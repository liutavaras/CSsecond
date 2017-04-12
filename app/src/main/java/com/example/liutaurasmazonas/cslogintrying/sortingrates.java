package com.example.liutaurasmazonas.cslogintrying;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.Spinner;

public class sortingrates extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sorting_rates);

        ImageButton bSettingsBlack = (ImageButton) findViewById(R.id.ibSettingsBlack);
        ImageButton bEconCalBlack = (ImageButton) findViewById(R.id.ibEconCalBlack);
        ImageButton bNewsBlack = (ImageButton) findViewById(R.id.ibNewsBlack);

        bEconCalBlack.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(sortingrates.this, WebViewActivity.class));

            }
        });
        bNewsBlack.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(sortingrates.this, HomePageNews.class));

            }
        });
        bSettingsBlack.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(sortingrates.this, SettingsActivity.class));

            }
        });

        Spinner spinner;
        Spinner spinner2;
        Spinner spinner3;
        Spinner spinner4;

        spinner = (Spinner) findViewById(R.id.spinner);

        ArrayAdapter<String> myAdaptor = new ArrayAdapter<String>(sortingrates.this,
                R.layout.support_simple_spinner_dropdown_item,
                getResources().getStringArray(R.array.shares_array));

        myAdaptor.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spinner.setAdapter(myAdaptor);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            public void onClick(View v) {
                // TODO Auto-generated method stub

            }

            @Override
            public void onItemSelected(AdapterView<?> arg0, View view, int position, long row_id) {
                final Intent intent;
                switch (position) {
                    case 1:
                        intent = new Intent(sortingrates.this, LiveRatesActivityfb.class);
                        startActivity(intent);
                        break;
                    case 2:
                        intent = new Intent(sortingrates.this, LiveRatesActivityhoo.class);
                        startActivity(intent);
                        break;
                    case 3:
                        intent = new Intent(sortingrates.this, LiveRatesActivityapple.class);
                        startActivity(intent);
                        break;

                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> arg0) {
                // TODO Auto-generated method stub

            }

        });

        spinner2 = (Spinner) findViewById(R.id.spinner2);

        ArrayAdapter<String> myAdaptor2 = new ArrayAdapter<String>(sortingrates.this,
                R.layout.simple_spinner_item,
                getResources().getStringArray(R.array.currencies_array));

        myAdaptor2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spinner2.setAdapter(myAdaptor2);

        spinner2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            public void onClick(View v) {
                // TODO Auto-generated method stub

            }

            @Override
            public void onItemSelected(AdapterView<?> arg0, View view, int position, long row_id) {
                final Intent intent;
                switch (position) {
                    case 1:
                        intent = new Intent(sortingrates.this, LiveRatesActivitygbpusd.class);
                        startActivity(intent);
                        break;
                    case 2:
                        intent = new Intent(sortingrates.this, LiveRatesActivitygbpeur.class);
                        startActivity(intent);
                        break;
                    case 3:
                        intent = new Intent(sortingrates.this, LiveRatesActivityeurusd.class);
                        startActivity(intent);
                        break;

                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> arg0) {
                // TODO Auto-generated method stub

            }

        });

        spinner3 = (Spinner) findViewById(R.id.spinner3);

        ArrayAdapter<String> myAdaptor3 = new ArrayAdapter<String>(sortingrates.this,
                R.layout.simple_spinner_item,
                getResources().getStringArray(R.array.commodities_array));

        myAdaptor3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spinner3.setAdapter(myAdaptor3);

        spinner3.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            public void onClick(View v) {
                // TODO Auto-generated method stub

            }

            @Override
            public void onItemSelected(AdapterView<?> arg0, View view, int position, long row_id) {
                final Intent intent;
                switch (position) {
                    case 1:
                        intent = new Intent(sortingrates.this, LiveRatesActivitysilver.class);
                        startActivity(intent);
                        break;
                    case 2:
                        intent = new Intent(sortingrates.this, LiveRatesActivitygold.class);
                        startActivity(intent);
                        break;

                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> arg0) {
                // TODO Auto-generated method stub

            }

        });

        spinner4 = (Spinner) findViewById(R.id.spinner4);

        ArrayAdapter<String> myAdaptor4 = new ArrayAdapter<String>(sortingrates.this,
                R.layout.simple_spinner_item,
                getResources().getStringArray(R.array.indices_array));

        myAdaptor4.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spinner4.setAdapter(myAdaptor4);

        spinner4.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            public void onClick(View v) {
                // TODO Auto-generated method stub

            }

            @Override
            public void onItemSelected(AdapterView<?> arg0, View view, int position, long row_id) {
                final Intent intent;
                switch (position) {
                    case 1:
                        intent = new Intent(sortingrates.this, LiveRatesActivitynasdaq.class);
                        startActivity(intent);
                        break;
                    case 2:
                        intent = new Intent(sortingrates.this, LiveRatesActivitysp.class);
                        startActivity(intent);
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