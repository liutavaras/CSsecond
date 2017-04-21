package com.example.liutaurasmazonas.cslogintrying;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;

import static android.R.attr.button;

public class MainActivity21 extends AppCompatActivity {

    Spinner spinner6;
    Button bButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main21);

        bButton = (Button) findViewById(R.id.button4);

        bButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {


                final ArrayList<String> Keys = new ArrayList<String>();
                for(int ii = 0; ii < 10; ii ++){
                    Keys.add("Keys is : " + String.valueOf(ii));
                }

                RelativeLayout Row = (RelativeLayout) findViewById(R.id.relativelayoutexample);

                final Button[] my_button = new Button[Keys.size()];

                for (int bt = 0; bt < Keys.size(); bt ++){
                    final int Index = bt;

                    my_button[Index] = new Button(MainActivity21.this);
                    my_button[Index].setLayoutParams(new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT, RelativeLayout.LayoutParams.WRAP_CONTENT));
                    my_button[Index].setText(Keys.get(Index));
                    my_button[Index].setId(Index);

                    my_button[bt].setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if (my_button[Index].getId() == ((Button) v).getId()){
                                Toast.makeText(getBaseContext(), Keys.get(Index), Toast.LENGTH_LONG).show();
                            }
                        }
                    });

                    Row.addView(my_button[Index]);
                }

            }
        });




    }}

