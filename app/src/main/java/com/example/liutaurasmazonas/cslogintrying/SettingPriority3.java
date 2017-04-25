package com.example.liutaurasmazonas.cslogintrying;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Spinner;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class SettingPriority3 extends AppCompatActivity {

    EditText etName;
    EditText etCareer;
    CheckBox cbTech;
    CheckBox cbMedi;
    CheckBox nfRenewableEnergy;
    CheckBox nfGoogle;
    CheckBox cfNovartis;
    CheckBox nfTesla;
    CheckBox lrsFB;
    CheckBox lrsAAPL;
    CheckBox lrsYHOO;
    CheckBox cbEURUSD;
    CheckBox lrcuUSDRUB;
    CheckBox lrcoSILVER;
    CheckBox lrcoGOLD;
    CheckBox lrcuGBPUSD;
    CheckBox lriNSDQ;
    CheckBox lriSP500;
    Spinner spinner5;

    final String url1 = "http://res.cloudinary.com/liutavaras/image/upload/v1492506105/a_oufued.png";
    final String url2 = "http://res.cloudinary.com/liutavaras/image/upload/v1492503937/b_eawxmg.png";
    final String url3 = "http://res.cloudinary.com/liutavaras/image/upload/v1492506105/c_jouf2t.png";
    final String url4 = "http://res.cloudinary.com/liutavaras/image/upload/v1492506105/d_isx7x3.png";

    DatabaseReference databaseClients;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting_priority3);

        databaseClients = FirebaseDatabase.getInstance().getReference("clients");

        //bGoBack = (Button) findViewById(R.id.bGoBack);
        etName = (EditText) findViewById(R.id.etName);
        etCareer = (EditText) findViewById(R.id.etCareer);
        cbTech = (CheckBox) findViewById(R.id.cbTech);
        cbMedi = (CheckBox) findViewById(R.id.cbMedi);
        nfRenewableEnergy = (CheckBox) findViewById(R.id.nfRenewableEnergy);
        nfGoogle = (CheckBox) findViewById(R.id.nfGoogle);
        cfNovartis = (CheckBox) findViewById(R.id.cfNovartis);
        nfTesla = (CheckBox) findViewById(R.id.nfTesla);
        lrsFB = (CheckBox) findViewById(R.id.lrsFB);
        lrsAAPL = (CheckBox) findViewById(R.id.lrsAAPL);
        lrsYHOO = (CheckBox) findViewById(R.id.lrsYHOO);
        cbEURUSD = (CheckBox) findViewById(R.id.cbEURUSD);
        lrcuUSDRUB = (CheckBox) findViewById(R.id.lrcuUSDRUB);
        lrcoSILVER = (CheckBox) findViewById(R.id.lrcoSILVER);
        lrcoGOLD = (CheckBox) findViewById(R.id.lrcoGOLD);
        lrcuGBPUSD = (CheckBox) findViewById(R.id.lrcuGBPUSD);
        lriNSDQ = (CheckBox) findViewById(R.id.lriNSDQ);
        lriSP500 = (CheckBox) findViewById(R.id.lriSP500);
        spinner5 = (Spinner) findViewById(R.id.spinner5);


        ImageButton bSettingsBlack = (ImageButton) findViewById(R.id.ibSettingsBlack);
        ImageButton bEconCalBlack = (ImageButton) findViewById(R.id.ibEconCalBlack);
        ImageButton bLiveRates = (ImageButton) findViewById(R.id.ibLiveRates);
        ImageButton bNewsBlack = (ImageButton) findViewById(R.id.ibNewsBlack);
        ImageButton bAddAProfile = (ImageButton) findViewById(R.id.addAProfile);
        Spinner spinner5 = (Spinner) findViewById(R.id.spinner5);

        bSettingsBlack.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(SettingPriority3.this, SettingsActivity.class));
            }
        });
        bEconCalBlack.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(SettingPriority3.this, WebViewActivity.class));
            }
        });
        bLiveRates.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(SettingPriority3.this, sortingrates.class));
            }
        });
        bNewsBlack.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(SettingPriority3.this, HomePageNews.class);
                intent.putExtra("url1", url1);
                startActivity(intent);

            }
        });
        bAddAProfile.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(SettingPriority3.this, AddProfileActivity.class));
            }
        });


        ArrayAdapter<String> myAdaptor = new ArrayAdapter<String>(SettingPriority3.this,
                R.layout.simple_spinner_item,
                getResources().getStringArray(R.array.letters_array));

        myAdaptor.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spinner5.setAdapter(myAdaptor);

        spinner5.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            public void onClick(View v) {
                // TODO Auto-generated method stub

            }

            @Override
            public void onItemSelected(AdapterView<?> arg0, View view, int position, long row_id) {

                switch (position) {
                    case 1:
                        String key = (String) getIntent().getExtras().get("key");

//                        String url = "http://res.cloudinary.com/liutavaras/image/upload/v1492506105/a_oufued.png";

                        databaseClients.child(key).child("image").setValue(url1);
//                        new DownloadImageTask((ImageView) findViewById(R.id.imageView11))
//                                .execute(downloadAmberA);
                        Intent intent1 = new Intent(SettingPriority3.this, HomePageNews.class);
                        intent1.putExtra("key", key);
                        intent1.putExtra("url1", url1);
                        startActivity(intent1);
                        break;
                    case 2:
                        String key2 = (String) getIntent().getExtras().get("key");
                        databaseClients.child(key2).child("image").setValue(url2);
                        Intent intent2 = new Intent(SettingPriority3.this, HomePageNews.class);
                        intent2.putExtra("url2", url2);
                        startActivity(intent2);
                        break;
                    case 3:
                        String key3 = (String) getIntent().getExtras().get("key");
                        databaseClients.child(key3).child("image").setValue(url3);
                        Intent intent3 = new Intent(SettingPriority3.this, HomePageNews.class);
                        intent3.putExtra("url3", url3);
                        startActivity(intent3);
                        break;
                    case 4:
                        String key4 = (String) getIntent().getExtras().get("key");
                        databaseClients.child(key4).child("image").setValue(url4);
                        Intent intent4 = new Intent(SettingPriority3.this, HomePageNews.class);
                        intent4.putExtra("url4", url4);
                        startActivity(intent4);
                        break;

                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> arg0) {
                // TODO Auto-generated method stub

            }

        });
    }
}