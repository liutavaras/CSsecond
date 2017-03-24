package com.example.liutaurasmazonas.cslogintrying;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.support.v7.widget.ButtonBarLayout;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageButton;

import com.example.liutaurasmazonas.cslogintrying.WebViewActivity;
public class MainActivity14 extends AppCompatActivity {
    RecyclerView recyclerView;
    ImageButton button;


public class MainActivity14 extends Activity {
    private Button button;
    public void onCreate(Bundle savedInstanceState) {
        final Context context = this;
        super.onCreate(savedInstanceState);
    @Override
    protected void onCreate (Bundle savedInstantState) {
        super.onCreate(savedInstantState);
        setContentView(R.layout.activity_main14);
        button = (Button) findViewById(R.id.activity_main14);
        button.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View arg0) {
                Intent intent = new Intent(context, WebViewActivity.class);
                startActivity(intent);
            }
        });

        button= (ImageButton)findViewById(R.id.googleImgBtn);
        button.setTag(1);
        button.setOnClickListener(imageButtonHandler);


        recyclerView= (RecyclerView) findViewById(R.id.recyclerview);
        ReadRss readRss=new ReadRss(this, recyclerView);
        readRss.execute();
    }
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