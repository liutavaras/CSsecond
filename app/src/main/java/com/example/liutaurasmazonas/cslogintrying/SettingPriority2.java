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

public class SettingPriority2 extends AppCompatActivity {

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



    //Green circles:
    final String gurl1 = "http://res.cloudinary.com/liutavaras/image/upload/v1493125480/a_nfnlas.png";
    final String gurl2 = "http://res.cloudinary.com/liutavaras/image/upload/v1493125480/b_bkkac4.png";
    final String gurl3 = "http://res.cloudinary.com/liutavaras/image/upload/v1493125480/c_km2vhn.png";
    final String gurl4 = "http://res.cloudinary.com/liutavaras/image/upload/v1493125480/d_cftn9n.png";
    final String gurl5 = "http://res.cloudinary.com/liutavaras/image/upload/v1493125480/e_cemsct.png";
    final String gurl6 = "http://res.cloudinary.com/liutavaras/image/upload/v1493125480/f_kf5vxe.png";
    final String gurl7 = "http://res.cloudinary.com/liutavaras/image/upload/v1493125481/g_uoyw17.png";
    final String gurl8 = "http://res.cloudinary.com/liutavaras/image/upload/v1493125481/h_utmd5c.png";
    final String gurl9 = "http://res.cloudinary.com/liutavaras/image/upload/v1493125481/i_drprth.png";
    final String gurl10 = "http://res.cloudinary.com/liutavaras/image/upload/v1493125481/j_i9ho4x.png";
    final String gurl11 = "http://res.cloudinary.com/liutavaras/image/upload/v1493125481/k_vegzk9.png";
    final String gurl12 = "http://res.cloudinary.com/liutavaras/image/upload/v1493125481/l_r3dus1.png";
    final String gurl13 = "http://res.cloudinary.com/liutavaras/image/upload/v1493125481/m_oazvm5.png";
    final String gurl14 = "http://res.cloudinary.com/liutavaras/image/upload/v1493125481/n_ctnj8t.png";
    final String gurl15 = "http://res.cloudinary.com/liutavaras/image/upload/v1493125481/o_rukxmy.png";
    final String gurl16 = "http://res.cloudinary.com/liutavaras/image/upload/v1493125481/p_vqfcmu.png";
    final String gurl17 = "http://res.cloudinary.com/liutavaras/image/upload/v1493125481/q_xdbpk8.png";
    final String gurl18 = "http://res.cloudinary.com/liutavaras/image/upload/v1493125481/r_ywn7hj.png";
    final String gurl19 = "http://res.cloudinary.com/liutavaras/image/upload/v1493125482/s_cbvhxu.png";
    final String gurl20 = "http://res.cloudinary.com/liutavaras/image/upload/v1493125482/t_ioz19h.png";
    final String gurl21 = "http://res.cloudinary.com/liutavaras/image/upload/v1493125482/u_gxaa6k.png";
    final String gurl22 = "http://res.cloudinary.com/liutavaras/image/upload/v1493125482/v_hmupzd.png";
    final String gurl23 = "http://res.cloudinary.com/liutavaras/image/upload/v1493125482/w_npdliu.png";
    final String gurl24 = "http://res.cloudinary.com/liutavaras/image/upload/v1493125482/x_nsglrk.png";
    final String gurl25 = "http://res.cloudinary.com/liutavaras/image/upload/v1493125482/y_mpckvd.png";
    final String gurl26 = "http://res.cloudinary.com/liutavaras/image/upload/v1493125482/z_hhktgn.png";

    //Red circles:
    final String rurl1 = "http://res.cloudinary.com/liutavaras/image/upload/v1492506105/a_oufued.png";
    final String rurl2 = "http://res.cloudinary.com/liutavaras/image/upload/v1493125480/b_bkkac4.png";
    final String rurl3 = "http://res.cloudinary.com/liutavaras/image/upload/v1493125480/c_km2vhn.png";
    final String rurl4 = "http://res.cloudinary.com/liutavaras/image/upload/v1493125480/d_cftn9n.png";
    final String rurl5 = "http://res.cloudinary.com/liutavaras/image/upload/v1493125480/e_cemsct.png";
    final String rurl6 = "http://res.cloudinary.com/liutavaras/image/upload/v1493125480/f_kf5vxe.png";
    final String rurl7 = "http://res.cloudinary.com/liutavaras/image/upload/v1493125481/g_uoyw17.png";
    final String rurl8 = "http://res.cloudinary.com/liutavaras/image/upload/v1493125481/h_utmd5c.png";
    final String rurl9 = "http://res.cloudinary.com/liutavaras/image/upload/v1493125481/i_drprth.png";
    final String rurl10 = "http://res.cloudinary.com/liutavaras/image/upload/v1493125481/j_i9ho4x.png";
    final String rurl11 = "http://res.cloudinary.com/liutavaras/image/upload/v1493125481/k_vegzk9.png";
    final String rurl12 = "http://res.cloudinary.com/liutavaras/image/upload/v1493125481/l_r3dus1.png";
    final String rurl13 = "http://res.cloudinary.com/liutavaras/image/upload/v1493125481/m_oazvm5.png";
    final String rurl14 = "http://res.cloudinary.com/liutavaras/image/upload/v1493125481/n_ctnj8t.png";
    final String rurl15 = "http://res.cloudinary.com/liutavaras/image/upload/v1493125481/o_rukxmy.png";
    final String rurl16 = "http://res.cloudinary.com/liutavaras/image/upload/v1493125481/p_vqfcmu.png";
    final String rurl17 = "http://res.cloudinary.com/liutavaras/image/upload/v1493125481/q_xdbpk8.png";
    final String rurl18 = "http://res.cloudinary.com/liutavaras/image/upload/v1493125481/r_ywn7hj.png";
    final String rurl19 = "http://res.cloudinary.com/liutavaras/image/upload/v1493125482/s_cbvhxu.png";
    final String rurl20 = "http://res.cloudinary.com/liutavaras/image/upload/v1493125482/t_ioz19h.png";
    final String rurl21 = "http://res.cloudinary.com/liutavaras/image/upload/v1493125482/u_gxaa6k.png";
    final String rurl22 = "http://res.cloudinary.com/liutavaras/image/upload/v1493125482/v_hmupzd.png";
    final String rurl23 = "http://res.cloudinary.com/liutavaras/image/upload/v1493125482/w_npdliu.png";
    final String rurl24 = "http://res.cloudinary.com/liutavaras/image/upload/v1493125482/x_nsglrk.png";
    final String rurl25 = "http://res.cloudinary.com/liutavaras/image/upload/v1493125482/y_mpckvd.png";
    final String rurl26 = "http://res.cloudinary.com/liutavaras/image/upload/v1493125482/z_hhktgn.png";

    //Amber circles:
    final String aurl1 = "http://res.cloudinary.com/liutavaras/image/upload/v1492506105/a_oufued.png";
    final String aurl2 = "http://res.cloudinary.com/liutavaras/image/upload/v1493125480/b_bkkac4.png";
    final String aurl3 = "http://res.cloudinary.com/liutavaras/image/upload/v1493125480/c_km2vhn.png";
    final String aurl4 = "http://res.cloudinary.com/liutavaras/image/upload/v1493125480/d_cftn9n.png";
    final String aurl5 = "http://res.cloudinary.com/liutavaras/image/upload/v1493125480/e_cemsct.png";
    final String aurl6 = "http://res.cloudinary.com/liutavaras/image/upload/v1493125480/f_kf5vxe.png";
    final String aurl7 = "http://res.cloudinary.com/liutavaras/image/upload/v1493125481/g_uoyw17.png";
    final String aurl8 = "http://res.cloudinary.com/liutavaras/image/upload/v1493125481/h_utmd5c.png";
    final String aurl9 = "http://res.cloudinary.com/liutavaras/image/upload/v1493125481/i_drprth.png";
    final String aurl10 = "http://res.cloudinary.com/liutavaras/image/upload/v1493125481/j_i9ho4x.png";
    final String aurl11 = "http://res.cloudinary.com/liutavaras/image/upload/v1493125481/k_vegzk9.png";
    final String aurl12 = "http://res.cloudinary.com/liutavaras/image/upload/v1493125481/l_r3dus1.png";
    final String aurl13 = "http://res.cloudinary.com/liutavaras/image/upload/v1493125481/m_oazvm5.png";
    final String aurl14 = "http://res.cloudinary.com/liutavaras/image/upload/v1493125481/n_ctnj8t.png";
    final String aurl15 = "http://res.cloudinary.com/liutavaras/image/upload/v1493125481/o_rukxmy.png";
    final String aurl16 = "http://res.cloudinary.com/liutavaras/image/upload/v1493125481/p_vqfcmu.png";
    final String aurl17 = "http://res.cloudinary.com/liutavaras/image/upload/v1493125481/q_xdbpk8.png";
    final String aurl18 = "http://res.cloudinary.com/liutavaras/image/upload/v1493125481/r_ywn7hj.png";
    final String aurl19 = "http://res.cloudinary.com/liutavaras/image/upload/v1493125482/s_cbvhxu.png";
    final String aurl20 = "http://res.cloudinary.com/liutavaras/image/upload/v1493125482/t_ioz19h.png";
    final String aurl21 = "http://res.cloudinary.com/liutavaras/image/upload/v1493125482/u_gxaa6k.png";
    final String aurl22 = "http://res.cloudinary.com/liutavaras/image/upload/v1493125482/v_hmupzd.png";
    final String aurl23 = "http://res.cloudinary.com/liutavaras/image/upload/v1493125482/w_npdliu.png";
    final String aurl24 = "http://res.cloudinary.com/liutavaras/image/upload/v1493125482/x_nsglrk.png";
    final String aurl25 = "http://res.cloudinary.com/liutavaras/image/upload/v1493125482/y_mpckvd.png";
    final String aurl26 = "http://res.cloudinary.com/liutavaras/image/upload/v1493125482/z_hhktgn.png";


    DatabaseReference databaseClients;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting_priority1);

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
        final ImageButton ibSearch = (ImageButton) findViewById(R.id.ibSearch);

        bSettingsBlack.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(SettingPriority2.this, SettingsActivity.class));
            }
        });
        bEconCalBlack.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(SettingPriority2.this, WebViewActivity.class));
            }
        });
        bLiveRates.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(SettingPriority2.this, sortingrates.class));
            }
        });
        bNewsBlack.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(SettingPriority2.this, HomePageNews.class);
                intent.putExtra("url1", url1);
                startActivity(intent);

            }
        });
        bAddAProfile.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(SettingPriority2.this, AddProfileActivity.class));
            }
        });
        ibSearch.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(SettingPriority2.this, GoogleSearchIntentActivity.class));
            }

        });


        ArrayAdapter<String> myAdaptor = new ArrayAdapter<String>(SettingPriority2.this,
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
                        Intent intent1 = new Intent(SettingPriority2.this, HomePageNews.class);
                        intent1.putExtra("ggurl1", gurl1);
                        startActivity(intent1);
                        break;
                    case 2:
                        Intent intent2 = new Intent(SettingPriority2.this, HomePageNews.class);
                        intent2.putExtra("ggurl2", gurl2);
                        startActivity(intent2);
                        break;
                    case 3:
                        Intent intent3 = new Intent(SettingPriority2.this, HomePageNews.class);
                        intent3.putExtra("ggurl3", gurl3);
                        startActivity(intent3);
                        break;
                    case 4:
                        Intent intent4 = new Intent(SettingPriority2.this, HomePageNews.class);
                        intent4.putExtra("ggurl4", gurl4);
                        startActivity(intent4);
                        break;
                    case 5:
                        Intent intent5 = new Intent(SettingPriority2.this, HomePageNews.class);
                        intent5.putExtra("ggurl5", gurl5);
                        startActivity(intent5);
                        break;
                    case 6:
                        Intent intent6 = new Intent(SettingPriority2.this, HomePageNews.class);
                        intent6.putExtra("ggurl6", gurl6);
                        startActivity(intent6);
                        break;
                    case 7:
                        Intent intent7 = new Intent(SettingPriority2.this, HomePageNews.class);
                        intent7.putExtra("ggurl7", gurl7);
                        startActivity(intent7);
                        break;
                    case 8:
                        Intent intent8 = new Intent(SettingPriority2.this, HomePageNews.class);
                        intent8.putExtra("ggurl8", gurl8);
                        startActivity(intent8);
                        break;
                    case 9:
                        Intent intent9 = new Intent(SettingPriority2.this, HomePageNews.class);
                        intent9.putExtra("ggurl9", gurl9);
                        startActivity(intent9);
                        break;
                    case 10:
                        Intent intent10 = new Intent(SettingPriority2.this, HomePageNews.class);
                        intent10.putExtra("ggurl10", gurl10);
                        startActivity(intent10);
                        break;
                    case 11:
                        Intent intent11 = new Intent(SettingPriority2.this, HomePageNews.class);
                        intent11.putExtra("ggurl11", gurl11);
                        startActivity(intent11);
                        break;
                    case 12:
                        Intent intent12 = new Intent(SettingPriority2.this, HomePageNews.class);
                        intent12.putExtra("ggurl9", gurl12);
                        startActivity(intent12);
                        break;
                    case 13:
                        Intent intent13 = new Intent(SettingPriority2.this, HomePageNews.class);
                        intent13.putExtra("ggurl9", gurl13);
                        startActivity(intent13);
                        break;
                    case 14:
                        Intent intent14 = new Intent(SettingPriority2.this, HomePageNews.class);
                        intent14.putExtra("ggurl14", gurl14);
                        startActivity(intent14);
                        break;
                    case 15:
                        Intent intent15 = new Intent(SettingPriority2.this, HomePageNews.class);
                        intent15.putExtra("ggurl15", gurl15);
                        startActivity(intent15);
                        break;
                    case 16:
                        Intent intent16 = new Intent(SettingPriority2.this, HomePageNews.class);
                        intent16.putExtra("ggurl16", gurl16);
                        startActivity(intent16);
                        break;
                    case 17:
                        Intent intent17 = new Intent(SettingPriority2.this, HomePageNews.class);
                        intent17.putExtra("ggurl17", gurl17);
                        startActivity(intent17);
                        break;
                    case 18:
                        Intent intent18 = new Intent(SettingPriority2.this, HomePageNews.class);
                        intent18.putExtra("ggurl9", gurl18);
                        startActivity(intent18);
                        break;
                    case 19:
                        Intent intent19 = new Intent(SettingPriority2.this, HomePageNews.class);
                        intent19.putExtra("ggurl9", gurl19);
                        startActivity(intent19);
                        break;
                    case 20:
                        Intent intent20 = new Intent(SettingPriority2.this, HomePageNews.class);
                        intent20.putExtra("ggurl9", gurl9);
                        startActivity(intent20);
                        break;
                    case 21:
                        Intent intent21 = new Intent(SettingPriority2.this, HomePageNews.class);
                        intent21.putExtra("ggurl21", gurl21);
                        startActivity(intent21);
                        break;
                    case 22:
                        Intent intent22 = new Intent(SettingPriority2.this, HomePageNews.class);
                        intent22.putExtra("ggurl22", gurl22);
                        startActivity(intent22);
                        break;
                    case 23:
                        Intent intent23 = new Intent(SettingPriority2.this, HomePageNews.class);
                        intent23.putExtra("ggurl23", gurl23);
                        startActivity(intent23);
                        break;
                    case 24:
                        Intent intent24 = new Intent(SettingPriority2.this, HomePageNews.class);
                        intent24.putExtra("ggurl24", gurl24);
                        startActivity(intent24);
                        break;
                    case 25:
                        Intent intent25 = new Intent(SettingPriority2.this, HomePageNews.class);
                        intent25.putExtra("ggurl25", gurl25);
                        startActivity(intent25);
                        break;
                    case 26:
                        Intent intent26 = new Intent(SettingPriority2.this, HomePageNews.class);
                        intent26.putExtra("ggurl26", gurl26);
                        startActivity(intent26);
                        break;
                    case 27:
                        Intent intent27 = new Intent(SettingPriority2.this, HomePageNews.class);
                        intent27.putExtra("aaurl1", aurl1);
                        startActivity(intent27);
                        break;
                    case 28:
//                        String key4 = (String) getIntent().getExtras().get("key");
//                        databaseClients.child(key).child("image").setValue(gurl4);
                        Intent intent28 = new Intent(SettingPriority2.this, HomePageNews.class);
//                        intent4.putExtra("key", key);
                        intent28.putExtra("aaurl2", aurl2);
                        startActivity(intent28);
                        break;
                    case 29:
//                        String key4 = (String) getIntent().getExtras().get("key");
//                        databaseClients.child(key).child("image").setValue(gurl4);
                        Intent intent29 = new Intent(SettingPriority2.this, HomePageNews.class);
//                        intent4.putExtra("key", key);
                        intent29.putExtra("aaurl3", aurl3);
                        startActivity(intent29);
                        break;
                    case 30:
//                        String key4 = (String) getIntent().getExtras().get("key");
//                        databaseClients.child(key).child("image").setValue(gurl4);
                        Intent intent30 = new Intent(SettingPriority2.this, HomePageNews.class);
//                        intent4.putExtra("key", key);
                        intent30.putExtra("aaurl4", aurl4);
                        startActivity(intent30);
                        break;
                    case 31:
//                        String key4 = (String) getIntent().getExtras().get("key");
//                        databaseClients.child(key).child("image").setValue(gurl4);
                        Intent intent31 = new Intent(SettingPriority2.this, HomePageNews.class);
//                        intent4.putExtra("key", key);
                        intent31.putExtra("aaurl5", aurl5);
                        startActivity(intent31);
                        break;
                    case 32:
//                        String key4 = (String) getIntent().getExtras().get("key");
//                        databaseClients.child(key).child("image").setValue(gurl4);
                        Intent intent32 = new Intent(SettingPriority2.this, HomePageNews.class);
//                        intent4.putExtra("key", key);
                        intent32.putExtra("aaurl6", aurl6);
                        startActivity(intent32);
                        break;
                    case 33:
//                        String key4 = (String) getIntent().getExtras().get("key");
//                        databaseClients.child(key).child("image").setValue(gurl4);
                        Intent intent33 = new Intent(SettingPriority2.this, HomePageNews.class);
//                        intent4.putExtra("key", key);
                        intent33.putExtra("aaurl7", aurl7);
                        startActivity(intent33);
                        break;
                    case 34:
//                        String key4 = (String) getIntent().getExtras().get("key");
//                        databaseClients.child(key).child("image").setValue(gurl4);
                        Intent intent34 = new Intent(SettingPriority2.this, HomePageNews.class);
//                        intent4.putExtra("key", key);
                        intent34.putExtra("aaurl8", aurl8);
                        startActivity(intent34);
                        break;
                    case 35:
//                        String key4 = (String) getIntent().getExtras().get("key");
//                        databaseClients.child(key).child("image").setValue(gurl4);
                        Intent intent35 = new Intent(SettingPriority2.this, HomePageNews.class);
//                        intent4.putExtra("key", key);
                        intent35.putExtra("aaurl9", aurl9);
                        startActivity(intent35);
                        break;
                    case 36:
//                        String key4 = (String) getIntent().getExtras().get("key");
//                        databaseClients.child(key).child("image").setValue(gurl4);
                        Intent intent36 = new Intent(SettingPriority2.this, HomePageNews.class);
//                        intent4.putExtra("key", key);
                        intent36.putExtra("aaurl10", aurl10);
                        startActivity(intent36);
                        break;
                    case 37:
//                        String key4 = (String) getIntent().getExtras().get("key");
//                        databaseClients.child(key).child("image").setValue(gurl4);
                        Intent intent37 = new Intent(SettingPriority2.this, HomePageNews.class);
//                        intent4.putExtra("key", key);
                        intent37.putExtra("aaurl11", aurl11);
                        startActivity(intent37);
                        break;
                    case 38:
//                        String key4 = (String) getIntent().getExtras().get("key");
//                        databaseClients.child(key).child("image").setValue(gurl4);
                        Intent intent38 = new Intent(SettingPriority2.this, HomePageNews.class);
//                        intent4.putExtra("key", key);
                        intent38.putExtra("aaurl12", aurl12);
                        startActivity(intent38);
                        break;
                    case 39:
//                        String key4 = (String) getIntent().getExtras().get("key");
//                        databaseClients.child(key).child("image").setValue(gurl4);
                        Intent intent39 = new Intent(SettingPriority2.this, HomePageNews.class);
//                        intent4.putExtra("key", key);
                        intent39.putExtra("aaurl13", aurl13);
                        startActivity(intent39);
                        break;
                    case 40:
//                        String key4 = (String) getIntent().getExtras().get("key");
//                        databaseClients.child(key).child("image").setValue(gurl4);
                        Intent intent40 = new Intent(SettingPriority2.this, HomePageNews.class);
//                        intent4.putExtra("key", key);
                        intent40.putExtra("aaurl14", aurl14);
                        startActivity(intent40);
                        break;
                    case 41:
//                        String key4 = (String) getIntent().getExtras().get("key");
//                        databaseClients.child(key).child("image").setValue(gurl4);
                        Intent intent41 = new Intent(SettingPriority2.this, HomePageNews.class);
//                      intent41.putExtra("key", key);
                        intent41.putExtra("aaurl15", aurl15);
                        startActivity(intent41);
                        break;
                    case 42:
//                        String key4 = (String) getIntent().getExtras().get("key");
//                        databaseClients.child(key).child("image").setValue(gurl4);
                        Intent intent42 = new Intent(SettingPriority2.this, HomePageNews.class);
//                      intent41.putExtra("key", key);
                        intent42.putExtra("aaurl16", aurl16);
                        startActivity(intent42);
                        break;
                    case 43:
//                        String key4 = (String) getIntent().getExtras().get("key");
//                        databaseClients.child(key).child("image").setValue(gurl4);
                        Intent intent43 = new Intent(SettingPriority2.this, HomePageNews.class);
//                      intent41.putExtra("key", key);
                        intent43.putExtra("aaurl17", aurl17);
                        startActivity(intent43);
                        break;
                    case 44:
//                        String key4 = (String) getIntent().getExtras().get("key");
//                        databaseClients.child(key).child("image").setValue(gurl4);
                        Intent intent44 = new Intent(SettingPriority2.this, HomePageNews.class);
//                      intent41.putExtra("key", key);
                        intent44.putExtra("aaurl18", aurl18);
                        startActivity(intent44);
                        break;

                    case 45:
//                        String key4 = (String) getIntent().getExtras().get("key");
//                        databaseClients.child(key).child("image").setValue(gurl4);
                        Intent intent45 = new Intent(SettingPriority2.this, HomePageNews.class);
//                      intent41.putExtra("key", key);
                        intent45.putExtra("aaurl19", aurl19);
                        startActivity(intent45);
                        break;
                    case 46:
//                        String key4 = (String) getIntent().getExtras().get("key");
//                        databaseClients.child(key).child("image").setValue(gurl4);
                        Intent intent46 = new Intent(SettingPriority2.this, HomePageNews.class);
//                      intent41.putExtra("key", key);
                        intent46.putExtra("aaurl20", aurl20);
                        startActivity(intent46);
                        break;
                    case 47:
//                        String key4 = (String) getIntent().getExtras().get("key");
//                        databaseClients.child(key).child("image").setValue(gurl4);
                        Intent intent47 = new Intent(SettingPriority2.this, HomePageNews.class);
//                      intent41.putExtra("key", key);
                        intent47.putExtra("aaurl21", aurl21);
                        startActivity(intent47);
                        break;
                    case 48:
//                        String key4 = (String) getIntent().getExtras().get("key");
//                        databaseClients.child(key).child("image").setValue(gurl4);
                        Intent intent48 = new Intent(SettingPriority2.this, HomePageNews.class);
//                      intent41.putExtra("key", key);
                        intent48.putExtra("aaurl22", aurl22);
                        startActivity(intent48);
                        break;
                    case 49:
//                        String key4 = (String) getIntent().getExtras().get("key");
//                        databaseClients.child(key).child("image").setValue(gurl4);
                        Intent intent49 = new Intent(SettingPriority2.this, HomePageNews.class);
//                      intent41.putExtra("key", key);
                        intent49.putExtra("aaurl23", aurl23);
                        startActivity(intent49);
                        break;
                    case 50:
//                        String key4 = (String) getIntent().getExtras().get("key");
//                        databaseClients.child(key).child("image").setValue(gurl4);
                        Intent intent50 = new Intent(SettingPriority2.this, HomePageNews.class);
//                      intent41.putExtra("key", key);
                        intent50.putExtra("aaurl24", aurl24);
                        startActivity(intent50);
                        break;
                    case 51:
//                        String key4 = (String) getIntent().getExtras().get("key");
//                        databaseClients.child(key).child("image").setValue(gurl4);
                        Intent intent51 = new Intent(SettingPriority2.this, HomePageNews.class);
//                      intent41.putExtra("key", key);
                        intent51.putExtra("aaurl25", aurl25);
                        startActivity(intent51);
                        break;
                    case 52:
//                        String key4 = (String) getIntent().getExtras().get("key");
//                        databaseClients.child(key).child("image").setValue(gurl4);
                        Intent intent52 = new Intent(SettingPriority2.this, HomePageNews.class);
//                      intent41.putExtra("key", key);
                        intent52.putExtra("aaurl26", aurl26);
                        startActivity(intent52);
                        break;

                    case 53:
                        final String key = (String) getIntent().getExtras().get("key");
//                        databaseClients.child(key).child("image").setValue(gurl1);
                        Intent intent53 = new Intent(SettingPriority2.this, HomePageNews.class);
//                        intent1.putExtra("key", key);
                        intent53.putExtra("rrurl1", rurl1);
                        startActivity(intent53);
                        break;
                    case 54:
                        //final String key = (String) getIntent().getExtras().get("key");
//                        databaseClients.child(key).child("image").setValue(gurl1);
                        Intent intent54 = new Intent(SettingPriority2.this, HomePageNews.class);
//                        intent1.putExtra("key", key);
                        intent54.putExtra("rrurl2", rurl2);
                        startActivity(intent54);
                        break;
                    case 55:
                        //final String key = (String) getIntent().getExtras().get("key");
//                        databaseClients.child(key).child("image").setValue(gurl1);
                        Intent intent55 = new Intent(SettingPriority2.this, HomePageNews.class);
//                        intent1.putExtra("key", key);
                        intent55.putExtra("rrurl3", rurl3);
                        startActivity(intent55);
                        break;
                    case 56:
                        //final String key = (String) getIntent().getExtras().get("key");
//                        databaseClients.child(key).child("image").setValue(gurl1);
                        Intent intent56 = new Intent(SettingPriority2.this, HomePageNews.class);
//                        intent1.putExtra("key", key);
                        intent56.putExtra("rrurl4", rurl4);
                        startActivity(intent56);
                        break;
                    case 57:
                        //final String key = (String) getIntent().getExtras().get("key");
//                        databaseClients.child(key).child("image").setValue(gurl1);
                        Intent intent57 = new Intent(SettingPriority2.this, HomePageNews.class);
//                        intent1.putExtra("key", key);
                        intent57.putExtra("rrurl5", rurl5);
                        startActivity(intent57);
                        break;
                    case 58:
                        //final String key = (String) getIntent().getExtras().get("key");
//                        databaseClients.child(key).child("image").setValue(gurl1);
                        Intent intent58 = new Intent(SettingPriority2.this, HomePageNews.class);
//                        intent1.putExtra("key", key);
                        intent58.putExtra("rrurl6", rurl6);
                        startActivity(intent58);
                        break;
                    case 59:
                        //final String key = (String) getIntent().getExtras().get("key");
//                        databaseClients.child(key).child("image").setValue(gurl1);
                        Intent intent59 = new Intent(SettingPriority2.this, HomePageNews.class);
//                        intent1.putExtra("key", key);
                        intent59.putExtra("rrurl7", rurl7);
                        startActivity(intent59);
                        break;
                    case 60:
                        //final String key = (String) getIntent().getExtras().get("key");
//                        databaseClients.child(key).child("image").setValue(gurl1);
                        Intent intent60 = new Intent(SettingPriority2.this, HomePageNews.class);
//                        intent1.putExtra("key", key);
                        intent60.putExtra("rrurl8", rurl8);
                        startActivity(intent60);
                        break;
                    case 61:
                        //final String key = (String) getIntent().getExtras().get("key");
//                        databaseClients.child(key).child("image").setValue(gurl1);
                        Intent intent61 = new Intent(SettingPriority2.this, HomePageNews.class);
//                        intent1.putExtra("key", key);
                        intent61.putExtra("rrurl9", rurl9);
                        startActivity(intent61);
                        break;
                    case 62:
                        //final String key = (String) getIntent().getExtras().get("key");
//                        databaseClients.child(key).child("image").setValue(gurl1);
                        Intent intent62 = new Intent(SettingPriority2.this, HomePageNews.class);
//                        intent1.putExtra("key", key);
                        intent62.putExtra("rrurl10", rurl10);
                        startActivity(intent62);
                        break;
                    case 63:
                        //final String key = (String) getIntent().getExtras().get("key");
//                        databaseClients.child(key).child("image").setValue(gurl1);
                        Intent intent63 = new Intent(SettingPriority2.this, HomePageNews.class);
//                        intent1.putExtra("key", key);
                        intent63.putExtra("rrurl11", rurl11);
                        startActivity(intent63);
                        break;
                    case 64:
                        //final String key = (String) getIntent().getExtras().get("key");
//                        databaseClients.child(key).child("image").setValue(gurl1);
                        Intent intent64 = new Intent(SettingPriority2.this, HomePageNews.class);
//                        intent1.putExtra("key", key);
                        intent64.putExtra("rrrrrurl12", rurl12);
                        startActivity(intent64);
                        break;
                    case 65:
                        //final String key = (String) getIntent().getExtras().get("key");
//                        databaseClients.child(key).child("image").setValue(gurl1);
                        Intent intent65 = new Intent(SettingPriority2.this, HomePageNews.class);
//                        intent1.putExtra("key", key);
                        intent65.putExtra("rrurl13", rurl13);
                        startActivity(intent65);
                        break;
                    case 66:
                        //final String key = (String) getIntent().getExtras().get("key");
//                        databaseClients.child(key).child("image").setValue(gurl1);
                        Intent intent66 = new Intent(SettingPriority2.this, HomePageNews.class);
//                        intent1.putExtra("key", key);
                        intent66.putExtra("rrurl14", rurl14);
                        startActivity(intent66);
                        break;
                    case 67:
                        //final String key = (String) getIntent().getExtras().get("key");
//                        databaseClients.child(key).child("image").setValue(gurl1);
                        Intent intent67 = new Intent(SettingPriority2.this, HomePageNews.class);
//                        intent1.putExtra("key", key);
                        intent67.putExtra("rrurl15", rurl15);
                        startActivity(intent67);
                        break;
                    case 68:
                        //final String key = (String) getIntent().getExtras().get("key");
//                        databaseClients.child(key).child("image").setValue(gurl1);
                        Intent intent68 = new Intent(SettingPriority2.this, HomePageNews.class);
//                        intent1.putExtra("key", key);
                        intent68.putExtra("rrurl16", rurl16);
                        startActivity(intent68);
                        break;
                    case 69:
                        //final String key = (String) getIntent().getExtras().get("key");
//                        databaseClients.child(key).child("image").setValue(gurl1);
                        Intent intent69 = new Intent(SettingPriority2.this, HomePageNews.class);
//                        intent1.putExtra("key", key);
                        intent69.putExtra("rrurl17", rurl17);
                        startActivity(intent69);
                        break;
                    case 70:
                        //final String key = (String) getIntent().getExtras().get("key");
//                        databaseClients.child(key).child("image").setValue(gurl1);
                        Intent intent70 = new Intent(SettingPriority2.this, HomePageNews.class);
//                        intent1.putExtra("key", key);
                        intent70.putExtra("rrurl18", rurl18);
                        startActivity(intent70);
                        break;
                    case 71:
                        //final String key = (String) getIntent().getExtras().get("key");
//                        databaseClients.child(key).child("image").setValue(gurl1);
                        Intent intent71 = new Intent(SettingPriority2.this, HomePageNews.class);
//                        intent1.putExtra("key", key);
                        intent71.putExtra("rrurl19", rurl19);
                        startActivity(intent71);
                        break;
                    case 72:
                        //final String key = (String) getIntent().getExtras().get("key");
//                        databaseClients.child(key).child("image").setValue(gurl1);
                        Intent intent72 = new Intent(SettingPriority2.this, HomePageNews.class);
//                        intent1.putExtra("key", key);
                        intent72.putExtra("rrurl20", rurl20);
                        startActivity(intent72);
                        break;
                    case 73:
                        //final String key = (String) getIntent().getExtras().get("key");
//                        databaseClients.child(key).child("image").setValue(gurl1);
                        Intent intent73 = new Intent(SettingPriority2.this, HomePageNews.class);
//                        intent1.putExtra("key", key);
                        intent73.putExtra("rrurl21", rurl21);
                        startActivity(intent73);
                        break;
                    case 74:
                        //final String key = (String) getIntent().getExtras().get("key");
//                        databaseClients.child(key).child("image").setValue(gurl1);
                        Intent intent74 = new Intent(SettingPriority2.this, HomePageNews.class);
//                        intent1.putExtra("key", key);
                        intent74.putExtra("rrurl22", rurl22);
                        startActivity(intent74);
                        break;
                    case 75:
                        //final String key = (String) getIntent().getExtras().get("key");
//                        databaseClients.child(key).child("image").setValue(gurl1);
                        Intent intent75 = new Intent(SettingPriority2.this, HomePageNews.class);
//                        intent1.putExtra("key", key);
                        intent75.putExtra("rrurl23", rurl23);
                        startActivity(intent75);
                        break;
                    case 76:
                        //final String key = (String) getIntent().getExtras().get("key");
//                        databaseClients.child(key).child("image").setValue(gurl1);
                        Intent intent76 = new Intent(SettingPriority2.this, HomePageNews.class);
//                        intent1.putExtra("key", key);
                        intent76.putExtra("rrurl24", rurl24);
                        startActivity(intent76);
                        break;
                    case 77:
                        //final String key = (String) getIntent().getExtras().get("key");
//                        databaseClients.child(key).child("image").setValue(gurl1);
                        Intent intent77 = new Intent(SettingPriority2.this, HomePageNews.class);
//                        intent1.putExtra("key", key);
                        intent77.putExtra("rrurl25", rurl25);
                        startActivity(intent77);
                        break;
                    case 78:
                        //final String key = (String) getIntent().getExtras().get("key");
//                        databaseClients.child(key).child("image").setValue(gurl1);
                        Intent intent78 = new Intent(SettingPriority2.this, HomePageNews.class);
//                        intent1.putExtra("key", key);
                        intent78.putExtra("rrurl26", rurl26);
                        startActivity(intent78);
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
