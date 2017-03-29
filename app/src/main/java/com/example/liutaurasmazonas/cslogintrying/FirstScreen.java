package com.example.liutaurasmazonas.cslogintrying;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.firebase.client.Firebase;

public class FirstScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.first_screen);
    }
    public void btnRegister_Click(View v) {
        Intent i = new Intent(FirstScreen.this, Register.class);
        startActivity(i);
    }
    public void btnLogin_Click(View v) {
        Intent i = new Intent(FirstScreen.this, LoginPage.class);
        startActivity(i);
    }
}