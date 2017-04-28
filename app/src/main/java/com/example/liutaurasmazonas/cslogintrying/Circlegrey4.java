package com.example.liutaurasmazonas.cslogintrying;

import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Circlegrey4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_circlegrey4);

        final SharedPreferences sharedPref = PreferenceManager.getDefaultSharedPreferences(this);
        ImageButton buttonclearcache = (ImageButton) findViewById(R.id.buttonclearcache);

        ImageButton bSettingsBlack = (ImageButton) findViewById(R.id.ibSettingsBlack);
        ImageButton bEconCalBlack = (ImageButton) findViewById(R.id.ibEconCalBlack);
        ImageButton bLiveRates = (ImageButton) findViewById(R.id.ibLiveRates);
        ImageButton bNewsBlack = (ImageButton) findViewById(R.id.ibNewsBlack);
        final ImageButton ibSearch = (ImageButton) findViewById(R.id.ibSearch);

        bSettingsBlack.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Circlegrey4.this, SettingsActivity.class));
            }
        });
        bEconCalBlack.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Circlegrey4.this, WebViewActivity.class));
            }
        });
        bLiveRates.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Circlegrey4.this, sortingrates.class));
            }
        });
        bNewsBlack.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Circlegrey4.this, HomePageNews.class));
            }
        });

        ImageButton buttonlookforclient = (ImageButton) findViewById(R.id.buttonlookforclient);
        ImageButton buttonsetpriority = (ImageButton) findViewById(R.id.buttonsetpriority);

        buttonlookforclient.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Circlegrey4.this, ViewProfile.class));
            }
        });
        buttonsetpriority.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Circlegrey4.this, SettingPriority4.class));
            }
        });
        ibSearch.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(Circlegrey4.this, GoogleSearchIntentActivity.class));
            }

        });
        buttonclearcache.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {SharedPreferences.Editor editor = sharedPref.edit();
                editor.remove("ggggurl1");
                editor.remove("ggggurl2");
                editor.remove("ggggurl3");
                editor.remove("ggggurl4");
                editor.remove("ggggurl5");
                editor.remove("ggggurl6");
                editor.remove("ggggurl7");
                editor.remove("ggggurl8");
                editor.remove("ggggurl9");
                editor.remove("ggggurl10");
                editor.remove("ggggurl11");
                editor.remove("ggggurl12");
                editor.remove("ggggurl13");
                editor.remove("ggggurl14");
                editor.remove("ggggurl15");
                editor.remove("ggggurl16");
                editor.remove("ggggurl17");
                editor.remove("ggggurl18");
                editor.remove("ggggurl19");
                editor.remove("ggggurl20");
                editor.remove("ggggurl21");
                editor.remove("ggggurl22");
                editor.remove("ggggurl23");
                editor.remove("ggggurl24");
                editor.remove("ggggurl25");
                editor.remove("ggggurl26");

                editor.remove("aaaaurl1");
                editor.remove("aaaaurl2");
                editor.remove("aaaaurl3");
                editor.remove("aaaaurl4");
                editor.remove("aaaaurl5");
                editor.remove("aaaaurl6");
                editor.remove("aaaaurl7");
                editor.remove("aaaaurl8");
                editor.remove("aaaaurl9");
                editor.remove("aaaaurl10");
                editor.remove("aaaaurl11");
                editor.remove("aaaaurl12");
                editor.remove("aaaaurl13");
                editor.remove("aaaaurl14");
                editor.remove("aaaaurl15");
                editor.remove("aaaaurl16");
                editor.remove("aaaaurl17");
                editor.remove("aaaaurl18");
                editor.remove("aaaaurl19");
                editor.remove("aaaaurl20");
                editor.remove("aaaaurl21");
                editor.remove("aaaaurl22");
                editor.remove("aaaaurl23");
                editor.remove("aaaaurl24");
                editor.remove("aaaaurl25");
                editor.remove("aaaaurl26");

                editor.remove("rrrrurl1");
                editor.remove("rrrrurl2");
                editor.remove("rrrrurl3");
                editor.remove("rrrrurl4");
                editor.remove("rrrrurl5");
                editor.remove("rrrrurl6");
                editor.remove("rrrrurl7");
                editor.remove("rrrrurl8");
                editor.remove("rrrrurl9");
                editor.remove("rrrrurl10");
                editor.remove("rrrrurl11");
                editor.remove("rrrrurl12");
                editor.remove("rrrrurl13");
                editor.remove("rrrrurl14");
                editor.remove("rrrrurl15");
                editor.remove("rrrrurl16");
                editor.remove("rrrrurl17");
                editor.remove("rrrrurl18");
                editor.remove("rrrrurl19");
                editor.remove("rrrrurl20");
                editor.remove("rrrrurl21");
                editor.remove("rrrrurl22");
                editor.remove("rrrrurl23");
                editor.remove("rrrrurl24");
                editor.remove("rrrrurl25");
                editor.remove("rrrrurl26");
                editor.commit();
                startActivity(new Intent(Circlegrey4.this, HomePageNews.class));
            }
        });
    }
}
