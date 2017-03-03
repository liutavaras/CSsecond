package com.example.liutaurasmazonas.cslogintrying;

import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.app.Activity;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.toolbox.Volley;

import org.json.JSONException;
import org.json.JSONObject;


public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_page);
        final EditText etName = (EditText) findViewById(R.id.etName);
        final EditText etSurname = (EditText) findViewById(R.id.etSurname);
        final EditText etCompanysID = (EditText) findViewById(R.id.etCompanysID);
        final EditText etPassword = (EditText) findViewById(R.id.etPassword);
        final EditText etRepeatpassword = (EditText) findViewById(R.id.etRepeatpassword);
        final Button bRegister = (Button) findViewById(R.id.bRegister);
        final TextView backtoLoginPageLink = (TextView) findViewById(R.id.tvBacktologin);


        backtoLoginPageLink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent backtoLoginPageIntent = new Intent(RegisterActivity.this, LoginPage.class);
                RegisterActivity.this.startActivity(backtoLoginPageIntent);


                bRegister.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        final String name = etName.getText().toString();
                        final String surname = etSurname.getText().toString();
                        final String companysID = etCompanysID.getText().toString();
                        final String password = etPassword.getText().toString();
                        final String repeatpassword = etRepeatpassword.getText().toString();

                        Response.Listener<String> responseListener = new Response.Listener<String>() {

                            @Override
                            public void onResponse(String response) {
                                try {
                                    JSONObject jsonResponse = new JSONObject(response);
                                    boolean success = jsonResponse.getBoolean("success");

                                    if (success) {
                                        Intent intent = new Intent(RegisterActivity.this, LoginPage.class);
                                        RegisterActivity.this.startActivity(intent);
                                    } else {
                                        AlertDialog.Builder builder = new AlertDialog.Builder(RegisterActivity.this);
                                        builder.setMessage("Register Failed")
                                                .setNegativeButton("Retry", null)
                                                .create()
                                                .show();
                                    }
                                } catch (JSONException e) {
                                    e.printStackTrace();
                                }
                            }
                        };

                        RegisterRequest registerRequest = new RegisterRequest(name, surname, companysID, password, repeatpassword, responseListener);
                        RequestQueue queue = Volley.newRequestQueue(RegisterActivity.this);
                        queue.add(registerRequest);

                    }
                });
            }
        });

    }


}


