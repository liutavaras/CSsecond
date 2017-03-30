package com.example.liutaurasmazonas.cslogintrying.service;


import android.net.Uri;
import android.os.AsyncTask;

import com.example.liutaurasmazonas.cslogintrying.data.Quote;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

/**
 * Created by Liutauras Mazonas on 3/26/2017.
 */

public class YahooFinanceService {
    private FinanceServiceCallback callback;
    private String symbol;
    private Exception error;


    public YahooFinanceService(FinanceServiceCallback callback) {
        this.callback = callback;
    }

    public String getSymbol() {
        return symbol;
    }

    public void refreshFinance(String symbol) {

        this.symbol = symbol;

        new AsyncTask<String, Void, String>() {
            @Override
            protected String doInBackground(String... strings) {

            String YQL = String.format("select * from pm.finance where symbol=\"%s\"", YahooFinanceService.this.symbol);

            String endpoint = String.format("https://query.yahooapis.com/v1/public/yql?q=%s&format=json&diagnostics=true&callback=", Uri.encode(YQL));

                try {
                    URL url = new URL(endpoint);

                    URLConnection connection = url.openConnection();

                    InputStream inputStream = connection.getInputStream();

                    BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
                    StringBuilder result = new StringBuilder();
                    String line;
                    while ((line = reader.readLine()) != null) {
                        result.append(line);
                    }

                    return result.toString();

                } catch (Exception e) {
                  error = e;
                }

                return null;
            }

            @Override
            protected void onPostExecute(String s) {

                if(s == null && error != null) {
                    callback.serviceFailure(error);
                    return;
                }

                try {
                    JSONObject data = new JSONObject(s);

                    JSONObject queryResults = data.optJSONObject("query");

                    int count = queryResults.optInt("count");
                    if (count == 0) {
                        callback.serviceFailure(new SymbolFinanceException("No finance information found for" +s));
                        return;
                    }

                    Quote quote = new Quote();
                    quote.populate(queryResults.optJSONObject("results ").optJSONObject("quote"));

                    callback.serviceSuccess(quote);

                } catch (JSONException e) {
                    callback.serviceFailure(e);
                }


            }

        }.execute(symbol);
    }


    public class SymbolFinanceException extends Exception {
        public SymbolFinanceException(String message) {
            super(message);
        }
    }
}
