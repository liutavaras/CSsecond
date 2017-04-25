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

public class SettingPriority1 extends AppCompatActivity {

//    Spinner spinner5;

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

//    DatabaseReference databaseClients;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting_priority1);

        ImageButton bSettingsBlack = (ImageButton) findViewById(R.id.ibSettingsBlack);
        ImageButton bEconCalBlack = (ImageButton) findViewById(R.id.ibEconCalBlack);
        ImageButton bLiveRates = (ImageButton) findViewById(R.id.ibLiveRates);
        ImageButton bNewsBlack = (ImageButton) findViewById(R.id.ibNewsBlack);
        ImageButton bAddAProfile = (ImageButton) findViewById(R.id.addAProfile);
        Spinner spinner5 = (Spinner) findViewById(R.id.spinner5);

        bSettingsBlack.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(SettingPriority1.this, SettingsActivity.class));
            }
        });
        bEconCalBlack.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(SettingPriority1.this, WebViewActivity.class));
            }
        });
        bLiveRates.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(SettingPriority1.this, sortingrates.class));
            }
        });
        bNewsBlack.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(SettingPriority1.this, HomePageNews.class));

            }
        });
        bAddAProfile.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(SettingPriority1.this, AddProfileActivity.class));
            }
        });


        ArrayAdapter<String> myAdaptor = new ArrayAdapter<String>(SettingPriority1.this,
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
//                        final String key = (String) getIntent().getExtras().get("key");
//                        databaseClients.child(key).child("image").setValue(gurl1);
                        Intent intent1 = new Intent(SettingPriority1.this, HomePageNews.class);
//                        intent1.putExtra("key", key);
                        intent1.putExtra("gurl1", gurl1);
                        startActivity(intent1);
                        break;
                    case 2:
//                        String key2 = (String) getIntent().getExtras().get("key");
//                        databaseClients.child(key).child("image").setValue(gurl2);
                        Intent intent2 = new Intent(SettingPriority1.this, HomePageNews.class);
//                        intent2.putExtra("key", key);
                        intent2.putExtra("gurl2", gurl2);
                        startActivity(intent2);
                        break;
                    case 3:
//                        String key3 = (String) getIntent().getExtras().get("key");
//                        databaseClients.child(key).child("image").setValue(gurl3);
                        Intent intent3 = new Intent(SettingPriority1.this, HomePageNews.class);
//                        intent3.putExtra("key", key);
                        intent3.putExtra("gurl3", gurl3);
                        startActivity(intent3);
                        break;
                    case 4:
//                        String key4 = (String) getIntent().getExtras().get("key");
//                        databaseClients.child(key).child("image").setValue(gurl4);
                        Intent intent4 = new Intent(SettingPriority1.this, HomePageNews.class);
//                        intent4.putExtra("key", key);
                        intent4.putExtra("gurl4", gurl4);
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