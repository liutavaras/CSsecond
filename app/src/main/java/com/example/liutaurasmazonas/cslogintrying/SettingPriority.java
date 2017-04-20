package com.example.liutaurasmazonas.cslogintrying;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.os.Handler;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.Spinner;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.io.InputStream;

import static com.example.liutaurasmazonas.cslogintrying.R.id.activity_add_profile;
import static com.example.liutaurasmazonas.cslogintrying.R.id.addAProfile;
import static com.example.liutaurasmazonas.cslogintrying.R.id.bSave;
import static com.example.liutaurasmazonas.cslogintrying.R.id.cbEURUSD;
import static com.example.liutaurasmazonas.cslogintrying.R.id.cbMedi;
import static com.example.liutaurasmazonas.cslogintrying.R.id.cbTech;
import static com.example.liutaurasmazonas.cslogintrying.R.id.cfNovartis;
import static com.example.liutaurasmazonas.cslogintrying.R.id.etCareer;
import static com.example.liutaurasmazonas.cslogintrying.R.id.etName;
import static com.example.liutaurasmazonas.cslogintrying.R.id.imageView11;
import static com.example.liutaurasmazonas.cslogintrying.R.id.lrcoGOLD;
import static com.example.liutaurasmazonas.cslogintrying.R.id.lrcoSILVER;
import static com.example.liutaurasmazonas.cslogintrying.R.id.lrcuGBPUSD;
import static com.example.liutaurasmazonas.cslogintrying.R.id.lrcuUSDRUB;
import static com.example.liutaurasmazonas.cslogintrying.R.id.lriNSDQ;
import static com.example.liutaurasmazonas.cslogintrying.R.id.lriSP500;
import static com.example.liutaurasmazonas.cslogintrying.R.id.lrsAAPL;
import static com.example.liutaurasmazonas.cslogintrying.R.id.lrsFB;
import static com.example.liutaurasmazonas.cslogintrying.R.id.lrsYHOO;
import static com.example.liutaurasmazonas.cslogintrying.R.id.nfGoogle;
import static com.example.liutaurasmazonas.cslogintrying.R.id.nfRenewableEnergy;
import static com.example.liutaurasmazonas.cslogintrying.R.id.nfTesla;
import static com.example.liutaurasmazonas.cslogintrying.R.id.parent;

public class SettingPriority extends AppCompatActivity {

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
    Button bGoBack;
    Spinner spinner5;

    String downloadAmberA = "http://res.cloudinary.com/liutavaras/image/upload/v1492506105/a_oufued.png";
    String downloadAmberB = "http://res.cloudinary.com/liutavaras/image/upload/v1492503937/b_eawxmg.png";
    String downloadAmberC = "http://res.cloudinary.com/liutavaras/image/upload/v1492506105/c_jouf2t.png";
    String downloadAmberD = "http://res.cloudinary.com/liutavaras/image/upload/v1492506105/d_isx7x3.png";

    DatabaseReference databaseClients;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting_priority);

        databaseClients = FirebaseDatabase.getInstance().getReference("clients");

        bGoBack = (Button) findViewById(R.id.bGoBack);
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

        bSettingsBlack.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(SettingPriority.this, SettingsActivity.class));
            }
        });
        bEconCalBlack.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(SettingPriority.this, WebViewActivity.class));
            }
        });
        bLiveRates.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(SettingPriority.this, sortingrates.class));
            }
        });
        bNewsBlack.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(SettingPriority.this, HomePageNews.class));
            }
        });
        bAddAProfile.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(SettingPriority.this, AddProfileActivity.class));
            }
        });


        ArrayAdapter<String> myAdaptor = new ArrayAdapter<String>(SettingPriority.this,
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
                        String url = "http://res.cloudinary.com/liutavaras/image/upload/v1492506105/a_oufued.png";
                        String id = (String) getIntent().getExtras().get("id");
                        databaseClients.child(id).child("image").setValue(url);
                        new DownloadImageTask((ImageView) findViewById(R.id.imageView11))
                                .execute(downloadAmberA);
                        Intent a = new Intent(SettingPriority.this, HomePageNews.class);
                        a.putExtra("url", url);
                        startActivity(a);
                        break;
                    case 2:
                        String url2 = "http://res.cloudinary.com/liutavaras/image/upload/v1492503937/b_eawxmg.png";
                        String id2 = (String) getIntent().getExtras().get("id");
                        databaseClients.child(id2).child("image").setValue(url2);
                        new DownloadImageTask((ImageView) findViewById(R.id.imageView11))
                                .execute(downloadAmberB);
                        Intent b = new Intent(SettingPriority.this, HomePageNews.class);
                        b.putExtra("url", url2);
                        startActivity(b);
                        break;
                    case 3:
                        String url3 = "http://res.cloudinary.com/liutavaras/image/upload/v1492503937/b_eawxmg.png";
                        String id3 = (String) getIntent().getExtras().get("id");
                        databaseClients.child(id3).child("image").setValue(url3);
                        new DownloadImageTask((ImageView) findViewById(R.id.imageView11))
                                .execute(downloadAmberB);
                        Intent c = new Intent(SettingPriority.this, HomePageNews.class);
                        c.putExtra("url", url3);
                        startActivity(c);
                        break;
                    case 4:
                        String url4 = "http://res.cloudinary.com/liutavaras/image/upload/v1492503937/b_eawxmg.png";
                        String id4 = (String) getIntent().getExtras().get("id");
                        databaseClients.child(id4).child("image").setValue(url4);
                        new DownloadImageTask((ImageView) findViewById(R.id.imageView11))
                                .execute(downloadAmberB);
                        Intent d = new Intent(SettingPriority.this, HomePageNews.class);
                        d.putExtra("url", url4);
                        startActivity(d);
                        break;

                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> arg0) {
                // TODO Auto-generated method stub

            }

        });

//        bGoBack.setOnClickListener(new View.OnClickListener() {
//            public void onClick(View v) {
//                String url = "http://res.cloudinary.com/liutavaras/image/upload/v1492506105/a_oufued.png";
//                if (spinner5.getSelectedItem().toString().equals("A")) {
//                    Intent i = new Intent(SettingPriority.this, HomePageNews.class);
//                    i.putExtra("url", url);
//                    startActivity(i);
//                }
//                else if(spinner5.getSelectedItem().toString().equals("B")) {
//                    Intent i = new Intent(SettingPriority.this, HomePageNews.class);
//                    i.putExtra("url", url2);
//                    startActivity(i);
//                }else{
//                    Toast.makeText(getApplication(), "No priority selected", Toast.LENGTH_SHORT).show();
//                }
//
//
//                startActivity(new Intent(SettingPriority.this, HomePageNews.class));
//            }
//        });

    }

    private class DownloadImageTask extends AsyncTask<String, Void, Bitmap> {
        ImageView imageView11;

        public DownloadImageTask(ImageView imageView11) {
            this.imageView11 = imageView11;
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
            imageView11.setImageBitmap(result);


        }
    }
}
