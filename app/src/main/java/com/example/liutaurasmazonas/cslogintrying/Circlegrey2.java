package com.example.liutaurasmazonas.cslogintrying;

import android.app.SearchManager;
import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

import com.google.android.gms.maps.model.Circle;

public class Circlegrey2 extends AppCompatActivity {

    private EditText editTextInput;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_circlegrey2);

        final SharedPreferences sharedPref = PreferenceManager.getDefaultSharedPreferences(this);
        ImageButton buttonclearcache = (ImageButton) findViewById(R.id.buttonclearcache);


        ImageButton bSettingsBlack = (ImageButton) findViewById(R.id.ibSettingsBlack);
        ImageButton bEconCalBlack = (ImageButton) findViewById(R.id.ibEconCalBlack);
        ImageButton bLiveRates = (ImageButton) findViewById(R.id.ibLiveRates);
        ImageButton bNewsBlack = (ImageButton) findViewById(R.id.ibNewsBlack);


        bSettingsBlack.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Circlegrey2.this, SettingsActivity.class));
            }
        });
        bEconCalBlack.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Circlegrey2.this, WebViewActivity.class));
            }
        });
        bLiveRates.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Circlegrey2.this, sortingrates.class));
            }
        });
        bNewsBlack.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Circlegrey2.this, HomePageNews.class));
            }
        });

        ImageButton buttonlookforclient = (ImageButton) findViewById(R.id.buttonlookforclient);
        ImageButton buttonsetpriority = (ImageButton) findViewById(R.id.buttonsetpriority);

        buttonlookforclient.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Circlegrey2.this, ViewProfile.class));
            }
        });
        buttonsetpriority.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Circlegrey2.this, SettingPriority2.class));
            }
        });

        buttonclearcache.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {SharedPreferences.Editor editor = sharedPref.edit();
                editor.remove("ggurl1");
                editor.remove("ggurl2");
                editor.remove("ggurl3");
                editor.remove("ggurl4");
                editor.remove("ggurl5");
                editor.remove("ggurl6");
                editor.remove("ggurl7");
                editor.remove("ggurl8");
                editor.remove("ggurl9");
                editor.remove("ggurl10");
                editor.remove("ggurl11");
                editor.remove("ggurl12");
                editor.remove("ggurl13");
                editor.remove("ggurl14");
                editor.remove("ggurl15");
                editor.remove("ggurl16");
                editor.remove("ggurl17");
                editor.remove("ggurl18");
                editor.remove("ggurl19");
                editor.remove("ggurl20");
                editor.remove("ggurl21");
                editor.remove("ggurl22");
                editor.remove("ggurl23");
                editor.remove("ggurl24");
                editor.remove("ggurl25");
                editor.remove("ggurl26");

                editor.remove("aaurl1");
                editor.remove("aaurl2");
                editor.remove("aaurl3");
                editor.remove("aaurl4");
                editor.remove("aaurl5");
                editor.remove("aaurl6");
                editor.remove("aaurl7");
                editor.remove("aaurl8");
                editor.remove("aaurl9");
                editor.remove("aaurl10");
                editor.remove("aaurl11");
                editor.remove("aaurl12");
                editor.remove("aaurl13");
                editor.remove("aaurl14");
                editor.remove("aaurl15");
                editor.remove("aaurl16");
                editor.remove("aaurl17");
                editor.remove("aaurl18");
                editor.remove("aaurl19");
                editor.remove("aaurl20");
                editor.remove("aaurl21");
                editor.remove("aaurl22");
                editor.remove("aaurl23");
                editor.remove("aaurl24");
                editor.remove("aaurl25");
                editor.remove("aaurl26");

                editor.remove("rrurl1");
                editor.remove("rrurl2");
                editor.remove("rrurl3");
                editor.remove("rrurl4");
                editor.remove("rrurl5");
                editor.remove("rrurl6");
                editor.remove("rrurl7");
                editor.remove("rrurl8");
                editor.remove("rrurl9");
                editor.remove("rrurl10");
                editor.remove("rrurl11");
                editor.remove("rrurl12");
                editor.remove("rrurl13");
                editor.remove("rrurl14");
                editor.remove("rrurl15");
                editor.remove("rrurl16");
                editor.remove("rrurl17");
                editor.remove("rrurl18");
                editor.remove("rrurl19");
                editor.remove("rrurl20");
                editor.remove("rrurl21");
                editor.remove("rrurl22");
                editor.remove("rrurl23");
                editor.remove("rrurl24");
                editor.remove("rrurl25");
                editor.remove("rrurl26");
                editor.commit();
                startActivity(new Intent(Circlegrey2.this, HomePageNews.class));
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
}
