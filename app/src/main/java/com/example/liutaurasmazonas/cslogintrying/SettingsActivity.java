package com.example.liutaurasmazonas.cslogintrying;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import com.google.android.gms.common.SignInButton;

public class SettingsActivity extends AppCompatActivity {

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
        //NURODOME VISUS MYGTUKUS
        Button b1=(Button)findViewById(R.id.bChangePassword);
        ImageButton b2=(ImageButton)findViewById(R.id.ibLiveRates);
        //PIRMAS MYGTUKAS
        b1.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent myintent2 = new Intent(SettingsActivity.this,ChangePasswordActivity.class);
                startActivity(myintent2);

            }
        });
        //NAUJAS MYGTUKAS
        b2.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent myintent2 = new Intent(SettingsActivity.this,LiveRatesActivity.class);
                startActivity(myintent2);

            }
        });
    }
}