package com.example.liutaurasmazonas.cslogintrying;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import org.w3c.dom.Text;

import static com.example.liutaurasmazonas.cslogintrying.R.id.addAProfile;

public class AddProfileActivity extends AppCompatActivity {

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
    Button bSave;



    DatabaseReference databaseClients;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_profile);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        databaseClients = FirebaseDatabase.getInstance().getReference("clients");

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
        bSave = (Button) findViewById(R.id.bSave);


        ImageButton bSettingsBlack = (ImageButton) findViewById(R.id.ibSettingsBlack);
        ImageButton bEconCalBlack = (ImageButton) findViewById(R.id.ibEconCalBlack);
        ImageButton bLiveRates = (ImageButton) findViewById(R.id.ibLiveRates);
        ImageButton bNewsBlack = (ImageButton) findViewById(R.id.ibNewsBlack);

        bSettingsBlack.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(AddProfileActivity.this, SettingsActivity.class));
            }
        });
        bEconCalBlack.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(AddProfileActivity.this, WebViewActivity.class));
            }
        });
        bLiveRates.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(AddProfileActivity.this, sortingrates.class));
            }
        });
        bNewsBlack.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(AddProfileActivity.this, HomePageNews.class));
            }
        });

        bSave.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                bSave();

            }
        });



    }

    private void bSave(){
        String name = etName.getText().toString().trim();
        String career = etCareer.getText().toString().trim();
        Boolean techCB = cbTech.isChecked();
        Boolean mediCB = cbMedi.isChecked();
        Boolean renewableEnergyNF = nfRenewableEnergy.isChecked();
        Boolean googleNF = nfGoogle.isChecked();
        Boolean novartisNF = cfNovartis.isChecked();
        Boolean teslaNF = nfTesla.isChecked();
        Boolean fbLRS = lrsFB.isChecked();
        Boolean applLRS = lrsAAPL.isChecked();
        Boolean yhooLRS = lrsYHOO.isChecked();
        Boolean eurusdCB = cbEURUSD.isChecked();
        Boolean usdrubCU = lrcuUSDRUB.isChecked();
        Boolean silverCO = lrcoSILVER.isChecked();
        Boolean goldCO = lrcoGOLD.isChecked();
        Boolean gbpusdCU = lrcuGBPUSD.isChecked();
        Boolean nsdqI = lriNSDQ.isChecked();
        Boolean sp500I = lriSP500.isChecked();


        if(!TextUtils.isEmpty(name)){
          String id =  databaseClients.push().getKey();

            Clients clients = new Clients(id, name, career, techCB, mediCB, renewableEnergyNF, googleNF,
                    novartisNF, teslaNF, fbLRS, applLRS, yhooLRS, eurusdCB, usdrubCU, silverCO,
                    goldCO, gbpusdCU, nsdqI, sp500I );

            databaseClients.child(id).setValue(clients);

            Toast.makeText(this, "Client added", Toast.LENGTH_LONG).show();

            startActivity(new Intent(AddProfileActivity.this, AddProfileActivity.class));



        }else{
            Toast.makeText(this, "Please enter your name", Toast.LENGTH_LONG).show();

        }


    }

}
