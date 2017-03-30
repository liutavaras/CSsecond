package com.example.liutaurasmazonas.cslogintrying;

import android.app.ProgressDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import com.example.liutaurasmazonas.cslogintrying.data.Quote;
import com.example.liutaurasmazonas.cslogintrying.service.FinanceServiceCallback;
import com.example.liutaurasmazonas.cslogintrying.service.YahooFinanceService;



public class LiveRatesActivity extends AppCompatActivity implements FinanceServiceCallback {

    private TextView sharenameID;
    private TextView sharesymbolID;
    private TextView sharepriceID;
    private TextView sharechangeID;
    private TextView sharepercentagechangeID;
    private TextView sharevolumeID;
    private TextView shareperatioID;
    private TextView sharedayshighID;
    private TextView sharedayslowID;
    private TextView sharemarketcapID;

    private YahooFinanceService service;
    private ProgressDialog dialog;





        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_live_rates);
            final ImageButton bSettingsBlack = (ImageButton) findViewById(R.id.ibSettingsBlack);
            final ImageButton bEconCalBlack = (ImageButton) findViewById(R.id.ibEconCalBlack);
            final ImageButton bNewsBlack = (ImageButton) findViewById(R.id.ibNewsBlack);
            //My shares attribute naming starts here...//

            sharenameID = (TextView)findViewById(R.id.sharenameID);
            sharesymbolID = (TextView)findViewById(R.id.sharesymbolID);
            sharepriceID = (TextView)findViewById(R.id.sharepriceID);
            sharechangeID = (TextView)findViewById(R.id.sharechangeID);
            sharepercentagechangeID = (TextView)findViewById(R.id.sharepercentagechangeID);
            sharevolumeID = (TextView)findViewById(R.id.sharevolumeID);
            shareperatioID = (TextView)findViewById(R.id.shareperatioID);
            sharedayshighID = (TextView)findViewById(R.id.sharedayshighID);
            sharedayslowID = (TextView)findViewById(R.id.sharedayslowID);

            service = new YahooFinanceService(this);
            service.refreshFinance("Shares");

            dialog = new ProgressDialog(this);
            dialog.setMessage("Loading stock information...");
            dialog.show();

            service.refreshFinance("GOOGL");

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

    @Override
    public void serviceSuccess(Quote quote) {
        dialog.hide();

        sharenameID.setText(quote.getName());
        sharepriceID.setText(quote.getRealtime_price());
        sharechangeID.setText(quote.getChange());
        sharepercentagechangeID.setText(quote.getRealtime_chg_percent());
        sharevolumeID.setText(quote.getVolume());
        shareperatioID.setText(quote.getPERatio());
        sharedayshighID.setText(quote.getDaysHigh());
        sharedayslowID.setText(quote.getDaysLow());
        sharemarketcapID.setText(quote.getMarketCapitalization());
        sharesymbolID.setText(service.getSymbol());


    }

    @Override
    public void serviceFailure(Exception exception) {
        dialog.hide();
        Toast.makeText(this, exception.getMessage(), Toast.LENGTH_LONG).show();
    }
}