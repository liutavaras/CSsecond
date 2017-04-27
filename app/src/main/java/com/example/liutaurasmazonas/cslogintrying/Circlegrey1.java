package com.example.liutaurasmazonas.cslogintrying;

import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Circlegrey1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_circlegrey1);
        final SharedPreferences sharedPref = PreferenceManager.getDefaultSharedPreferences(this);


        ImageButton bSettingsBlack = (ImageButton) findViewById(R.id.ibSettingsBlack);
        ImageButton bEconCalBlack = (ImageButton) findViewById(R.id.ibEconCalBlack);
        ImageButton bLiveRates = (ImageButton) findViewById(R.id.ibLiveRates);
        ImageButton bNewsBlack = (ImageButton) findViewById(R.id.ibNewsBlack);
        Button buttonlookforclient = (Button) findViewById(R.id.buttonlookforclient);
        Button buttonsetpriority = (Button) findViewById(R.id.buttonsetpriority);
        Button buttonclearcache = (Button) findViewById(R.id.buttonclearcache);
        final ImageButton ibSearch = (ImageButton) findViewById(R.id.ibSearch);

        bSettingsBlack.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Circlegrey1.this, SettingsActivity.class));
            }
        });
        bEconCalBlack.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Circlegrey1.this, WebViewActivity.class));
            }
        });
        bLiveRates.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Circlegrey1.this, sortingrates.class));
            }
        });
        bNewsBlack.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Circlegrey1.this, HomePageNews.class));
            }
        });

        buttonlookforclient.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Circlegrey1.this, ViewProfile.class));
            }
        });

        buttonsetpriority.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Circlegrey1.this, SettingPriority1.class));
            }
        });
        buttonclearcache.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {SharedPreferences.Editor editor = sharedPref.edit();
                editor.remove("gurl1");
                editor.remove("gurl2");
                editor.commit();
                startActivity(new Intent(Circlegrey1.this, HomePageNews.class));
            }
        });
        ibSearch.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(Circlegrey1.this, GoogleSearchIntentActivity.class));
            }

        });

    }

}
