package com.example.liutaurasmazonas.cslogintrying;

import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Circlegrey5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_circlegrey5);
        final SharedPreferences sharedPref = PreferenceManager.getDefaultSharedPreferences(this);
        ImageButton buttonclearcache = (ImageButton) findViewById(R.id.buttonclearcache);

        ImageButton bSettingsBlack = (ImageButton) findViewById(R.id.ibSettingsBlack);
        ImageButton bEconCalBlack = (ImageButton) findViewById(R.id.ibEconCalBlack);
        ImageButton bLiveRates = (ImageButton) findViewById(R.id.ibLiveRates);
        ImageButton bNewsBlack = (ImageButton) findViewById(R.id.ibNewsBlack);
        final ImageButton ibSearch = (ImageButton) findViewById(R.id.ibSearch);

        bSettingsBlack.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Circlegrey5.this, SettingsActivity.class));
            }
        });
        bEconCalBlack.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Circlegrey5.this, WebViewActivity.class));
            }
        });
        bLiveRates.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Circlegrey5.this, sortingrates.class));
            }
        });
        bNewsBlack.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Circlegrey5.this, HomePageNews.class));
            }
        });

        ImageButton buttonlookforclient = (ImageButton) findViewById(R.id.buttonlookforclient);
        ImageButton buttonsetpriority = (ImageButton) findViewById(R.id.buttonsetpriority);

        buttonlookforclient.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Circlegrey5.this, ViewProfile.class));
            }
        });
        buttonsetpriority.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Circlegrey5.this, SettingPriority5.class));
            }
        });
        ibSearch.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(Circlegrey5.this, GoogleSearchIntentActivity.class));
            }

        });
        buttonclearcache.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {SharedPreferences.Editor editor = sharedPref.edit();
                editor.remove("gggggurl1");
                editor.remove("gggggurl2");
                editor.remove("gggggurl3");
                editor.remove("gggggurl4");
                editor.remove("gggggurl5");
                editor.remove("gggggurl6");
                editor.remove("gggggurl7");
                editor.remove("gggggurl8");
                editor.remove("gggggurl9");
                editor.remove("gggggurl10");
                editor.remove("gggggurl11");
                editor.remove("gggggurl12");
                editor.remove("gggggurl13");
                editor.remove("gggggurl14");
                editor.remove("gggggurl15");
                editor.remove("gggggurl16");
                editor.remove("gggggurl17");
                editor.remove("gggggurl18");
                editor.remove("gggggurl19");
                editor.remove("gggggurl20");
                editor.remove("gggggurl21");
                editor.remove("gggggurl22");
                editor.remove("gggggurl23");
                editor.remove("gggggurl24");
                editor.remove("gggggurl25");
                editor.remove("gggggurl26");

                editor.remove("aaaaaurl1");
                editor.remove("aaaaaurl2");
                editor.remove("aaaaaurl3");
                editor.remove("aaaaaurl4");
                editor.remove("aaaaaurl5");
                editor.remove("aaaaaurl6");
                editor.remove("aaaaaurl7");
                editor.remove("aaaaaurl8");
                editor.remove("aaaaaurl9");
                editor.remove("aaaaaurl10");
                editor.remove("aaaaaurl11");
                editor.remove("aaaaaurl12");
                editor.remove("aaaaaurl13");
                editor.remove("aaaaaurl14");
                editor.remove("aaaaaurl15");
                editor.remove("aaaaaurl16");
                editor.remove("aaaaaurl17");
                editor.remove("aaaaaurl18");
                editor.remove("aaaaaurl19");
                editor.remove("aaaaaurl20");
                editor.remove("aaaaaurl21");
                editor.remove("aaaaaurl22");
                editor.remove("aaaaaurl23");
                editor.remove("aaaaaurl24");
                editor.remove("aaaaaurl25");
                editor.remove("aaaaaurl26");

                editor.remove("rrrrrurl1");
                editor.remove("rrrrrurl2");
                editor.remove("rrrrrurl3");
                editor.remove("rrrrrurl4");
                editor.remove("rrrrrurl5");
                editor.remove("rrrrrurl6");
                editor.remove("rrrrrurl7");
                editor.remove("rrrrrurl8");
                editor.remove("rrrrrurl9");
                editor.remove("rrrrrurl10");
                editor.remove("rrrrrurl11");
                editor.remove("rrrrrurl12");
                editor.remove("rrrrrurl13");
                editor.remove("rrrrrurl14");
                editor.remove("rrrrrurl15");
                editor.remove("rrrrrurl16");
                editor.remove("rrrrrurl17");
                editor.remove("rrrrrurl18");
                editor.remove("rrrrrurl19");
                editor.remove("rrrrrurl20");
                editor.remove("rrrrrurl21");
                editor.remove("rrrrrurl22");
                editor.remove("rrrrrurl23");
                editor.remove("rrrrrurl24");
                editor.remove("rrrrrurl25");
                editor.remove("rrrrrurl26");
                editor.commit();
                startActivity(new Intent(Circlegrey5.this, HomePageNews.class));
            }
        });
    }
}
