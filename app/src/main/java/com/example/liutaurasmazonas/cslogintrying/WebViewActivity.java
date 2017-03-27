package com.example.liutaurasmazonas.cslogintrying;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;
public class WebViewActivity extends Activity {
    private WebView webView;
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view);
        webView = (WebView) findViewById(R.id.webView1);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl("http://www.tradingeconomics.com/calendar");
    }
}
