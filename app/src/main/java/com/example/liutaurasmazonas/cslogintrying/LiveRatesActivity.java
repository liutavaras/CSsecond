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
            final ImageButton bSettingsBlack = (ImageButton) findViewById(R.id.ibSettingsBlack);
            final ImageButton bEconCalBlack = (ImageButton) findViewById(R.id.ibEconCalBlack);
            final ImageButton bNewsBlack = (ImageButton) findViewById(R.id.ibNewsBlack);

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
