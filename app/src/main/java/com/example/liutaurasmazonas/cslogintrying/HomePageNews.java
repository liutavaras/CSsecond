package com.example.liutaurasmazonas.cslogintrying;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageButton;


public class HomePageNews extends AppCompatActivity {
    RecyclerView recyclerView;
    ImageButton button;


    @Override
    protected void onCreate (Bundle savedInstantState) {
        super.onCreate(savedInstantState);
        setContentView(R.layout.home_page_news);

        button= (ImageButton)findViewById(R.id.googleImgBtn);
        button.setTag(1);
        button.setOnClickListener(imageButtonHandler);


        recyclerView= (RecyclerView) findViewById(R.id.recyclerview);
        ReadRss readRss=new ReadRss(this, recyclerView);
        readRss.execute();

        ImageButton bSettingsBlack = (ImageButton) findViewById(R.id.ibSettingsBlack);
        ImageButton bLiveRatesBlack = (ImageButton) findViewById(R.id.ibLiveRatesBlack);
        ImageButton bEconCalBlack = (ImageButton) findViewById(R.id.ibEconCalBlack);

        bLiveRatesBlack.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent openliverates = new Intent(HomePageNews.this, LiveRatesActivity.class);
                startActivity(openliverates);
            }
        });
        bSettingsBlack.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent opensettings = new Intent(HomePageNews.this, SettingsActivity.class);
                startActivity(opensettings);
            }
        });
        bEconCalBlack.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent openeconcal = new Intent(HomePageNews.this, EconomicCalendarActivity.class);
                startActivity(openeconcal);
            }
        });

    }

    View.OnClickListener imageButtonHandler = new View.OnClickListener() {

        public void onClick(View v) {
            button.setImageResource(R.drawable.circlesgooglegrey);

            if(((int) button.getTag()) == 1){
                button.setImageResource(R.drawable.circlesgooglegrey);
                button.setTag(2);
            }else{
                button.setImageResource(R.drawable.circlesgreen);
                button.setTag(1);
            }
        }
    };

}