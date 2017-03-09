package com.example.liutaurasmazonas.cslogintrying;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;


public class LiveRatesActivity extends AppCompatActivity {

        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_live_rates);
            final ImageButton bCurrencies = (ImageButton) findViewById(R.id.ibCurrencies);
            final ImageButton bShares = (ImageButton) findViewById(R.id.ibShares);
            final ImageButton bSettingsBlack = (ImageButton) findViewById(R.id.ibSettingsBlack);
            final ImageButton bEconCalBlack = (ImageButton) findViewById(R.id.ibEconCalBlack);
            final ImageButton bNewsBlack = (ImageButton) findViewById(R.id.ibNewsBlack);

            bCurrencies.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    Intent opencurrencies = new Intent(LiveRatesActivity.this,CurrenciesActivity.class);
                    startActivity(opencurrencies);
                }
            });
            bShares.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    Intent openshares = new Intent(LiveRatesActivity.this,SharesActivity.class);
                    startActivity(openshares);
                }
            });
            bSettingsBlack.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    Intent opensettings = new Intent(LiveRatesActivity.this,SettingsActivity.class);
                    startActivity(opensettings);
                }
            });
            bEconCalBlack.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    Intent openeconcal = new Intent(LiveRatesActivity.this,EconomicCalendarActivity.class);
                    startActivity(openeconcal);
                }
            });
            bNewsBlack.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    Intent openhome = new Intent(LiveRatesActivity.this,HomeActivity.class);
                    startActivity(openhome);
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
