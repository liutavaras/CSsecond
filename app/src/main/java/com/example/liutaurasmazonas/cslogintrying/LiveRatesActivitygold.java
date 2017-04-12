package com.example.liutaurasmazonas.cslogintrying;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;

import org.json.JSONException;
import org.json.JSONObject;


public class LiveRatesActivitygold extends AppCompatActivity implements Response.Listener,
        Response.ErrorListener {
    public static final String REQUEST_TAG = "LiveRatesActivitygold";
    private Button GetRates;
    private TextView OpenText2;
    private TextView SymbolText2;
    private TextView NameText2;
    private TextView LastTradePrice;
    private TextView DaysRange;
    private TextView Volume;
    private RequestQueue mQueue;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_live_ratesgold);

        OpenText2 = (TextView) findViewById(R.id.ResultsTextView);
        SymbolText2 = (TextView) findViewById(R.id.SymbolTextView);
        NameText2 = (TextView) findViewById(R.id.NameTextView);
        LastTradePrice = (TextView) findViewById(R.id.ChangeTextView2);
        DaysRange = (TextView) findViewById(R.id.PercentageChangeTextView2);
        Volume = (TextView) findViewById(R.id.DaysLowTextView2);
        GetRates = (Button) findViewById(R.id.Sentbutton);

        ImageButton bLiveRatesBlack = (ImageButton) findViewById(R.id.ibLiveRatesBlack);
        ImageButton bSettingsBlack = (ImageButton) findViewById(R.id.ibSettingsBlack);
        ImageButton bEconCalBlack = (ImageButton) findViewById(R.id.ibEconCalBlack);
        ImageButton bNewsBlack = (ImageButton) findViewById(R.id.ibNewsBlack);
        Button BackButton = (Button) findViewById(R.id.ibBackButton);

        bSettingsBlack.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(LiveRatesActivitygold.this, SettingsActivity.class));
            }
        });
        bEconCalBlack.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(LiveRatesActivitygold.this, WebViewActivity.class));
            }
        });
        bNewsBlack.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(LiveRatesActivitygold.this, HomePageNews.class));
            }
        });
        BackButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(LiveRatesActivitygold.this, sortingrates.class));
            }
        });
        bLiveRatesBlack.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(LiveRatesActivitygold.this, sortingrates.class));
            }
        });
    }



    @Override
    protected void onStart() {
        super.onStart();

        mQueue = CustomVolleyRequestQueue.getInstance(this.getApplicationContext())
                .getRequestQueue();
        String url = "https://query.yahooapis.com/v1/public/yql?q=select%20*%20from%20yahoo.finance.quotes%20where%20symbol%20in%20(%22GC=F%22)&format=json&env=store%3A%2F%2Fdatatables.org%2Falltableswithkeys&callback=";//"http://httpbin.org/get?site=code&network=tutsplus";
        final CustomJSONObjectRequest jsonRequest = new CustomJSONObjectRequest(Request.Method.GET, url, new JSONObject(), this, this);
        jsonRequest.setTag(REQUEST_TAG);


        GetRates.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mQueue.add(jsonRequest);
            }
        });
    }

    @Override
    protected void onStop() {
        super.onStop();
        if (mQueue != null) {
            mQueue.cancelAll(REQUEST_TAG);
        }
    }

    @Override
    public void onErrorResponse(VolleyError error) {
        OpenText2.setText(error.getMessage());
    }

    @Override
    public void onResponse(Object response) {
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
            OpenText2.setText("Response is: " + response);
            try {
                JSONObject response2 = ((JSONObject) response).getJSONObject("query");
                response2 = ((JSONObject) response2).getJSONObject("results");
                response2 = ((JSONObject) response2).getJSONObject("quote");
                String displayed_Text = ((JSONObject) response2).getString("Open");
                OpenText2.setText(displayed_Text);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        {
            LastTradePrice.setText("Response is: " + response);
            try {
                JSONObject response2 = ((JSONObject) response).getJSONObject("query");
                response2 = ((JSONObject) response2).getJSONObject("results");
                response2 = ((JSONObject) response2).getJSONObject("quote");
                String displayed_Text = ((JSONObject) response2).getString("LastTradePriceOnly");
                LastTradePrice.setText(displayed_Text);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        {
            DaysRange.setText("Response is: " + response);
            try {
                JSONObject response2 = ((JSONObject) response).getJSONObject("query");
                response2 = ((JSONObject) response2).getJSONObject("results");
                response2 = ((JSONObject) response2).getJSONObject("quote");
                String displayed_Text = ((JSONObject) response2).getString("DaysRange");
                DaysRange.setText(displayed_Text);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        {
            Volume.setText("Response is: " + response);
            try {
                JSONObject response2 = ((JSONObject) response).getJSONObject("query");
                response2 = ((JSONObject) response2).getJSONObject("results");
                response2 = ((JSONObject) response2).getJSONObject("quote");
                String displayed_Text = ((JSONObject) response2).getString("Volume");
                Volume.setText(displayed_Text);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }

    }

    public void NotificationPageRequest(View view) {
        Intent intent = new Intent(this, LiveRatesActivitygold.class);
        startActivity(intent);
    }


}

