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

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.Thing;

import static android.graphics.Color.BLACK;
import static android.graphics.Color.WHITE;


public class SettingsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
        final Button button = (Button) findViewById(R.id.bDark);
        final Button button1 = (Button) findViewById(R.id.button3);
        final Button button2 = (Button) findViewById(R.id.bNewsOn);
        final Button button3 = (Button) findViewById(R.id.bNews);
        final Button button4 = (Button) findViewById(R.id.bNotOn);
        final Button button5 = (Button) findViewById(R.id.bNot);
        final Button bChangePassword = (Button) findViewById(R.id.bChangePassword);
        final ImageButton bLiveRatesBlack = (ImageButton) findViewById(R.id.ibLiveRatesBlack);
        final ImageButton bEconCalBlack = (ImageButton) findViewById(R.id.ibEconCalBlack);
        final ImageButton bNewsBlack = (ImageButton) findViewById(R.id.ibNewsBlack);

        button.setOnClickListener(
                new Button.OnClickListener() {
                    public void onClick(View v) {
                        button.setText("ON");
                        button.getBackground().setColorFilter(Color.parseColor("#003662"), PorterDuff.Mode.MULTIPLY);
                        button.setTextColor(WHITE);
                        button1.setText("Light");
                        button1.setTextColor(BLACK);
                        button1.getBackground().setColorFilter(Color.LTGRAY, PorterDuff.Mode.MULTIPLY);

                        while (button.isSelected()) {
                            button.isEnabled();
                        }
                        button1.isEnabled();
                        while (button1.isSelected()) {
                            button1.isEnabled();
                        }
                        button.isEnabled();
                        button.setClickable(true);
                        button1.setClickable(true);

                    }
                }
        );


        button1.setOnClickListener(
                new Button.OnClickListener() {
                    public void onClick(View v) {
                        button1.setText("OFF");
                        button1.getBackground().setColorFilter(Color.parseColor("#003662"), PorterDuff.Mode.MULTIPLY);
                        button1.setTextColor(WHITE);
                        button.setText("Dark");
                        button.setTextColor(BLACK);
                        button.getBackground().setColorFilter(Color.LTGRAY, PorterDuff.Mode.MULTIPLY);

                        while (button1.isSelected()) {
                            button1.isEnabled();
                        }
                        button.isEnabled();
                        while (button.isSelected()) {
                            button.isEnabled();
                        }
                        button1.isEnabled();
                        button1.setClickable(true);
                        button.setClickable(true);

                    }
                }

        );

        bLiveRatesBlack.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent myintent2 = new Intent(SettingsActivity.this,LiveRatesActivity.class);
                startActivity(myintent2);
            }
        });
        bEconCalBlack.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent myintent3 = new Intent(SettingsActivity.this,EconomicCalendarActivity.class);
                startActivity(myintent3);
            }
        });
        bNewsBlack.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent myintent4 = new Intent(SettingsActivity.this,HomeActivity.class);
                startActivity(myintent4);
            }
        });
        bChangePassword.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent openchangepassword = new Intent(SettingsActivity.this,ChangePasswordActivity.class);
                startActivity(openchangepassword);
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
        switch (item.getItemId()) {
            case R.id.menuLogout:

                /* We need to create user in order to clear data
                LoginPage.getInstance(this).logout();

                */


                break;
        }
        return true;

    }

    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    public Action getIndexApiAction() {
        Thing object = new Thing.Builder()
                .setName("Settings Page") // TODO: Define a title for the content shown.
                // TODO: Make sure this auto-generated URL is correct.
                .setUrl(Uri.parse("http://[ENTER-YOUR-URL-HERE]"))
                .build();
        return new Action.Builder(Action.TYPE_VIEW)
                .setObject(object)
                .setActionStatus(Action.STATUS_TYPE_COMPLETED)
                .build();
    }

    @Override
    public void onStart() {
        super.onStart();

    }

    @Override
    public void onStop() {
        super.onStop();

    }

}