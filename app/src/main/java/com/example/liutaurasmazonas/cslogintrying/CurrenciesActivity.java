package com.example.liutaurasmazonas.cslogintrying;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;

<<<<<<< HEAD:app/src/main/java/com/example/liutaurasmazonas/cslogintrying/MainActivity14.java
public class MainActivity14 extends AppCompatActivity {
    RecyclerView recyclerView;
    @Override
    protected void onCreate (Bundle savedInstantState) {
        super.onCreate(savedInstantState);
        setContentView(R.layout.activity_main14);

        recyclerView= (RecyclerView) findViewById(R.id.recyclerview);
        ReadRss readRss=new ReadRss(this, recyclerView);
        readRss.execute();
=======
public class CurrenciesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_currencies);
>>>>>>> 8608d0ef3b5286257cdfd638ab4becb3d7f91aed:app/src/main/java/com/example/liutaurasmazonas/cslogintrying/CurrenciesActivity.java
    }

}