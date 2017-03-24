package com.example.liutaurasmazonas.cslogintrying;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

import com.example.liutaurasmazonas.cslogintrying.WebViewActivity;

public class MainActivity14 extends Activity {
    private Button button;
    public void onCreate(Bundle savedInstanceState) {
        final Context context = this;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main14);
        button = (Button) findViewById(R.id.activity_main14);
        button.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View arg0) {
                Intent intent = new Intent(context, WebViewActivity.class);
                startActivity(intent);
            }
        });
    }
}