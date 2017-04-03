package com.example.liutaurasmazonas.cslogintrying;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
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
import com.google.firebase.auth.AuthCredential;
import com.google.firebase.auth.EmailAuthProvider;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;


public class ChangePasswordActivity extends AppCompatActivity {

    private static final String TAG ="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_change_password);
        ImageButton bSettingsBlack = (ImageButton) findViewById(R.id.ibSettingsBlack);
        ImageButton bLiveRatesBlack = (ImageButton) findViewById(R.id.ibLiveRatesBlack);
        ImageButton bEconCalBlack = (ImageButton) findViewById(R.id.ibEconCalBlack);
        ImageButton bNewsBlack = (ImageButton) findViewById(R.id.ibNewsBlack);

        bLiveRatesBlack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent openliverates = new Intent(ChangePasswordActivity.this, LiveRatesActivity.class);
                startActivity(openliverates);
            }
        });
        bSettingsBlack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent opensettings = new Intent(ChangePasswordActivity.this, SettingsActivity.class);
                startActivity(opensettings);
            }
        });
        bEconCalBlack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent openeconcal = new Intent(ChangePasswordActivity.this, EconomicCalendarActivity.class);
                startActivity(openeconcal);
            }
        });
        bNewsBlack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent openhome = new Intent(ChangePasswordActivity.this, HomePageNews.class);
                startActivity(openhome);
            }
        });

        setupSaveButton();
        setupCancelButton();


    }




//    Change the password - Joe

   FirebaseUser user = FirebaseAuth.getInstance().getCurrentUser();

    AuthCredential credential = EmailAuthProvider.getCredential("user@example.com", "password1234");






    private void setupSaveButton(){
        Button saveButton = (Button) findViewById(R.id.bSave);
        saveButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v){
                Log.i ("ChangePasswordActivity", "It has been saved!");
                Toast.makeText(
                        ChangePasswordActivity.this,
                        "It has been saved!",
                        Toast.LENGTH_LONG
                ).show();

            }
        });


        user.reauthenticate(credential).addOnCompleteListener(new OnCompleteListener<Void>() {
            @Override
            public void onComplete(@NonNull Task<Void> task) {
                EditText newPass;
                newPass = (EditText) findViewById(R.id.etNewPasswordBox);

                if (task.isSuccessful()) {
                    user.updatePassword(String.valueOf(newPass)).addOnCompleteListener(new OnCompleteListener<Void>() {
                        @Override
                        public void onComplete(@NonNull Task<Void> task) {
                            if (task.isSuccessful()) {
                                Log.d(TAG, "Password updated");
                            } else {
                                Log.d(TAG, "Error password not updated");
                            }
                        }
                    });
                } else {
                    Log.d(TAG, "Error auth failed");
                }
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

                EditText etNewPasswordBox=(EditText) findViewById(R.id.etNewPasswordBox);
                etNewPasswordBox.setText("");

                EditText etRetypeNewPasswordBox=(EditText) findViewById(R.id.etRetypeNewPasswordBox);
                etRetypeNewPasswordBox.setText("");

            }
        });
    }







    //I create Logout feature here. Ksenia

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.menuLogout:

                /* We need to create user in order to clear data
                LoginPage.getInstance(this).logout();

                */


                break;
        }
        return true;

    }
}


