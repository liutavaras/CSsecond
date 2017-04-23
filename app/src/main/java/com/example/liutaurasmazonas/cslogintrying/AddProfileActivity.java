package com.example.liutaurasmazonas.cslogintrying;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.media.Image;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.Toast;

import com.firebase.client.Firebase;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import org.w3c.dom.Text;

import java.io.InputStream;

import static com.example.liutaurasmazonas.cslogintrying.R.id.add;
import static com.example.liutaurasmazonas.cslogintrying.R.id.addAProfile;
import static com.example.liutaurasmazonas.cslogintrying.R.id.imageView;
import static com.example.liutaurasmazonas.cslogintrying.R.id.imageView11;
import static com.example.liutaurasmazonas.cslogintrying.R.id.parent;
import static com.example.liutaurasmazonas.cslogintrying.R.layout.home_page_news;

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
    ImageButton bellbutton;
    ImageView imageView10;

    private ProgressDialog mProgress;
//    String downloadAmberA = "http://res.cloudinary.com/liutavaras/image/upload/v1492506105/a_oufued.png";
//    String downloadAmberB = "http://res.cloudinary.com/liutavaras/image/upload/v1492503937/b_eawxmg.png";
//    String downloadAmberC = "http://res.cloudinary.com/liutavaras/image/upload/v1492506105/c_jouf2t.png";
//    String downloadAmberD = "http://res.cloudinary.com/liutavaras/image/upload/v1492506105/d_isx7x3.png";

//    DatabaseReference databaseClients;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_profile);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

//        databaseClients = FirebaseDatabase.getInstance().getReference("clients");
//        databasePhotos = FirebaseDatabase.getInstance().getReference("photos");
        Firebase.setAndroidContext(this);

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


        bSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bSave();

            }
        });



//        Spinner spinner5;
//
//        spinner5 = (Spinner) findViewById(R.id.spinner5);
//
//        ArrayAdapter<String> myAdaptor = new ArrayAdapter<String>(AddProfileActivity.this,
//                R.layout.simple_spinner_item,
//                getResources().getStringArray(R.array.letters_array));
//
//        myAdaptor.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
//
//        spinner5.setAdapter(myAdaptor);
//
//        spinner5.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
//
//            public void onClick(View v) {
//                // TODO Auto-generated method stub
//
//            }
//
//            @Override
//            public void onItemSelected(AdapterView<?> arg0, View view, int position, long row_id) {
//                final Intent intent;
//
//
//                switch (position) {
//                    case 1:
//
////                        String image = downloadAmberA.toString();
////
////                        String id =  databaseClients.push().getKey();
////                        Clients clients = new Clients(id, image);
////
////                        databaseClients.child(id).setValue(clients);
//
//
//                        new DownloadImageTask((ImageView) findViewById(R.id.imageView10))
//                                .execute(downloadAmberA);
//                        break;
//                    case 2:
//                        new DownloadImageTask((ImageView) findViewById(R.id.imageView10))
//                                .execute(downloadAmberB);
//                        break;
//                    case 3:
//                        new DownloadImageTask((ImageView) findViewById(R.id.imageView10))
//                                .execute(downloadAmberC);
//                        break;
//                    case 4:
//                        new DownloadImageTask((ImageView) findViewById(R.id.imageView10))
//                                .execute(downloadAmberD);
//                        break;
//
//                }
//
//            }
//
//            @Override
//            public void onNothingSelected(AdapterView<?> arg0) {
//                // TODO Auto-generated method stub
//
//            }
//
//        });
//

    }

    private class DownloadImageTask extends AsyncTask<String, Void, Bitmap> {
        ImageView imageView10;

        public DownloadImageTask(ImageView imageView10) {
            this.imageView10 = imageView10;
        }

        protected Bitmap doInBackground(String... urls) {
            String urldisplay = urls[0];
            Bitmap mIcon11 = null;
            try {
                InputStream in = new java.net.URL(urldisplay).openStream();
                mIcon11 = BitmapFactory.decodeStream(in);
            } catch (Exception e) {
                Log.e("Error", e.getMessage());
                e.printStackTrace();
            }
            return mIcon11;
        }

        protected void onPostExecute(Bitmap result) {
            imageView10.setImageBitmap(result);
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
        String image = "joe";



        if(!TextUtils.isEmpty(name)){
//            String id =  databaseClients.push().getKey();
            String address = "https://console.firebase.google.com/project/cssecond-92a2d/database/data/clients/";
            Firebase ref = new Firebase(address);
            Firebase newRef = ref.push();
            String key = newRef.getKey();


            Clients clients = new Clients (key, name, career, techCB, mediCB, renewableEnergyNF, googleNF,
                    novartisNF, teslaNF, fbLRS, applLRS, yhooLRS, eurusdCB, usdrubCU, silverCO,
                    goldCO, gbpusdCU, nsdqI, sp500I, image );

            newRef.child(key).setValue(clients);

            Toast.makeText(this, "Client added", Toast.LENGTH_LONG).show();


            Intent intent = new Intent(AddProfileActivity.this, SettingPriority.class);
            intent.putExtra("key", key);
            startActivity(intent);

//            startActivity(new Intent(AddProfileActivity.this, SettingPriority.class));




        }else{
            Toast.makeText(this, "Please enter your name", Toast.LENGTH_LONG).show();

        }

    }


}