package com.example.liutaurasmazonas.cslogintrying;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.JsonRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;


public class EconomicCalendarActivity extends AppCompatActivity {
    TextView results;
    String JsonURL = "https://www.quandl.com/api/v3/datasets.json?database_code=LSE&per_page=100&sort_by=id&page=1&api_key=8iPf_tijy4EfSL_MbMDx";
    String data = "";
    RequestQueue requestQueue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_economic_calendar);
        requestQueue = Volley.newRequestQueue(this);
        results = (TextView) findViewById(R.id.jsonData);
        JsonObjectRequest getRequest = new JsonObjectRequest(
                JsonURL,
                null,
                new Response.Listener<JSONObject>()
        {

                    @Override
                    public void onResponse(JSONObject response) {
                        try {
                            JSONArray arr = response.getJSONArray("datasets");
                            for (int i = 0; i < arr.length(); i++) {
                                JSONObject obj = arr.getJSONObject(i);
                                // Retrieves the string labeled "colorName" and "description" from
                                //the response JSON Object
                                //and converts them into javascript objects

                                String data_id = obj.getString("id");
                                //change all the fields with the Json name!!!!!!
                                /*
                                String dataset_code = obj.getString("Dataset Code");
                                String database_code = obj.getString("Database Code");
                                String name = obj.getString("Data Name");
                                String description = obj.getString("Data Description");
                                String refreshed_at = obj.getString("Refresh Date");
                                String newest_available_date = obj.getString("Newest available date");
                                String oldest_available_date = obj.getString("Oldest available date");
                                String frequency = obj.getString("Data frequency");
                                String type = obj.getString("data type");
                                String premium = obj.getString("is it premium?");
                                String database_id = obj.getString("database id");*/

                                // Adds strings from object to the "data" string
                                data += "DataID: " + data_id;/* +
                                        "Dataset Code: " + dataset_code +
                                        "Database Code:" + database_code +
                                        "Name: " + name +
                                        "Description: " + description +
                                        "Refreshed At: " + refreshed_at +
                                        "Newest Available Date: " + newest_available_date +
                                        "Oldest Available Date: " + oldest_available_date +
                                        "Frequency: " + frequency +
                                        "Type: " + type +
                                        "Premium: " + premium +
                                        "Database ID: " + database_id;*/
                            }
                            // Adds the data string to the TextView "results"
                            results.setText(data);
                        }
                        // Try and catch are included to handle any errors due to JSON
                        catch (JSONException e) {
                            // If an error occurs, this prints the error to the log
                            e.printStackTrace();
                        }
                    }
                },
                // The final parameter overrides the method onErrorResponse() and passes VolleyError
                //as a parameter
                new Response.ErrorListener() {
                    @Override
                    // Handles errors that occur due to Volley
                    public void onErrorResponse(VolleyError error) {
                        Log.e("Volley", "Error");
                    }
                }
        );
        // Adds the JSON object request "obreq" to the request queue
        requestQueue.add(getRequest);
    }
}