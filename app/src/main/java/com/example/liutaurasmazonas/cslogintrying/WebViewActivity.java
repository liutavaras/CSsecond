package com.example.liutaurasmazonas.cslogintrying;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.ImageButton;

public class WebViewActivity extends Activity {
    private WebView webView;
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view);
        webView = (WebView) findViewById(R.id.webView1);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl("http://www.tradingeconomics.com/calendar");



        ImageButton bSettingsBlack = (ImageButton) findViewById(R.id.ibSettingsBlack);
        ImageButton bEconCalBlack = (ImageButton) findViewById(R.id.ibEconCalBlack);
        ImageButton bLiveRates = (ImageButton) findViewById(R.id.ibLiveRates);
        ImageButton bNewsBlack = (ImageButton) findViewById(R.id.ibNewsBlack);
        ImageButton addAProfile = (ImageButton) findViewById(R.id.addAProfile);
        final ImageButton ibSearch = (ImageButton) findViewById(R.id.ibSearch);

        bSettingsBlack.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(WebViewActivity.this, SettingsActivity.class));
            }
        });
        bEconCalBlack.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(WebViewActivity.this, WebViewActivity.class));
            }
        });
        bLiveRates.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(WebViewActivity.this, sortingrates.class));
            }
        });
        bNewsBlack.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(WebViewActivity.this, HomePageNews.class));
            }
        });
        addAProfile.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(WebViewActivity.this, AddProfileActivity.class));
            }
        });
        ibSearch.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(WebViewActivity.this, GoogleSearchIntentActivity.class));
            }

        });


    }
}
