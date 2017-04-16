package com.example.liutaurasmazonas.cslogintrying;

import android.content.Context;
import android.content.Intent;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import org.w3c.dom.Text;

import static com.example.liutaurasmazonas.cslogintrying.R.id.Sentbutton;
import static com.example.liutaurasmazonas.cslogintrying.R.id.addAProfile;
import static com.example.liutaurasmazonas.cslogintrying.R.id.spinner;

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
    Spinner spinner5;
    Button galleryspinner;


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
        spinner5 = (Spinner) findViewById(R.id.spinner5);


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





        int[] array = getResources().getIntArray(R.array.images_array);
        String [] objects = new String[array.length];
        for(int i = 0; i != array.length; i++){
            objects[i] = "" + array[i];
        }

        spinner5.setAdapter(new MyAdapter(AddProfileActivity.this, R.id.spinner5, objects));

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_add_profile, menu);
        return true;
    }

    class MyAdapter extends ArrayAdapter<String>{

        String[] objects;
        public MyAdapter(Context context, int textViewResourceId,   String[] objects) {
            super(context, textViewResourceId, objects);
            this.objects = objects;
        }

        @Override
        public View getDropDownView(int position, View convertView,ViewGroup parent) {
            return getCustomView(position, convertView, parent);
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            return getCustomView(position, convertView, parent);
        }

        public View getCustomView(int position, View convertView, ViewGroup parent) {

            LayoutInflater inflater=getLayoutInflater();
            View row=inflater.inflate(R.layout.row, parent, false);


            ImageView icon = (ImageView) row.findViewById(R.id.icon);
            TypedArray imgs = getResources().obtainTypedArray(R.array.images_array);
            icon.setImageResource(imgs.getResourceId(position, -1));

            return row;
        }
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
        String valueOfSelectedPos = spinner5.getSelectedItem().toString().trim();

        if(!TextUtils.isEmpty(name)){
          String id =  databaseClients.push().getKey();

            Clients clients = new Clients(id, name, career, techCB, mediCB, renewableEnergyNF, googleNF,
                    novartisNF, teslaNF, fbLRS, applLRS, yhooLRS, eurusdCB, usdrubCU, silverCO,
                    goldCO, gbpusdCU, nsdqI, sp500I, valueOfSelectedPos );

            databaseClients.child(id).setValue(clients);

            Toast.makeText(this, "Client added", Toast.LENGTH_LONG).show();

            startActivity(new Intent(AddProfileActivity.this, AddProfileActivity.class));



        }else{
            Toast.makeText(this, "Please enter your name", Toast.LENGTH_LONG).show();

        }

    }

    }


