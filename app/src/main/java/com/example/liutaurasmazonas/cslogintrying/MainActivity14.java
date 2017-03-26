package com.example.liutaurasmazonas.cslogintrying;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.ButtonBarLayout;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity14 extends AppCompatActivity {
    RecyclerView recyclerView;
    ImageButton button;


    @Override
    protected void onCreate (Bundle savedInstantState) {
        super.onCreate(savedInstantState);
        setContentView(R.layout.activity_main14);

        button= (ImageButton)findViewById(R.id.googleImgBtn);
        button.setTag(1);
        button.setOnClickListener(imageButtonHandler);


        recyclerView= (RecyclerView) findViewById(R.id.recyclerview);
        ReadRss readRss=new ReadRss(this, recyclerView);
        readRss.execute();
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