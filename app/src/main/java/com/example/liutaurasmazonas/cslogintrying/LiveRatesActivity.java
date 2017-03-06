package com.example.liutaurasmazonas.cslogintrying;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class LiveRatesActivity extends AppCompatActivity {

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_change_password);
        //NURODOME VISUS MYGTUKUS
        ImageButton b1=(ImageButton)findViewById(R.id.ibSettingsBlack);
        //PIRMAS MYGTUKAS
        b1.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent myintent2 = new Intent(LiveRatesActivity.this,SettingsActivity.class);
                startActivity(myintent2);

            }
        });

    }
}
