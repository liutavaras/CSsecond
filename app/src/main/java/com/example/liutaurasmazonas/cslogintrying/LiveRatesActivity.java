package com.example.liutaurasmazonas.cslogintrying;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;


public class LiveRatesActivity extends AppCompatActivity {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_live_rates);
            final ImageButton bCurrencies = (ImageButton) findViewById(R.id.ibCurrencies);
            final ImageButton bShares = (ImageButton) findViewById(R.id.ibShares);
            final ImageButton bSettingsBlack = (ImageButton) findViewById(R.id.ibSettingsBlack);
            final ImageButton bEconCal = (ImageButton) findViewById(R.id.ibEconCal);
            final ImageButton bNews = (ImageButton) findViewById(R.id.ibNews);

            bCurrencies.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    Intent myintent2 = new Intent(LiveRatesActivity.this,CurrenciesActivity.class);
                    startActivity(myintent2);
                }
            });
            bShares.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    Intent myintent3 = new Intent(LiveRatesActivity.this,SharesActivity.class);
                    startActivity(myintent3);
                }
            });
            bSettingsBlack.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    Intent myintent4 = new Intent(LiveRatesActivity.this,SettingsActivity.class);
                    startActivity(myintent4);
                }
            });
            bEconCal.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    Intent myintent5 = new Intent(LiveRatesActivity.this,EconomicCalendarActivity.class);
                    startActivity(myintent5);
                }
            });
            bNews.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    Intent myintent6 = new Intent(LiveRatesActivity.this,HomeActivity.class);
                    startActivity(myintent6);
                }
            });
        }

    //I create Logout feature here. Ksenia

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch(item.getItemId()){
            case R.id.menuLogout:

                /* We need to create user in order to clear data
                LoginPage.getInstance(this).logout();

                */


                break;
        }
        return true;

    }
}
