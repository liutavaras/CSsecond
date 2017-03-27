package com.example.liutaurasmazonas.cslogintrying;

import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import com.firebase.client.Firebase;
import com.firebase.client.annotations.NotNull;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

import java.security.AuthProvider;

public class LoginPage extends AppCompatActivity {

   private EditText etCompanysID;
    private EditText etPassword;
    private Button bLogin;

    private FirebaseAuth mAuth;
    private FirebaseAuth.AuthStateListener mAuthListener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_page);
        Firebase.setAndroidContext(this);

        mAuth = FirebaseAuth.getInstance();

//
//         etCompanysID = (EditText) findViewById(R.id.etCompanysID);
//        etPassword = (EditText) findViewById(R.id.etPassword);
//        bLogin = (ImageButton) findViewById(R.id.bLogin);
//        TextView registerLink = (TextView) findViewById(R.id.tvRegisterHere);

        mAuthListener =new FirebaseAuth.AuthStateListener(){
            @Override
            public void onAuthStateChanged(@NotNull FirebaseAuth firebaseAuth){

                if(firebaseAuth.getCurrentUser() != null){
                    startActivity(new Intent(LoginPage.this, HomePageNews.class ));

                }
            }
        };
        bLogin.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                startSignIn();

            }
            });
//        registerLink.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent registerIntent = new Intent(LoginPage.this, RegisterActivity.class);
//                LoginPage.this.startActivity(registerIntent);
//
//
//            }
//        });
    }

    @Override
    protected void onStart(){
        super.onStart();
        mAuth.addAuthStateListener(mAuthListener);
    }
    private void startSignIn(){
        String email = etCompanysID.getText().toString();
        String password = etPassword.getText().toString();
        if(TextUtils.isEmpty(email) || TextUtils.isEmpty(password)) {
            Toast.makeText(LoginPage.this, "Fields are empty.", Toast.LENGTH_LONG).show();

        }else{
            mAuth.signInWithEmailAndPassword(email, password).addOnCompleteListener(new OnCompleteListener<AuthResult>(){
                @Override
                public void onComplete(@NotNull Task<AuthResult> task){

                    if(!task.isSuccessful()){

                        Toast.makeText(LoginPage.this, "Sign In Problem", Toast.LENGTH_LONG).show();
                    }

                }

            });
        }

    }
}
