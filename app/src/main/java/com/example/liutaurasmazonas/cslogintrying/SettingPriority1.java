package com.example.liutaurasmazonas.cslogintrying;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.Spinner;

public class SettingPriority1 extends AppCompatActivity {

    Spinner spinner5;

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

    //Amber circles:
    final String aurl1 = "http://res.cloudinary.com/liutavaras/image/upload/v1492506105/a_oufued.png";
    final String aurl2 = "http://res.cloudinary.com/liutavaras/image/upload/v1492503937/b_eawxmg.png”";
    final String aurl3 = "http://res.cloudinary.com/liutavaras/image/upload/v1492506105/c_jouf2t.png";
    final String aurl4 = "http://res.cloudinary.com/liutavaras/image/upload/v1492506105/d_isx7x3.png";
    final String aurl5 = "http://res.cloudinary.com/liutavaras/image/upload/v1492506105/e_gddfiw.png";
    final String aurl6 = "http://res.cloudinary.com/liutavaras/image/upload/v1492506105/f_qdqk2b.png";
    final String aurl7 = "“http://res.cloudinary.com/liutavaras/image/upload/v1492506105/g_qtlk5b.png";
    final String aurl8 = "http://res.cloudinary.com/liutavaras/image/upload/v1492506106/h_rhbqin.png";
    final String aurl9 = "http://res.cloudinary.com/liutavaras/image/upload/v1492506106/i_ukqnpy.png";
    final String aurl10 = "http://res.cloudinary.com/liutavaras/image/upload/v1492506106/j_v6efpt.png";
    final String aurl11 = "http://res.cloudinary.com/liutavaras/image/upload/v1492506106/k_ilzlxg.png";
    final String aurl12 = "http://res.cloudinary.com/liutavaras/image/upload/v1492506106/l_rzjwdu.png";
    final String aurl13 = "http://res.cloudinary.com/liutavaras/image/upload/v1492506106/m_warnsa.png";
    final String aurl14 = "http://res.cloudinary.com/liutavaras/image/upload/v1492506106/n_ysuei3.png";
    final String aurl15 = "http://res.cloudinary.com/liutavaras/image/upload/v1492506106/o_duhgg3.png";
    final String aurl16 = "http://res.cloudinary.com/liutavaras/image/upload/v1492506106/p_ejntwq.png";
    final String aurl17 = "http://res.cloudinary.com/liutavaras/image/upload/v1492506106/q_zdqnwe.png";
    final String aurl18 = "http://res.cloudinary.com/liutavaras/image/upload/v1492506106/r_q4ziyc.png";
    final String aurl19 = "http://res.cloudinary.com/liutavaras/image/upload/v1492506106/s_o6meec.png";
    final String aurl20 = "http://res.cloudinary.com/liutavaras/image/upload/v1492506107/t_vqz1o8.png";
    final String aurl21 = "http://res.cloudinary.com/liutavaras/image/upload/v1492506107/u_pgjt19.png";
    final String aurl22 = "http://res.cloudinary.com/liutavaras/image/upload/v1492506106/v_mzeuhc.png";
    final String aurl23 = "http://res.cloudinary.com/liutavaras/image/upload/v1492506107/w_vg898p.png";
    final String aurl24 = "http://res.cloudinary.com/liutavaras/image/upload/v1492506107/x_vgmvs0.png";
    final String aurl25 = "http://res.cloudinary.com/liutavaras/image/upload/v1492506107/y_w006fy.png”";
    final String aurl26 = "http://res.cloudinary.com/liutavaras/image/upload/v1492506107/z_t6dff0.png";

    //Red circles:
    final String rurl1 = "http://res.cloudinary.com/liutavaras/image/upload/v1493125461/aa_hihdzw.png";
    final String rurl2 = "http://res.cloudinary.com/liutavaras/image/upload/v1493125461/bb_di27ze.png";
    final String rurl3 = "http://res.cloudinary.com/liutavaras/image/upload/v1493125461/cc_vuxgvm.png";
    final String rurl4 = "http://res.cloudinary.com/liutavaras/image/upload/v1493125462/d_yv3bwj.png";
    final String rurl5 = "http://res.cloudinary.com/liutavaras/image/upload/v1493125461/e_qkyrmn.png";
    final String rurl6 = "http://res.cloudinary.com/liutavaras/image/upload/v1493125461/f_k5fvar.png";
    final String rurl7 = "http://res.cloudinary.com/liutavaras/image/upload/v1493125462/g_iyyufx.png";
    final String rurl8 = "http://res.cloudinary.com/liutavaras/image/upload/v1493125462/h_itx30n.png”";
    final String rurl9 = "http://res.cloudinary.com/liutavaras/image/upload/v1493125462/I_coawhk.png";
    final String rurl10 = "http://res.cloudinary.com/liutavaras/image/upload/v1493125462/J_spwqks.png";
    final String rurl11 = "http://res.cloudinary.com/liutavaras/image/upload/v1493125462/K_ivdxc4.png";
    final String rurl12 = "http://res.cloudinary.com/liutavaras/image/upload/v1493125462/L_ee4vna.png";
    final String rurl13 = "http://res.cloudinary.com/liutavaras/image/upload/v1493125462/m_rmagxn.png";
    final String rurl14 = "http://res.cloudinary.com/liutavaras/image/upload/v1493125463/n_s5xbwm.png";
    final String rurl15 = "http://res.cloudinary.com/liutavaras/image/upload/v1493125463/o_lgwrfe.png";
    final String rurl16 = "http://res.cloudinary.com/liutavaras/image/upload/v1493125463/P_zujqmb.png”";
    final String rurl17 = "http://res.cloudinary.com/liutavaras/image/upload/v1493125463/q_aljiez.png";
    final String rurl18 = "http://res.cloudinary.com/liutavaras/image/upload/v1493125463/r_k7y1fg.png";
    final String rurl19 = "http://res.cloudinary.com/liutavaras/image/upload/v1493125463/s_fgm7ap.png";
    final String rurl20 = "http://res.cloudinary.com/liutavaras/image/upload/v1493125463/t_p3prna.png";
    final String rurl21 = "http://res.cloudinary.com/liutavaras/image/upload/v1493125463/u_xpitjw.png";
    final String rurl22 = "http://res.cloudinary.com/liutavaras/image/upload/v1493125463/v_rskswx.png";
    final String rurl23 = "http://res.cloudinary.com/liutavaras/image/upload/v1493125464/w_mlqkao.png";
    final String rurl24 = "http://res.cloudinary.com/liutavaras/image/upload/v1493125464/x_jc2kqh.png";
    final String rurl25 = "http://res.cloudinary.com/liutavaras/image/upload/v1493125464/y_iodvtp.png";
    final String rurl26 = "http://res.cloudinary.com/liutavaras/image/upload/v1493125464/z_ll2nhm.png";

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
                        Intent intent1 = new Intent(SettingPriority1.this, HomePageNews.class);
                        intent1.putExtra("gurl1", gurl1);
                        startActivity(intent1);
                        break;
                    case 2:
                        Intent intent2 = new Intent(SettingPriority1.this, HomePageNews.class);
                        intent2.putExtra("gurl2", gurl2);
                        startActivity(intent2);
                        break;
                    case 3:
                        Intent intent3 = new Intent(SettingPriority1.this, HomePageNews.class);
                        intent3.putExtra("gurl3", gurl3);
                        startActivity(intent3);
                        break;
                    case 4:
                        Intent intent4 = new Intent(SettingPriority1.this, HomePageNews.class);
                        intent4.putExtra("gurl4", gurl4);
                        startActivity(intent4);
                        break;
                    case 5:
                        Intent intent5 = new Intent(SettingPriority1.this, HomePageNews.class);
                        intent5.putExtra("gurl5", gurl5);
                        startActivity(intent5);
                        break;
                    case 6:
                        Intent intent6 = new Intent(SettingPriority1.this, HomePageNews.class);
                        intent6.putExtra("gurl6", gurl6);
                        startActivity(intent6);
                        break;
                    case 7:
                        Intent intent7 = new Intent(SettingPriority1.this, HomePageNews.class);
                        intent7.putExtra("gurl7", gurl7);
                        startActivity(intent7);
                        break;
                    case 8:
                        Intent intent8 = new Intent(SettingPriority1.this, HomePageNews.class);
                        intent8.putExtra("gurl8", gurl8);
                        startActivity(intent8);
                        break;
                    case 9:
                        Intent intent9 = new Intent(SettingPriority1.this, HomePageNews.class);
                        intent9.putExtra("gurl9", gurl9);
                        startActivity(intent9);
                        break;
                    case 10:
                        Intent intent10 = new Intent(SettingPriority1.this, HomePageNews.class);
                        intent10.putExtra("gurl10", gurl10);
                        startActivity(intent10);
                        break;
                    case 11:
                        Intent intent11 = new Intent(SettingPriority1.this, HomePageNews.class);
                        intent11.putExtra("gurl11", gurl11);
                        startActivity(intent11);
                        break;
                    case 12:
                        Intent intent12 = new Intent(SettingPriority1.this, HomePageNews.class);
                        intent12.putExtra("gurl12", gurl12);
                        startActivity(intent12);
                        break;
                    case 13:
                        Intent intent13 = new Intent(SettingPriority1.this, HomePageNews.class);
                        intent13.putExtra("gurl13", gurl13);
                        startActivity(intent13);
                        break;
                    case 14:
                        Intent intent14 = new Intent(SettingPriority1.this, HomePageNews.class);
                        intent14.putExtra("gurl14", gurl14);
                        startActivity(intent14);
                        break;
                    case 15:
                        Intent intent15 = new Intent(SettingPriority1.this, HomePageNews.class);
                        intent15.putExtra("gurl15", gurl15);
                        startActivity(intent15);
                        break;
                    case 16:
                        Intent intent16 = new Intent(SettingPriority1.this, HomePageNews.class);
                        intent16.putExtra("gurl16", gurl16);
                        startActivity(intent16);
                        break;
                    case 17:
                        Intent intent17 = new Intent(SettingPriority1.this, HomePageNews.class);
                        intent17.putExtra("gurl17", gurl17);
                        startActivity(intent17);
                        break;
                    case 18:
                        Intent intent18 = new Intent(SettingPriority1.this, HomePageNews.class);
                        intent18.putExtra("gurl8", gurl18);
                        startActivity(intent18);
                        break;
                    case 19:
                        Intent intent19 = new Intent(SettingPriority1.this, HomePageNews.class);
                        intent19.putExtra("gurl9", gurl19);
                        startActivity(intent19);
                        break;
                    case 20:
                        Intent intent20 = new Intent(SettingPriority1.this, HomePageNews.class);
                        intent20.putExtra("gur20", gurl20);
                        startActivity(intent20);
                        break;
                    case 21:
                        Intent intent21 = new Intent(SettingPriority1.this, HomePageNews.class);
                        intent21.putExtra("gurl21", gurl21);
                        startActivity(intent21);
                        break;
                    case 22:
                        Intent intent22 = new Intent(SettingPriority1.this, HomePageNews.class);
                        intent22.putExtra("gurl22", gurl22);
                        startActivity(intent22);
                        break;
                    case 23:
                        Intent intent23 = new Intent(SettingPriority1.this, HomePageNews.class);
                        intent23.putExtra("gurl23", gurl23);
                        startActivity(intent23);
                        break;
                    case 24:
                        Intent intent24 = new Intent(SettingPriority1.this, HomePageNews.class);
                        intent24.putExtra("gurl24", gurl24);
                        startActivity(intent24);
                        break;
                    case 25:
                        Intent intent25 = new Intent(SettingPriority1.this, HomePageNews.class);
                        intent25.putExtra("gurl25", gurl25);
                        startActivity(intent25);
                        break;
                    case 26:
                        Intent intent26 = new Intent(SettingPriority1.this, HomePageNews.class);
                        intent26.putExtra("gurl26", gurl26);
                        startActivity(intent26);
                        break;
                    case 27:
                        Intent intent27 = new Intent(SettingPriority1.this, HomePageNews.class);
                        intent27.putExtra("aurl1", aurl1);
                        startActivity(intent27);
                        break;
                    case 28:
//                        String key4 = (String) getIntent().getExtras().get("key");
//                        databaseClients.child(key).child("image").setValue(gurl4);
                        Intent intent28 = new Intent(SettingPriority1.this, HomePageNews.class);
//                        intent4.putExtra("key", key);
                        intent28.putExtra("aurl2", aurl2);
                        startActivity(intent28);
                        break;
                    case 29:
//                        String key4 = (String) getIntent().getExtras().get("key");
//                        databaseClients.child(key).child("image").setValue(gurl4);
                        Intent intent29 = new Intent(SettingPriority1.this, HomePageNews.class);
//                        intent4.putExtra("key", key);
                        intent29.putExtra("aurl3", aurl3);
                        startActivity(intent29);
                        break;
                    case 30:
//                        String key4 = (String) getIntent().getExtras().get("key");
//                        databaseClients.child(key).child("image").setValue(gurl4);
                        Intent intent30 = new Intent(SettingPriority1.this, HomePageNews.class);
//                        intent4.putExtra("key", key);
                        intent30.putExtra("aurl4", aurl4);
                        startActivity(intent30);
                        break;
                    case 31:
//                        String key4 = (String) getIntent().getExtras().get("key");
//                        databaseClients.child(key).child("image").setValue(gurl4);
                        Intent intent31 = new Intent(SettingPriority1.this, HomePageNews.class);
//                        intent4.putExtra("key", key);
                        intent31.putExtra("aurl5", aurl5);
                        startActivity(intent31);
                        break;
                    case 32:
//                        String key4 = (String) getIntent().getExtras().get("key");
//                        databaseClients.child(key).child("image").setValue(gurl4);
                        Intent intent32 = new Intent(SettingPriority1.this, HomePageNews.class);
//                        intent4.putExtra("key", key);
                        intent32.putExtra("aurl6", aurl6);
                        startActivity(intent32);
                        break;
                    case 33:
//                        String key4 = (String) getIntent().getExtras().get("key");
//                        databaseClients.child(key).child("image").setValue(gurl4);
                        Intent intent33 = new Intent(SettingPriority1.this, HomePageNews.class);
//                        intent4.putExtra("key", key);
                        intent33.putExtra("aurl7", aurl7);
                        startActivity(intent33);
                        break;
                    case 34:
//                        String key4 = (String) getIntent().getExtras().get("key");
//                        databaseClients.child(key).child("image").setValue(gurl4);
                        Intent intent34 = new Intent(SettingPriority1.this, HomePageNews.class);
//                        intent4.putExtra("key", key);
                        intent34.putExtra("aurl8", aurl8);
                        startActivity(intent34);
                        break;
                    case 35:
//                        String key4 = (String) getIntent().getExtras().get("key");
//                        databaseClients.child(key).child("image").setValue(gurl4);
                        Intent intent35 = new Intent(SettingPriority1.this, HomePageNews.class);
//                        intent4.putExtra("key", key);
                        intent35.putExtra("aurl9", aurl9);
                        startActivity(intent35);
                        break;
                    case 36:
//                        String key4 = (String) getIntent().getExtras().get("key");
//                        databaseClients.child(key).child("image").setValue(gurl4);
                        Intent intent36 = new Intent(SettingPriority1.this, HomePageNews.class);
//                        intent4.putExtra("key", key);
                        intent36.putExtra("aurl10", aurl10);
                        startActivity(intent36);
                        break;
                    case 37:
//                        String key4 = (String) getIntent().getExtras().get("key");
//                        databaseClients.child(key).child("image").setValue(gurl4);
                        Intent intent37 = new Intent(SettingPriority1.this, HomePageNews.class);
//                        intent4.putExtra("key", key);
                        intent37.putExtra("aurl11", aurl11);
                        startActivity(intent37);
                        break;
                    case 38:
//                        String key4 = (String) getIntent().getExtras().get("key");
//                        databaseClients.child(key).child("image").setValue(gurl4);
                        Intent intent38 = new Intent(SettingPriority1.this, HomePageNews.class);
//                        intent4.putExtra("key", key);
                        intent38.putExtra("aurl12", aurl12);
                        startActivity(intent38);
                        break;
                    case 39:
//                        String key4 = (String) getIntent().getExtras().get("key");
//                        databaseClients.child(key).child("image").setValue(gurl4);
                        Intent intent39 = new Intent(SettingPriority1.this, HomePageNews.class);
//                        intent4.putExtra("key", key);
                        intent39.putExtra("aurl13", aurl13);
                        startActivity(intent39);
                        break;
                    case 40:
//                        String key4 = (String) getIntent().getExtras().get("key");
//                        databaseClients.child(key).child("image").setValue(gurl4);
                        Intent intent40 = new Intent(SettingPriority1.this, HomePageNews.class);
//                        intent4.putExtra("key", key);
                        intent40.putExtra("aurl14", aurl14);
                        startActivity(intent40);
                        break;
                    case 41:
//                        String key4 = (String) getIntent().getExtras().get("key");
//                        databaseClients.child(key).child("image").setValue(gurl4);
                        Intent intent41 = new Intent(SettingPriority1.this, HomePageNews.class);
//                      intent41.putExtra("key", key);
                        intent41.putExtra("aurl15", aurl15);
                        startActivity(intent41);
                        break;
                    case 42:
//                        String key4 = (String) getIntent().getExtras().get("key");
//                        databaseClients.child(key).child("image").setValue(gurl4);
                        Intent intent42 = new Intent(SettingPriority1.this, HomePageNews.class);
//                      intent41.putExtra("key", key);
                        intent42.putExtra("aurl16", aurl16);
                        startActivity(intent42);
                        break;
                    case 43:
//                        String key4 = (String) getIntent().getExtras().get("key");
//                        databaseClients.child(key).child("image").setValue(gurl4);
                        Intent intent43 = new Intent(SettingPriority1.this, HomePageNews.class);
//                      intent41.putExtra("key", key);
                        intent43.putExtra("aurl17", aurl17);
                        startActivity(intent43);
                        break;
                    case 44:
//                        String key4 = (String) getIntent().getExtras().get("key");
//                        databaseClients.child(key).child("image").setValue(gurl4);
                        Intent intent44 = new Intent(SettingPriority1.this, HomePageNews.class);
//                      intent41.putExtra("key", key);
                        intent44.putExtra("aurl18", aurl18);
                        startActivity(intent44);
                        break;
                    case 45:
//                        String key4 = (String) getIntent().getExtras().get("key");
//                        databaseClients.child(key).child("image").setValue(gurl4);
                        Intent intent45 = new Intent(SettingPriority1.this, HomePageNews.class);
//                      intent41.putExtra("key", key);
                        intent45.putExtra("aurl19", aurl19);
                        startActivity(intent45);
                        break;
                    case 46:
//                        String key4 = (String) getIntent().getExtras().get("key");
//                        databaseClients.child(key).child("image").setValue(gurl4);
                        Intent intent46 = new Intent(SettingPriority1.this, HomePageNews.class);
//                      intent41.putExtra("key", key);
                        intent46.putExtra("aurl20", aurl20);
                        startActivity(intent46);
                        break;
                    case 47:
//                        String key4 = (String) getIntent().getExtras().get("key");
//                        databaseClients.child(key).child("image").setValue(gurl4);
                        Intent intent47 = new Intent(SettingPriority1.this, HomePageNews.class);
//                      intent41.putExtra("key", key);
                        intent47.putExtra("aurl21", aurl21);
                        startActivity(intent47);
                        break;
                    case 48:
//                        String key4 = (String) getIntent().getExtras().get("key");
//                        databaseClients.child(key).child("image").setValue(gurl4);
                        Intent intent48 = new Intent(SettingPriority1.this, HomePageNews.class);
//                      intent41.putExtra("key", key);
                        intent48.putExtra("aurl22", aurl22);
                        startActivity(intent48);
                        break;
                    case 49:
//                        String key4 = (String) getIntent().getExtras().get("key");
//                        databaseClients.child(key).child("image").setValue(gurl4);
                        Intent intent49 = new Intent(SettingPriority1.this, HomePageNews.class);
//                      intent41.putExtra("key", key);
                        intent49.putExtra("aurl23", aurl23);
                        startActivity(intent49);
                        break;
                    case 50:
//                        String key4 = (String) getIntent().getExtras().get("key");
//                        databaseClients.child(key).child("image").setValue(gurl4);
                        Intent intent50 = new Intent(SettingPriority1.this, HomePageNews.class);
//                      intent41.putExtra("key", key);
                        intent50.putExtra("aurl24", aurl24);
                        startActivity(intent50);
                        break;
                    case 51:
//                        String key4 = (String) getIntent().getExtras().get("key");
//                        databaseClients.child(key).child("image").setValue(gurl4);
                        Intent intent51 = new Intent(SettingPriority1.this, HomePageNews.class);
//                      intent41.putExtra("key", key);
                        intent51.putExtra("aurl25", aurl25);
                        startActivity(intent51);
                        break;
                    case 52:
//                        String key4 = (String) getIntent().getExtras().get("key");
//                        databaseClients.child(key).child("image").setValue(gurl4);
                        Intent intent52 = new Intent(SettingPriority1.this, HomePageNews.class);
//                      intent41.putExtra("key", key);
                        intent52.putExtra("aurl26", aurl26);
                        startActivity(intent52);
                        break;
                    case 53:
                        final String key = (String) getIntent().getExtras().get("key");
//                        databaseClients.child(key).child("image").setValue(gurl1);
                        Intent intent53 = new Intent(SettingPriority1.this, HomePageNews.class);
//                        intent1.putExtra("key", key);
                        intent53.putExtra("rurl1", rurl1);
                        startActivity(intent53);
                        break;
                    case 54:
                        //final String key = (String) getIntent().getExtras().get("key");
//                        databaseClients.child(key).child("image").setValue(gurl1);
                        Intent intent54 = new Intent(SettingPriority1.this, HomePageNews.class);
//                        intent1.putExtra("key", key);
                        intent54.putExtra("rurl2", rurl2);
                        startActivity(intent54);
                        break;
                    case 55:
                        //final String key = (String) getIntent().getExtras().get("key");
//                        databaseClients.child(key).child("image").setValue(gurl1);
                        Intent intent55 = new Intent(SettingPriority1.this, HomePageNews.class);
//                        intent1.putExtra("key", key);
                        intent55.putExtra("rurl3", rurl3);
                        startActivity(intent55);
                        break;
                    case 56:
                        //final String key = (String) getIntent().getExtras().get("key");
//                        databaseClients.child(key).child("image").setValue(gurl1);
                        Intent intent56 = new Intent(SettingPriority1.this, HomePageNews.class);
//                        intent1.putExtra("key", key);
                        intent56.putExtra("rurl4", rurl4);
                        startActivity(intent56);
                        break;
                    case 57:
                        //final String key = (String) getIntent().getExtras().get("key");
//                        databaseClients.child(key).child("image").setValue(gurl1);
                        Intent intent57 = new Intent(SettingPriority1.this, HomePageNews.class);
//                        intent1.putExtra("key", key);
                        intent57.putExtra("rurl5", rurl5);
                        startActivity(intent57);
                        break;
                    case 58:
                        //final String key = (String) getIntent().getExtras().get("key");
//                        databaseClients.child(key).child("image").setValue(gurl1);
                        Intent intent58 = new Intent(SettingPriority1.this, HomePageNews.class);
//                        intent1.putExtra("key", key);
                        intent58.putExtra("rurl6", rurl6);
                        startActivity(intent58);
                        break;
                    case 59:
                        //final String key = (String) getIntent().getExtras().get("key");
//                        databaseClients.child(key).child("image").setValue(gurl1);
                        Intent intent59 = new Intent(SettingPriority1.this, HomePageNews.class);
//                        intent1.putExtra("key", key);
                        intent59.putExtra("rurl7", rurl7);
                        startActivity(intent59);
                        break;
                    case 60:
                        //final String key = (String) getIntent().getExtras().get("key");
//                        databaseClients.child(key).child("image").setValue(gurl1);
                        Intent intent60 = new Intent(SettingPriority1.this, HomePageNews.class);
//                        intent1.putExtra("key", key);
                        intent60.putExtra("rurl8", rurl8);
                        startActivity(intent60);
                        break;
                    case 61:
                        //final String key = (String) getIntent().getExtras().get("key");
//                        databaseClients.child(key).child("image").setValue(gurl1);
                        Intent intent61 = new Intent(SettingPriority1.this, HomePageNews.class);
//                        intent1.putExtra("key", key);
                        intent61.putExtra("rurl9", rurl9);
                        startActivity(intent61);
                        break;
                    case 62:
                        //final String key = (String) getIntent().getExtras().get("key");
//                        databaseClients.child(key).child("image").setValue(gurl1);
                        Intent intent62 = new Intent(SettingPriority1.this, HomePageNews.class);
//                        intent1.putExtra("key", key);
                        intent62.putExtra("rurl10", rurl10);
                        startActivity(intent62);
                        break;
                    case 63:
                        //final String key = (String) getIntent().getExtras().get("key");
//                        databaseClients.child(key).child("image").setValue(gurl1);
                        Intent intent63 = new Intent(SettingPriority1.this, HomePageNews.class);
//                        intent1.putExtra("key", key);
                        intent63.putExtra("rurl11", rurl11);
                        startActivity(intent63);
                        break;
                    case 64:
                        //final String key = (String) getIntent().getExtras().get("key");
//                        databaseClients.child(key).child("image").setValue(gurl1);
                        Intent intent64 = new Intent(SettingPriority1.this, HomePageNews.class);
//                        intent1.putExtra("key", key);
                        intent64.putExtra("rurl12", rurl12);
                        startActivity(intent64);
                        break;
                    case 65:
                        //final String key = (String) getIntent().getExtras().get("key");
//                        databaseClients.child(key).child("image").setValue(gurl1);
                        Intent intent65 = new Intent(SettingPriority1.this, HomePageNews.class);
//                        intent1.putExtra("key", key);
                        intent65.putExtra("rurl13", rurl13);
                        startActivity(intent65);
                        break;
                    case 66:
                        //final String key = (String) getIntent().getExtras().get("key");
//                        databaseClients.child(key).child("image").setValue(gurl1);
                        Intent intent66 = new Intent(SettingPriority1.this, HomePageNews.class);
//                        intent1.putExtra("key", key);
                        intent66.putExtra("rurl14", rurl14);
                        startActivity(intent66);
                        break;
                    case 67:
                        //final String key = (String) getIntent().getExtras().get("key");
//                        databaseClients.child(key).child("image").setValue(gurl1);
                        Intent intent67 = new Intent(SettingPriority1.this, HomePageNews.class);
//                        intent1.putExtra("key", key);
                        intent67.putExtra("rurl15", rurl15);
                        startActivity(intent67);
                        break;
                    case 68:
                        //final String key = (String) getIntent().getExtras().get("key");
//                        databaseClients.child(key).child("image").setValue(gurl1);
                        Intent intent68 = new Intent(SettingPriority1.this, HomePageNews.class);
//                        intent1.putExtra("key", key);
                        intent68.putExtra("rurl16", rurl16);
                        startActivity(intent68);
                        break;
                    case 69:
                        //final String key = (String) getIntent().getExtras().get("key");
//                        databaseClients.child(key).child("image").setValue(gurl1);
                        Intent intent69 = new Intent(SettingPriority1.this, HomePageNews.class);
//                        intent1.putExtra("key", key);
                        intent69.putExtra("rurl17", rurl17);
                        startActivity(intent69);
                        break;
                    case 70:
                        //final String key = (String) getIntent().getExtras().get("key");
//                        databaseClients.child(key).child("image").setValue(gurl1);
                        Intent intent70 = new Intent(SettingPriority1.this, HomePageNews.class);
//                        intent1.putExtra("key", key);
                        intent70.putExtra("rurl18", rurl18);
                        startActivity(intent70);
                        break;
                    case 71:
                        //final String key = (String) getIntent().getExtras().get("key");
//                        databaseClients.child(key).child("image").setValue(gurl1);
                        Intent intent71 = new Intent(SettingPriority1.this, HomePageNews.class);
//                        intent1.putExtra("key", key);
                        intent71.putExtra("rurl19", rurl19);
                        startActivity(intent71);
                        break;
                    case 72:
                        //final String key = (String) getIntent().getExtras().get("key");
//                        databaseClients.child(key).child("image").setValue(gurl1);
                        Intent intent72 = new Intent(SettingPriority1.this, HomePageNews.class);
//                        intent1.putExtra("key", key);
                        intent72.putExtra("rurl20", rurl20);
                        startActivity(intent72);
                        break;
                    case 73:
                        //final String key = (String) getIntent().getExtras().get("key");
//                        databaseClients.child(key).child("image").setValue(gurl1);
                        Intent intent73 = new Intent(SettingPriority1.this, HomePageNews.class);
//                        intent1.putExtra("key", key);
                        intent73.putExtra("rurl21", rurl21);
                        startActivity(intent73);
                        break;
                    case 74:
                        //final String key = (String) getIntent().getExtras().get("key");
//                        databaseClients.child(key).child("image").setValue(gurl1);
                        Intent intent74 = new Intent(SettingPriority1.this, HomePageNews.class);
//                        intent1.putExtra("key", key);
                        intent74.putExtra("rurl22", rurl22);
                        startActivity(intent74);
                        break;
                    case 75:
                        //final String key = (String) getIntent().getExtras().get("key");
//                        databaseClients.child(key).child("image").setValue(gurl1);
                        Intent intent75 = new Intent(SettingPriority1.this, HomePageNews.class);
//                        intent1.putExtra("key", key);
                        intent75.putExtra("rurl23", rurl23);
                        startActivity(intent75);
                        break;
                    case 76:
                        //final String key = (String) getIntent().getExtras().get("key");
//                        databaseClients.child(key).child("image").setValue(gurl1);
                        Intent intent76 = new Intent(SettingPriority1.this, HomePageNews.class);
//                        intent1.putExtra("key", key);
                        intent76.putExtra("rurl24", rurl24);
                        startActivity(intent76);
                        break;
                    case 77:
                        //final String key = (String) getIntent().getExtras().get("key");
//                        databaseClients.child(key).child("image").setValue(gurl1);
                        Intent intent77 = new Intent(SettingPriority1.this, HomePageNews.class);
//                        intent1.putExtra("key", key);
                        intent77.putExtra("rurl25", rurl25);
                        startActivity(intent77);
                        break;
                    case 78:
                        //final String key = (String) getIntent().getExtras().get("key");
//                        databaseClients.child(key).child("image").setValue(gurl1);
                        Intent intent78 = new Intent(SettingPriority1.this, HomePageNews.class);
//                        intent1.putExtra("key", key);
                        intent78.putExtra("rurl26", rurl26);
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