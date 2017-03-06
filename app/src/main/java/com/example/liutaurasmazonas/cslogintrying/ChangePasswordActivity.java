package com.example.liutaurasmazonas.cslogintrying;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.view.View;
import android.widget.ImageButton;


public class ChangePasswordActivity extends AppCompatActivity {

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Button button = (Button) findViewById(R.id.bSave);
        ChangePasswordActivityButtonListener listener = new ChangePasswordActivityButtonListener();
        button.setOnClickListener(listener);
        setContentView(R.layout.activity_change_password);
        //NURODOME VISUS MYGTUKUS
        ImageButton b1=(ImageButton)findViewById(R.id.ibSettingsBlack);
        ImageButton b2=(ImageButton)findViewById(R.id.ibLiveRates);
        //PIRMAS MYGTUKAS
        b1.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent myintent2 = new Intent(ChangePasswordActivity.this,SettingsActivity.class);
                startActivity(myintent2);

            }
        });
        //NAUJAS MYGTUKAS
        b2.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent myintent2 = new Intent(ChangePasswordActivity.this,LiveRatesActivity.class);
                startActivity(myintent2);

            }
        });
    }

    protected void onFinishInflate() {

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

