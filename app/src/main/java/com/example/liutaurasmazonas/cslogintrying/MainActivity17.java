package com.example.liutaurasmazonas.cslogintrying;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import static com.example.liutaurasmazonas.cslogintrying.R.drawable.bell;

public class MainActivity17 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main17);

        ImageView view = (ImageView) findViewById(R.id.imageView3);
        view.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                ImageView imageView = (ImageView) view;
                assert(R.id.imageView3 == imageView.getId());
                Integer integer = (Integer) imageView.getTag();
                integer = integer == null ? 0 : integer;
                switch(integer) {
                    case R.drawable.circlesambergrey2:
                        imageView.setImageResource(R.drawable.bell);
                        imageView.setTag(R.drawable.bell);
                        break;
                    case R.drawable.bell:
                    default:
                        imageView.setImageResource(R.drawable.circlesambergrey2);
                        imageView.setTag(R.drawable.circlesambergrey2);
                        break;}
                }
            });
        }
    }

