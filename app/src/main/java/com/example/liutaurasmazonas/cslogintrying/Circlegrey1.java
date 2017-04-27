package com.example.liutaurasmazonas.cslogintrying;

import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Circlegrey1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_circlegrey1);
        final SharedPreferences sharedPref = PreferenceManager.getDefaultSharedPreferences(this);


        ImageButton bSettingsBlack = (ImageButton) findViewById(R.id.ibSettingsBlack);
        ImageButton bEconCalBlack = (ImageButton) findViewById(R.id.ibEconCalBlack);
        ImageButton bLiveRates = (ImageButton) findViewById(R.id.ibLiveRates);
        ImageButton bNewsBlack = (ImageButton) findViewById(R.id.ibNewsBlack);
        Button buttonlookforclient = (Button) findViewById(R.id.buttonlookforclient);
        Button buttonsetpriority = (Button) findViewById(R.id.buttonsetpriority);
        Button buttonclearcache = (Button) findViewById(R.id.buttonclearcache);
        final ImageButton ibSearch = (ImageButton) findViewById(R.id.ibSearch);

        bSettingsBlack.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Circlegrey1.this, SettingsActivity.class));
            }
        });
        bEconCalBlack.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Circlegrey1.this, WebViewActivity.class));
            }
        });
        bLiveRates.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Circlegrey1.this, sortingrates.class));
            }
        });
        bNewsBlack.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Circlegrey1.this, HomePageNews.class));
            }
        });

        buttonlookforclient.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Circlegrey1.this, ViewProfile.class));
            }
        });

        buttonsetpriority.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Circlegrey1.this, SettingPriority1.class));
            }
        });
        buttonclearcache.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {SharedPreferences.Editor editor = sharedPref.edit();
                editor.remove("gurl1");
                editor.remove("gurl2");
                editor.remove("gurl3");
                editor.remove("gurl4");
                editor.remove("gurl5");
                editor.remove("gurl6");
                editor.remove("gurl7");
                editor.remove("gurl8");
                editor.remove("gurl9");
                editor.remove("gurl10");
                editor.remove("gurl11");
                editor.remove("gurl12");
                editor.remove("gurl13");
                editor.remove("gurl14");
                editor.remove("gurl15");
                editor.remove("gurl16");
                editor.remove("gurl17");
                editor.remove("gurl18");
                editor.remove("gurl19");
                editor.remove("gurl20");
                editor.remove("gurl21");
                editor.remove("gurl22");
                editor.remove("gurl23");
                editor.remove("gurl24");
                editor.remove("gurl25");
                editor.remove("gurl26");

                editor.remove("aurl1");
                editor.remove("aurl2");
                editor.remove("aurl3");
                editor.remove("aurl4");
                editor.remove("aurl5");
                editor.remove("aurl6");
                editor.remove("aurl7");
                editor.remove("aurl8");
                editor.remove("aurl9");
                editor.remove("aurl10");
                editor.remove("aurl11");
                editor.remove("aurl12");
                editor.remove("aurl13");
                editor.remove("aurl14");
                editor.remove("aurl15");
                editor.remove("aurl16");
                editor.remove("aurl17");
                editor.remove("aurl18");
                editor.remove("aurl19");
                editor.remove("aurl20");
                editor.remove("aurl21");
                editor.remove("aurl22");
                editor.remove("aurl23");
                editor.remove("aurl24");
                editor.remove("aurl25");
                editor.remove("aurl26");

                editor.remove("rurl1");
                editor.remove("rurl2");
                editor.remove("rurl3");
                editor.remove("rurl4");
                editor.remove("rurl5");
                editor.remove("rurl6");
                editor.remove("rurl7");
                editor.remove("rurl8");
                editor.remove("rurl9");
                editor.remove("rurl10");
                editor.remove("rurl11");
                editor.remove("rurl12");
                editor.remove("rurl13");
                editor.remove("rurl14");
                editor.remove("rurl15");
                editor.remove("rurl16");
                editor.remove("rurl17");
                editor.remove("rurl18");
                editor.remove("rurl19");
                editor.remove("rurl20");
                editor.remove("rurl21");
                editor.remove("rurl22");
                editor.remove("rurl23");
                editor.remove("rurl24");
                editor.remove("rurl25");
                editor.remove("rurl26");
                editor.commit();
                startActivity(new Intent(Circlegrey1.this, HomePageNews.class));
            }
        });
        ibSearch.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(Circlegrey1.this, GoogleSearchIntentActivity.class));
            }

        });

    }

}
