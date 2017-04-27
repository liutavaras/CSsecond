package com.example.liutaurasmazonas.cslogintrying;

import android.content.Intent;
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

        Button buttonlookforclient = (Button) findViewById(R.id.buttonlookforclient);
        Button buttonsetpriority = (Button) findViewById(R.id.buttonsetpriority);

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
    }
}
