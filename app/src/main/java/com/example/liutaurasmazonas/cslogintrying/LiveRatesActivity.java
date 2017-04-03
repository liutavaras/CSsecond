package com.example.liutaurasmazonas.cslogintrying;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;

import org.json.JSONException;
import org.json.JSONObject;
import org.w3c.dom.Text;


public class LiveRatesActivity extends AppCompatActivity implements Response.Listener,
        Response.ErrorListener {
    public static final String REQUEST_TAG = "LiveRatesActivity";
    private TextView LastTradePriceOnlyText;
    private TextView SymbolText;
    private TextView NameText;
    private Button GetRates;
    private RequestQueue mQueue;

    public static final String REQUEST_TAG2 = "LiveRatesActivity";
    private TextView LastTradePriceOnlyText2;
    private TextView SymbolText2;
    private TextView NameText2;
    private TextView ChangeText2;
    private TextView PercentageChangeText2;
    private TextView DaysLowText2;
    private TextView DaysHighText2;
    private TextView AvgVolumeText2;
    private TextView PERatioText2;
    private TextView MarketCapText2;
    private RequestQueue nQueue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_live_rates);

        LastTradePriceOnlyText = (TextView) findViewById(R.id.ResultsTextView);
        SymbolText = (TextView) findViewById(R.id.SymbolTextView);
        NameText = (TextView) findViewById(R.id.NameTextView);
        LastTradePriceOnlyText2 = (TextView) findViewById(R.id.ResultsTextView2);
        SymbolText2 = (TextView) findViewById(R.id.SymbolTextView2);
        NameText2 = (TextView) findViewById(R.id.NameTextView2);
        ChangeText2 = (TextView) findViewById(R.id.ChangeTextView2);
        PercentageChangeText2 = (TextView) findViewById(R.id.PercentageChangeTextView2);
        DaysLowText2 = (TextView) findViewById(R.id.DaysLowTextView2);
        DaysHighText2 = (TextView) findViewById(R.id.DaysHighTextView2);
        AvgVolumeText2 = (TextView) findViewById(R.id.AvgVolumeTextView2);
        PERatioText2 = (TextView) findViewById(R.id.PERatioTextView2);
        MarketCapText2 = (TextView) findViewById(R.id.MarketCapTextView2);
        GetRates = (Button) findViewById(R.id.Sentbutton);
    }

    @Override
    protected void onStart() {
        super.onStart();
        // Instantiate the RequestQueue.
        mQueue = CustomVolleyRequestQueue.getInstance(this.getApplicationContext())
                .getRequestQueue();
        String url = "https://query.yahooapis.com/v1/public/yql?q=select%20*%20from%20yahoo.finance.quotes%20where%20symbol%20in%20(%22FB%22)&format=json&env=store%3A%2F%2Fdatatables.org%2Falltableswithkeys&callback=";//"http://httpbin.org/get?site=code&network=tutsplus";
        final CustomJSONObjectRequest jsonRequest = new CustomJSONObjectRequest(Request.Method.GET, url, new JSONObject(), this, this);
        jsonRequest.setTag(REQUEST_TAG);

        nQueue = CustomVolleyRequestQueue.getInstance(this.getApplicationContext())
                .getRequestQueue();
        String url2 = "https://query.yahooapis.com/v1/public/yql?q=select%20*%20from%20yahoo.finance.quotes%20where%20symbol%20in%20(%22YHOO%22)&format=json&env=store%3A%2F%2Fdatatables.org%2Falltableswithkeys&callback=";//"http://httpbin.org/get?site=code&network=tutsplus";
        final CustomJSONObjectRequest jsonRequest2 = new CustomJSONObjectRequest(Request.Method.GET, url2, new JSONObject(), this, this);
        jsonRequest2.setTag(REQUEST_TAG2);

        GetRates.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mQueue.add(jsonRequest);
                nQueue.add(jsonRequest2);
            }
        });
    }

    @Override
    protected void onStop() {
        super.onStop();
        if (mQueue != null) {
            mQueue.cancelAll(REQUEST_TAG);
        }
        else if (nQueue !=null) {
            nQueue.cancelAll(REQUEST_TAG2);
        }
    }

    @Override
    public void onErrorResponse(VolleyError error) {
        LastTradePriceOnlyText.setText(error.getMessage());
        LastTradePriceOnlyText2.setText(error.getMessage());
    }

    @Override
    public void onResponse(Object response) {
        LastTradePriceOnlyText.setText("Response is: " + response);
        try {
            JSONObject response2 = ((JSONObject) response).getJSONObject("query");
            response2 = ((JSONObject) response2).getJSONObject("results");
            response2 = ((JSONObject) response2).getJSONObject("quote");
            String displayed_Text = ((JSONObject) response2).getString("LastTradePriceOnly");
            LastTradePriceOnlyText.setText(displayed_Text);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        {
            SymbolText.setText("Response is: " + response);
            try {
                JSONObject response2 = ((JSONObject) response).getJSONObject("query");
                response2 = ((JSONObject) response2).getJSONObject("results");
                response2 = ((JSONObject) response2).getJSONObject("quote");
                String displayed_Text = ((JSONObject) response2).getString("symbol");
                SymbolText.setText(displayed_Text);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        {
            NameText.setText("Response is: " + response);
            try {
                JSONObject response2 = ((JSONObject) response).getJSONObject("query");
                response2 = ((JSONObject) response2).getJSONObject("results");
                response2 = ((JSONObject) response2).getJSONObject("quote");
                String displayed_Text = ((JSONObject) response2).getString("Name");
                NameText.setText(displayed_Text);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        {
            NameText2.setText("Response is: " + response);
            try {
                JSONObject response2 = ((JSONObject) response).getJSONObject("query");
                response2 = ((JSONObject) response2).getJSONObject("results");
                response2 = ((JSONObject) response2).getJSONObject("quote");
                String displayed_Text = ((JSONObject) response2).getString("Name");
                NameText2.setText(displayed_Text);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        {
            SymbolText2.setText("Response is: " + response);
            try {
                JSONObject response2 = ((JSONObject) response).getJSONObject("query");
                response2 = ((JSONObject) response2).getJSONObject("results");
                response2 = ((JSONObject) response2).getJSONObject("quote");
                String displayed_Text = ((JSONObject) response2).getString("symbol");
                SymbolText2.setText(displayed_Text);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        {
            LastTradePriceOnlyText2.setText("Response is: " + response);
            try {
                JSONObject response2 = ((JSONObject) response).getJSONObject("query");
                response2 = ((JSONObject) response2).getJSONObject("results");
                response2 = ((JSONObject) response2).getJSONObject("quote");
                String displayed_Text = ((JSONObject) response2).getString("LastTradePriceOnly");
                LastTradePriceOnlyText2.setText(displayed_Text);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        {
            ChangeText2.setText("Response is: " + response);
            try {
                JSONObject response2 = ((JSONObject) response).getJSONObject("query");
                response2 = ((JSONObject) response2).getJSONObject("results");
                response2 = ((JSONObject) response2).getJSONObject("quote");
                String displayed_Text = ((JSONObject) response2).getString("Change");
                ChangeText2.setText(displayed_Text);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        {
            PercentageChangeText2.setText("Response is: " + response);
            try {
                JSONObject response2 = ((JSONObject) response).getJSONObject("query");
                response2 = ((JSONObject) response2).getJSONObject("results");
                response2 = ((JSONObject) response2).getJSONObject("quote");
                String displayed_Text = ((JSONObject) response2).getString("PercentChange");
                PercentageChangeText2.setText(displayed_Text);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        {
            DaysHighText2.setText("Response is: " + response);
            try {
                JSONObject response2 = ((JSONObject) response).getJSONObject("query");
                response2 = ((JSONObject) response2).getJSONObject("results");
                response2 = ((JSONObject) response2).getJSONObject("quote");
                String displayed_Text = ((JSONObject) response2).getString("DaysHigh");
                DaysHighText2.setText(displayed_Text);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        {
            DaysLowText2.setText("Response is: " + response);
            try {
                JSONObject response2 = ((JSONObject) response).getJSONObject("query");
                response2 = ((JSONObject) response2).getJSONObject("results");
                response2 = ((JSONObject) response2).getJSONObject("quote");
                String displayed_Text = ((JSONObject) response2).getString("DaysLow");
                DaysLowText2.setText(displayed_Text);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        {
            AvgVolumeText2.setText("Response is: " + response);
            try {
                JSONObject response2 = ((JSONObject) response).getJSONObject("query");
                response2 = ((JSONObject) response2).getJSONObject("results");
                response2 = ((JSONObject) response2).getJSONObject("quote");
                String displayed_Text = ((JSONObject) response2).getString("AverageDailyVolume");
                AvgVolumeText2.setText(displayed_Text);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        {
            PERatioText2.setText("Response is: " + response);
            try {
                JSONObject response2 = ((JSONObject) response).getJSONObject("query");
                response2 = ((JSONObject) response2).getJSONObject("results");
                response2 = ((JSONObject) response2).getJSONObject("quote");
                String displayed_Text = ((JSONObject) response2).getString("PERatio");
                PERatioText2.setText(displayed_Text);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        {
            MarketCapText2.setText("Response is: " + response);
            try {
                JSONObject response2 = ((JSONObject) response).getJSONObject("query");
                response2 = ((JSONObject) response2).getJSONObject("results");
                response2 = ((JSONObject) response2).getJSONObject("quote");
                String displayed_Text = ((JSONObject) response2).getString("MarketCapitalization");
                MarketCapText2.setText(displayed_Text);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }

    /** Called when the user clicks the Send button */
    public void NotificationPageRequest(View view) {
        Intent intent = new Intent(this, LiveRatesActivity.class);
        startActivity(intent);
    }


}

