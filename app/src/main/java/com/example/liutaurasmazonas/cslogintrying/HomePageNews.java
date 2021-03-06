package com.example.liutaurasmazonas.cslogintrying;

import android.app.SearchManager;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.AsyncTask;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.util.Base64;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Toast;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;


public class HomePageNews extends AppCompatActivity {
    RecyclerView recyclerView;
    ImageButton button;
    private EditText editTextInput;

//    private ImageButton plusgrey1;
//    private ImageButton plusgrey2;
//    private ImageButton plusgrey3;
//    private ImageButton plusgrey4;
//    private ImageButton plusgrey5;
//    private ImageButton plusgrey6;

//                    DatabaseReference databaseClients;
//                    Bitmap bmp = BitmapFactory.decodeStream(url.openConnection().getInputStream());
//                    imageView.setImageBitmap(bmp);

//                    String urlas = "\"http://res.cloudinary.com/liutavaras/image/upload/v1492506105/a_oufued.png\"";
//                    try {
//                        URL url = new URL(urlas);
//                    } catch (MalformedURLException e) {
//                        Toast.makeText(HomePageNews.this, "blabla", Toast.LENGTH_LONG).show();
//                    }
//                    byte [] imageByte = Base64.decode(urlas, Base64.DEFAULT);
//                    Bitmap bmp = BitmapFactory.decodeStream(urlas.openConnection().getInputStream());
//                    imageView.setImageBitmap(bmp);

    @Override
    protected void onCreate(Bundle savedInstantState) {
        super.onCreate(savedInstantState);
        setContentView(R.layout.home_page_news);

        editTextInput = (EditText) findViewById(R.id.editTextInput);

        final SharedPreferences sharedPref = PreferenceManager.getDefaultSharedPreferences(this);

        recyclerView = (RecyclerView) findViewById(R.id.recyclerview);
        ReadRss readRss = new ReadRss(this, recyclerView);
        readRss.execute();

        ImageButton bSettingsBlack = (ImageButton) findViewById(R.id.ibSettingsBlack);
        ImageButton bEconCalBlack = (ImageButton) findViewById(R.id.ibEconCalBlack);
        ImageButton bLiveRates = (ImageButton) findViewById(R.id.ibLiveRates);
        ImageButton addAProfile = (ImageButton) findViewById(R.id.addAProfile);
        final ImageButton bbutton = (ImageButton) findViewById(R.id.button2);


        bSettingsBlack.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(HomePageNews.this, SettingsActivity.class));
            }
        });
        bEconCalBlack.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(HomePageNews.this, WebViewActivity.class));
            }
        });
        bLiveRates.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(HomePageNews.this, sortingrates.class));
            }
        });
        addAProfile.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(HomePageNews.this, AddProfileActivity.class));
            }
        });



        //Intializing Circles:
        final ImageButton plusgrey1 = (ImageButton) findViewById(R.id.plusgrey1);
        final ImageButton plusgrey2 = (ImageButton) findViewById(R.id.plusgrey2);
        final ImageButton plusgrey3 = (ImageButton) findViewById(R.id.plusgrey3);
        final ImageButton plusgrey4 = (ImageButton) findViewById(R.id.plusgrey4);
        final ImageButton plusgrey5 = (ImageButton) findViewById(R.id.plusgrey5);

//        final SharedPreferences sharedPref = PreferenceManager.getDefaultSharedPreferences(this);
//        SharedPreferences.Editor editor = sharedPref.edit();
//        editor.putInt("drawableAgreen", R.drawable.a);
//        editor.commit();

//        final Drawable circlesplusgrey1 = getResources().getDrawable(R.drawable.circlesplusgrey1);
//        final Bitmap grey11 = ((BitmapDrawable) circlesplusgrey1).getBitmap();
//        Drawable circlesplusgrey2 = getResources().getDrawable(R.drawable.circlesplusgrey2);
//        Bitmap grey21 = ((BitmapDrawable) circlesplusgrey2).getBitmap();
//        Drawable circlesplusgrey3 = getResources().getDrawable(R.drawable.circlesplusgrey3);
//        Bitmap grey31 = ((BitmapDrawable) circlesplusgrey3).getBitmap();
//        Drawable circlesplusgrey4 = getResources().getDrawable(R.drawable.circlesplusgrey4);
//        Bitmap grey41 = ((BitmapDrawable) circlesplusgrey4).getBitmap();
//        Drawable circlesplusgrey5 = getResources().getDrawable(R.drawable.circlesplusgrey5);
//        Bitmap grey51 = ((BitmapDrawable) circlesplusgrey5).getBitmap();
//        Drawable circlesplusgrey6 = getResources().getDrawable(R.drawable.circlesplusgrey6);
//        Bitmap grey61 = ((BitmapDrawable) circlesplusgrey6).getBitmap();
//
//        BitmapDrawable Grey11asDrawable = new BitmapDrawable(getResources(), grey11);
//        plusgrey1.setBackgroundDrawable(Grey11asDrawable);
//
//        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
//        grey11.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
//        final byte[] grey11base64 = byteArrayOutputStream.toByteArray();
//        final String encodedGrey11 = Base64.encodeToString(grey11base64, Base64.DEFAULT);
//
//        Bitmap grey12 = BitmapFactory.decodeFile(encodedGrey11);


        //Grey buttons navigations:
        plusgrey1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(HomePageNews.this, Circlegrey1.class));
            }
        });
        plusgrey2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(HomePageNews.this, Circlegrey2.class));
            }
        });
        plusgrey3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(HomePageNews.this, Circlegrey3.class));
            }
        });
        plusgrey4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(HomePageNews.this, Circlegrey4.class));
            }
        });
        plusgrey5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(HomePageNews.this, Circlegrey5.class));
            }
        });


        final LinearLayout Row = (LinearLayout) findViewById(R.id.LinearLayoutScrollView);

                bbutton.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {

                        String gurl111 = sharedPref.getString("gurl1", "");
                        String gurl211 = sharedPref.getString("gurl2", "");
                        String gurl311 = sharedPref.getString("gurl3", "");
                        String gurl411 = sharedPref.getString("gurl4", "");
                        String gurl511 = sharedPref.getString("gurl5", "");
                        String gurl611 = sharedPref.getString("gurl6", "");
                        String gurl711 = sharedPref.getString("gurl7", "");
                        String gurl811 = sharedPref.getString("gurl8", "");
                        String gurl911 = sharedPref.getString("gurl9", "");
                        String gurl1011 = sharedPref.getString("gurl10", "");
                        String gurl1111 = sharedPref.getString("gurl11", "");
                        String gurl1211 = sharedPref.getString("gurl12", "");
                        String gurl1311 = sharedPref.getString("gurl13", "");
                        String gurl1411 = sharedPref.getString("gurl14", "");
                        String gurl1511 = sharedPref.getString("gurl15", "");
                        String gurl1611 = sharedPref.getString("gurl16", "");
                        String gurl1711 = sharedPref.getString("gurl17", "");
                        String gurl1811 = sharedPref.getString("gurl18", "");
                        String gurl1911 = sharedPref.getString("gurl19", "");
                        String gurl2011 = sharedPref.getString("gurl20", "");
                        String gurl2111 = sharedPref.getString("gurl21", "");
                        String gurl2211 = sharedPref.getString("gurl22", "");
                        String gurl2311 = sharedPref.getString("gurl23", "");
                        String gurl2411 = sharedPref.getString("gurl24", "");
                        String gurl2511 = sharedPref.getString("gurl25", "");
                        String gurl2611 = sharedPref.getString("gurl26", "");
                        String aurl111 = sharedPref.getString("aurl1", "");
                        String aurl211 = sharedPref.getString("aurl2", "");
                        String aurl311 = sharedPref.getString("aurl3", "");
                        String aurl411 = sharedPref.getString("aurl4", "");
                        String aurl511 = sharedPref.getString("aurl5", "");
                        String aurl611 = sharedPref.getString("aurl6", "");
                        String aurl711 = sharedPref.getString("aurl7", "");
                        String aurl811 = sharedPref.getString("aurl8", "");
                        String aurl911 = sharedPref.getString("aurl9", "");
                        String aurl1011 = sharedPref.getString("aurl10", "");
                        String aurl1111 = sharedPref.getString("aurl11", "");
                        String aurl1211 = sharedPref.getString("aurl12", "");
                        String aurl1311 = sharedPref.getString("aurl13", "");
                        String aurl1411 = sharedPref.getString("aurl14", "");
                        String aurl1511 = sharedPref.getString("aurl15", "");
                        String aurl1611 = sharedPref.getString("aurl16", "");
                        String aurl1711 = sharedPref.getString("aurl17", "");
                        String aurl1811 = sharedPref.getString("aurl18", "");
                        String aurl1911 = sharedPref.getString("aurl19", "");
                        String aurl2011 = sharedPref.getString("aurl20", "");
                        String aurl2111 = sharedPref.getString("aurl21", "");
                        String aurl2211 = sharedPref.getString("aurl22", "");
                        String aurl2311 = sharedPref.getString("aurl23", "");
                        String aurl2411 = sharedPref.getString("aurl24", "");
                        String aurl2511 = sharedPref.getString("aurl25", "");
                        String aurl2611 = sharedPref.getString("aurl26", "");
                        String rurl111 = sharedPref.getString("rurl1", "");
                        String rurl211 = sharedPref.getString("rurl2", "");
                        String rurl311 = sharedPref.getString("rurl3", "");
                        String rurl411 = sharedPref.getString("rurl4", "");
                        String rurl511 = sharedPref.getString("rurl5", "");
                        String rurl611 = sharedPref.getString("rurl6", "");
                        String rurl711 = sharedPref.getString("rurl7", "");
                        String rurl811 = sharedPref.getString("rurl8", "");
                        String rurl911 = sharedPref.getString("rurl9", "");
                        String rurl1011 = sharedPref.getString("rurl10", "");
                        String rurl1111 = sharedPref.getString("rurl11", "");
                        String rurl1211 = sharedPref.getString("rurl12", "");
                        String rurl1311 = sharedPref.getString("rurl13", "");
                        String rurl1411 = sharedPref.getString("rurl14", "");
                        String rurl1511 = sharedPref.getString("rurl15", "");
                        String rurl1611 = sharedPref.getString("rurl16", "");
                        String rurl1711 = sharedPref.getString("rurl17", "");
                        String rurl1811 = sharedPref.getString("rurl18", "");
                        String rurl1911 = sharedPref.getString("rurl19", "");
                        String rurl2011 = sharedPref.getString("rurl20", "");
                        String rurl2111 = sharedPref.getString("rurl21", "");
                        String rurl2211 = sharedPref.getString("rurl22", "");
                        String rurl2311 = sharedPref.getString("rurl23", "");
                        String rurl2411 = sharedPref.getString("rurl24", "");
                        String rurl2511 = sharedPref.getString("rurl25", "");
                        String rurl2611 = sharedPref.getString("rurl26", "");

                        String ggurl111 = sharedPref.getString("ggurl1", "");
                        String ggurl211 = sharedPref.getString("ggurl2", "");
                        String ggurl311 = sharedPref.getString("ggurl3", "");
                        String ggurl411 = sharedPref.getString("ggurl4", "");
                        String ggurl511 = sharedPref.getString("ggurl5", "");
                        String ggurl611 = sharedPref.getString("ggurl6", "");
                        String ggurl711 = sharedPref.getString("ggurl7", "");
                        String ggurl811 = sharedPref.getString("ggurl8", "");
                        String ggurl911 = sharedPref.getString("ggurl9", "");
                        String ggurl1011 = sharedPref.getString("ggurl10", "");
                        String ggurl1111 = sharedPref.getString("ggurl11", "");
                        String ggurl1211 = sharedPref.getString("ggurl12", "");
                        String ggurl1311 = sharedPref.getString("ggurl13", "");
                        String ggurl1411 = sharedPref.getString("ggurl14", "");
                        String ggurl1511 = sharedPref.getString("ggurl15", "");
                        String ggurl1611 = sharedPref.getString("ggurl16", "");
                        String ggurl1711 = sharedPref.getString("ggurl17", "");
                        String ggurl1811 = sharedPref.getString("ggurl18", "");
                        String ggurl1911 = sharedPref.getString("ggurl19", "");
                        String ggurl2011 = sharedPref.getString("ggurl20", "");
                        String ggurl2111 = sharedPref.getString("ggurl21", "");
                        String ggurl2211 = sharedPref.getString("ggurl22", "");
                        String ggurl2311 = sharedPref.getString("ggurl23", "");
                        String ggurl2411 = sharedPref.getString("ggurl24", "");
                        String ggurl2511 = sharedPref.getString("ggurl25", "");
                        String ggurl2611 = sharedPref.getString("ggurl26", "");
                        String aaurl111 = sharedPref.getString("aaurl1", "");
                        String aaurl211 = sharedPref.getString("aaurl2", "");
                        String aaurl311 = sharedPref.getString("aaurl3", "");
                        String aaurl411 = sharedPref.getString("aaurl4", "");
                        String aaurl511 = sharedPref.getString("aaurl5", "");
                        String aaurl611 = sharedPref.getString("aaurl6", "");
                        String aaurl711 = sharedPref.getString("aaurl7", "");
                        String aaurl811 = sharedPref.getString("aaurl8", "");
                        String aaurl911 = sharedPref.getString("aaurl9", "");
                        String aaurl1011 = sharedPref.getString("aaurl10", "");
                        String aaurl1111 = sharedPref.getString("aaurl11", "");
                        String aaurl1211 = sharedPref.getString("aaurl12", "");
                        String aaurl1311 = sharedPref.getString("aaurl13", "");
                        String aaurl1411 = sharedPref.getString("aaurl14", "");
                        String aaurl1511 = sharedPref.getString("aaurl15", "");
                        String aaurl1611 = sharedPref.getString("aaurl16", "");
                        String aaurl1711 = sharedPref.getString("aaurl17", "");
                        String aaurl1811 = sharedPref.getString("aaurl18", "");
                        String aaurl1911 = sharedPref.getString("aaurl19", "");
                        String aaurl2011 = sharedPref.getString("aaurl20", "");
                        String aaurl2111 = sharedPref.getString("aaurl21", "");
                        String aaurl2211 = sharedPref.getString("aaurl22", "");
                        String aaurl2311 = sharedPref.getString("aaurl23", "");
                        String aaurl2411 = sharedPref.getString("aaurl24", "");
                        String aaurl2511 = sharedPref.getString("aaurl25", "");
                        String aaurl2611 = sharedPref.getString("aaurl26", "");
                        String rrurl111 = sharedPref.getString("rrurl1", "");
                        String rrurl211 = sharedPref.getString("rrurl2", "");
                        String rrurl311 = sharedPref.getString("rrurl3", "");
                        String rrurl411 = sharedPref.getString("rrurl4", "");
                        String rrurl511 = sharedPref.getString("rrurl5", "");
                        String rrurl611 = sharedPref.getString("rrurl6", "");
                        String rrurl711 = sharedPref.getString("rrurl7", "");
                        String rrurl811 = sharedPref.getString("rrurl8", "");
                        String rrurl911 = sharedPref.getString("rrurl9", "");
                        String rrurl1011 = sharedPref.getString("rrurl10", "");
                        String rrurl1111 = sharedPref.getString("rrurl11", "");
                        String rrurl1211 = sharedPref.getString("rrurl12", "");
                        String rrurl1311 = sharedPref.getString("rrurl13", "");
                        String rrurl1411 = sharedPref.getString("rrurl14", "");
                        String rrurl1511 = sharedPref.getString("rrurl15", "");
                        String rrurl1611 = sharedPref.getString("rrurl16", "");
                        String rrurl1711 = sharedPref.getString("rrurl17", "");
                        String rrurl1811 = sharedPref.getString("rrurl18", "");
                        String rrurl1911 = sharedPref.getString("rrurl19", "");
                        String rrurl2011 = sharedPref.getString("rrurl20", "");
                        String rrurl2111 = sharedPref.getString("rrurl21", "");
                        String rrurl2211 = sharedPref.getString("rrurl22", "");
                        String rrurl2311 = sharedPref.getString("rrurl23", "");
                        String rrurl2411 = sharedPref.getString("rrurl24", "");
                        String rrurl2511 = sharedPref.getString("rrul25", "");
                        String rrurl2611 = sharedPref.getString("rrul26", "");

                        String gggurl111 = sharedPref.getString("gggurl1", "");
                        String gggurl211 = sharedPref.getString("gggurl2", "");
                        String gggurl311 = sharedPref.getString("gggurl3", "");
                        String gggurl411 = sharedPref.getString("gggurl4", "");
                        String gggurl511 = sharedPref.getString("gggurl5", "");
                        String gggurl611 = sharedPref.getString("gggurl6", "");
                        String gggurl711 = sharedPref.getString("gggurl7", "");
                        String gggurl811 = sharedPref.getString("gggurl8", "");
                        String gggurl911 = sharedPref.getString("gggurl9", "");
                        String gggurl1011 = sharedPref.getString("gggurl10", "");
                        String gggurl1111 = sharedPref.getString("gggurl11", "");
                        String gggurl1211 = sharedPref.getString("gggurl12", "");
                        String gggurl1311 = sharedPref.getString("gggurl13", "");
                        String gggurl1411 = sharedPref.getString("gggurl14", "");
                        String gggurl1511 = sharedPref.getString("gggurl15", "");
                        String gggurl1611 = sharedPref.getString("gggurl16", "");
                        String gggurl1711 = sharedPref.getString("gggurl17", "");
                        String gggurl1811 = sharedPref.getString("gggurl18", "");
                        String gggurl1911 = sharedPref.getString("gggurl19", "");
                        String gggurl2011 = sharedPref.getString("gggurl20", "");
                        String gggurl2111 = sharedPref.getString("gggurl21", "");
                        String gggurl2211 = sharedPref.getString("gggurl22", "");
                        String gggurl2311 = sharedPref.getString("gggurl23", "");
                        String gggurl2411 = sharedPref.getString("gggurl24", "");
                        String gggurl2511 = sharedPref.getString("gggurl25", "");
                        String gggurl2611 = sharedPref.getString("gggurl26", "");
                        String aaaurl111 = sharedPref.getString("aaaurl1", "");
                        String aaaurl211 = sharedPref.getString("aaaurl2", "");
                        String aaaurl311 = sharedPref.getString("aaaurl3", "");
                        String aaaurl411 = sharedPref.getString("aaaurl4", "");
                        String aaaurl511 = sharedPref.getString("aaaurl5", "");
                        String aaaurl611 = sharedPref.getString("aaaurl6", "");
                        String aaaurl711 = sharedPref.getString("aaaurl7", "");
                        String aaaurl811 = sharedPref.getString("aaaurl8", "");
                        String aaaurl911 = sharedPref.getString("aaaurl9", "");
                        String aaaurl1011 = sharedPref.getString("aaaurl10", "");
                        String aaaurl1111 = sharedPref.getString("aaaurl11", "");
                        String aaaurl1211 = sharedPref.getString("aaaurl12", "");
                        String aaaurl1311 = sharedPref.getString("aaaurl13", "");
                        String aaaurl1411 = sharedPref.getString("aaaurl14", "");
                        String aaaurl1511 = sharedPref.getString("aaaurl15", "");
                        String aaaurl1611 = sharedPref.getString("aaaurl16", "");
                        String aaaurl1711 = sharedPref.getString("aaaurl17", "");
                        String aaaurl1811 = sharedPref.getString("aaaurl18", "");
                        String aaaurl1911 = sharedPref.getString("aaaurl19", "");
                        String aaaurl2011 = sharedPref.getString("aaaurl20", "");
                        String aaaurl2111 = sharedPref.getString("aaaurl21", "");
                        String aaaurl2211 = sharedPref.getString("aaaurl22", "");
                        String aaaurl2311 = sharedPref.getString("aaaurl23", "");
                        String aaaurl2411 = sharedPref.getString("aaaurl24", "");
                        String aaaurl2511 = sharedPref.getString("aaaurl25", "");
                        String aaaurl2611 = sharedPref.getString("aaaurl26", "");
                        String rrrurl111 = sharedPref.getString("rrrurl1", "");
                        String rrrurl211 = sharedPref.getString("rrrurl2", "");
                        String rrrurl311 = sharedPref.getString("rrrurl3", "");
                        String rrrurl411 = sharedPref.getString("rrrurl4", "");
                        String rrrurl511 = sharedPref.getString("rrrurl5", "");
                        String rrrurl611 = sharedPref.getString("rrrurl6", "");
                        String rrrurl711 = sharedPref.getString("rrrurl7", "");
                        String rrrurl811 = sharedPref.getString("rrrurl8", "");
                        String rrrurl911 = sharedPref.getString("rrrurl9", "");
                        String rrrurl1011 = sharedPref.getString("rrrurl10", "");
                        String rrrurl1111 = sharedPref.getString("rrrurl11", "");
                        String rrrurl1211 = sharedPref.getString("rrrurl12", "");
                        String rrrurl1311 = sharedPref.getString("rrrurl13", "");
                        String rrrurl1411 = sharedPref.getString("rrrurl14", "");
                        String rrrurl1511 = sharedPref.getString("rrrurl15", "");
                        String rrrurl1611 = sharedPref.getString("rrrurl16", "");
                        String rrrurl1711 = sharedPref.getString("rrrurl17", "");
                        String rrrurl1811 = sharedPref.getString("rrrurl18", "");
                        String rrrurl1911 = sharedPref.getString("rrrurl19", "");
                        String rrrurl2011 = sharedPref.getString("rrrurl20", "");
                        String rrrurl2111 = sharedPref.getString("rrrurl21", "");
                        String rrrurl2211 = sharedPref.getString("rrrurl22", "");
                        String rrrurl2311 = sharedPref.getString("rrrurl23", "");
                        String rrrurl2411 = sharedPref.getString("rrrurl24", "");
                        String rrrurl2511 = sharedPref.getString("rrrurl25", "");
                        String rrrurl2611 = sharedPref.getString("rrrurl26", "");


                        String ggggurl111 = sharedPref.getString("ggggurl1", "");
                        String ggggurl211 = sharedPref.getString("ggggurl2", "");
                        String ggggurl311 = sharedPref.getString("ggggurl3", "");
                        String ggggurl411 = sharedPref.getString("ggggurl4", "");
                        String ggggurl511 = sharedPref.getString("ggggurl5", "");
                        String ggggurl611 = sharedPref.getString("ggggurl6", "");
                        String ggggurl711 = sharedPref.getString("ggggurl7", "");
                        String ggggurl811 = sharedPref.getString("ggggurl8", "");
                        String ggggurl911 = sharedPref.getString("ggggurl9", "");
                        String ggggurl1011 = sharedPref.getString("ggggurl10", "");
                        String ggggurl1111 = sharedPref.getString("ggggurl11", "");
                        String ggggurl1211 = sharedPref.getString("ggggurl12", "");
                        String ggggurl1311 = sharedPref.getString("ggggurl13", "");
                        String ggggurl1411 = sharedPref.getString("ggggurl14", "");
                        String ggggurl1511 = sharedPref.getString("ggggurl15", "");
                        String ggggurl1611 = sharedPref.getString("ggggurl16", "");
                        String ggggurl1711 = sharedPref.getString("ggggurl17", "");
                        String ggggurl1811 = sharedPref.getString("ggggurl18", "");
                        String ggggurl1911 = sharedPref.getString("ggggurl19", "");
                        String ggggurl2011 = sharedPref.getString("ggggurl20", "");
                        String ggggurl2111 = sharedPref.getString("ggggurl21", "");
                        String ggggurl2211 = sharedPref.getString("ggggurl22", "");
                        String ggggurl2311 = sharedPref.getString("ggggurl23", "");
                        String ggggurl2411 = sharedPref.getString("ggggurl24", "");
                        String ggggurl2511 = sharedPref.getString("ggggurl25", "");
                        String ggggurl2611 = sharedPref.getString("ggggurl26", "");
                        String aaaaurl111 = sharedPref.getString("aaaaurl1", "");
                        String aaaaurl211 = sharedPref.getString("aaaaurl2", "");
                        String aaaaurl311 = sharedPref.getString("aaaaurl3", "");
                        String aaaaurl411 = sharedPref.getString("aaaaurl4", "");
                        String aaaaurl511 = sharedPref.getString("aaaaurl5", "");
                        String aaaaurl611 = sharedPref.getString("aaaaurl6", "");
                        String aaaaurl711 = sharedPref.getString("aaaaurl7", "");
                        String aaaaurl811 = sharedPref.getString("aaaaurl8", "");
                        String aaaaurl911 = sharedPref.getString("aaaaurl9", "");
                        String aaaaurl1011 = sharedPref.getString("aaaaurl10", "");
                        String aaaaurl1111 = sharedPref.getString("aaaaurl11", "");
                        String aaaaurl1211 = sharedPref.getString("aaaaurl12", "");
                        String aaaaurl1311 = sharedPref.getString("aaaaurl13", "");
                        String aaaaurl1411 = sharedPref.getString("aaaaurl14", "");
                        String aaaaurl1511 = sharedPref.getString("aaaaurl15", "");
                        String aaaaurl1611 = sharedPref.getString("aaaaurl16", "");
                        String aaaaurl1711 = sharedPref.getString("aaaaurl17", "");
                        String aaaaurl1811 = sharedPref.getString("aaaaurl18", "");
                        String aaaaurl1911 = sharedPref.getString("aaaaurl19", "");
                        String aaaaurl2011 = sharedPref.getString("aaaaurl20", "");
                        String aaaaurl2111 = sharedPref.getString("aaaaurl21", "");
                        String aaaaurl2211 = sharedPref.getString("aaaaurl22", "");
                        String aaaaurl2311 = sharedPref.getString("aaaaurl23", "");
                        String aaaaurl2411 = sharedPref.getString("aaaaurl24", "");
                        String aaaaurl2511 = sharedPref.getString("aaaaurl25", "");
                        String aaaaurl2611 = sharedPref.getString("aaaaurl26", "");
                        String rrrrurl111 = sharedPref.getString("rrrrurl1", "");
                        String rrrrurl211 = sharedPref.getString("rrrrurl2", "");
                        String rrrrurl311 = sharedPref.getString("rrrrurl3", "");
                        String rrrrurl411 = sharedPref.getString("rrrrurl4", "");
                        String rrrrurl511 = sharedPref.getString("rrrrurl5", "");
                        String rrrrurl611 = sharedPref.getString("rrrrurl6", "");
                        String rrrrurl711 = sharedPref.getString("rrrrurl7", "");
                        String rrrrurl811 = sharedPref.getString("rrrrurl8", "");
                        String rrrrurl911 = sharedPref.getString("rrrrurl9", "");
                        String rrrrurl1011 = sharedPref.getString("rrrrurl10", "");
                        String rrrrurl1111 = sharedPref.getString("rrrrurl11", "");
                        String rrrrurl1211 = sharedPref.getString("rrrrurl12", "");
                        String rrrrurl1311 = sharedPref.getString("rrrrurl13", "");
                        String rrrrurl1411 = sharedPref.getString("rrrrurl14", "");
                        String rrrrurl1511 = sharedPref.getString("rrrrurl15", "");
                        String rrrrurl1611 = sharedPref.getString("rrrrurl16", "");
                        String rrrrurl1711 = sharedPref.getString("rrrrurl17", "");
                        String rrrrurl1811 = sharedPref.getString("rrrrurl18", "");
                        String rrrrurl1911 = sharedPref.getString("rrrrurl19", "");
                        String rrrrurl2011 = sharedPref.getString("rrrrurl20", "");
                        String rrrrurl2111 = sharedPref.getString("rrrrurl21", "");
                        String rrrrurl2211 = sharedPref.getString("rrrrurl22", "");
                        String rrrrurl2311 = sharedPref.getString("rrrrurl23", "");
                        String rrrrurl2411 = sharedPref.getString("rrrrurl24", "");
                        String rrrrurl2511 = sharedPref.getString("rrrrurl25", "");
                        String rrrrurl2611 = sharedPref.getString("rrrrurl26", "");


                        String gggggurl111 = sharedPref.getString("gggggurl1", "");
                        String gggggurl211 = sharedPref.getString("gggggurl2", "");
                        String gggggurl311 = sharedPref.getString("gggggurl3", "");
                        String gggggurl411 = sharedPref.getString("gggggurl4", "");
                        String gggggurl511 = sharedPref.getString("gggggurl5", "");
                        String gggggurl611 = sharedPref.getString("gggggurl6", "");
                        String gggggurl711 = sharedPref.getString("gggggurl7", "");
                        String gggggurl811 = sharedPref.getString("gggggurl8", "");
                        String gggggurl911 = sharedPref.getString("gggggurl9", "");
                        String gggggurl1011 = sharedPref.getString("gggggurl10", "");
                        String gggggurl1111 = sharedPref.getString("gggggurl11", "");
                        String gggggurl1211 = sharedPref.getString("gggggurl12", "");
                        String gggggurl1311 = sharedPref.getString("gggggurl13", "");
                        String gggggurl1411 = sharedPref.getString("gggggurl14", "");
                        String gggggurl1511 = sharedPref.getString("gggggurl15", "");
                        String gggggurl1611 = sharedPref.getString("gggggurl16", "");
                        String gggggurl1711 = sharedPref.getString("gggggurl17", "");
                        String gggggurl1811 = sharedPref.getString("gggggurl18", "");
                        String gggggurl1911 = sharedPref.getString("gggggurl19", "");
                        String gggggurl2011 = sharedPref.getString("gggggurl20", "");
                        String gggggurl2111 = sharedPref.getString("gggggurl21", "");
                        String gggggurl2211 = sharedPref.getString("gggggurl22", "");
                        String gggggurl2311 = sharedPref.getString("gggggurl23", "");
                        String gggggurl2411 = sharedPref.getString("gggggurl24", "");
                        String gggggurl2511 = sharedPref.getString("gggggurl25", "");
                        String gggggurl2611 = sharedPref.getString("gggggurl26", "");
                        String aaaaaurl111 = sharedPref.getString("aaaaaurl1", "");
                        String aaaaaurl211 = sharedPref.getString("aaaaaurl2", "");
                        String aaaaaurl311 = sharedPref.getString("aaaaaurl3", "");
                        String aaaaaurl411 = sharedPref.getString("aaaaaurl4", "");
                        String aaaaaurl511 = sharedPref.getString("aaaaaurl5", "");
                        String aaaaaurl611 = sharedPref.getString("aaaaaurl6", "");
                        String aaaaaurl711 = sharedPref.getString("aaaaaurl7", "");
                        String aaaaaurl811 = sharedPref.getString("aaaaaurl8", "");
                        String aaaaaurl911 = sharedPref.getString("aaaaaurl9", "");
                        String aaaaaurl1011 = sharedPref.getString("aaaaaurl10", "");
                        String aaaaaurl1111 = sharedPref.getString("aaaaaurl11", "");
                        String aaaaaurl1211 = sharedPref.getString("aaaaaurl12", "");
                        String aaaaaurl1311 = sharedPref.getString("aaaaaurl13", "");
                        String aaaaaurl1411 = sharedPref.getString("aaaaaurl14", "");
                        String aaaaaurl1511 = sharedPref.getString("aaaaaurl15", "");
                        String aaaaaurl1611 = sharedPref.getString("aaaaaurl16", "");
                        String aaaaaurl1711 = sharedPref.getString("aaaaaurl17", "");
                        String aaaaaurl1811 = sharedPref.getString("aaaaaurl18", "");
                        String aaaaaurl1911 = sharedPref.getString("aaaaaurl19", "");
                        String aaaaaurl2011 = sharedPref.getString("aaaaaurl20", "");
                        String aaaaaurl2111 = sharedPref.getString("aaaaaurl21", "");
                        String aaaaaurl2211 = sharedPref.getString("aaaaaurl22", "");
                        String aaaaaurl2311 = sharedPref.getString("aaaaaurl23", "");
                        String aaaaaurl2411 = sharedPref.getString("aaaaaurl24", "");
                        String aaaaaurl2511 = sharedPref.getString("aaaaaurl25", "");
                        String aaaaaurl2611 = sharedPref.getString("aaaaaurl26", "");
                        String rrrrrurl111 = sharedPref.getString("rrrrrurl1", "");
                        String rrrrrurl211 = sharedPref.getString("rrrrrurl2", "");
                        String rrrrrurl311 = sharedPref.getString("rrrrrurl3", "");
                        String rrrrrurl411 = sharedPref.getString("rrrrrurl4", "");
                        String rrrrrurl511 = sharedPref.getString("rrrrrurl5", "");
                        String rrrrrurl611 = sharedPref.getString("rrrrrurl6", "");
                        String rrrrrurl711 = sharedPref.getString("rrrrrurl7", "");
                        String rrrrrurl811 = sharedPref.getString("rrrrrurl8", "");
                        String rrrrrurl911 = sharedPref.getString("rrrrrurl9", "");
                        String rrrrrurl1011 = sharedPref.getString("rrrrrurl10", "");
                        String rrrrrurl1111 = sharedPref.getString("rrrrrurl11", "");
                        String rrrrrurl1211 = sharedPref.getString("rrrrrurl12", "");
                        String rrrrrurl1311 = sharedPref.getString("rrrrrurl13", "");
                        String rrrrrurl1411 = sharedPref.getString("rrrrrurl14", "");
                        String rrrrrurl1511 = sharedPref.getString("rrrrrurl15", "");
                        String rrrrrurl1611 = sharedPref.getString("rrrrrurl16", "");
                        String rrrrrurl1711 = sharedPref.getString("rrrrrurl17", "");
                        String rrrrrurl1811 = sharedPref.getString("rrrrrurl18", "");
                        String rrrrrurl1911 = sharedPref.getString("rrrrrurl19", "");
                        String rrrrrurl2011 = sharedPref.getString("rrrrrurl20", "");
                        String rrrrrurl2111 = sharedPref.getString("rrrrrurl21", "");
                        String rrrrrurl2211 = sharedPref.getString("rrrrrurl22", "");
                        String rrrrrurl2311 = sharedPref.getString("rrrrrurl23", "");
                        String rrrrrurl2411 = sharedPref.getString("rrrrrurl24", "");
                        String rrrrrurl2511 = sharedPref.getString("rrrrrurl25", "");
                        String rrrrrurl2611 = sharedPref.getString("rrrrrurl26", "");



                        if (gurl111 == "" && gurl211 == "" && gurl311 == "" && gurl411 == "" && gurl511 == "" && gurl611 == "" && gurl711 == "" &&
                                gurl811 == "" && gurl911 == "" && gurl1011 == "" && gurl1111 == "" && gurl1211 == "" && gurl1311 == "" && gurl1411 == "" &&
                                gurl1511 == "" && gurl1611 == "" && gurl1711 == "" && gurl1811 == "" && gurl1911 == "" && gurl2011 == "" && gurl2111 == "" &&
                                gurl2211 == "" && gurl2311 == "" && gurl2411 == "" && gurl2511 == "" && gurl2611 == "" &&
                                rurl111 == "" && rurl211 == "" && rurl311 == "" && rurl411 == "" && rurl511 == "" && rurl611 == "" && rurl711 == "" &&
                                rurl811 == "" && rurl911 == "" && rurl1011 == "" && rurl1111 == "" && rurl1211 == "" && rurl1311 == "" && rurl1411 == "" &&
                                rurl1511 == "" && rurl1611 == "" && rurl1711 == "" && rurl1811 == "" && rurl1911 == "" && rurl2011 == "" && rurl2111 == "" &&
                                rurl2211 == "" && rurl2311 == "" && rurl2411 == "" && rurl2511 == "" && rurl2611 == "" &&
                                aurl111 == "" && aurl211 == "" && aurl311 == "" && aurl411 == "" && aurl511 == "" && aurl611 == "" && aurl711 == "" &&
                                aurl811 == "" && aurl911 == "" && aurl1011 == "" && aurl1111 == "" && aurl1211 == "" && aurl1311 == "" && aurl1411 == "" &&
                                aurl1511 == "" && aurl1611 == "" && aurl1711 == "" && aurl1811 == "" && aurl1911 == "" && aurl2011 == "" && aurl2111 == "" &&
                                aurl2211 == "" && aurl2311 == "" && aurl2411 == "" && aurl2511 == "" && aurl2611 == "") {
                            Toast.makeText(HomePageNews.this, "Haha", Toast.LENGTH_LONG);
                        } else if (gurl111 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey1).execute(gurl111);
                        } else if (gurl211 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey1).execute(gurl211);
                        } else if (gurl311 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey1).execute(gurl311);
                        } else if (gurl411 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey1).execute(gurl411);
                        } else if (gurl511 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey1).execute(gurl511);
                        } else if (gurl611 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey1).execute(gurl611);
                        } else if (gurl711 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey1).execute(gurl711);
                        } else if (gurl811 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey1).execute(gurl811);
                        } else if (gurl911 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey1).execute(gurl911);
                        } else if (gurl1011 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey1).execute(gurl1011);
                        } else if (gurl1111 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey1).execute(gurl1111);
                        } else if (gurl1211 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey1).execute(gurl1211);
                        } else if (gurl1311 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey1).execute(gurl1311);
                        } else if (gurl1411 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey1).execute(gurl1411);
                        } else if (gurl1511 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey1).execute(gurl1511);
                        } else if (gurl1611 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey1).execute(gurl1611);
                        } else if (gurl1711 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey1).execute(gurl1711);
                        } else if (gurl1811 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey1).execute(gurl1811);
                        } else if (gurl1911 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey1).execute(gurl1911);
                        } else if (gurl2011 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey1).execute(gurl2011);
                        } else if (gurl2111 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey1).execute(gurl2111);
                        } else if (gurl2211 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey1).execute(gurl2211);
                        } else if (gurl2311 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey1).execute(gurl2311);
                        } else if (gurl2411 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey1).execute(gurl2411);
                        } else if (gurl2511 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey1).execute(gurl2511);
                        } else if (gurl2611 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey1).execute(gurl2611);
                        } else if (aurl111 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey1).execute(aurl111);
                        } else if (aurl211 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey1).execute(aurl211);
                        } else if (aurl311 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey1).execute(aurl311);
                        } else if (aurl411 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey1).execute(aurl411);
                        } else if (aurl511 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey1).execute(aurl511);
                        } else if (aurl611 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey1).execute(aurl611);
                        } else if (aurl711 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey1).execute(aurl711);
                        } else if (aurl811 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey1).execute(aurl811);
                        } else if (aurl911 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey1).execute(aurl911);
                        } else if (aurl1011 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey1).execute(aurl1011);
                        } else if (aurl1111 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey1).execute(aurl1111);
                        } else if (aurl1211 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey1).execute(aurl1211);
                        } else if (aurl1311 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey1).execute(aurl1311);
                        } else if (aurl1411 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey1).execute(aurl1411);
                        } else if (aurl1511 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey1).execute(aurl1511);
                        } else if (aurl1611 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey1).execute(aurl1611);
                        } else if (aurl1711 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey1).execute(aurl1711);
                        } else if (aurl1811 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey1).execute(aurl1811);
                        } else if (aurl1911 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey1).execute(aurl1911);
                        } else if (aurl2011 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey1).execute(aurl2011);
                        } else if (aurl2111 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey1).execute(aurl2111);
                        } else if (aurl2211 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey1).execute(aurl2211);
                        } else if (aurl2311 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey1).execute(aurl2311);
                        } else if (aurl2411 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey1).execute(aurl2411);
                        } else if (aurl2511 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey1).execute(aurl2511);
                        } else if (aurl2611 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey1).execute(aurl2611);
                        } else if (rurl111 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey1).execute(rurl111);
                        } else if (rurl211 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey1).execute(rurl211);
                        } else if (rurl311 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey1).execute(rurl311);
                        } else if (rurl411 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey1).execute(rurl411);
                        } else if (rurl511 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey1).execute(rurl511);
                        } else if (rurl611 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey1).execute(rurl611);
                        } else if (rurl711 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey1).execute(rurl711);
                        } else if (rurl811 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey1).execute(rurl811);
                        } else if (rurl911 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey1).execute(rurl911);
                        } else if (rurl1011 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey1).execute(rurl1011);
                        } else if (rurl1111 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey1).execute(rurl1111);
                        } else if (rurl1211 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey1).execute(rurl1211);
                        } else if (rurl1311 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey1).execute(rurl1311);
                        } else if (rurl1411 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey1).execute(rurl1411);
                        } else if (rurl1511 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey1).execute(rurl1511);
                        } else if (rurl1611 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey1).execute(rurl1611);
                        } else if (rurl1711 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey1).execute(rurl1711);
                        } else if (rurl1811 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey1).execute(rurl1811);
                        } else if (rurl1911 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey1).execute(rurl1911);
                        } else if (rurl2011 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey1).execute(rurl2011);
                        } else if (rurl2111 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey1).execute(rurl2111);
                        } else if (rurl2211 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey1).execute(rurl2211);
                        } else if (rurl2311 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey1).execute(rurl2311);
                        } else if (rurl2411 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey1).execute(rurl2411);
                        } else if (rurl2511 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey1).execute(rurl2511);
                        } else if (rurl2611 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey1).execute(rurl2611);
                        }


                        if (ggurl111 == "" && ggurl211 == "" && ggurl311 == "" && ggurl411 == "" && ggurl511 == "" && ggurl611 == "" && ggurl711 == "" &&
                                ggurl811 == "" && ggurl911 == "" && ggurl1011 == "" && ggurl1111 == "" && ggurl1211 == "" && ggurl1311 == "" && ggurl1411 == "" &&
                                ggurl1511 == "" && ggurl1611 == "" && ggurl1711 == "" && ggurl1811 == "" && ggurl1911 == "" && ggurl2011 == "" && ggurl2111 == "" &&
                                ggurl2211 == "" && ggurl2311 == "" && ggurl2411 == "" && ggurl2511 == "" && ggurl2611 == "" &&
                                rrurl111 == "" && rrurl211 == "" && rrurl311 == "" && rrurl411 == "" && rrurl511 == "" && rrurl611 == "" && rrurl711 == "" &&
                                rrurl811 == "" && rrurl911 == "" && rrurl1011 == "" && rrurl1111 == "" && rrurl1211 == "" && rrurl1311 == "" && rrurl1411 == "" &&
                                rrurl1511 == "" && rrurl1611 == "" && rrurl1711 == "" && rrurl1811 == "" && rrurl1911 == "" && rrurl2011 == "" && rrurl2111 == "" &&
                                rrurl2211 == "" && rrurl2311 == "" && rrurl2411 == "" && rrurl2511 == "" && rrurl2611 == "" &&
                                aaurl111 == "" && aaurl211 == "" && aaurl311 == "" && aaurl411 == "" && aaurl511 == "" && aaurl611 == "" && aaurl711 == "" &&
                                aaurl811 == "" && aaurl911 == "" && aaurl1011 == "" && aaurl1111 == "" && aaurl1211 == "" && aaurl1311 == "" && aaurl1411 == "" &&
                                aaurl1511 == "" && aaurl1611 == "" && aaurl1711 == "" && aaurl1811 == "" && aaurl1911 == "" && aaurl2011 == "" && aaurl2111 == "" &&
                                aaurl2211 == "" && aaurl2311 == "" && aaurl2411 == "" && aaurl2511 == "" && aaurl2611 == "") {
                            Toast.makeText(HomePageNews.this, "Haha", Toast.LENGTH_LONG);
                        } else if (ggurl111 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey2).execute(ggurl111);
                        } else if (ggurl211 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey2).execute(ggurl211);
                        } else if (ggurl311 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey2).execute(ggurl311);
                        } else if (ggurl411 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey2).execute(ggurl411);
                        } else if (ggurl511 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey2).execute(ggurl511);
                        } else if (ggurl611 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey2).execute(ggurl611);
                        } else if (ggurl711 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey2).execute(ggurl711);
                        } else if (ggurl811 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey2).execute(ggurl811);
                        } else if (ggurl911 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey2).execute(ggurl911);
                        } else if (ggurl1011 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey2).execute(ggurl1011);
                        } else if (ggurl1111 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey2).execute(ggurl1111);
                        } else if (ggurl1211 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey2).execute(ggurl1211);
                        } else if (ggurl1311 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey2).execute(ggurl1311);
                        } else if (ggurl1411 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey2).execute(ggurl1411);
                        } else if (ggurl1511 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey2).execute(ggurl1511);
                        } else if (ggurl1611 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey2).execute(ggurl1611);
                        } else if (ggurl1711 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey2).execute(ggurl1711);
                        } else if (ggurl1811 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey2).execute(ggurl1811);
                        } else if (ggurl1911 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey2).execute(ggurl1911);
                        } else if (ggurl2011 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey2).execute(ggurl2011);
                        } else if (ggurl2111 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey2).execute(ggurl2111);
                        } else if (ggurl2211 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey2).execute(ggurl2211);
                        } else if (ggurl2311 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey2).execute(ggurl2311);
                        } else if (ggurl2411 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey2).execute(ggurl2411);
                        } else if (ggurl2511 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey2).execute(ggurl2511);
                        } else if (ggurl2611 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey2).execute(ggurl2611);
                        } else if (aaurl111 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey2).execute(aaurl111);
                        } else if (aaurl211 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey2).execute(aaurl211);
                        } else if (aaurl311 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey2).execute(aaurl311);
                        } else if (aaurl411 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey2).execute(aaurl411);
                        } else if (aaurl511 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey2).execute(aaurl511);
                        } else if (aaurl611 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey2).execute(aaurl611);
                        } else if (aaurl711 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey2).execute(aaurl711);
                        } else if (aaurl811 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey2).execute(aaurl811);
                        } else if (aaurl911 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey2).execute(aaurl911);
                        } else if (aaurl1011 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey2).execute(aaurl1011);
                        } else if (aaurl1111 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey2).execute(aaurl1111);
                        } else if (aaurl1211 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey2).execute(aaurl1211);
                        } else if (aaurl1311 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey2).execute(aaurl1311);
                        } else if (aaurl1411 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey2).execute(aaurl1411);
                        } else if (aaurl1511 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey2).execute(aaurl1511);
                        } else if (aaurl1611 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey2).execute(aaurl1611);
                        } else if (aaurl1711 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey2).execute(aaurl1711);
                        } else if (aaurl1811 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey2).execute(aaurl1811);
                        } else if (aaurl1911 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey2).execute(aaurl1911);
                        } else if (aaurl2011 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey2).execute(aaurl2011);
                        } else if (aaurl2111 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey2).execute(aaurl2111);
                        } else if (aaurl2211 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey2).execute(aaurl2211);
                        } else if (aaurl2311 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey2).execute(aaurl2311);
                        } else if (aaurl2411 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey2).execute(aaurl2411);
                        } else if (aaurl2511 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey2).execute(aaurl2511);
                        } else if (aaurl2611 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey2).execute(aaurl2611);
                        } else if (rrurl111 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey2).execute(rrurl111);
                        } else if (rrurl211 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey2).execute(rrurl211);
                        } else if (rrurl311 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey2).execute(rrurl311);
                        } else if (rrurl411 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey2).execute(rrurl411);
                        } else if (rrurl511 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey2).execute(rrurl511);
                        } else if (rrurl611 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey2).execute(rrurl611);
                        } else if (rrurl711 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey2).execute(rrurl711);
                        } else if (rrurl811 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey2).execute(rrurl811);
                        } else if (rrurl911 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey2).execute(rrurl911);
                        } else if (rrurl1011 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey2).execute(rrurl1011);
                        } else if (rrurl1111 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey2).execute(rrurl1111);
                        } else if (rrurl1211 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey2).execute(rrurl1211);
                        } else if (rrurl1311 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey2).execute(rrurl1311);
                        } else if (rrurl1411 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey2).execute(rrurl1411);
                        } else if (rrurl1511 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey2).execute(rrurl1511);
                        } else if (rrurl1611 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey2).execute(rrurl1611);
                        } else if (rrurl1711 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey2).execute(rrurl1711);
                        } else if (rrurl1811 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey2).execute(rrurl1811);
                        } else if (rrurl1911 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey2).execute(rrurl1911);
                        } else if (rrurl2011 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey2).execute(rrurl2011);
                        } else if (rrurl2111 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey2).execute(rrurl2111);
                        } else if (rrurl2211 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey2).execute(rrurl2211);
                        } else if (rrurl2311 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey2).execute(rrurl2311);
                        } else if (rrurl2411 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey2).execute(rrurl2411);
                        } else if (rrurl2511 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey2).execute(rrurl2511);
                        } else if (rrurl2611 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey2).execute(rrurl2611);
                        }

                        if (gggurl111 == "" && gggurl211 == "" && gggurl311 == "" && gggurl411 == "" && gggurl511 == "" && gggurl611 == "" && gggurl711 == "" &&
                                gggurl811 == "" && gggurl911 == "" && gggurl1011 == "" && gggurl1111 == "" && gggurl1211 == "" && gggurl1311 == "" && gggurl1411 == "" &&
                                gggurl1511 == "" && gggurl1611 == "" && gggurl1711 == "" && gggurl1811 == "" && gggurl1911 == "" && gggurl2011 == "" && gggurl2111 == "" &&
                                gggurl2211 == "" && gggurl2311 == "" && gggurl2411 == "" && gggurl2511 == "" && gggurl2611 == "" &&
                                rrrurl111 == "" && rrrurl211 == "" && rrrurl311 == "" && rrrurl411 == "" && rrrurl511 == "" && rrrurl611 == "" && rrrurl711 == "" &&
                                rrrurl811 == "" && rrrurl911 == "" && rrrurl1011 == "" && rrrurl1111 == "" && rrrurl1211 == "" && rrrurl1311 == "" && rrrurl1411 == "" &&
                                rrrurl1511 == "" && rrrurl1611 == "" && rrrurl1711 == "" && rrrurl1811 == "" && rrrurl1911 == "" && rrrurl2011 == "" && rrrurl2111 == "" &&
                                rrrurl2211 == "" && rrrurl2311 == "" && rrrurl2411 == "" && rrrurl2511 == "" && rrrurl2611 == "" &&
                                aaaurl111 == "" && aaaurl211 == "" && aaaurl311 == "" && aaaurl411 == "" && aaaurl511 == "" && aaaurl611 == "" && aaaurl711 == "" &&
                                aaaurl811 == "" && aaaurl911 == "" && aaaurl1011 == "" && aaaurl1111 == "" && aaaurl1211 == "" && aaaurl1311 == "" && aaaurl1411 == "" &&
                                aaaurl1511 == "" && aaaurl1611 == "" && aaaurl1711 == "" && aaaurl1811 == "" && aaaurl1911 == "" && aaaurl2011 == "" && aaaurl2111 == "" &&
                                aaaurl2211 == "" && aaaurl2311 == "" && aaaurl2411 == "" && aaaurl2511 == "" && aaaurl2611 == "") {
                            Toast.makeText(HomePageNews.this, "Haha", Toast.LENGTH_LONG);
                        } else if (gggurl111 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey3).execute(gggurl111);
                        } else if (gggurl211 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey3).execute(gggurl211);
                        } else if (gggurl311 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey3).execute(gggurl311);
                        } else if (gggurl411 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey3).execute(gggurl411);
                        } else if (gggurl511 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey3).execute(gggurl511);
                        } else if (gggurl611 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey3).execute(gggurl611);
                        } else if (gggurl711 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey3).execute(gggurl711);
                        } else if (gggurl811 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey3).execute(gggurl811);
                        } else if (gggurl911 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey3).execute(gggurl911);
                        } else if (gggurl1011 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey3).execute(gggurl1011);
                        } else if (gggurl1111 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey3).execute(gggurl1111);
                        } else if (gggurl1211 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey3).execute(gggurl1211);
                        } else if (gggurl1311 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey3).execute(gggurl1311);
                        } else if (gggurl1411 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey3).execute(gggurl1411);
                        } else if (gggurl1511 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey3).execute(gggurl1511);
                        } else if (gggurl1611 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey3).execute(gggurl1611);
                        } else if (gggurl1711 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey3).execute(gggurl1711);
                        } else if (gggurl1811 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey3).execute(gggurl1811);
                        } else if (gggurl1911 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey3).execute(gggurl1911);
                        } else if (gggurl2011 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey3).execute(gggurl2011);
                        } else if (gggurl2111 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey3).execute(gggurl2111);
                        } else if (gggurl2211 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey3).execute(gggurl2211);
                        } else if (gggurl2311 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey3).execute(gggurl2311);
                        } else if (gggurl2411 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey3).execute(gggurl2411);
                        } else if (gggurl2511 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey3).execute(gggurl2511);
                        } else if (gggurl2611 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey3).execute(gggurl2611);
                        } else if (aaaurl111 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey3).execute(aaaurl111);
                        } else if (aaaurl211 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey3).execute(aaaurl211);
                        } else if (aaaurl311 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey3).execute(aaaurl311);
                        } else if (aaaurl411 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey3).execute(aaaurl411);
                        } else if (aaaurl511 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey3).execute(aaaurl511);
                        } else if (aaaurl611 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey3).execute(aaaurl611);
                        } else if (aaaurl711 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey3).execute(aaaurl711);
                        } else if (aaaurl811 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey3).execute(aaaurl811);
                        } else if (aaaurl911 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey3).execute(aaaurl911);
                        } else if (aaaurl1011 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey3).execute(aaaurl1011);
                        } else if (aaaurl1111 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey3).execute(aaaurl1111);
                        } else if (aaaurl1211 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey3).execute(aaaurl1211);
                        } else if (aaaurl1311 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey3).execute(aaaurl1311);
                        } else if (aaaurl1411 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey3).execute(aaaurl1411);
                        } else if (aaaurl1511 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey3).execute(aaaurl1511);
                        } else if (aaaurl1611 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey3).execute(aaaurl1611);
                        } else if (aaaurl1711 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey3).execute(aaaurl1711);
                        } else if (aaaurl1811 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey3).execute(aaaurl1811);
                        } else if (aaaurl1911 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey3).execute(aaaurl1911);
                        } else if (aaaurl2011 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey3).execute(aaaurl2011);
                        } else if (aaaurl2111 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey3).execute(aaaurl2111);
                        } else if (aaaurl2211 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey3).execute(aaaurl2211);
                        } else if (aaaurl2311 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey3).execute(aaaurl2311);
                        } else if (aaaurl2411 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey3).execute(aaaurl2411);
                        } else if (aaaurl2511 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey3).execute(aaaurl2511);
                        } else if (aaaurl2611 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey3).execute(aaaurl2611);
                        } else if (rrrurl111 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey3).execute(rrrurl111);
                        } else if (rrrurl211 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey3).execute(rrrurl211);
                        } else if (rrrurl311 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey3).execute(rrrurl311);
                        } else if (rrrurl411 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey3).execute(rrrurl411);
                        } else if (rrrurl511 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey3).execute(rrrurl511);
                        } else if (rrrurl611 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey3).execute(rrrurl611);
                        } else if (rrrurl711 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey3).execute(rrrurl711);
                        } else if (rrrurl811 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey3).execute(rrrurl811);
                        } else if (rrrurl911 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey3).execute(rrrurl911);
                        } else if (rrrurl1011 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey3).execute(rrrurl1011);
                        } else if (rrrurl1111 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey3).execute(rrrurl1111);
                        } else if (rrrurl1211 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey3).execute(rrrurl1211);
                        } else if (rrrurl1311 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey3).execute(rrrurl1311);
                        } else if (rrrurl1411 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey3).execute(rrrurl1411);
                        } else if (rrrurl1511 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey3).execute(rrrurl1511);
                        } else if (rrrurl1611 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey3).execute(rrrurl1611);
                        } else if (rrrurl1711 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey3).execute(rrrurl1711);
                        } else if (rrrurl1811 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey3).execute(rrrurl1811);
                        } else if (rrrurl1911 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey3).execute(rrrurl1911);
                        } else if (rrrurl2011 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey3).execute(rrrurl2011);
                        } else if (rrrurl2111 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey3).execute(rrrurl2111);
                        } else if (rrrurl2211 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey3).execute(rrrurl2211);
                        } else if (rrrurl2311 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey3).execute(rrrurl2311);
                        } else if (rrrurl2411 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey3).execute(rrrurl2411);
                        } else if (rrrurl2511 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey3).execute(rrrurl2511);
                        } else if (rrrurl2611 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey3).execute(rrrurl2611);
                        }


                        if (ggggurl111 == "" && ggggurl211 == "" && ggggurl311 == "" && ggggurl411 == "" && ggggurl511 == "" && ggggurl611 == "" && ggggurl711 == "" &&
                                ggggurl811 == "" && ggggurl911 == "" && ggggurl1011 == "" && ggggurl1111 == "" && ggggurl1211 == "" && ggggurl1311 == "" && ggggurl1411 == "" &&
                                ggggurl1511 == "" && ggggurl1611 == "" && ggggurl1711 == "" && ggggurl1811 == "" && ggggurl1911 == "" && ggggurl2011 == "" && ggggurl2111 == "" &&
                                ggggurl2211 == "" && ggggurl2311 == "" && ggggurl2411 == "" && ggggurl2511 == "" && ggggurl2611 == "" &&
                                rrrrurl111 == "" && rrrrurl211 == "" && rrrrurl311 == "" && rrrrurl411 == "" && rrrrurl511 == "" && rrrrurl611 == "" && rrrrurl711 == "" &&
                                rrrrurl811 == "" && rrrrurl911 == "" && rrrrurl1011 == "" && rrrrurl1111 == "" && rrrrurl1211 == "" && rrrrurl1311 == "" && rrrrurl1411 == "" &&
                                rrrrurl1511 == "" && rrrrurl1611 == "" && rrrrurl1711 == "" && rrrrurl1811 == "" && rrrrurl1911 == "" && rrrrurl2011 == "" && rrrrurl2111 == "" &&
                                rrrrurl2211 == "" && rrrrurl2311 == "" && rrrrurl2411 == "" && rrrrurl2511 == "" && rrrrurl2611 == "" &&
                                aaaaurl111 == "" && aaaaurl211 == "" && aaaaurl311 == "" && aaaaurl411 == "" && aaaaurl511 == "" && aaaaurl611 == "" && aaaaurl711 == "" &&
                                aaaaurl811 == "" && aaaaurl911 == "" && aaaaurl1011 == "" && aaaaurl1111 == "" && aaaaurl1211 == "" && aaaaurl1311 == "" && aaaaurl1411 == "" &&
                                aaaaurl1511 == "" && aaaaurl1611 == "" && aaaaurl1711 == "" && aaaaurl1811 == "" && aaaaurl1911 == "" && aaaaurl2011 == "" && aaaaurl2111 == "" &&
                                aaaaurl2211 == "" && aaaaurl2311 == "" && aaaaurl2411 == "" && aaaaurl2511 == "" && aaaaurl2611 == "") {
                            Toast.makeText(HomePageNews.this, "Haha", Toast.LENGTH_LONG);
                        } else if (ggggurl111 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey4).execute(ggggurl111);
                        } else if (ggggurl211 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey4).execute(ggggurl211);
                        } else if (ggggurl311 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey4).execute(ggggurl311);
                        } else if (ggggurl411 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey4).execute(ggggurl411);
                        } else if (ggggurl511 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey4).execute(ggggurl511);
                        } else if (ggggurl611 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey4).execute(ggggurl611);
                        } else if (ggggurl711 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey4).execute(ggggurl711);
                        } else if (ggggurl811 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey4).execute(ggggurl811);
                        } else if (ggggurl911 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey4).execute(ggggurl911);
                        } else if (ggggurl1011 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey4).execute(ggggurl1011);
                        } else if (ggggurl1111 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey4).execute(ggggurl1111);
                        } else if (ggggurl1211 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey4).execute(ggggurl1211);
                        } else if (ggggurl1311 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey4).execute(ggggurl1311);
                        } else if (ggggurl1411 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey4).execute(ggggurl1411);
                        } else if (ggggurl1511 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey4).execute(ggggurl1511);
                        } else if (ggggurl1611 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey4).execute(ggggurl1611);
                        } else if (ggggurl1711 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey4).execute(ggggurl1711);
                        } else if (ggggurl1811 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey4).execute(ggggurl1811);
                        } else if (ggggurl1911 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey4).execute(ggggurl1911);
                        } else if (ggggurl2011 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey4).execute(ggggurl2011);
                        } else if (ggggurl2111 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey4).execute(ggggurl2111);
                        } else if (ggggurl2211 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey4).execute(ggggurl2211);
                        } else if (ggggurl2311 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey4).execute(ggggurl2311);
                        } else if (ggggurl2411 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey4).execute(ggggurl2411);
                        } else if (ggggurl2511 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey4).execute(ggggurl2511);
                        } else if (ggggurl2611 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey4).execute(ggggurl2611);
                        } else if (aaaaurl111 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey4).execute(aaaaurl111);
                        } else if (aaaaurl211 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey4).execute(aaaaurl211);
                        } else if (aaaaurl311 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey4).execute(aaaaurl311);
                        } else if (aaaaurl411 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey4).execute(aaaaurl411);
                        } else if (aaaaurl511 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey4).execute(aaaaurl511);
                        } else if (aaaaurl611 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey4).execute(aaaaurl611);
                        } else if (aaaaurl711 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey4).execute(aaaaurl711);
                        } else if (aaaaurl811 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey4).execute(aaaaurl811);
                        } else if (aaaaurl911 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey4).execute(aaaaurl911);
                        } else if (aaaaurl1011 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey4).execute(aaaaurl1011);
                        } else if (aaaaurl1111 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey4).execute(aaaaurl1111);
                        } else if (aaaaurl1211 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey4).execute(aaaaurl1211);
                        } else if (aaaaurl1311 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey4).execute(aaaaurl1311);
                        } else if (aaaaurl1411 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey4).execute(aaaaurl1411);
                        } else if (aaaaurl1511 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey4).execute(aaaaurl1511);
                        } else if (aaaaurl1611 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey4).execute(aaaaurl1611);
                        } else if (aaaaurl1711 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey4).execute(aaaaurl1711);
                        } else if (aaaaurl1811 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey4).execute(aaaaurl1811);
                        } else if (aaaaurl1911 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey4).execute(aaaaurl1911);
                        } else if (aaaaurl2011 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey4).execute(aaaaurl2011);
                        } else if (aaaaurl2111 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey4).execute(aaaaurl2111);
                        } else if (aaaaurl2211 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey4).execute(aaaaurl2211);
                        } else if (aaaaurl2311 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey4).execute(aaaaurl2311);
                        } else if (aaaaurl2411 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey4).execute(aaaaurl2411);
                        } else if (aaaaurl2511 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey4).execute(aaaaurl2511);
                        } else if (aaaaurl2611 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey4).execute(aaaaurl2611);
                        } else if (rrrrurl111 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey4).execute(rrrrurl111);
                        } else if (rrrrurl211 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey4).execute(rrrrurl211);
                        } else if (rrrrurl311 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey4).execute(rrrrurl311);
                        } else if (rrrrurl411 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey4).execute(rrrrurl411);
                        } else if (rrrrurl511 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey4).execute(rrrrurl511);
                        } else if (rrrrurl611 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey4).execute(rrrrurl611);
                        } else if (rrrrurl711 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey4).execute(rrrrurl711);
                        } else if (rrrrurl811 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey4).execute(rrrrurl811);
                        } else if (rrrrurl911 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey4).execute(rrrrurl911);
                        } else if (rrrrurl1011 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey4).execute(rrrrurl1011);
                        } else if (rrrrurl1111 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey4).execute(rrrrurl1111);
                        } else if (rrrrurl1211 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey4).execute(rrrrurl1211);
                        } else if (rrrrurl1311 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey4).execute(rrrrurl1311);
                        } else if (rrrrurl1411 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey4).execute(rrrrurl1411);
                        } else if (rrrrurl1511 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey4).execute(rrrrurl1511);
                        } else if (rrrrurl1611 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey4).execute(rrrrurl1611);
                        } else if (rrrrurl1711 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey4).execute(rrrrurl1711);
                        } else if (rrrrurl1811 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey4).execute(rrrrurl1811);
                        } else if (rrrrurl1911 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey4).execute(rrrrurl1911);
                        } else if (rrrrurl2011 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey4).execute(rrrrurl2011);
                        } else if (rrrrurl2111 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey4).execute(rrrrurl2111);
                        } else if (rrrrurl2211 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey4).execute(rrrrurl2211);
                        } else if (rrrrurl2311 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey4).execute(rrrrurl2311);
                        } else if (rrrrurl2411 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey4).execute(rrrrurl2411);
                        } else if (rrrrurl2511 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey4).execute(rrrrurl2511);
                        } else if (rrrrurl2611 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey4).execute(rrrrurl2611);
                        }


                        if (gggggurl111 == "" && gggggurl211 == "" && gggggurl311 == "" && gggggurl411 == "" && gggggurl511 == "" && gggggurl611 == "" && gggggurl711 == "" &&
                                gggggurl811 == "" && gggggurl911 == "" && gggggurl1011 == "" && gggggurl1111 == "" && gggggurl1211 == "" && gggggurl1311 == "" && gggggurl1411 == "" &&
                                gggggurl1511 == "" && gggggurl1611 == "" && gggggurl1711 == "" && gggggurl1811 == "" && gggggurl1911 == "" && gggggurl2011 == "" && gggggurl2111 == "" &&
                                gggggurl2211 == "" && gggggurl2311 == "" && gggggurl2411 == "" && gggggurl2511 == "" && gggggurl2611 == "" &&
                                rrrrrurl111 == "" && rrrrrurl211 == "" && rrrrrurl311 == "" && rrrrrurl411 == "" && rrrrrurl511 == "" && rrrrrurl611 == "" && rrrrrurl711 == "" &&
                                rrrrrurl811 == "" && rrrrrurl911 == "" && rrrrrurl1011 == "" && rrrrrurl1111 == "" && rrrrrurl1211 == "" && rrrrrurl1311 == "" && rrrrrurl1411 == "" &&
                                rrrrrurl1511 == "" && rrrrrurl1611 == "" && rrrrrurl1711 == "" && rrrrrurl1811 == "" && rrrrrurl1911 == "" && rrrrrurl2011 == "" && rrrrrurl2111 == "" &&
                                rrrrrurl2211 == "" && rrrrrurl2311 == "" && rrrrrurl2411 == "" && rrrrrurl2511 == "" && rrrrrurl2611 == "" &&
                                aaaaaurl111 == "" && aaaaaurl211 == "" && aaaaaurl311 == "" && aaaaaurl411 == "" && aaaaaurl511 == "" && aaaaaurl611 == "" && aaaaaurl711 == "" &&
                                aaaaaurl811 == "" && aaaaaurl911 == "" && aaaaaurl1011 == "" && aaaaaurl1111 == "" && aaaaaurl1211 == "" && aaaaaurl1311 == "" && aaaaaurl1411 == "" &&
                                aaaaaurl1511 == "" && aaaaaurl1611 == "" && aaaaaurl1711 == "" && aaaaaurl1811 == "" && aaaaaurl1911 == "" && aaaaaurl2011 == "" && aaaaaurl2111 == "" &&
                                aaaaaurl2211 == "" && aaaaaurl2311 == "" && aaaaaurl2411 == "" && aaaaaurl2511 == "" && aaaaaurl2611 == "") {
                            Toast.makeText(HomePageNews.this, "Haha", Toast.LENGTH_LONG);
                        } else if (gggggurl111 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey5).execute(gggggurl111);
                        } else if (gggggurl211 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey5).execute(gggggurl211);
                        } else if (gggggurl311 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey5).execute(gggggurl311);
                        } else if (gggggurl411 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey5).execute(gggggurl411);
                        } else if (gggggurl511 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey5).execute(gggggurl511);
                        } else if (gggggurl611 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey5).execute(gggggurl611);
                        } else if (gggggurl711 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey5).execute(gggggurl711);
                        } else if (gggggurl811 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey5).execute(gggggurl811);
                        } else if (gggggurl911 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey5).execute(gggggurl911);
                        } else if (gggggurl1011 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey5).execute(gggggurl1011);
                        } else if (gggggurl1111 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey5).execute(gggggurl1111);
                        } else if (gggggurl1211 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey5).execute(gggggurl1211);
                        } else if (gggggurl1311 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey5).execute(gggggurl1311);
                        } else if (gggggurl1411 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey5).execute(gggggurl1411);
                        } else if (gggggurl1511 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey5).execute(gggggurl1511);
                        } else if (gggggurl1611 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey5).execute(gggggurl1611);
                        } else if (gggggurl1711 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey5).execute(gggggurl1711);
                        } else if (gggggurl1811 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey5).execute(gggggurl1811);
                        } else if (gggggurl1911 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey5).execute(gggggurl1911);
                        } else if (gggggurl2011 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey5).execute(gggggurl2011);
                        } else if (gggggurl2111 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey5).execute(gggggurl2111);
                        } else if (gggggurl2211 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey5).execute(gggggurl2211);
                        } else if (gggggurl2311 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey5).execute(gggggurl2311);
                        } else if (gggggurl2411 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey5).execute(gggggurl2411);
                        } else if (gggggurl2511 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey5).execute(gggggurl2511);
                        } else if (gggggurl2611 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey5).execute(gggggurl2611);
                        } else if (aaaaaurl111 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey5).execute(aaaaaurl111);
                        } else if (aaaaaurl211 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey5).execute(aaaaaurl211);
                        } else if (aaaaaurl311 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey5).execute(aaaaaurl311);
                        } else if (aaaaaurl411 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey5).execute(aaaaaurl411);
                        } else if (aaaaaurl511 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey5).execute(aaaaaurl511);
                        } else if (aaaaaurl611 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey5).execute(aaaaaurl611);
                        } else if (aaaaaurl711 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey5).execute(aaaaaurl711);
                        } else if (aaaaaurl811 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey5).execute(aaaaaurl811);
                        } else if (aaaaaurl911 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey5).execute(aaaaaurl911);
                        } else if (aaaaaurl1011 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey5).execute(aaaaaurl1011);
                        } else if (aaaaaurl1111 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey5).execute(aaaaaurl1111);
                        } else if (aaaaaurl1211 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey5).execute(aaaaaurl1211);
                        } else if (aaaaaurl1311 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey5).execute(aaaaaurl1311);
                        } else if (aaaaaurl1411 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey5).execute(aaaaaurl1411);
                        } else if (aaaaaurl1511 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey5).execute(aaaaaurl1511);
                        } else if (aaaaaurl1611 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey5).execute(aaaaaurl1611);
                        } else if (aaaaaurl1711 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey5).execute(aaaaaurl1711);
                        } else if (aaaaaurl1811 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey5).execute(aaaaaurl1811);
                        } else if (aaaaaurl1911 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey5).execute(aaaaaurl1911);
                        } else if (aaaaaurl2011 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey5).execute(aaaaaurl2011);
                        } else if (aaaaaurl2111 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey5).execute(aaaaaurl2111);
                        } else if (aaaaaurl2211 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey5).execute(aaaaaurl2211);
                        } else if (aaaaaurl2311 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey5).execute(aaaaaurl2311);
                        } else if (aaaaaurl2411 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey5).execute(aaaaaurl2411);
                        } else if (aaaaaurl2511 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey5).execute(aaaaaurl2511);
                        } else if (aaaaaurl2611 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey5).execute(aaaaaurl2611);
                        } else if (rrrrrurl111 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey5).execute(rrrrrurl111);
                        } else if (rrrrrurl211 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey5).execute(rrrrrurl211);
                        } else if (rrrrrurl311 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey5).execute(rrrrrurl311);
                        } else if (rrrrrurl411 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey5).execute(rrrrrurl411);
                        } else if (rrrrrurl511 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey5).execute(rrrrrurl511);
                        } else if (rrrrrurl611 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey5).execute(rrrrrurl611);
                        } else if (rrrrrurl711 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey5).execute(rrrrrurl711);
                        } else if (rrrrrurl811 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey5).execute(rrrrrurl811);
                        } else if (rrrrrurl911 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey5).execute(rrrrrurl911);
                        } else if (rrrrrurl1011 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey5).execute(rrrrrurl1011);
                        } else if (rrrrrurl1111 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey5).execute(rrrrrurl1111);
                        } else if (rrrrrurl1211 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey5).execute(rrrrrurl1211);
                        } else if (rrrrrurl1311 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey5).execute(rrrrrurl1311);
                        } else if (rrrrrurl1411 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey5).execute(rrrrrurl1411);
                        } else if (rrrrrurl1511 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey5).execute(rrrrrurl1511);
                        } else if (rrrrrurl1611 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey5).execute(rrrrrurl1611);
                        } else if (rrrrrurl1711 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey5).execute(rrrrrurl1711);
                        } else if (rrrrrurl1811 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey5).execute(rrrrrurl1811);
                        } else if (rrrrrurl1911 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey5).execute(rrrrrurl1911);
                        } else if (rrrrrurl2011 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey5).execute(rrrrrurl2011);
                        } else if (rrrrrurl2111 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey5).execute(rrrrrurl2111);
                        } else if (rrrrrurl2211 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey5).execute(rrrrrurl2211);
                        } else if (rrrrrurl2311 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey5).execute(rrrrrurl2311);
                        } else if (rrrrrurl2411 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey5).execute(rrrrrurl2411);
                        } else if (rrrrrurl2511 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey5).execute(rrrrrurl2511);
                        } else if (rrrrrurl2611 != "") {
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey5).execute(rrrrrurl2611);
                        }


//                      int drawableId = sharedPref.getInt("drawableId", 0);
//                      ImageButton imageButton = (ImageButton) findViewById(R.id.plusgrey1);
//                      imageButton.setBackgroundResource(drawableId);


                        Intent intent1 = getIntent();
                        Intent intent2 = getIntent();
                        Intent intent3 = getIntent();
                        Intent intent4 = getIntent();
                        Intent intent5 = getIntent();
                        Intent intent6 = getIntent();
                        Intent intent7 = getIntent();
                        Intent intent8 = getIntent();
                        Intent intent9 = getIntent();
                        Intent intent10 = getIntent();
                        Intent intent11 = getIntent();
                        Intent intent12 = getIntent();
                        Intent intent13 = getIntent();
                        Intent intent14 = getIntent();
                        Intent intent15 = getIntent();
                        Intent intent16 = getIntent();
                        Intent intent17 = getIntent();
                        Intent intent18 = getIntent();
                        Intent intent19 = getIntent();
                        Intent intent20 = getIntent();
                        Intent intent21 = getIntent();
                        Intent intent22 = getIntent();
                        Intent intent23 = getIntent();
                        Intent intent24 = getIntent();
                        Intent intent25 = getIntent();
                        Intent intent26 = getIntent();
//                        Intent intent27 = getIntent();
//                        Intent intent28 = getIntent();
//                        Intent intent29 = getIntent();
//                        Intent intent30 = getIntent();
//                        Intent intent31 = getIntent();
//                        Intent intent32 = getIntent();
//                        Intent intent33 = getIntent();
//                        Intent intent34 = getIntent();
//                        Intent intent35 = getIntent();
//                        Intent intent36 = getIntent();
//                        Intent intent37 = getIntent();
//                        Intent intent38 = getIntent();
//                        Intent intent39 = getIntent();
//                        Intent intent40 = getIntent();
//                        Intent intent41 = getIntent();
//                        Intent intent42 = getIntent();
//                        Intent intent43 = getIntent();
//                        Intent intent44 = getIntent();
//                        Intent intent45 = getIntent();
//                        Intent intent46 = getIntent();
//                        Intent intent47 = getIntent();
//                        Intent intent48 = getIntent();
//                        Intent intent49 = getIntent();
//                        Intent intent50 = getIntent();
//                        Intent intent51 = getIntent();
//                        Intent intent52 = getIntent();
//                        Intent intent53 = getIntent();
//                        Intent intent54 = getIntent();
//                        Intent intent55 = getIntent();
//                        Intent intent56 = getIntent();
//                        Intent intent57 = getIntent();
//                        Intent intent58 = getIntent();
//                        Intent intent59 = getIntent();
//                        Intent intent60 = getIntent();
//                        Intent intent61 = getIntent();
//                        Intent intent62 = getIntent();
//                        Intent intent63 = getIntent();
//                        Intent intent64 = getIntent();
//                        Intent intent65 = getIntent();
//                        Intent intent66 = getIntent();
//                        Intent intent67 = getIntent();
//                        Intent intent68 = getIntent();
//                        Intent intent69 = getIntent();
//                        Intent intent70 = getIntent();
//                        Intent intent71 = getIntent();
//                        Intent intent72 = getIntent();
//                        Intent intent73 = getIntent();
//                        Intent intent74 = getIntent();
//                        Intent intent75 = getIntent();
//                        Intent intent76 = getIntent();
//                        Intent intent77 = getIntent();
//                        Intent intent78 = getIntent();


                        String gurl1 = intent1.getStringExtra("gurl1");
                        String gurl2 = intent2.getStringExtra("gurl2");
                        String gurl3 = intent3.getStringExtra("gurl3");
                        String gurl4 = intent4.getStringExtra("gurl4");
                        String gurl5 = intent5.getStringExtra("gurl5");
                        String gurl6 = intent6.getStringExtra("gurl6");
                        String gurl7 = intent7.getStringExtra("gurl7");
                        String gurl8 = intent8.getStringExtra("gurl8");
                        String gurl9 = intent9.getStringExtra("gurl9");
                        String gurl10 = intent10.getStringExtra("gurl10");
                        String gurl11 = intent11.getStringExtra("gurl11");
                        String gurl12 = intent12.getStringExtra("gurl12");
                        String gurl13 = intent13.getStringExtra("gurl13");
                        String gurl14 = intent14.getStringExtra("gurl14");
                        String gurl15 = intent15.getStringExtra("gurl15");
                        String gurl16 = intent16.getStringExtra("gurl16");
                        String gurl17 = intent17.getStringExtra("gurl17");
                        String gurl18 = intent18.getStringExtra("gurl18");
                        String gurl19 = intent19.getStringExtra("gurl19");
                        String gurl20 = intent20.getStringExtra("gurl20");
                        String gurl21 = intent21.getStringExtra("gurl21");
                        String gurl22 = intent22.getStringExtra("gurl22");
                        String gurl23 = intent23.getStringExtra("gurl23");
                        String gurl24 = intent24.getStringExtra("gurl24");
                        String gurl25 = intent25.getStringExtra("gurl25");
                        String gurl26 = intent26.getStringExtra("gurl26");
                        String aurl1 = intent1.getStringExtra("aurl1");
                        String aurl2 = intent2.getStringExtra("aurl2");
                        String aurl3 = intent3.getStringExtra("aurl3");
                        String aurl4 = intent4.getStringExtra("aurl4");
                        String aurl5 = intent5.getStringExtra("aurl5");
                        String aurl6 = intent6.getStringExtra("aurl6");
                        String aurl7 = intent7.getStringExtra("aurl7");
                        String aurl8 = intent8.getStringExtra("aurl8");
                        String aurl9 = intent9.getStringExtra("aurl9");
                        String aurl10 = intent10.getStringExtra("aurl10");
                        String aurl11 = intent11.getStringExtra("aurl11");
                        String aurl12 = intent12.getStringExtra("aurl12");
                        String aurl13 = intent13.getStringExtra("aurl13");
                        String aurl14 = intent14.getStringExtra("aurl14");
                        String aurl15 = intent15.getStringExtra("aurl15");
                        String aurl16 = intent16.getStringExtra("aurl16");
                        String aurl17 = intent17.getStringExtra("aurl17");
                        String aurl18 = intent18.getStringExtra("aurl18");
                        String aurl19 = intent19.getStringExtra("aurl19");
                        String aurl20 = intent20.getStringExtra("aurl20");
                        String aurl21 = intent21.getStringExtra("aurl21");
                        String aurl22 = intent22.getStringExtra("aurl22");
                        String aurl23 = intent23.getStringExtra("aurl23");
                        String aurl24 = intent24.getStringExtra("aurl24");
                        String aurl25 = intent25.getStringExtra("aurl25");
                        String aurl26 = intent26.getStringExtra("aurl26");
                        String rurl1 = intent1.getStringExtra("rurl1");
                        String rurl2 = intent2.getStringExtra("rurl2");
                        String rurl3 = intent3.getStringExtra("rurl3");
                        String rurl4 = intent4.getStringExtra("rurl4");
                        String rurl5 = intent5.getStringExtra("rurl5");
                        String rurl6 = intent6.getStringExtra("rurl6");
                        String rurl7 = intent7.getStringExtra("rurl7");
                        String rurl8 = intent8.getStringExtra("rurl8");
                        String rurl9 = intent9.getStringExtra("rurl9");
                        String rurl10 = intent10.getStringExtra("rurl10");
                        String rurl11 = intent11.getStringExtra("rurl11");
                        String rurl12 = intent12.getStringExtra("rurl12");
                        String rurl13 = intent13.getStringExtra("rurl13");
                        String rurl14 = intent14.getStringExtra("rurl14");
                        String rurl15 = intent15.getStringExtra("rurl15");
                        String rurl16 = intent16.getStringExtra("rurl16");
                        String rurl17 = intent17.getStringExtra("rurl17");
                        String rurl18 = intent18.getStringExtra("rurl18");
                        String rurl19 = intent19.getStringExtra("rurl19");
                        String rurl20 = intent20.getStringExtra("rurl20");
                        String rurl21 = intent21.getStringExtra("rurl21");
                        String rurl22 = intent22.getStringExtra("rurl22");
                        String rurl23 = intent23.getStringExtra("rurl23");
                        String rurl24 = intent24.getStringExtra("rurl24");
                        String rurl25 = intent25.getStringExtra("rurl25");
                        String rurl26 = intent26.getStringExtra("rurl26");


                        String ggurl1 = intent1.getStringExtra("ggurl1");
                        String ggurl2 = intent2.getStringExtra("ggurl2");
                        String ggurl3 = intent3.getStringExtra("ggurl3");
                        String ggurl4 = intent4.getStringExtra("ggurl4");
                        String ggurl5 = intent5.getStringExtra("ggurl5");
                        String ggurl6 = intent6.getStringExtra("ggurl6");
                        String ggurl7 = intent7.getStringExtra("ggurl7");
                        String ggurl8 = intent8.getStringExtra("ggurl8");
                        String ggurl9 = intent9.getStringExtra("ggurl9");
                        String ggurl10 = intent10.getStringExtra("ggurl10");
                        String ggurl11 = intent11.getStringExtra("ggurl11");
                        String ggurl12 = intent12.getStringExtra("ggurl12");
                        String ggurl13 = intent13.getStringExtra("ggurl13");
                        String ggurl14 = intent14.getStringExtra("ggurl14");
                        String ggurl15 = intent15.getStringExtra("ggurl15");
                        String ggurl16 = intent16.getStringExtra("ggurl16");
                        String ggurl17 = intent17.getStringExtra("ggurl17");
                        String ggurl18 = intent18.getStringExtra("ggurl18");
                        String ggurl19 = intent19.getStringExtra("ggurl19");
                        String ggurl20 = intent20.getStringExtra("ggurl20");
                        String ggurl21 = intent21.getStringExtra("ggurl21");
                        String ggurl22 = intent22.getStringExtra("ggurl22");
                        String ggurl23 = intent23.getStringExtra("ggurl23");
                        String ggurl24 = intent24.getStringExtra("ggurl24");
                        String ggurl25 = intent25.getStringExtra("ggurl25");
                        String ggurl26 = intent26.getStringExtra("ggurl26");

                        String aaurl1 = intent1.getStringExtra("aaurl1");
                        String aaurl2 = intent2.getStringExtra("aaurl2");
                        String aaurl3 = intent3.getStringExtra("aaurl3");
                        String aaurl4 = intent4.getStringExtra("aaurl4");
                        String aaurl5 = intent5.getStringExtra("aaurl5");
                        String aaurl6 = intent6.getStringExtra("aaurl6");
                        String aaurl7 = intent7.getStringExtra("aaurl7");
                        String aaurl8 = intent8.getStringExtra("aaurl8");
                        String aaurl9 = intent9.getStringExtra("aaurl9");
                        String aaurl10 = intent10.getStringExtra("aaurl10");
                        String aaurl11 = intent11.getStringExtra("aaurl11");
                        String aaurl12 = intent12.getStringExtra("aaurl12");
                        String aaurl13 = intent13.getStringExtra("aaurl13");
                        String aaurl14 = intent14.getStringExtra("aaurl14");
                        String aaurl15 = intent15.getStringExtra("aaurl15");
                        String aaurl16 = intent16.getStringExtra("aaurl16");
                        String aaurl17 = intent17.getStringExtra("aaurl17");
                        String aaurl18 = intent18.getStringExtra("aaurl18");
                        String aaurl19 = intent19.getStringExtra("aaurl19");
                        String aaurl20 = intent20.getStringExtra("aaurl20");
                        String aaurl21 = intent21.getStringExtra("aaurl21");
                        String aaurl22 = intent22.getStringExtra("aaurl22");
                        String aaurl23 = intent23.getStringExtra("aaurl23");
                        String aaurl24 = intent24.getStringExtra("aaurl24");
                        String aaurl25 = intent25.getStringExtra("aaurl25");
                        String aaurl26 = intent26.getStringExtra("aaurl26");


                        String rrurl1 = intent1.getStringExtra("rrurl1");
                        String rrurl2 = intent2.getStringExtra("rrurl2");
                        String rrurl3 = intent3.getStringExtra("rrurl3");
                        String rrurl4 = intent4.getStringExtra("rrurl4");
                        String rrurl5 = intent5.getStringExtra("rrurl5");
                        String rrurl6 = intent6.getStringExtra("rrurl6");
                        String rrurl7 = intent7.getStringExtra("rrurl7");
                        String rrurl8 = intent8.getStringExtra("rrurl8");
                        String rrurl9 = intent9.getStringExtra("rrurl9");
                        String rrurl10 = intent10.getStringExtra("rrurl10");
                        String rrurl11 = intent11.getStringExtra("rrurl11");
                        String rrurl12 = intent12.getStringExtra("rrurl12");
                        String rrurl13 = intent13.getStringExtra("rrurl13");
                        String rrurl14 = intent14.getStringExtra("rrurl14");
                        String rrurl15 = intent15.getStringExtra("rrurl15");
                        String rrurl16 = intent16.getStringExtra("rrurl16");
                        String rrurl17 = intent17.getStringExtra("rrurl17");
                        String rrurl18 = intent18.getStringExtra("rrurl18");
                        String rrurl19 = intent19.getStringExtra("rrurl19");
                        String rrurl20 = intent20.getStringExtra("rrurl20");
                        String rrurl21 = intent21.getStringExtra("rrurl21");
                        String rrurl22 = intent22.getStringExtra("rrurl22");
                        String rrurl23 = intent23.getStringExtra("rrurl23");
                        String rrurl24 = intent24.getStringExtra("rrurl24");
                        String rrurl25 = intent25.getStringExtra("rrurl25");
                        String rrurl26 = intent26.getStringExtra("rrurl26");


                        String gggurl1 = intent1.getStringExtra("gggurl1");
                        String gggurl2 = intent2.getStringExtra("gggurl2");
                        String gggurl3 = intent3.getStringExtra("gggurl3");
                        String gggurl4 = intent4.getStringExtra("gggurl4");
                        String gggurl5 = intent5.getStringExtra("gggurl5");
                        String gggurl6 = intent6.getStringExtra("gggurl6");
                        String gggurl7 = intent7.getStringExtra("gggurl7");
                        String gggurl8 = intent8.getStringExtra("gggurl8");
                        String gggurl9 = intent9.getStringExtra("gggurl9");
                        String gggurl10 = intent10.getStringExtra("gggurl10");
                        String gggurl11 = intent11.getStringExtra("gggurl11");
                        String gggurl12 = intent12.getStringExtra("gggurl12");
                        String gggurl13 = intent13.getStringExtra("gggurl13");
                        String gggurl14 = intent14.getStringExtra("gggurl14");
                        String gggurl15 = intent15.getStringExtra("gggurl15");
                        String gggurl16 = intent16.getStringExtra("gggurl16");
                        String gggurl17 = intent17.getStringExtra("gggurl17");
                        String gggurl18 = intent18.getStringExtra("gggurl18");
                        String gggurl19 = intent19.getStringExtra("gggurl19");
                        String gggurl20 = intent20.getStringExtra("gggurl20");
                        String gggurl21 = intent21.getStringExtra("gggurl21");
                        String gggurl22 = intent22.getStringExtra("gggurl22");
                        String gggurl23 = intent23.getStringExtra("gggurl23");
                        String gggurl24 = intent24.getStringExtra("gggurl24");
                        String gggurl25 = intent25.getStringExtra("gggurl25");
                        String gggurl26 = intent26.getStringExtra("gggurl26");


                        String aaaurl1 = intent1.getStringExtra("aaaurl1");
                        String aaaurl2 = intent2.getStringExtra("aaaurl2");
                        String aaaurl3 = intent3.getStringExtra("aaaurl3");
                        String aaaurl4 = intent4.getStringExtra("aaaurl4");
                        String aaaurl5 = intent5.getStringExtra("aaaurl5");
                        String aaaurl6 = intent6.getStringExtra("aaaurl6");
                        String aaaurl7 = intent7.getStringExtra("aaaurl7");
                        String aaaurl8 = intent8.getStringExtra("aaaurl8");
                        String aaaurl9 = intent9.getStringExtra("aaaurl9");
                        String aaaurl10 = intent10.getStringExtra("aaaurl10");
                        String aaaurl11 = intent11.getStringExtra("aaaurl11");
                        String aaaurl12 = intent12.getStringExtra("aaaurl12");
                        String aaaurl13 = intent13.getStringExtra("aaaurl13");
                        String aaaurl14 = intent14.getStringExtra("aaaurl14");
                        String aaaurl15 = intent15.getStringExtra("aaaurl15");
                        String aaaurl16 = intent16.getStringExtra("aaaurl16");
                        String aaaurl17 = intent17.getStringExtra("aaaurl17");
                        String aaaurl18 = intent18.getStringExtra("aaaurl18");
                        String aaaurl19 = intent19.getStringExtra("aaaurl19");
                        String aaaurl20 = intent20.getStringExtra("aaaurl20");
                        String aaaurl21 = intent21.getStringExtra("aaaurl21");
                        String aaaurl22 = intent22.getStringExtra("aaaurl22");
                        String aaaurl23 = intent23.getStringExtra("aaaurl23");
                        String aaaurl24 = intent24.getStringExtra("aaaurl24");
                        String aaaurl25 = intent25.getStringExtra("aaaurl25");
                        String aaaurl26 = intent26.getStringExtra("aaaurl26");


                        String rrrurl1 = intent1.getStringExtra("rrrurl1");
                        String rrrurl2 = intent2.getStringExtra("rrrurl2");
                        String rrrurl3 = intent3.getStringExtra("rrrurl3");
                        String rrrurl4 = intent4.getStringExtra("rrrurl4");
                        String rrrurl5 = intent5.getStringExtra("rrrurl5");
                        String rrrurl6 = intent6.getStringExtra("rrrurl6");
                        String rrrurl7 = intent7.getStringExtra("rrrurl7");
                        String rrrurl8 = intent8.getStringExtra("rrrurl8");
                        String rrrurl9 = intent9.getStringExtra("rrrurl9");
                        String rrrurl10 = intent10.getStringExtra("rrrurl10");
                        String rrrurl11 = intent11.getStringExtra("rrrurl11");
                        String rrrurl12 = intent12.getStringExtra("rrrurl12");
                        String rrrurl13 = intent13.getStringExtra("rrrurl13");
                        String rrrurl14 = intent14.getStringExtra("rrrurl14");
                        String rrrurl15 = intent15.getStringExtra("rrrurl15");
                        String rrrurl16 = intent16.getStringExtra("rrrurl16");
                        String rrrurl17 = intent17.getStringExtra("rrrurl17");
                        String rrrurl18 = intent18.getStringExtra("rrrurl18");
                        String rrrurl19 = intent19.getStringExtra("rrrurl19");
                        String rrrurl20 = intent20.getStringExtra("rrrurl20");
                        String rrrurl21 = intent21.getStringExtra("rrrurl21");
                        String rrrurl22 = intent22.getStringExtra("rrrurl22");
                        String rrrurl23 = intent23.getStringExtra("rrrurl23");
                        String rrrurl24 = intent24.getStringExtra("rrrurl24");
                        String rrrurl25 = intent25.getStringExtra("rrrurl25");
                        String rrrurl26 = intent26.getStringExtra("rrrurl26");


                        String ggggurl1 = intent1.getStringExtra("ggggurl1");
                        String ggggurl2 = intent2.getStringExtra("ggggurl2");
                        String ggggurl3 = intent3.getStringExtra("ggggurl3");
                        String ggggurl4 = intent4.getStringExtra("ggggurl4");
                        String ggggurl5 = intent5.getStringExtra("ggggurl5");
                        String ggggurl6 = intent6.getStringExtra("ggggurl6");
                        String ggggurl7 = intent7.getStringExtra("ggggurl7");
                        String ggggurl8 = intent8.getStringExtra("ggggurl8");
                        String ggggurl9 = intent9.getStringExtra("ggggurl9");
                        String ggggurl10 = intent10.getStringExtra("ggggurl10");
                        String ggggurl11 = intent11.getStringExtra("ggggurl11");
                        String ggggurl12 = intent12.getStringExtra("ggggurl12");
                        String ggggurl13 = intent13.getStringExtra("ggggurl13");
                        String ggggurl14 = intent14.getStringExtra("ggggurl14");
                        String ggggurl15 = intent15.getStringExtra("ggggurl15");
                        String ggggurl16 = intent16.getStringExtra("ggggurl16");
                        String ggggurl17 = intent17.getStringExtra("ggggurl17");
                        String ggggurl18 = intent18.getStringExtra("ggggurl18");
                        String ggggurl19 = intent19.getStringExtra("ggggurl19");
                        String ggggurl20 = intent20.getStringExtra("ggggurl20");
                        String ggggurl21 = intent21.getStringExtra("ggggurl21");
                        String ggggurl22 = intent22.getStringExtra("ggggurl22");
                        String ggggurl23 = intent23.getStringExtra("ggggurl23");
                        String ggggurl24 = intent24.getStringExtra("ggggurl24");
                        String ggggurl25 = intent25.getStringExtra("ggggurl25");
                        String ggggurl26 = intent26.getStringExtra("ggggurl26");

                        String aaaaurl1 = intent1.getStringExtra("aaaaurl1");
                        String aaaaurl2 = intent2.getStringExtra("aaaaurl2");
                        String aaaaurl3 = intent3.getStringExtra("aaaaurl3");
                        String aaaaurl4 = intent4.getStringExtra("aaaaurl4");
                        String aaaaurl5 = intent5.getStringExtra("aaaaurl5");
                        String aaaaurl6 = intent6.getStringExtra("aaaaurl6");
                        String aaaaurl7 = intent7.getStringExtra("aaaaurl7");
                        String aaaaurl8 = intent8.getStringExtra("aaaaurl8");
                        String aaaaurl9 = intent9.getStringExtra("aaaaurl9");
                        String aaaaurl10 = intent10.getStringExtra("aaaaurl10");
                        String aaaaurl11 = intent11.getStringExtra("aaaaurl11");
                        String aaaaurl12 = intent12.getStringExtra("aaaaurl12");
                        String aaaaurl13 = intent13.getStringExtra("aaaaurl13");
                        String aaaaurl14 = intent14.getStringExtra("aaaaurl14");
                        String aaaaurl15 = intent15.getStringExtra("aaaaurl15");
                        String aaaaurl16 = intent16.getStringExtra("aaaaurl16");
                        String aaaaurl17 = intent17.getStringExtra("aaaaurl17");
                        String aaaaurl18 = intent18.getStringExtra("aaaaurl18");
                        String aaaaurl19 = intent19.getStringExtra("aaaaurl19");
                        String aaaaurl20 = intent20.getStringExtra("aaaaurl20");
                        String aaaaurl21 = intent21.getStringExtra("aaaaurl21");
                        String aaaaurl22 = intent22.getStringExtra("aaaaurl22");
                        String aaaaurl23 = intent23.getStringExtra("aaaaurl23");
                        String aaaaurl24 = intent24.getStringExtra("aaaaurl24");
                        String aaaaurl25 = intent25.getStringExtra("aaaaurl25");
                        String aaaaurl26 = intent26.getStringExtra("aaaaurl26");

                        String rrrrurl1 = intent1.getStringExtra("rrrrurl1");
                        String rrrrurl2 = intent2.getStringExtra("rrrrurl2");
                        String rrrrurl3 = intent3.getStringExtra("rrrrurl3");
                        String rrrrurl4 = intent4.getStringExtra("rrrrurl4");
                        String rrrrurl5 = intent5.getStringExtra("rrrrurl5");
                        String rrrrurl6 = intent6.getStringExtra("rrrrurl6");
                        String rrrrurl7 = intent7.getStringExtra("rrrrurl7");
                        String rrrrurl8 = intent8.getStringExtra("rrrrurl8");
                        String rrrrurl9 = intent9.getStringExtra("rrrrurl9");
                        String rrrrurl10 = intent10.getStringExtra("rrrrurl10");
                        String rrrrurl11 = intent11.getStringExtra("rrrrurl11");
                        String rrrrurl12 = intent12.getStringExtra("rrrrurl12");
                        String rrrrurl13 = intent13.getStringExtra("rrrrurl13");
                        String rrrrurl14 = intent14.getStringExtra("rrrrurl14");
                        String rrrrurl15 = intent15.getStringExtra("rrrrurl15");
                        String rrrrurl16 = intent16.getStringExtra("rrrrurl16");
                        String rrrrurl17 = intent17.getStringExtra("rrrrurl17");
                        String rrrrurl18 = intent18.getStringExtra("rrrrurl18");
                        String rrrrurl19 = intent19.getStringExtra("rrrrurl19");
                        String rrrrurl20 = intent20.getStringExtra("rrrrurl20");
                        String rrrrurl21 = intent21.getStringExtra("rrrrurl21");
                        String rrrrurl22 = intent22.getStringExtra("rrrrurl22");
                        String rrrrurl23 = intent23.getStringExtra("rrrrurl23");
                        String rrrrurl24 = intent24.getStringExtra("rrrrurl24");
                        String rrrrurl25 = intent25.getStringExtra("rrrrurl25");
                        String rrrrurl26 = intent26.getStringExtra("rrrrurl26");


                        String gggggurl1 = intent1.getStringExtra("gggggurl1");
                        String gggggurl2 = intent2.getStringExtra("gggggurl2");
                        String gggggurl3 = intent3.getStringExtra("gggggurl3");
                        String gggggurl4 = intent4.getStringExtra("gggggurl4");
                        String gggggurl5 = intent5.getStringExtra("gggggurl5");
                        String gggggurl6 = intent6.getStringExtra("gggggurl6");
                        String gggggurl7 = intent7.getStringExtra("gggggurl7");
                        String gggggurl8 = intent8.getStringExtra("gggggurl8");
                        String gggggurl9 = intent9.getStringExtra("gggggurl9");
                        String gggggurl10 = intent10.getStringExtra("gggggurl10");
                        String gggggurl11 = intent11.getStringExtra("gggggurl11");
                        String gggggurl12 = intent12.getStringExtra("gggggurl12");
                        String gggggurl13 = intent13.getStringExtra("gggggurl13");
                        String gggggurl14 = intent14.getStringExtra("gggggurl14");
                        String gggggurl15 = intent15.getStringExtra("gggggurl15");
                        String gggggurl16 = intent16.getStringExtra("gggggurl16");
                        String gggggurl17 = intent17.getStringExtra("gggggurl17");
                        String gggggurl18 = intent18.getStringExtra("gggggurl18");
                        String gggggurl19 = intent19.getStringExtra("gggggurl19");
                        String gggggurl20 = intent20.getStringExtra("gggggurl20");
                        String gggggurl21 = intent21.getStringExtra("gggggurl21");
                        String gggggurl22 = intent22.getStringExtra("gggggurl22");
                        String gggggurl23 = intent23.getStringExtra("gggggurl23");
                        String gggggurl24 = intent24.getStringExtra("gggggurl24");
                        String gggggurl25 = intent25.getStringExtra("gggggurl25");
                        String gggggurl26 = intent26.getStringExtra("gggggurl26");

                        String aaaaaurl1 = intent1.getStringExtra("aaaaaurl1");
                        String aaaaaurl2 = intent2.getStringExtra("aaaaaurl2");
                        String aaaaaurl3 = intent3.getStringExtra("aaaaaurl3");
                        String aaaaaurl4 = intent4.getStringExtra("aaaaaurl4");
                        String aaaaaurl5 = intent5.getStringExtra("aaaaaurl5");
                        String aaaaaurl6 = intent6.getStringExtra("aaaaaurl6");
                        String aaaaaurl7 = intent7.getStringExtra("aaaaaurl7");
                        String aaaaaurl8 = intent8.getStringExtra("aaaaaurl8");
                        String aaaaaurl9 = intent9.getStringExtra("aaaaaurl9");
                        String aaaaaurl10 = intent10.getStringExtra("aaaaaurl10");
                        String aaaaaurl11 = intent11.getStringExtra("aaaaaurl11");
                        String aaaaaurl12 = intent12.getStringExtra("aaaaaurl12");
                        String aaaaaurl13 = intent13.getStringExtra("aaaaaurl13");
                        String aaaaaurl14 = intent14.getStringExtra("aaaaaurl14");
                        String aaaaaurl15 = intent15.getStringExtra("aaaaaurl15");
                        String aaaaaurl16 = intent16.getStringExtra("aaaaaurl16");
                        String aaaaaurl17 = intent17.getStringExtra("aaaaaurl17");
                        String aaaaaurl18 = intent18.getStringExtra("aaaaaurl18");
                        String aaaaaurl19 = intent19.getStringExtra("aaaaaurl19");
                        String aaaaaurl20 = intent20.getStringExtra("aaaaaurl20");
                        String aaaaaurl21 = intent21.getStringExtra("aaaaaurl21");
                        String aaaaaurl22 = intent22.getStringExtra("aaaaaurl22");
                        String aaaaaurl23 = intent23.getStringExtra("aaaaaurl23");
                        String aaaaaurl24 = intent24.getStringExtra("aaaaaurl24");
                        String aaaaaurl25 = intent25.getStringExtra("aaaaaurl25");
                        String aaaaaurl26 = intent26.getStringExtra("aaaaaurl26");

                        String rrrrrurl1 = intent1.getStringExtra("rrrrrurl1");
                        String rrrrrurl2 = intent2.getStringExtra("rrrrrurl2");
                        String rrrrrurl3 = intent3.getStringExtra("rrrrrurl3");
                        String rrrrrurl4 = intent4.getStringExtra("rrrrrurl4");
                        String rrrrrurl5 = intent5.getStringExtra("rrrrrurl5");
                        String rrrrrurl6 = intent6.getStringExtra("rrrrrurl6");
                        String rrrrrurl7 = intent7.getStringExtra("rrrrrurl7");
                        String rrrrrurl8 = intent8.getStringExtra("rrrrrurl8");
                        String rrrrrurl9 = intent9.getStringExtra("rrrrrurl9");
                        String rrrrrurl10 = intent10.getStringExtra("rrrrrurl10");
                        String rrrrrurl11 = intent11.getStringExtra("rrrrrurl11");
                        String rrrrrurl12 = intent12.getStringExtra("rrrrrurl12");
                        String rrrrrurl13 = intent13.getStringExtra("rrrrrurl13");
                        String rrrrrurl14 = intent14.getStringExtra("rrrrrurl14");
                        String rrrrrurl15 = intent15.getStringExtra("rrrrrurl15");
                        String rrrrrurl16 = intent16.getStringExtra("rrrrrurl16");
                        String rrrrrurl17 = intent17.getStringExtra("rrrrrurl17");
                        String rrrrrurl18 = intent18.getStringExtra("rrrrrurl18");
                        String rrrrrurl19 = intent19.getStringExtra("rrrrrurl19");
                        String rrrrrurl20 = intent20.getStringExtra("rrrrrurl20");
                        String rrrrrurl21 = intent21.getStringExtra("rrrrrurl21");
                        String rrrrrurl22 = intent22.getStringExtra("rrrrrurl22");
                        String rrrrrurl23 = intent23.getStringExtra("rrrrrurl23");
                        String rrrrrurl24 = intent24.getStringExtra("rrrrrurl24");
                        String rrrrrurl25 = intent25.getStringExtra("rrrrrurl25");
                        String rrrrrurl26 = intent26.getStringExtra("rrrrrurl26");


//                Toast.makeText(HomePageNews.this,"nom est : "+url1 ,Toast.LENGTH_SHORT).show();


                        if (gurl1 == null && gurl2 == null && gurl3 == null && gurl4 == null && gurl5 == null && gurl6 == null && gurl7 == null && gurl8 == null && gurl9 == null && gurl10 == null && gurl11 == null && gurl12 == null && gurl13 == null && gurl14 == null && gurl15 == null && gurl16 == null && gurl17 == null && gurl18 == null && gurl19 == null && gurl20 == null && gurl21 == null && gurl22 == null && gurl23 == null && gurl24 == null && gurl25 == null && gurl26 == null &&
                                aurl1 == null && aurl2 == null && aurl3 == null && aurl4 == null && aurl5 == null && aurl6 == null && aurl7 == null && aurl8 == null && aurl9 == null && aurl10 == null && aurl11 == null && aurl12 == null && aurl13 == null && aurl14 == null && aurl15 == null && aurl16 == null && aurl17 == null && aurl18 == null && aurl19 == null && aurl20 == null && aurl21 == null && aurl22 == null && aurl23 == null && aurl24 == null && aurl25 == null && aurl26 == null &&
                                rurl1 == null && rurl2 == null && rurl3 == null && rurl4 == null && rurl5 == null && rurl6 == null && rurl7 == null && rurl8 == null && rurl9 == null && rurl10 == null && rurl11 == null && rurl12 == null && rurl13 == null && rurl14 == null && rurl15 == null && rurl16 == null && rurl17 == null && rurl18 == null && rurl19 == null && rurl20 == null && rurl21 == null && rurl22 == null && rurl23 == null && rurl24 == null && rurl25 == null && rurl26 == null) {
                            Toast.makeText(getApplication(), "No new clients added!", Toast.LENGTH_SHORT).show();
                        } else if (gurl1 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("gurl1", gurl1);
                            editor.commit();

                            plusgrey1.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey1.class));
                                }
                            });
                        } else if (gurl2 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("gurl2", gurl2);
                            editor.commit();

                            plusgrey1.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey1.class));
                                }
                            });
                        } else if (gurl3 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("gurl3", gurl3);
                            editor.commit();

                            plusgrey1.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey1.class));
                                }
                            });
                        } else if (gurl4 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("gurl4", gurl4);
                            editor.commit();

                            plusgrey1.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey1.class));
                                }
                            });
                        } else if (gurl5 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("gurl5", gurl5);
                            editor.commit();

                            plusgrey1.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey1.class));
                                }
                            });
                        } else if (gurl6 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("gurl6", gurl6);
                            editor.commit();

                            plusgrey1.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey1.class));
                                }
                            });
                        } else if (gurl7 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("gurl7", gurl7);
                            editor.commit();

                            plusgrey1.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey1.class));
                                }
                            });
                        } else if (gurl8 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("gurl8", gurl8);
                            editor.commit();

                            plusgrey1.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey1.class));
                                }
                            });
                        } else if (gurl9 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("gurl9", gurl9);
                            editor.commit();

                            plusgrey1.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey1.class));
                                }
                            });
                        } else if (gurl10 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("gurl10", gurl10);
                            editor.commit();

                            plusgrey1.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey1.class));
                                }
                            });
                        } else if (gurl11 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("gurl11", gurl11);
                            editor.commit();

                            plusgrey1.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey1.class));
                                }
                            });
                        } else if (gurl12 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("gurl12", gurl12);
                            editor.commit();

                            plusgrey1.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey1.class));
                                }
                            });
                        } else if (gurl13 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("gurl13", gurl13);
                            editor.commit();

                            plusgrey1.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey1.class));
                                }
                            });
                        } else if (gurl14 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("gurl14", gurl14);
                            editor.commit();

                            plusgrey1.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey1.class));
                                }
                            });
                        } else if (gurl15 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("gurl15", gurl15);
                            editor.commit();

                            plusgrey1.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey1.class));
                                }
                            });
                        } else if (gurl16 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("gurl16", gurl16);
                            editor.commit();

                            plusgrey1.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey1.class));
                                }
                            });
                        } else if (gurl17 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("gurl17", gurl17);
                            editor.commit();

                            plusgrey1.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey1.class));
                                }
                            });
                        } else if (gurl18 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("gurl18", gurl18);
                            editor.commit();

                            plusgrey1.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey1.class));
                                }
                            });
                        } else if (gurl19 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("gurl19", gurl19);
                            editor.commit();

                            plusgrey1.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey1.class));
                                }
                            });
                        } else if (gurl20 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("gurl20", gurl20);
                            editor.commit();

                            plusgrey1.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey1.class));
                                }
                            });
                        } else if (gurl21 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("gurl21", gurl21);
                            editor.commit();

                            plusgrey1.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey1.class));
                                }
                            });
                        } else if (gurl21 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("gurl21", gurl21);
                            editor.commit();

                            plusgrey1.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey1.class));
                                }
                            });
                        } else if (gurl22 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("gurl22", gurl23);
                            editor.commit();

                            plusgrey1.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey1.class));
                                }
                            });
                        } else if (gurl24 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("gurl24", gurl24);
                            editor.commit();

                            plusgrey1.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey1.class));
                                }
                            });
                        } else if (gurl25 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("gurl25", gurl25);
                            editor.commit();

                            plusgrey1.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey1.class));
                                }
                            });
                        } else if (gurl26 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("gurl26", gurl26);
                            editor.commit();

                            plusgrey1.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey1.class));
                                }
                            });
                        } else if (aurl1 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("aurl1", aurl1);
                            editor.commit();

                            plusgrey1.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey1.class));
                                }
                            });
                        } else if (aurl2 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("aurl2", aurl2);
                            editor.commit();

                            plusgrey1.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey1.class));
                                }
                            });
                        } else if (aurl3 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("aurl3", aurl3);
                            editor.commit();

                            plusgrey1.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey1.class));
                                }
                            });
                        } else if (aurl4 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("aurl4", aurl4);
                            editor.commit();

                            plusgrey1.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey1.class));
                                }
                            });
                        } else if (aurl5 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("aurl5", aurl5);
                            editor.commit();

                            plusgrey1.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey1.class));
                                }
                            });
                        } else if (aurl6 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("aurl6", aurl6);
                            editor.commit();

                            plusgrey1.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey1.class));
                                }
                            });
                        } else if (aurl7 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("aurl7", aurl7);
                            editor.commit();

                            plusgrey1.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey1.class));
                                }
                            });
                        } else if (aurl8 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("aurl8", aurl8);
                            editor.commit();

                            plusgrey1.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey1.class));
                                }
                            });
                        } else if (aurl9 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("aurl9", aurl9);
                            editor.commit();

                            plusgrey1.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey1.class));
                                }
                            });
                        } else if (aurl10 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("aurl10", aurl10);
                            editor.commit();

                            plusgrey1.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey1.class));
                                }
                            });
                        } else if (aurl11 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("aurl11", aurl11);
                            editor.commit();

                            plusgrey1.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey1.class));
                                }
                            });
                        } else if (aurl12 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("aurl12", aurl12);
                            editor.commit();

                            plusgrey1.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey1.class));
                                }
                            });
                        } else if (aurl13 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("aurl13", aurl13);
                            editor.commit();

                            plusgrey1.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey1.class));
                                }
                            });
                        } else if (aurl14 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("aurl14", aurl14);
                            editor.commit();

                            plusgrey1.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey1.class));
                                }
                            });
                        } else if (aurl15 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("aurl15", aurl15);
                            editor.commit();

                            plusgrey1.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey1.class));
                                }
                            });
                        } else if (aurl16 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("aurl16", aurl16);
                            editor.commit();

                            plusgrey1.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey1.class));
                                }
                            });
                        } else if (aurl17 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("aurl17", aurl17);
                            editor.commit();

                            plusgrey1.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey1.class));
                                }
                            });
                        } else if (aurl18 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("aurl18", aurl18);
                            editor.commit();

                            plusgrey1.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey1.class));
                                }
                            });
                        } else if (aurl19 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("aurl19", aurl19);
                            editor.commit();

                            plusgrey1.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey1.class));
                                }
                            });
                        } else if (aurl20 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("aurl20", aurl20);
                            editor.commit();

                            plusgrey1.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey1.class));
                                }
                            });
                        } else if (aurl21 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("aurl21", aurl21);
                            editor.commit();

                            plusgrey1.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey1.class));
                                }
                            });
                        } else if (aurl22 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("aurl22", aurl22);
                            editor.commit();

                            plusgrey1.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey1.class));
                                }
                            });
                        } else if (aurl23 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("aurl23", aurl23);
                            editor.commit();

                            plusgrey1.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey1.class));
                                }
                            });
                        } else if (aurl24 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("aurl24", aurl24);
                            editor.commit();

                            plusgrey1.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey1.class));
                                }
                            });
                        } else if (aurl25 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("aurl25", aurl25);
                            editor.commit();

                            plusgrey1.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey1.class));
                                }
                            });
                        } else if (aurl26 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("aurl26", aurl26);
                            editor.commit();

                            plusgrey1.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey1.class));
                                }
                            });
                        } else if (rurl1 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("rurl1", rurl1);
                            editor.commit();

                            plusgrey1.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey1.class));
                                }
                            });
                        } else if (rurl2 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("rurl2", rurl2);
                            editor.commit();

                            plusgrey1.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey1.class));
                                }
                            });
                        } else if (rurl3 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("rurl3", rurl3);
                            editor.commit();

                            plusgrey1.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey1.class));
                                }
                            });
                        } else if (rurl4 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("rurl4", rurl4);
                            editor.commit();

                            plusgrey1.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey1.class));
                                }
                            });
                        } else if (rurl5 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("rurl5", rurl5);
                            editor.commit();

                            plusgrey1.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey1.class));
                                }
                            });
                        } else if (rurl6 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("rurl6", rurl6);
                            editor.commit();

                            plusgrey1.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey1.class));
                                }
                            });
                        } else if (rurl7 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("rurl7", rurl7);
                            editor.commit();

                            plusgrey1.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey1.class));
                                }
                            });
                        } else if (rurl8 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("rurl8", rurl8);
                            editor.commit();

                            plusgrey1.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey1.class));
                                }
                            });
                        } else if (rurl9 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("rurl9", rurl9);
                            editor.commit();

                            plusgrey1.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey1.class));
                                }
                            });
                        } else if (rurl10 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("rurl10", rurl10);
                            editor.commit();

                            plusgrey1.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey1.class));
                                }
                            });
                        } else if (rurl11 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("rurl11", rurl11);
                            editor.commit();

                            plusgrey1.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey1.class));
                                }
                            });
                        } else if (rurl12 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("rurl12", rurl12);
                            editor.commit();

                            plusgrey1.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey1.class));
                                }
                            });
                        } else if (rurl13 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("rurl31", rurl13);
                            editor.commit();

                            plusgrey1.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey1.class));
                                }
                            });
                        } else if (rurl14 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("rurl14", rurl14);
                            editor.commit();

                            plusgrey1.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey1.class));
                                }
                            });
                        } else if (rurl15 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("rurl15", rurl15);
                            editor.commit();

                            plusgrey1.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey1.class));
                                }
                            });
                        } else if (rurl16 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("rurl16", rurl16);
                            editor.commit();

                            plusgrey1.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey1.class));
                                }
                            });
                        } else if (rurl17 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("rurl17", gurl17);
                            editor.commit();

                            plusgrey1.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey1.class));
                                }
                            });
                        } else if (rurl18 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("rurl18", rurl18);
                            editor.commit();

                            plusgrey1.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey1.class));
                                }
                            });
                        } else if (rurl19 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("rurl19", rurl19);
                            editor.commit();

                            plusgrey1.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey1.class));
                                }
                            });
                        } else if (rurl20 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("rurl20", rurl20);
                            editor.commit();

                            plusgrey1.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey1.class));
                                }
                            });
                        } else if (rurl21 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("rurl21", rurl21);
                            editor.commit();

                            plusgrey1.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey1.class));
                                }
                            });
                        } else if (rurl22 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("rurl22", rurl22);
                            editor.commit();

                            plusgrey1.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey1.class));
                                }
                            });
                        } else if (rurl23 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("rurl23", rurl23);
                            editor.commit();

                            plusgrey1.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey1.class));
                                }
                            });
                        } else if (rurl24 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("rurl24", rurl24);
                            editor.commit();

                            plusgrey1.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey1.class));
                                }
                            });
                        } else if (rurl25 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("rurl25", rurl25);
                            editor.commit();

                            plusgrey1.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey1.class));
                                }
                            });
                        } else if (rurl26 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("rurl26", rurl26);
                            editor.commit();

                            plusgrey1.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey1.class));
                                }
                            });

                        }


                        if (ggurl1 == null && ggurl2 == null && ggurl3 == null && ggurl4 == null && ggurl5 == null && ggurl6 == null && ggurl7 == null && ggurl8 == null && ggurl9 == null && ggurl10 == null && ggurl11 == null && ggurl12 == null && ggurl13 == null && ggurl14 == null && ggurl15 == null && ggurl16 == null && ggurl17 == null && ggurl18 == null && ggurl19 == null && ggurl20 == null && ggurl21 == null && ggurl22 == null && ggurl23 == null && ggurl24 == null && ggurl25 == null && ggurl26 == null &&
                                aaurl1 == null && aaurl2 == null && aaurl3 == null && aaurl4 == null && aaurl5 == null && aaurl6 == null && aaurl7 == null && aaurl8 == null && aaurl9 == null && aaurl10 == null && aaurl11 == null && aaurl12 == null && aaurl13 == null && aaurl14 == null && aaurl15 == null && aaurl16 == null && aaurl17 == null && aaurl18 == null && aaurl19 == null && aaurl20 == null && aaurl21 == null && aaurl22 == null && aaurl23 == null && aaurl24 == null && aaurl25 == null && aaurl26 == null &&
                                rrurl1 == null && rrurl2 == null && rrurl3 == null && rrurl4 == null && rrurl5 == null && rrurl6 == null && rrurl7 == null && rrurl8 == null && rrurl9 == null && rrurl10 == null && rrurl11 == null && rrurl12 == null && rrurl13 == null && rrurl14 == null && rrurl15 == null && rrurl16 == null && rrurl17 == null && rrurl18 == null && rrurl19 == null && rrurl20 == null && rrurl21 == null && rrurl22 == null && rrurl23 == null && rrurl24 == null && rrurl25 == null && rrurl26 == null) {

                        } else if (ggurl1 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("ggurl1", ggurl1);
                            editor.commit();

                            plusgrey2.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey2.class));
                                }
                            });
                        } else if (ggurl2 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("ggurl2", ggurl2);
                            editor.commit();

                            plusgrey2.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey2.class));
                                }
                            });
                        } else if (ggurl3 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("ggurl3", ggurl3);
                            editor.commit();

                            plusgrey2.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey2.class));
                                }
                            });
                        } else if (ggurl4 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("ggurl4", ggurl4);
                            editor.commit();

                            plusgrey2.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey2.class));
                                }
                            });
                        } else if (ggurl5 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("ggurl5", ggurl5);
                            editor.commit();

                            plusgrey2.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey2.class));
                                }
                            });
                        } else if (ggurl6 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("ggurl6", ggurl6);
                            editor.commit();

                            plusgrey2.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey2.class));
                                }
                            });
                        } else if (ggurl7 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("ggurl7", ggurl7);
                            editor.commit();

                            plusgrey2.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey2.class));
                                }
                            });
                        } else if (ggurl8 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("ggurl8", ggurl8);
                            editor.commit();

                            plusgrey2.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey2.class));
                                }
                            });
                        } else if (ggurl9 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("ggurl9", ggurl9);
                            editor.commit();

                            plusgrey2.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey2.class));
                                }
                            });
                        } else if (ggurl10 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("ggurl10", ggurl10);
                            editor.commit();

                            plusgrey2.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey2.class));
                                }
                            });
                        } else if (ggurl11 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("ggurl11", ggurl11);
                            editor.commit();

                            plusgrey2.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey2.class));
                                }
                            });
                        } else if (ggurl12 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("ggurl12", ggurl12);
                            editor.commit();

                            plusgrey2.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey2.class));
                                }
                            });
                        } else if (ggurl13 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("ggurl13", ggurl13);
                            editor.commit();

                            plusgrey2.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey2.class));
                                }
                            });
                        } else if (ggurl14 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("ggurl14", ggurl14);
                            editor.commit();

                            plusgrey2.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey2.class));
                                }
                            });
                        } else if (ggurl15 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("ggurl15", ggurl15);
                            editor.commit();

                            plusgrey2.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey2.class));
                                }
                            });
                        } else if (ggurl16 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("ggurl16", ggurl16);
                            editor.commit();

                            plusgrey2.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey2.class));
                                }
                            });
                        } else if (ggurl17 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("ggurl17", ggurl17);
                            editor.commit();

                            plusgrey2.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey2.class));
                                }
                            });
                        } else if (ggurl18 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("ggurl18", ggurl18);
                            editor.commit();

                            plusgrey2.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey2.class));
                                }
                            });
                        } else if (ggurl19 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("ggurl19", ggurl19);
                            editor.commit();

                            plusgrey2.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey2.class));
                                }
                            });
                        } else if (ggurl20 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("ggurl20", ggurl20);
                            editor.commit();

                            plusgrey2.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey2.class));
                                }
                            });
                        } else if (ggurl21 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("ggurl21", ggurl21);
                            editor.commit();

                            plusgrey2.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey2.class));
                                }
                            });
                        } else if (ggurl22 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("ggurl2", ggurl22);
                            editor.commit();

                            plusgrey2.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey2.class));
                                }
                            });
                        } else if (ggurl23 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("ggurl23", ggurl23);
                            editor.commit();

                            plusgrey2.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey2.class));
                                }
                            });
                        } else if (ggurl24 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("ggurl24", ggurl24);
                            editor.commit();

                            plusgrey2.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey2.class));
                                }
                            });
                        } else if (ggurl25 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("ggurl25", ggurl25);
                            editor.commit();

                            plusgrey2.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey2.class));
                                }
                            });
                        } else if (ggurl26 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("ggurl26", ggurl26);
                            editor.commit();

                            plusgrey2.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey2.class));
                                }
                            });
                        } else if (aaurl1 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("aaurl1", aaurl1);
                            editor.commit();

                            plusgrey2.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey2.class));
                                }
                            });
                        } else if (aaurl2 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("aaurl2", aaurl2);
                            editor.commit();

                            plusgrey2.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey2.class));
                                }
                            });
                        } else if (aaurl3 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("aaurl3", aaurl3);
                            editor.commit();

                            plusgrey2.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey2.class));
                                }
                            });
                        } else if (aaurl4 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("aaurl4", aaurl4);
                            editor.commit();

                            plusgrey2.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey2.class));
                                }
                            });
                        } else if (aaurl5 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("aaurl5", aaurl5);
                            editor.commit();

                            plusgrey2.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey2.class));
                                }
                            });
                        } else if (aaurl6 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("aaurl6", aaurl6);
                            editor.commit();

                            plusgrey2.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey2.class));
                                }
                            });
                        } else if (aaurl7 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("aaurl7", aaurl7);
                            editor.commit();

                            plusgrey2.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey2.class));
                                }
                            });
                        } else if (aaurl8 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("aaurl8", aaurl8);
                            editor.commit();

                            plusgrey2.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey2.class));
                                }
                            });
                        } else if (aaurl9 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("aaurl9", aaurl9);
                            editor.commit();

                            plusgrey2.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey2.class));
                                }
                            });
                        } else if (aaurl10 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("aaurl10", aaurl10);
                            editor.commit();

                            plusgrey2.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey2.class));
                                }
                            });
                        } else if (aaurl11 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("aaurl11", aaurl11);
                            editor.commit();

                            plusgrey2.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey2.class));
                                }
                            });
                        } else if (aaurl12 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("aaurl12", aaurl12);
                            editor.commit();

                            plusgrey2.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey2.class));
                                }
                            });
                        } else if (aaurl13 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("aaurl13", aaurl13);
                            editor.commit();

                            plusgrey2.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey2.class));
                                }
                            });
                        } else if (aaurl14 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("aaurl14", aaurl14);
                            editor.commit();

                            plusgrey2.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey2.class));
                                }
                            });
                        } else if (aaurl15 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("aaurl15", aaurl15);
                            editor.commit();

                            plusgrey2.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey2.class));
                                }
                            });
                        } else if (aaurl16 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("aaurl16", aaurl16);
                            editor.commit();

                            plusgrey2.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey2.class));
                                }
                            });
                        } else if (aaurl17 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("aaurl17", aaurl17);
                            editor.commit();

                            plusgrey2.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey2.class));
                                }
                            });
                        } else if (aaurl18 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("aaurl18", aaurl18);
                            editor.commit();

                            plusgrey2.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey2.class));
                                }
                            });
                        } else if (aaurl19 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("aaurl19", aaurl19);
                            editor.commit();

                            plusgrey2.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey2.class));
                                }
                            });
                        } else if (aaurl20 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("aaurl20", aaurl20);
                            editor.commit();

                            plusgrey2.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey2.class));
                                }
                            });
                        } else if (aaurl21 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("aaurl21", aaurl21);
                            editor.commit();

                            plusgrey2.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey2.class));
                                }
                            });
                        } else if (aaurl22 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("aaurl22", aaurl22);
                            editor.commit();

                            plusgrey2.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey2.class));
                                }
                            });
                        } else if (aaurl23 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("aaurl23", aaurl23);
                            editor.commit();

                            plusgrey2.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey2.class));
                                }
                            });
                        } else if (aaurl24 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("aaurl24", aaurl24);
                            editor.commit();

                            plusgrey2.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey2.class));
                                }
                            });
                        } else if (aaurl25 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("aaurl25", aaurl25);
                            editor.commit();

                            plusgrey2.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey2.class));
                                }
                            });
                        } else if (aaurl26 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("aaurl26", aaurl26);
                            editor.commit();

                            plusgrey2.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey2.class));
                                }
                            });
                        } else if (rrurl1 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("rrurl1", rrurl1);
                            editor.commit();

                            plusgrey2.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey2.class));
                                }
                            });
                        } else if (rrurl2 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("rrurl2", rrurl2);
                            editor.commit();

                            plusgrey2.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey2.class));
                                }
                            });
                        } else if (rrurl3 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("rrurl3", rrurl3);
                            editor.commit();

                            plusgrey2.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey2.class));
                                }
                            });
                        } else if (rrurl4 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("rrurl4", rrurl4);
                            editor.commit();

                            plusgrey2.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey2.class));
                                }
                            });
                        } else if (rrurl5 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("rrurl5", rrurl5);
                            editor.commit();

                            plusgrey2.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey2.class));
                                }
                            });
                        } else if (rrurl6 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("rrurl6", rrurl6);
                            editor.commit();

                            plusgrey2.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey2.class));
                                }
                            });
                        } else if (rrurl7 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("rrurl7", rrurl7);
                            editor.commit();

                            plusgrey2.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey2.class));
                                }
                            });
                        } else if (rrurl8 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("rrurl8", rrurl8);
                            editor.commit();

                            plusgrey2.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey2.class));
                                }
                            });
                        } else if (rrurl8 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("rrurl9", rrurl9);
                            editor.commit();

                            plusgrey2.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey2.class));
                                }
                            });
                        } else if (rrurl10 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("rrurl10", rrurl10);
                            editor.commit();

                            plusgrey2.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey2.class));
                                }
                            });
                        } else if (rrurl11 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("rrurl11", rrurl11);
                            editor.commit();

                            plusgrey2.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey2.class));
                                }
                            });
                        } else if (rrurl12 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("rrurl12", rrurl12);
                            editor.commit();

                            plusgrey2.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey2.class));
                                }
                            });
                        } else if (rrurl13 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("rrurl13", rrurl13);
                            editor.commit();

                            plusgrey2.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey2.class));
                                }
                            });
                        } else if (rrurl14 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("rrurl14", rrurl14);
                            editor.commit();

                            plusgrey2.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey2.class));
                                }
                            });
                        } else if (rrurl15 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("rrurl15", rrurl15);
                            editor.commit();

                            plusgrey2.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey2.class));
                                }
                            });
                        } else if (rrurl16 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("rrurl16", rrurl16);
                            editor.commit();

                            plusgrey2.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey2.class));
                                }
                            });
                        } else if (rrurl17 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("rrurl17", ggurl17);
                            editor.commit();

                            plusgrey2.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey2.class));
                                }
                            });
                        } else if (rrurl18 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("rrurl18", rrurl18);
                            editor.commit();

                            plusgrey2.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey2.class));
                                }
                            });
                        } else if (rrurl19 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("rrurl19", rrurl19);
                            editor.commit();

                            plusgrey2.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey2.class));
                                }
                            });
                        } else if (rrurl20 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("rrurl20", rrurl20);
                            editor.commit();

                            plusgrey2.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey2.class));
                                }
                            });
                        } else if (rrurl21 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("rrurl21", rrurl21);
                            editor.commit();

                            plusgrey2.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey2.class));
                                }
                            });
                        } else if (rrurl22 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("rrurl22", rrurl22);
                            editor.commit();

                            plusgrey2.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey2.class));
                                }
                            });
                        } else if (rrurl23 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("rrurl23", rrurl23);
                            editor.commit();

                            plusgrey2.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey2.class));
                                }
                            });
                        } else if (rrurl24 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("rrurl24", rrurl24);
                            editor.commit();

                            plusgrey2.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey2.class));
                                }
                            });
                        } else if (rrurl25 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("rrurl25", rrurl25);
                            editor.commit();

                            plusgrey2.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey2.class));
                                }
                            });
                        } else if (rrurl26 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("rrurl26", rrurl26);
                            editor.commit();

                            plusgrey2.setOnClickListener(   new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey2.class));
                                }
                            });
                        }


                        if (gggurl1 == null && gggurl2 == null && gggurl3 == null && gggurl4 == null && gggurl5 == null && gggurl6 == null && gggurl7 == null && gggurl8 == null && gggurl9 == null && gggurl10 == null && gggurl11 == null && gggurl12 == null && gggurl13 == null && gggurl14 == null && gggurl15 == null && gggurl16 == null && gggurl17 == null && gggurl18 == null && gggurl19 == null && gggurl20 == null && gggurl21 == null && gggurl22 == null && gggurl23 == null && gggurl24 == null && gggurl25 == null && gggurl26 == null &&
                                aaaurl1 == null && aaaurl2 == null && aaaurl3 == null && aaaurl4 == null && aaaurl5 == null && aaaurl6 == null && aaaurl7 == null && aaaurl8 == null && aaaurl9 == null && aaaurl10 == null && aaaurl11 == null && aaaurl12 == null && aaaurl13 == null && aaaurl14 == null && aaaurl15 == null && aaaurl16 == null && aaaurl17 == null && aaaurl18 == null && aaaurl19 == null && aaaurl20 == null && aaaurl21 == null && aaaurl22 == null && aaaurl23 == null && aaaurl24 == null && aaaurl25 == null && aaaurl26 == null &&
                                rrrurl1 == null && rrrurl2 == null && rrrurl3 == null && rrrurl4 == null && rrrurl5 == null && rrrurl6 == null && rrrurl7 == null && rrrurl8 == null && rrrurl9 == null && rrrurl10 == null && rrrurl11 == null && rrrurl12 == null && rrrurl13 == null && rrrurl14 == null && rrrurl15 == null && rrrurl16 == null && rrrurl17 == null && rrrurl18 == null && rrrurl19 == null && rrrurl20 == null && rrrurl21 == null && rrrurl22 == null && rrrurl23 == null && rrrurl24 == null && rrrurl25 == null && rrrurl26 == null) {

                        } else if (gggurl1 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("gggurl1", gggurl1);
                            editor.commit();

                            plusgrey3.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey3.class));
                                }
                            });
                        } else if (gggurl2 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("gggurl2", gggurl2);
                            editor.commit();

                            plusgrey3.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey3.class));
                                }
                            });
                        } else if (gggurl3 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("gggurl3", gggurl3);
                            editor.commit();

                            plusgrey3.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey3.class));
                                }
                            });
                        } else if (gggurl4 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("gggurl4", gggurl4);
                            editor.commit();

                            plusgrey3.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey3.class));
                                }
                            });
                        } else if (gggurl5 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("gggurl5", gggurl5);
                            editor.commit();

                            plusgrey3.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey3.class));
                                }
                            });
                        } else if (gggurl6 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("gggurl6", gggurl6);
                            editor.commit();

                            plusgrey3.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey3.class));
                                }
                            });
                        } else if (gggurl7 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("gggurl7", gggurl7);
                            editor.commit();

                            plusgrey3.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey3.class));
                                }
                            });
                        } else if (gggurl8 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("gggurl8", gggurl8);
                            editor.commit();

                            plusgrey3.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey3.class));
                                }
                            });
                        } else if (gggurl9 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("gggurl9", gggurl9);
                            editor.commit();

                            plusgrey3.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey3.class));
                                }
                            });
                        } else if (gggurl10 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("gggurl10", gggurl10);
                            editor.commit();

                            plusgrey3.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey3.class));
                                }
                            });
                        } else if (gggurl11 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("gggurl11", gggurl11);
                            editor.commit();

                            plusgrey3.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey3.class));
                                }
                            });
                        } else if (gggurl12 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("gggurl12", gggurl12);
                            editor.commit();

                            plusgrey3.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey3.class));
                                }
                            });
                        } else if (gggurl13 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("gggurl13", gggurl13);
                            editor.commit();

                            plusgrey3.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey3.class));
                                }
                            });
                        } else if (gggurl14 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("gggurl14", gggurl14);
                            editor.commit();

                            plusgrey3.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey3.class));
                                }
                            });
                        } else if (gggurl15 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("gggurl15", gggurl15);
                            editor.commit();

                            plusgrey3.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey3.class));
                                }
                            });
                        } else if (gggurl16 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("gggurl16", gggurl16);
                            editor.commit();

                            plusgrey3.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey3.class));
                                }
                            });
                        } else if (gggurl17 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("gggurl17", gggurl17);
                            editor.commit();

                            plusgrey3.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey3.class));
                                }
                            });
                        } else if (gggurl18 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("gggurl18", gggurl18);
                            editor.commit();

                            plusgrey3.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey3.class));
                                }
                            });
                        } else if (gggurl19 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("gggurl19", gggurl19);
                            editor.commit();

                            plusgrey3.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey3.class));
                                }
                            });
                        } else if (gggurl20 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("gggurl20", gggurl20);
                            editor.commit();

                            plusgrey3.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey3.class));
                                }
                            });
                        } else if (gggurl21 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("gggurl21", gggurl21);
                            editor.commit();

                            plusgrey3.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey3.class));
                                }
                            });
                        } else if (gggurl22 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("gggurl22", gggurl22);
                            editor.commit();

                            plusgrey3.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey3.class));
                                }
                            });
                        } else if (gggurl23 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("gggurl23", gggurl23);
                            editor.commit();

                            plusgrey3.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey3.class));
                                }
                            });
                        } else if (gggurl24 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("gggurl24", gggurl24);
                            editor.commit();

                            plusgrey3.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey3.class));
                                }
                            });
                        } else if (gggurl25 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("gggurl25", gggurl25);
                            editor.commit();

                            plusgrey3.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey3.class));
                                }
                            });
                        } else if (gggurl26 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("gggurl26", gggurl26);
                            editor.commit();

                            plusgrey3.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey3.class));
                                }
                            });
                        } else if (aaaurl1 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("aaaurl1", aaaurl1);
                            editor.commit();

                            plusgrey3.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey3.class));
                                }
                            });
                        } else if (aaaurl2 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("aaaurl2", aaaurl2);
                            editor.commit();

                            plusgrey3.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey3.class));
                                }
                            });
                        } else if (aaaurl3 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("aaaurl3", aaaurl3);
                            editor.commit();

                            plusgrey3.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey3.class));
                                }
                            });
                        } else if (aaaurl4 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("aaaurl4", aaaurl4);
                            editor.commit();

                            plusgrey3.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey3.class));
                                }
                            });
                        } else if (aaaurl5 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("aaaurl5", aaaurl5);
                            editor.commit();

                            plusgrey3.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey3.class));
                                }
                            });
                        } else if (aaaurl6 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("aaaurl6", aaaurl6);
                            editor.commit();

                            plusgrey3.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey3.class));
                                }
                            });
                        } else if (aaaurl7 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("aaaurl7", aaaurl7);
                            editor.commit();

                            plusgrey3.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey3.class));
                                }
                            });
                        } else if (aaaurl8 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("aaaurl8", aaaurl8);
                            editor.commit();

                            plusgrey3.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey3.class));
                                }
                            });
                        } else if (aaaurl9 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("aaaurl9", aaaurl9);
                            editor.commit();

                            plusgrey3.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey3.class));
                                }
                            });
                        } else if (aaaurl10 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("aaaurl10", aaaurl10);
                            editor.commit();

                            plusgrey3.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey3.class));
                                }
                            });
                        } else if (aaaurl11 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("aaaurl11", aaaurl11);
                            editor.commit();

                            plusgrey3.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey3.class));
                                }
                            });
                        } else if (aaaurl12 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("aaaurl12", aaaurl12);
                            editor.commit();

                            plusgrey3.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey3.class));
                                }
                            });
                        } else if (aaaurl13 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("aaaurl13", aaaurl13);
                            editor.commit();

                            plusgrey3.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey3.class));
                                }
                            });
                        } else if (aaaurl14 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("aaaurl14", aaaurl14);
                            editor.commit();

                            plusgrey3.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey3.class));
                                }
                            });
                        } else if (aaaurl15 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("aaaurl15", aaaurl15);
                            editor.commit();

                            plusgrey3.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey3.class));
                                }
                            });
                        } else if (aaaurl16 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("aaaurl16", aaaurl16);
                            editor.commit();

                            plusgrey3.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey3.class));
                                }
                            });
                        } else if (aaaurl17 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("aaaurl17", aaaurl17);
                            editor.commit();

                            plusgrey3.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey3.class));
                                }
                            });
                        } else if (aaaurl18 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("aaaurl18", aaaurl18);
                            editor.commit();

                            plusgrey3.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey3.class));
                                }
                            });
                        } else if (aaaurl19 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("aaaurl19", aaaurl19);
                            editor.commit();

                            plusgrey3.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey3.class));
                                }
                            });
                        } else if (aaaurl20 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("aaaurl20", aaaurl20);
                            editor.commit();

                            plusgrey3.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey3.class));
                                }
                            });
                        } else if (aaaurl21 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("aaaurl21", aaaurl21);
                            editor.commit();

                            plusgrey3.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey3.class));
                                }
                            });
                        } else if (aaaurl22 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("aaaurl22", aaaurl22);
                            editor.commit();

                            plusgrey3.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey3.class));
                                }
                            });
                        } else if (aaaurl23 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("aaaurl23", aaaurl23);
                            editor.commit();

                            plusgrey3.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey3.class));
                                }
                            });
                        } else if (aaaurl24 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("aaaurl24", aaaurl24);
                            editor.commit();

                            plusgrey3.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey3.class));
                                }
                            });
                        } else if (aaaurl25 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("aaaurl25", aaaurl25);
                            editor.commit();

                            plusgrey3.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey3.class));
                                }
                            });
                        } else if (aaaurl26 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("aaaurl26", aaaurl26);
                            editor.commit();

                            plusgrey3.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey3.class));
                                }
                            });
                        } else if (rrrurl1 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("rrrurl1", rrrurl1);
                            editor.commit();

                            plusgrey3.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey3.class));
                                }
                            });
                        } else if (rrrurl2 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("rrrurl2", rrrurl2);
                            editor.commit();

                            plusgrey3.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey3.class));
                                }
                            });
                        } else if (rrrurl3 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("rrrurl3", rrrurl3);
                            editor.commit();

                            plusgrey3.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey3.class));
                                }
                            });
                        } else if (rrrurl4 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("rrrurl4", rrrurl4);
                            editor.commit();

                            plusgrey3.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey3.class));
                                }
                            });
                        } else if (rrrurl5 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("rrrurl5", rrrurl5);
                            editor.commit();

                            plusgrey3.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey3.class));
                                }
                            });
                        } else if (rrrurl6 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("rrrurl6", rrrurl6);
                            editor.commit();

                            plusgrey3.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey3.class));
                                }
                            });
                        } else if (rrrurl7 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("rrrurl7", rrrurl7);
                            editor.commit();

                            plusgrey3.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey3.class));
                                }
                            });
                        } else if (rrrurl8 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("rrrurl8", rrrurl8);
                            editor.commit();

                            plusgrey3.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey3.class));
                                }
                            });
                        } else if (rrrurl9 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("rrrurl9", rrrurl9);
                            editor.commit();

                            plusgrey3.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey3.class));
                                }
                            });
                        } else if (rrrurl10 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("rrrurl10", rrrurl10);
                            editor.commit();

                            plusgrey3.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey3.class));
                                }
                            });
                        } else if (rrrurl11 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("rrrurl11", rrrurl11);
                            editor.commit();

                            plusgrey3.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey3.class));
                                }
                            });
                        } else if (rrrurl12 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("rrrurl12", rrrurl12);
                            editor.commit();

                            plusgrey3.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey3.class));
                                }
                            });
                        } else if (rrrurl13 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("rrrurl13", rrrurl13);
                            editor.commit();

                            plusgrey3.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey3.class));
                                }
                            });
                        } else if (rrrurl14 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("rrrurl14", rrrurl14);
                            editor.commit();

                            plusgrey3.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey3.class));
                                }
                            });
                        } else if (rrrurl15 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("rrrurl15", rrrurl15);
                            editor.commit();

                            plusgrey3.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey3.class));
                                }
                            });
                        } else if (rrrurl16 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("rrrurl16", rrrurl16);
                            editor.commit();

                            plusgrey3.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey3.class));
                                }
                            });
                        } else if (rrrurl17 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("rrrurl17", rrrurl17);
                            editor.commit();

                            plusgrey3.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey3.class));
                                }
                            });
                        } else if (rrrurl18 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("rrrurl18", rrrurl18);
                            editor.commit();

                            plusgrey3.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey3.class));
                                }
                            });
                        } else if (rrrurl19 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("rrrurl19", rrrurl19);
                            editor.commit();

                            plusgrey3.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey3.class));
                                }
                            });
                        } else if (rrrurl20 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("rrrurl20", rrrurl20);
                            editor.commit();

                            plusgrey3.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey3.class));
                                }
                            });
                        } else if (rrrurl21 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("rrrurl21", rrrurl21);
                            editor.commit();

                            plusgrey3.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey3.class));
                                }
                            });
                        } else if (rrrurl22 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("rrrurl22", rrrurl22);
                            editor.commit();

                            plusgrey3.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey3.class));
                                }
                            });
                        } else if (rrrurl23 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("rrrurl23", rrrurl23);
                            editor.commit();

                            plusgrey3.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey3.class));
                                }
                            });
                        } else if (rrrurl24 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("rrrurl24", rrrurl24);
                            editor.commit();

                            plusgrey3.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey3.class));
                                }
                            });
                        } else if (rrrurl25 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("rrrurl25", rrrurl25);
                            editor.commit();

                            plusgrey3.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey3.class));
                                }
                            });
                        } else if (rrrurl26 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("rrrurl26", rrrurl26);
                            editor.commit();

                            plusgrey3.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey3.class));
                                }
                            });
                        }


                        if (ggggurl1 == null && ggggurl2 == null && ggggurl3 == null && ggggurl4 == null && ggggurl5 == null && ggggurl6 == null && ggggurl7 == null && ggggurl8 == null && ggggurl9 == null && ggggurl10 == null && ggggurl11 == null && ggggurl12 == null && ggggurl13 == null && ggggurl14 == null && ggggurl15 == null && ggggurl16 == null && ggggurl17 == null && ggggurl18 == null && ggggurl19 == null && ggggurl20 == null && ggggurl21 == null && ggggurl22 == null && ggggurl23 == null && ggggurl24 == null && ggggurl25 == null && ggggurl26 == null &&
                                aaaaurl1 == null && aaaaurl2 == null && aaaaurl3 == null && aaaaurl4 == null && aaaaurl5 == null && aaaaurl6 == null && aaaaurl7 == null && aaaaurl8 == null && aaaaurl9 == null && aaaaurl10 == null && aaaaurl11 == null && aaaaurl12 == null && aaaaurl13 == null && aaaaurl14 == null && aaaaurl15 == null && aaaaurl16 == null && aaaaurl17 == null && aaaaurl18 == null && aaaaurl19 == null && aaaaurl20 == null && aaaaurl21 == null && aaaaurl22 == null && aaaaurl23 == null && aaaaurl24 == null && aaaaurl25 == null && aaaaurl26 == null &&
                                rrrrurl1 == null && rrrrurl2 == null && rrrrurl3 == null && rrrrurl4 == null && rrrrurl5 == null && rrrrurl6 == null && rrrrurl7 == null && rrrrurl8 == null && rrrrurl9 == null && rrrrurl10 == null && rrrrurl11 == null && rrrrurl12 == null && rrrrurl13 == null && rrrrurl14 == null && rrrrurl15 == null && rrrrurl16 == null && rrrrurl17 == null && rrrrurl18 == null && rrrrurl19 == null && rrrrurl20 == null && rrrrurl21 == null && rrrrurl22 == null && rrrrurl23 == null && rrrrurl24 == null && rrrrurl25 == null && rrrrurl26 == null) {
                        } else if (ggggurl1 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("ggggurl1", ggggurl1);
                            editor.commit();

                            plusgrey4.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey4.class));
                                }
                            });
                        } else if (ggggurl2 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("ggggurl2", ggggurl2);
                            editor.commit();

                            plusgrey4.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey4.class));
                                }
                            });
                        } else if (ggggurl3 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("ggggurl3", ggggurl3);
                            editor.commit();

                            plusgrey4.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey4.class));
                                }
                            });
                        } else if (ggggurl4 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("ggggurl4", ggggurl4);
                            editor.commit();

                            plusgrey4.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey4.class));
                                }
                            });
                        } else if (ggggurl5 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("ggggurl5", ggggurl5);
                            editor.commit();

                            plusgrey4.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey4.class));
                                }
                            });
                        } else if (ggggurl6 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("ggggurl6", ggggurl6);
                            editor.commit();

                            plusgrey4.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey4.class));
                                }
                            });
                        } else if (ggggurl7 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("ggggurl7", ggggurl7);
                            editor.commit();

                            plusgrey4.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey4.class));
                                }
                            });
                        } else if (ggggurl8 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("ggggurl8", ggggurl8);
                            editor.commit();

                            plusgrey4.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey4.class));
                                }
                            });
                        } else if (ggggurl9 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("ggggurl9", ggggurl9);
                            editor.commit();

                            plusgrey4.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey4.class));
                                }
                            });
                        } else if (ggggurl10 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("ggggurl10", ggggurl10);
                            editor.commit();

                            plusgrey4.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey4.class));
                                }
                            });
                        } else if (ggggurl11 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("ggggurl11", ggggurl11);
                            editor.commit();

                            plusgrey4.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey4.class));
                                }
                            });
                        } else if (ggggurl12 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("ggggurl12", ggggurl12);
                            editor.commit();

                            plusgrey4.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey4.class));
                                }
                            });
                        } else if (ggggurl13 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("ggggurl13", ggggurl13);
                            editor.commit();

                            plusgrey4.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey4.class));
                                }
                            });
                        } else if (ggggurl14 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("ggggurl14", ggggurl14);
                            editor.commit();

                            plusgrey4.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey4.class));
                                }
                            });
                        } else if (ggggurl15 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("ggggurl15", ggggurl15);
                            editor.commit();

                            plusgrey4.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey4.class));
                                }
                            });
                        } else if (ggggurl16 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("ggggurl16", ggggurl16);
                            editor.commit();

                            plusgrey4.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey4.class));
                                }
                            });
                        } else if (ggggurl17 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("ggggurl17", ggggurl17);
                            editor.commit();

                            plusgrey4.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey4.class));
                                }
                            });
                        } else if (ggggurl18 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("ggggurl18", ggggurl18);
                            editor.commit();

                            plusgrey4.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey4.class));
                                }
                            });
                        } else if (ggggurl19 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("ggggurl19", ggggurl19);
                            editor.commit();

                            plusgrey4.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey4.class));
                                }
                            });
                        } else if (ggggurl20 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("ggggurl20", ggggurl20);
                            editor.commit();

                            plusgrey4.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey4.class));
                                }
                            });
                        } else if (ggggurl21 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("ggggurl21", ggggurl21);
                            editor.commit();

                            plusgrey4.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey4.class));
                                }
                            });
                        } else if (ggggurl22 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("ggggurl2", ggggurl22);
                            editor.commit();

                            plusgrey4.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey4.class));
                                }
                            });
                        } else if (ggggurl23 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("ggggurl23", ggggurl23);
                            editor.commit();

                            plusgrey4.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey4.class));
                                }
                            });
                        } else if (ggggurl24 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("ggggurl24", ggggurl24);
                            editor.commit();

                            plusgrey4.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey4.class));
                                }
                            });
                        } else if (ggggurl25 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("ggggurl25", ggggurl25);
                            editor.commit();

                            plusgrey4.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey4.class));
                                }
                            });
                        } else if (ggggurl26 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("ggggurl26", ggggurl26);
                            editor.commit();

                            plusgrey4.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey4.class));
                                }
                            });
                        } else if (aaaaurl1 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("aaaaurl1", aaaaurl1);
                            editor.commit();

                            plusgrey4.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey4.class));
                                }
                            });
                        } else if (aaaaurl2 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("aaaaurl2", aaaaurl2);
                            editor.commit();

                            plusgrey4.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey4.class));
                                }
                            });
                        } else if (aaaaurl3 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("aaaaurl3", aaaaurl3);
                            editor.commit();

                            plusgrey4.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey4.class));
                                }
                            });
                        } else if (aaaaurl4 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("aaaaurl4", aaaaurl4);
                            editor.commit();

                            plusgrey4.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey4.class));
                                }
                            });
                        } else if (aaaaurl5 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("aaaaurl5", aaaaurl5);
                            editor.commit();

                            plusgrey4.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey4.class));
                                }
                            });
                        } else if (aaaaurl6 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("aaaaurl6", aaaaurl6);
                            editor.commit();

                            plusgrey4.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey4.class));
                                }
                            });
                        } else if (aaaaurl7 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("aaaaurl7", aaaaurl7);
                            editor.commit();

                            plusgrey4.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey4.class));
                                }
                            });
                        } else if (aaaaurl8 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("aaaaurl8", aaaaurl8);
                            editor.commit();

                            plusgrey4.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey4.class));
                                }
                            });
                        } else if (aaaaurl9 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("aaaaurl9", aaaaurl9);
                            editor.commit();

                            plusgrey4.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey4.class));
                                }
                            });
                        } else if (aaaaurl10 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("aaaaurl10", aaaaurl10);
                            editor.commit();

                            plusgrey4.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey4.class));
                                }
                            });
                        } else if (aaaaurl11 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("aaaaurl11", aaaaurl11);
                            editor.commit();

                            plusgrey4.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey4.class));
                                }
                            });
                        } else if (aaaaurl12 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("aaaaurl12", aaaaurl12);
                            editor.commit();

                            plusgrey4.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey4.class));
                                }
                            });
                        } else if (aaaaurl13 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("aaaaurl13", aaaaurl13);
                            editor.commit();

                            plusgrey4.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey4.class));
                                }
                            });
                        } else if (aaaaurl14 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("aaaaurl14", aaaaurl14);
                            editor.commit();

                            plusgrey4.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey4.class));
                                }
                            });
                        } else if (aaaaurl15 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("aaaaurl15", aaaaurl15);
                            editor.commit();

                            plusgrey4.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey4.class));
                                }
                            });
                        } else if (aaaaurl16 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("aaaaurl16", aaaaurl16);
                            editor.commit();

                            plusgrey4.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey4.class));
                                }
                            });
                        } else if (aaaaurl17 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("aaaaurl17", aaaaurl17);
                            editor.commit();

                            plusgrey4.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey4.class));
                                }
                            });
                        } else if (aaaaurl18 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("aaaaurl18", aaaaurl18);
                            editor.commit();

                            plusgrey4.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey4.class));
                                }
                            });
                        } else if (aaaaurl19 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("aaaaurl19", aaaaurl19);
                            editor.commit();

                            plusgrey4.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey4.class));
                                }
                            });
                        } else if (aaaaurl20 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("aaaaurl20", aaaaurl20);
                            editor.commit();

                            plusgrey4.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey4.class));
                                }
                            });
                        } else if (aaaaurl21 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("aaaaurl21", aaaaurl21);
                            editor.commit();

                            plusgrey4.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey4.class));
                                }
                            });
                        } else if (aaaaurl22 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("aaaaurl22", aaaaurl22);
                            editor.commit();

                            plusgrey4.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey4.class));
                                }
                            });
                        } else if (aaaaurl23 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("aaaaurl23", aaaaurl23);
                            editor.commit();

                            plusgrey4.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey4.class));
                                }
                            });
                        } else if (aaaaurl24 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("aaaaurl24", aaaaurl24);
                            editor.commit();

                            plusgrey4.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey4.class));
                                }
                            });
                        } else if (aaaaurl25 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("aaaaurl25", aaaaurl25);
                            editor.commit();

                            plusgrey4.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey4.class));
                                }
                            });
                        } else if (aaaaurl26 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("aaaaurl26", aaaaurl26);
                            editor.commit();

                            plusgrey4.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey4.class));
                                }
                            });
                        } else if (rrrrurl1 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("rrrrurl1", rrrrurl1);
                            editor.commit();

                            plusgrey4.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey4.class));
                                }
                            });
                        } else if (rrrrurl2 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("rrrrurl2", rrrrurl2);
                            editor.commit();

                            plusgrey4.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey4.class));
                                }
                            });
                        } else if (rrrrurl3 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("rrrrurl3", rrrrurl3);
                            editor.commit();

                            plusgrey4.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey4.class));
                                }
                            });
                        } else if (rrrrurl4 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("rrrrurl4", rrrrurl4);
                            editor.commit();

                            plusgrey4.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey4.class));
                                }
                            });
                        } else if (rrrrurl5 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("rrrrurl5", rrrrurl5);
                            editor.commit();

                            plusgrey4.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey4.class));
                                }
                            });
                        } else if (rrrrurl6 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("rrrrurl6", rrrrurl6);
                            editor.commit();

                            plusgrey4.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey4.class));
                                }
                            });
                        } else if (rrrrurl7 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("rrrrurl7", rrrrurl7);
                            editor.commit();

                            plusgrey4.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey4.class));
                                }
                            });
                        } else if (rrrrurl8 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("rrrrurl8", rrrrurl8);
                            editor.commit();

                            plusgrey4.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey4.class));
                                }
                            });
                        } else if (rrrrurl9 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("rrrrurl9", rrrrurl9);
                            editor.commit();

                            plusgrey4.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey4.class));
                                }
                            });
                        } else if (rrrrurl10 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("rrrrurl10", rrrrurl10);
                            editor.commit();

                            plusgrey4.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey4.class));
                                }
                            });
                        } else if (rrrrurl11 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("rrrrurl11", rrrrurl11);
                            editor.commit();

                            plusgrey4.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey4.class));
                                }
                            });
                        } else if (rrrrurl12 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("rrrrurl12", rrrrurl12);
                            editor.commit();

                            plusgrey4.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey4.class));
                                }
                            });
                        } else if (rrrrurl13 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("rrrrurl13", rrrrurl13);
                            editor.commit();

                            plusgrey4.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey4.class));
                                }
                            });
                        } else if (rrrrurl14 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("rrrrurl14", rrrrurl14);
                            editor.commit();

                            plusgrey4.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey4.class));
                                }
                            });
                        } else if (rrrrurl15 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("rrrrurl15", rrrrurl15);
                            editor.commit();

                            plusgrey4.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey4.class));
                                }
                            });
                        } else if (rrrrurl16 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("rrrrurl16", rrrrurl16);
                            editor.commit();

                            plusgrey4.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey4.class));
                                }
                            });
                        } else if (rrrrurl17 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("rrrrurl17", rrrrurl17);
                            editor.commit();

                            plusgrey4.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey4.class));
                                }
                            });
                        } else if (rrrrurl18 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("rrrrurl18", rrrrurl18);
                            editor.commit();

                            plusgrey4.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey4.class));
                                }
                            });
                        } else if (rrrrurl19 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("rrrrurl19", rrrrurl19);
                            editor.commit();

                            plusgrey4.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey4.class));
                                }
                            });
                        } else if (rrrrurl20 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("rrrrurl20", rrrrurl20);
                            editor.commit();

                            plusgrey4.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey4.class));
                                }
                            });
                        } else if (rrrrurl21 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("rrrrurl21", rrrrurl21);
                            editor.commit();

                            plusgrey4.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey4.class));
                                }
                            });
                        } else if (rrrrurl22 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("rrrrurl22", rrrrurl22);
                            editor.commit();

                            plusgrey4.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey4.class));
                                }
                            });
                        } else if (rrrrurl23 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("rrrrurl23", rrrrurl23);
                            editor.commit();

                            plusgrey4.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey4.class));
                                }
                            });
                        } else if (rrrrurl24 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("rrrrurl24", rrrrurl24);
                            editor.commit();

                            plusgrey4.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey4.class));
                                }
                            });
                        } else if (rrrrurl25 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("rrrrurl25", rrrrurl25);
                            editor.commit();

                            plusgrey4.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey4.class));
                                }
                            });
                        } else if (rrrrurl26 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("rrrrurl26", rrrrurl26);
                            editor.commit();

                            plusgrey4.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey4.class));
                                }
                            });
                        }


                        if (gggggurl1 == null && gggggurl2 == null && gggggurl3 == null && gggggurl4 == null && gggggurl5 == null && gggggurl6 == null && gggggurl7 == null && gggggurl8 == null && gggggurl9 == null && gggggurl10 == null && gggggurl11 == null && gggggurl12 == null && gggggurl13 == null && gggggurl14 == null && gggggurl15 == null && gggggurl16 == null && gggggurl17 == null && gggggurl18 == null && gggggurl19 == null && gggggurl20 == null && gggggurl21 == null && gggggurl22 == null && gggggurl23 == null && gggggurl24 == null && gggggurl25 == null && gggggurl26 == null &&
                                aaaaaurl1 == null && aaaaaurl2 == null && aaaaaurl3 == null && aaaaaurl4 == null && aaaaaurl5 == null && aaaaaurl6 == null && aaaaaurl7 == null && aaaaaurl8 == null && aaaaaurl9 == null && aaaaaurl10 == null && aaaaaurl11 == null && aaaaaurl12 == null && aaaaaurl13 == null && aaaaaurl14 == null && aaaaaurl15 == null && aaaaaurl16 == null && aaaaaurl17 == null && aaaaaurl18 == null && aaaaaurl19 == null && aaaaaurl20 == null && aaaaaurl21 == null && aaaaaurl22 == null && aaaaaurl23 == null && aaaaaurl24 == null && aaaaaurl25 == null && aaaaaurl26 == null &&
                                rrrrrurl1 == null && rrrrrurl2 == null && rrrrrurl3 == null && rrrrrurl4 == null && rrrrrurl5 == null && rrrrrurl6 == null && rrrrrurl7 == null && rrrrrurl8 == null && rrrrrurl9 == null && rrrrrurl10 == null && rrrrrurl11 == null && rrrrrurl12 == null && rrrrrurl13 == null && rrrrrurl14 == null && rrrrrurl15 == null && rrrrrurl16 == null && rrrrrurl17 == null && rrrrrurl18 == null && rrrrrurl19 == null && rrrrrurl20 == null && rrrrrurl21 == null && rrrrrurl22 == null && rrrrrurl23 == null && rrrrrurl24 == null && rrrrrurl25 == null && rrrrrurl26 == null) {

                        } else if (gggggurl1 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("gggggurl1", gggggurl1);
                            editor.commit();

                            plusgrey5.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey5.class));
                                }
                            });
                        } else if (gggggurl2 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("gggggurl2", gggggurl2);
                            editor.commit();

                            plusgrey5.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey5.class));
                                }
                            });
                        } else if (gggggurl3 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("gggggurl3", gggggurl3);
                            editor.commit();

                            plusgrey5.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey5.class));
                                }
                            });
                        } else if (gggggurl4 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("gggggurl4", gggggurl4);
                            editor.commit();

                            plusgrey5.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey5.class));
                                }
                            });
                        } else if (gggggurl5 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("gggggurl5", gggggurl5);
                            editor.commit();

                            plusgrey5.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey5.class));
                                }
                            });
                        } else if (gggggurl6 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("gggggurl6", gggggurl6);
                            editor.commit();

                            plusgrey5.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey5.class));
                                }
                            });
                        } else if (gggggurl7 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("gggggurl7", gggggurl7);
                            editor.commit();

                            plusgrey5.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey5.class));
                                }
                            });
                        } else if (gggggurl8 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("gggggurl8", gggggurl8);
                            editor.commit();

                            plusgrey5.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey5.class));
                                }
                            });
                        } else if (gggggurl9 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("gggggurl9", gggggurl9);
                            editor.commit();

                            plusgrey5.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey5.class));
                                }
                            });
                        } else if (gggggurl10 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("gggggurl10", gggggurl10);
                            editor.commit();

                            plusgrey5.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey5.class));
                                }
                            });
                        } else if (gggggurl11 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("gggggurl11", gggggurl11);
                            editor.commit();

                            plusgrey5.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey5.class));
                                }
                            });
                        } else if (gggggurl12 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("gggggurl12", gggggurl12);
                            editor.commit();

                            plusgrey5.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey5.class));
                                }
                            });
                        } else if (gggggurl13 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("gggggurl13", gggggurl13);
                            editor.commit();

                            plusgrey5.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey5.class));
                                }
                            });
                        } else if (gggggurl14 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("gggggurl14", gggggurl14);
                            editor.commit();

                            plusgrey5.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey5.class));
                                }
                            });
                        } else if (gggggurl15 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("gggggurl15", gggggurl15);
                            editor.commit();

                            plusgrey5.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey5.class));
                                }
                            });
                        } else if (gggggurl16 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("gggggurl16", gggggurl16);
                            editor.commit();

                            plusgrey5.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey5.class));
                                }
                            });
                        } else if (gggggurl17 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("gggggurl17", gggggurl17);
                            editor.commit();

                            plusgrey5.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey5.class));
                                }
                            });
                        } else if (gggggurl18 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("gggggurl18", gggggurl18);
                            editor.commit();

                            plusgrey5.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey5.class));
                                }
                            });
                        } else if (gggggurl19 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("gggggurl19", gggggurl19);
                            editor.commit();

                            plusgrey5.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey5.class));
                                }
                            });
                        } else if (gggggurl20 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("gggggurl20", gggggurl20);
                            editor.commit();

                            plusgrey5.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey5.class));
                                }
                            });
                        } else if (gggggurl21 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("gggggurl21", gggggurl21);
                            editor.commit();

                            plusgrey5.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey5.class));
                                }
                            });
                        } else if (gggggurl22 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("gggggurl22", gggggurl22);
                            editor.commit();

                            plusgrey5.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey5.class));
                                }
                            });
                        } else if (gggggurl23 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("gggggurl23", gggggurl23);
                            editor.commit();

                            plusgrey5.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey5.class));
                                }
                            });
                        } else if (gggggurl24 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("gggggurl24", gggggurl24);
                            editor.commit();

                            plusgrey5.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey5.class));
                                }
                            });
                        } else if (gggggurl25 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("gggggurl25", gggggurl25);
                            editor.commit();

                            plusgrey5.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey5.class));
                                }
                            });
                        } else if (gggggurl26 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("gggggurl26", gggggurl26);
                            editor.commit();

                            plusgrey5.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey5.class));
                                }
                            });
                        } else if (aaaaaurl1 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("aaaaaurl1", aaaaaurl1);
                            editor.commit();

                            plusgrey5.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey5.class));
                                }
                            });
                        } else if (aaaaaurl2 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("aaaaaurl2", aaaaaurl2);
                            editor.commit();

                            plusgrey5.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey5.class));
                                }
                            });
                        } else if (aaaaaurl3 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("aaaaaurl3", aaaaaurl3);
                            editor.commit();

                            plusgrey5.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey5.class));
                                }
                            });
                        } else if (aaaaaurl4 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("aaaaaurl4", aaaaaurl4);
                            editor.commit();

                            plusgrey5.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey5.class));
                                }
                            });
                        } else if (aaaaaurl5 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("aaaaaurl5", aaaaaurl5);
                            editor.commit();

                            plusgrey5.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey5.class));
                                }
                            });
                        } else if (aaaaaurl6 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("aaaaaurl6", aaaaaurl6);
                            editor.commit();

                            plusgrey5.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey5.class));
                                }
                            });
                        } else if (aaaaaurl7 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("aaaaaurl7", aaaaaurl7);
                            editor.commit();

                            plusgrey5.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey5.class));
                                }
                            });
                        } else if (aaaaaurl8 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("aaaaaurl8", aaaaaurl8);
                            editor.commit();

                            plusgrey5.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey5.class));
                                }
                            });
                        } else if (aaaaaurl10 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("aaaaaurl10", aaaaaurl10);
                            editor.commit();

                            plusgrey5.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey5.class));
                                }
                            });
                        } else if (aaaaaurl11 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("aaaaaurl11", aaaaaurl11);
                            editor.commit();

                            plusgrey5.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey5.class));
                                }
                            });
                        } else if (aaaaaurl12 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("aaaaaurl12", aaaaaurl12);
                            editor.commit();

                            plusgrey5.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey5.class));
                                }
                            });
                        } else if (aaaaaurl13 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("aaaaaurl13", aaaaaurl13);
                            editor.commit();

                            plusgrey5.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey5.class));
                                }
                            });
                        } else if (aaaaaurl14 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("aaaaaurl14", aaaaaurl14);
                            editor.commit();

                            plusgrey5.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey5.class));
                                }
                            });
                        } else if (aaaaaurl15 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("aaaaaurl15", aaaaaurl15);
                            editor.commit();

                            plusgrey5.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey5.class));
                                }
                            });
                        } else if (aaaaaurl16 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("aaaaaurl16", aaaaaurl16);
                            editor.commit();

                            plusgrey5.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey5.class));
                                }
                            });
                        } else if (aaaaaurl17 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("aaaaaurl17", aaaaaurl17);
                            editor.commit();

                            plusgrey5.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey5.class));
                                }
                            });
                        } else if (aaaaaurl18 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("aaaaaurl18", aaaaaurl18);
                            editor.commit();

                            plusgrey5.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey5.class));
                                }
                            });
                        } else if (aaaaaurl19 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("aaaaaurl19", aaaaaurl19);
                            editor.commit();

                            plusgrey5.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey5.class));
                                }
                            });
                        } else if (aaaaaurl20 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("aaaaaurl20", aaaaaurl20);
                            editor.commit();

                            plusgrey5.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey5.class));
                                }
                            });
                        } else if (aaaaaurl21 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("aaaaaurl21", aaaaaurl21);
                            editor.commit();

                            plusgrey5.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey5.class));
                                }
                            });
                        } else if (aaaaaurl22 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("aaaaaurl22", aaaaaurl22);
                            editor.commit();

                            plusgrey5.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey5.class));
                                }
                            });
                        } else if (aaaaaurl23 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("aaaaaurl23", aaaaaurl23);
                            editor.commit();

                            plusgrey5.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey5.class));
                                }
                            });
                        } else if (aaaaaurl24 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("aaaaaurl24", aaaaaurl24);
                            editor.commit();

                            plusgrey5.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey5.class));
                                }
                            });
                        } else if (aaaaaurl25 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("aaaaaurl25", aaaaaurl25);
                            editor.commit();

                            plusgrey5.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey5.class));
                                }
                            });
                        } else if (aaaaaurl26 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("aaaaaurl26", aaaaaurl26);
                            editor.commit();

                            plusgrey5.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey5.class));
                                }
                            });
                        } else if (rrrrrurl1 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("rrrrrurl1", rrrrrurl1);
                            editor.commit();

                            plusgrey5.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey5.class));
                                }
                            });
                        } else if (rrrrrurl2 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("rrrrrurl2", rrrrrurl2);
                            editor.commit();

                            plusgrey5.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey5.class));
                                }
                            });
                        } else if (rrrrrurl3 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("rrrrrurl3", rrrrrurl3);
                            editor.commit();

                            plusgrey5.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey5.class));
                                }
                            });
                        } else if (rrrrrurl4 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("rrrrrurl4", rrrrrurl4);
                            editor.commit();

                            plusgrey5.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey5.class));
                                }
                            });
                        } else if (rrrrrurl5 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("rrrrrurl5", rrrrrurl5);
                            editor.commit();

                            plusgrey5.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey5.class));
                                }
                            });
                        } else if (rrrrrurl6 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("rrrrrurl6", rrrrrurl6);
                            editor.commit();

                            plusgrey5.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey5.class));
                                }
                            });
                        } else if (rrrrrurl7 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("rrrrrurl7", rrrrrurl7);
                            editor.commit();

                            plusgrey5.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey5.class));
                                }
                            });
                        } else if (rrrrrurl8 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("rrrrrurl8", rrrrrurl8);
                            editor.commit();

                            plusgrey5.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey5.class));
                                }
                            });
                        } else if (rrrrrurl9 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("rrrrrurl9", rrrrrurl9);
                            editor.commit();

                            plusgrey5.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey5.class));
                                }
                            });
                        } else if (rrrrrurl10 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("rrrrrurl10", rrrrrurl10);
                            editor.commit();

                            plusgrey5.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey5.class));
                                }
                            });
                        } else if (rrrrrurl11 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("rrrrrurl11", rrrrrurl11);
                            editor.commit();

                            plusgrey5.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey5.class));
                                }
                            });
                        } else if (rrrrrurl12 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("rrrrrurl12", rrrrrurl12);
                            editor.commit();

                            plusgrey5.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey5.class));
                                }
                            });
                        } else if (rrrrrurl13 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("rrrrrurl13", rrrrrurl13);
                            editor.commit();

                            plusgrey5.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey5.class));
                                }
                            });
                        } else if (rrrrrurl14 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("rrrrrurl14", rrrrrurl14);
                            editor.commit();

                            plusgrey5.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey5.class));
                                }
                            });
                        } else if (rrrrrurl15 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("rrrrrurl15", rrrrrurl15);
                            editor.commit();

                            plusgrey5.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey5.class));
                                }
                            });
                        } else if (rrrrrurl16 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("rrrrrurl16", rrrrrurl16);
                            editor.commit();

                            plusgrey5.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey5.class));
                                }
                            });
                        } else if (rrrrrurl17 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("rrrrrurl17", rrrrrurl17);
                            editor.commit();

                            plusgrey5.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey5.class));
                                }
                            });
                        } else if (rrrrrurl18 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("rrrrrurl18", rrrrrurl18);
                            editor.commit();

                            plusgrey5.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey5.class));
                                }
                            });
                        } else if (rrrrrurl19 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("rrrrrurl19", rrrrrurl19);
                            editor.commit();

                            plusgrey5.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey5.class));
                                }
                            });
                        } else if (rrrrrurl20 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("rrrrrurl20", rrrrrurl20);
                            editor.commit();

                            plusgrey5.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey5.class));
                                }
                            });
                        } else if (rrrrrurl21 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("rrrrrurl21", rrrrrurl21);
                            editor.commit();

                            plusgrey5.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey5.class));
                                }
                            });
                        } else if (rrrrrurl22 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("rrrrrurl22", rrrrrurl22);
                            editor.commit();

                            plusgrey5.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey5.class));
                                }
                            });
                        } else if (rrrrrurl23 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("rrrrrurl23", rrrrrurl23);
                            editor.commit();

                            plusgrey5.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey5.class));
                                }
                            });
                        } else if (rrrrrurl24 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("rrrrrurl24", rrrrrurl24);
                            editor.commit();

                            plusgrey5.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey5.class));
                                }
                            });
                        } else if (rrrrrurl25 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("rrrrrurl25", rrrrrurl25);
                            editor.commit();

                            plusgrey5.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey5.class));
                                }
                            });
                        } else if (rrrrrurl26 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("rrrrrurl26", rrrrrurl26);
                            editor.commit();

                            plusgrey5.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey5.class));
                                }
                            });
                        }else{
                            Toast.makeText(HomePageNews.this, "BOOM", Toast.LENGTH_SHORT).show();
                        }
                    }
                });

    }

    public void onSearchClick(View v)
    {
        try {
            Intent intent = new Intent(Intent.ACTION_WEB_SEARCH);
            String term = editTextInput.getText().toString();
            intent.putExtra(SearchManager.QUERY, term);
            startActivity(intent);
        } catch (Exception e) {
            // TODO: handle exception
        }

    }

//    View.OnClickListener imageButtonHandler = new View.OnClickListener() {
//
//        public void onClick(View v) {
//            button.setImageResource(R.drawable.circlesgooglegrey);
//
//            if (((int) button.getTag()) == 1) {
//                button.setImageResource(R.drawable.circlesgooglegrey);
//                button.setTag(2);
//            } else {
//                button.setImageResource(R.drawable.circlesgreen);
//                button.setTag(1);
//            }
//        }
//    };


    private class DownloadImageTask extends AsyncTask<String, Void, Bitmap> {
        ImageButton imageButton9;

        public DownloadImageTask(ImageButton imageButton9) {
            this.imageButton9 = imageButton9;
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
            imageButton9.setImageBitmap(result);


        }

        public void onSearchClick(View v)
        {
            try {
                Intent intent = new Intent(Intent.ACTION_WEB_SEARCH);
                String term = editTextInput.getText().toString();
                intent.putExtra(SearchManager.QUERY, term);
                startActivity(intent);
            } catch (Exception e) {
                // TODO: handle exception
            }

        }

    }






    ////                                        Intent b = getIntent();
////                                    String url2 = b.getStringExtra("url");
////                                    new HomePageNews.DownloadImageTask((ImageButton) findViewById(R.id.imageButton11))
////                                    .execute(url2);

}