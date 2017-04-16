package com.example.liutaurasmazonas.cslogintrying;

import android.app.ProgressDialog;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

//ksenija find me

public class LoginPage extends AppCompatActivity {

    private EditText etEmail;
    private EditText etPassword;
    private FirebaseAuth firebaseAuth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_page);
        etEmail = (EditText) findViewById(R.id.etEmail);
        etPassword = (EditText) findViewById(R.id.etPassword);
        firebaseAuth = FirebaseAuth.getInstance();
    }

    public void btnUserLogin_Click(View v) {
        final ProgressDialog progressDialog = ProgressDialog.show(LoginPage.this, "Please wait...", "Proccessing...", true);
        String email = etEmail.getText().toString().trim();
        String password = etPassword.getText().toString().trim();

        if (TextUtils.isEmpty(email)) {
            Toast.makeText(getApplication(), "Enter your registered email ID", Toast.LENGTH_SHORT).show();
            progressDialog.dismiss();
            return;
        }


        if (TextUtils.isEmpty(password)) {
            Toast.makeText(getApplication(), "Enter your password", Toast.LENGTH_SHORT).show();
            progressDialog.dismiss();
            return;
        }

        (firebaseAuth.signInWithEmailAndPassword(etEmail.getText().toString(), etPassword.getText().toString()))
                .addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        progressDialog.dismiss();

                        if (task.isSuccessful()) {
                            Toast.makeText(LoginPage.this, "Login successful", Toast.LENGTH_LONG).show();
                            Intent i = new Intent(LoginPage.this, HomePageNews.class);
                            i.putExtra("Email", firebaseAuth.getCurrentUser().getEmail());
                            startActivity(i);
                        } else {
                            Log.e("ERROR", task.getException().toString());
                            Toast.makeText(LoginPage.this, task.getException().getMessage(), Toast.LENGTH_LONG).show();


                        }

                    }
                });
    }
}
//dhed