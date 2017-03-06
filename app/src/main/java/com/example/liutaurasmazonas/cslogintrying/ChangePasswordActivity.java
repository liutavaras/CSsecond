package com.example.liutaurasmazonas.cslogintrying;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class ChangePasswordActivity extends AppCompatActivity {

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
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
}