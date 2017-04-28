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

public class Circlegrey3 extends AppCompatActivity {
    private EditText editTextInput;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_circlegrey3);

        final SharedPreferences sharedPref = PreferenceManager.getDefaultSharedPreferences(this);
        ImageButton bSettingsBlack = (ImageButton) findViewById(R.id.ibSettingsBlack);
        ImageButton bEconCalBlack = (ImageButton) findViewById(R.id.ibEconCalBlack);
        ImageButton bLiveRates = (ImageButton) findViewById(R.id.ibLiveRates);
        ImageButton bNewsBlack = (ImageButton) findViewById(R.id.ibNewsBlack);


        bSettingsBlack.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Circlegrey3.this, SettingsActivity.class));
            }
        });
        bEconCalBlack.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Circlegrey3.this, WebViewActivity.class));
            }
        });
        bLiveRates.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Circlegrey3.this, sortingrates.class));
            }
        });
        bNewsBlack.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Circlegrey3.this, HomePageNews.class));
            }
        });

        ImageButton buttonlookforclient = (ImageButton) findViewById(R.id.buttonlookforclient);
        ImageButton buttonsetpriority = (ImageButton) findViewById(R.id.buttonsetpriority);
        ImageButton buttonclearcache = (ImageButton) findViewById(R.id.buttonclearcache);
        buttonlookforclient.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Circlegrey3.this, ViewProfile.class));
            }
        });
        buttonsetpriority.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Circlegrey3.this, SettingPriority3.class));
            }
        });

        buttonclearcache.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {SharedPreferences.Editor editor = sharedPref.edit();
                editor.remove("gggurl1");
                editor.remove("gggurl2");
                editor.remove("gggurl3");
                editor.remove("gggurl4");
                editor.remove("gggurl5");
                editor.remove("gggurl6");
                editor.remove("gggurl7");
                editor.remove("gggurl8");
                editor.remove("gggurl9");
                editor.remove("gggurl10");
                editor.remove("gggurl11");
                editor.remove("gggurl12");
                editor.remove("gggurl13");
                editor.remove("gggurl14");
                editor.remove("gggurl15");
                editor.remove("gggurl16");
                editor.remove("gggurl17");
                editor.remove("gggurl18");
                editor.remove("gggurl19");
                editor.remove("gggurl20");
                editor.remove("gggurl21");
                editor.remove("gggurl22");
                editor.remove("gggurl23");
                editor.remove("gggurl24");
                editor.remove("gggurl25");
                editor.remove("gggurl26");

                editor.remove("aaaurl1");
                editor.remove("aaaurl2");
                editor.remove("aaaurl3");
                editor.remove("aaaurl4");
                editor.remove("aaaurl5");
                editor.remove("aaaurl6");
                editor.remove("aaaurl7");
                editor.remove("aaaurl8");
                editor.remove("aaaurl9");
                editor.remove("aaaurl10");
                editor.remove("aaaurl11");
                editor.remove("aaaurl12");
                editor.remove("aaaurl13");
                editor.remove("aaaurl14");
                editor.remove("aaaurl15");
                editor.remove("aaaurl16");
                editor.remove("aaaurl17");
                editor.remove("aaaurl18");
                editor.remove("aaaurl19");
                editor.remove("aaaurl20");
                editor.remove("aaaurl21");
                editor.remove("aaaurl22");
                editor.remove("aaaurl23");
                editor.remove("aaaurl24");
                editor.remove("aaaurl25");
                editor.remove("aaaurl26");

                editor.remove("rrrurl1");
                editor.remove("rrrurl2");
                editor.remove("rrrurl3");
                editor.remove("rrrurl4");
                editor.remove("rrrurl5");
                editor.remove("rrrurl6");
                editor.remove("rrrurl7");
                editor.remove("rrrurl8");
                editor.remove("rrrurl9");
                editor.remove("rrrurl10");
                editor.remove("rrrurl11");
                editor.remove("rrrurl12");
                editor.remove("rrrurl13");
                editor.remove("rrrurl14");
                editor.remove("rrrurl15");
                editor.remove("rrrurl16");
                editor.remove("rrrurl17");
                editor.remove("rrrurl18");
                editor.remove("rrrurl19");
                editor.remove("rrrurl20");
                editor.remove("rrrurl21");
                editor.remove("rrrurl22");
                editor.remove("rrrurl23");
                editor.remove("rrrurl24");
                editor.remove("rrrurl25");
                editor.remove("rrrurl26");
                editor.commit();
                startActivity(new Intent(Circlegrey3.this, HomePageNews.class));
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
