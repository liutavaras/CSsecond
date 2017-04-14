package com.example.liutaurasmazonas.cslogintrying;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.AuthResult;


import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;


public class ChangePasswordActivity extends AppCompatActivity {

    private FirebaseAuth auth;
    private Button bSave1;

    private EditText etCurrentPasswordBox;
    private CheckBox cbShowEmail;
    private EditText etNewPasswordBox;
    private EditText etRetypeNewPasswordBox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_change_password);
        final ImageButton bSettingsBlack = (ImageButton) findViewById(R.id.ibSettingsBlack);
        final ImageButton bLiveRatesBlack = (ImageButton) findViewById(R.id.ibLiveRatesBlack);
        final ImageButton bEconCalBlack = (ImageButton) findViewById(R.id.ibEconCalBlack);
        final ImageButton bNewsBlack = (ImageButton) findViewById(R.id.ibNewsBlack);
        final Button bSave = (Button) findViewById(R.id.bSave);


        etCurrentPasswordBox = (EditText) findViewById(R.id.etCurrentPasswordBox);

        cbShowEmail = (CheckBox) findViewById(R.id.cbShowEmail);



        bSave1 = (Button) findViewById(R.id.bSave);
        auth = FirebaseAuth.getInstance();


        cbShowEmail.setOnCheckedChangeListener(new OnCheckedChangeListener() {

            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                // checkbox status is changed from uncheck to checked.
                if (!isChecked) {
                    // show password
                    etCurrentPasswordBox.setTransformationMethod(PasswordTransformationMethod.getInstance());
                } else {
                    // hide password
                    etCurrentPasswordBox.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
                }
            }
        });


        bLiveRatesBlack.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent openliverates = new Intent(ChangePasswordActivity.this, sortingrates.class);
                startActivity(openliverates);
            }
        });
        bSettingsBlack.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent opensettings = new Intent(ChangePasswordActivity.this, SettingsActivity.class);
                startActivity(opensettings);
            }
        });
        bEconCalBlack.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent openeconcal = new Intent(ChangePasswordActivity.this, WebViewActivity.class);
                startActivity(openeconcal);
            }
        });
        bNewsBlack.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(ChangePasswordActivity.this, HomePageNews.class));
            }
        });

        setupSaveButton();
        setupCancelButton();


    }
    private void setupSaveButton(){
        Button saveButton = (Button) findViewById(R.id.bSave);
        saveButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v){

                String email = etCurrentPasswordBox.getText().toString().trim();

                if (TextUtils.isEmpty(email)) {
                    Toast.makeText(getApplication(), "Enter your registered email ID", Toast.LENGTH_SHORT).show();
                    return;
                }

                auth.sendPasswordResetEmail(email).addOnCompleteListener(new OnCompleteListener<Void>() {
                    @Override
                    public void onComplete(@NonNull Task<Void> task) {
                        if (task.isSuccessful()) {
                            Toast.makeText(ChangePasswordActivity.this, "We have sent you instructions to reset your password!", Toast.LENGTH_SHORT).show();
                        } else {
                            Toast.makeText(ChangePasswordActivity.this, "Failed to send reset email!", Toast.LENGTH_SHORT).show();
                        }
                    }
                });




            }
        });
    }






//test please delete me and again and again
    private void setupCancelButton(){
        Button cancelButton = (Button) findViewById(R.id.bCancel);
        cancelButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v){
                Log.i ("ChangePasswordActivity", "It has been cancelled!");
                Toast.makeText(
                        ChangePasswordActivity.this,
                        "It has been cancelled!",
                        Toast.LENGTH_LONG
                ).show();
                EditText etCurrentPasswordBox=(EditText) findViewById(R.id.etCurrentPasswordBox);
                etCurrentPasswordBox.setText("");


            }
        });
    }




}


