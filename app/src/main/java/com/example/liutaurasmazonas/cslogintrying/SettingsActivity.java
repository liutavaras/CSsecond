package com.example.liutaurasmazonas.cslogintrying;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.media.audiofx.BassBoost;
import android.net.Uri;
import android.support.v4.content.IntentCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;
import android.widget.ImageButton;
import android.view.View.OnClickListener;
import android.app.Activity;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.Thing;
import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DatabaseReference;

import static android.graphics.Color.BLACK;
import static android.graphics.Color.WHITE;


public class SettingsActivity extends AppCompatActivity {


    private Button signOut;
    private FirebaseAuth.AuthStateListener authListener;
    private FirebaseAuth firebaseAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);


        final String url = "http://res.cloudinary.com/liutavaras/image/upload/v1492506105/a_oufued.png";


        final Button button = (Button) findViewById(R.id.bDark);
        final Button button1 = (Button) findViewById(R.id.button3);
//        final Button button2 = (Button) findViewById(R.id.bNewsOn);
//        final Button button3 = (Button) findViewById(R.id.bNews);
//        final Button button4 = (Button) findViewById(R.id.bNotOn);
//        final Button button5 = (Button) findViewById(R.id.bNot);
        final Button bChangePassword = (Button) findViewById(R.id.bChangePassword);
        final ImageButton bLiveRatesBlack = (ImageButton) findViewById(R.id.ibLiveRatesBlack);
        final ImageButton bEconCalBlack = (ImageButton) findViewById(R.id.ibEconCalBlack);
        final ImageButton bNewsBlack = (ImageButton) findViewById(R.id.ibNewsBlack);
        final ImageButton addAProfile = (ImageButton) findViewById(R.id.addAProfile);
        signOut = (Button) findViewById(R.id.bLogout);
        final ImageButton ibSearch = (ImageButton) findViewById(R.id.ibSearch);

        final RelativeLayout rl=(RelativeLayout) findViewById(R.id.myLayout);

        //get firebase auth instance
        firebaseAuth = FirebaseAuth.getInstance();

        //get current user
        final FirebaseUser user = FirebaseAuth.getInstance().getCurrentUser();

        authListener = new FirebaseAuth.AuthStateListener() {
            @Override
            public void onAuthStateChanged(@NonNull FirebaseAuth firebaseAuth) {
                FirebaseUser user = firebaseAuth.getCurrentUser();
                if (user == null) {
                    // user auth state is changed - user is null
                    // launch login activity
                    Intent i = new Intent(SettingsActivity.this, LoginPage.class);
                    i.addFlags(IntentCompat.FLAG_ACTIVITY_CLEAR_TASK
                            | Intent.FLAG_ACTIVITY_NEW_TASK);
                    startActivity(i);

                }
            }
        };



        // first row of buttons

        button.setOnClickListener(
                new Button.OnClickListener() {
                    public void onClick(View v) {
                        button.setText("ON");
                        button.getBackground().setColorFilter(Color.parseColor("#003662"), PorterDuff.Mode.MULTIPLY);
                        button.setTextColor(WHITE);
                        button1.setText("Light");
                        button1.setTextColor(BLACK);
                        button1.getBackground().setColorFilter(Color.LTGRAY, PorterDuff.Mode.MULTIPLY);
                        rl.setBackgroundColor(BLACK);





                        while (button.isSelected()) {
                            button.isEnabled();

                        }
                        button1.isEnabled();
                        while (button1.isSelected()) {
                            button1.isEnabled();
                        }
                        button.isEnabled();
                        button.setClickable(true);
                        button1.setClickable(true);

                    }
                }
        );


        button1.setOnClickListener(
                new Button.OnClickListener() {
                    public void onClick(View v) {
                        button1.setText("OFF");
                        button1.getBackground().setColorFilter(Color.parseColor("#2B292A"), PorterDuff.Mode.MULTIPLY);
                        button1.setTextColor(WHITE);
                        button.setText("Dark");
                        button.setTextColor(BLACK);
                        button.getBackground().setColorFilter(Color.LTGRAY, PorterDuff.Mode.MULTIPLY);
                        rl.setBackgroundColor(WHITE);


                        while (button1.isSelected()) {
                            button1.isEnabled();
                        }
                        button.isEnabled();
                        while (button.isSelected()) {
                            button.isEnabled();
                        }
                        button1.isEnabled();
                        button1.setClickable(true);
                        button.setClickable(true);

                    }
                }

        );

        // second row of buttons




        bLiveRatesBlack.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(SettingsActivity.this, sortingrates.class));
            }
        });
//        button2.setOnClickListener(
//                new Button.OnClickListener() {
//                    public void onClick(View v) {
//                        button2.setText("ON");
//                        button2.getBackground().setColorFilter(Color.parseColor("#003662"), PorterDuff.Mode.MULTIPLY);
//                        button2.setTextColor(WHITE);
//                        button3.setText("News");
//                        button3.setTextColor(BLACK);
//                        button3.getBackground().setColorFilter(Color.LTGRAY, PorterDuff.Mode.MULTIPLY);
//
//                        while (button2.isSelected()) {
//                            button2.isEnabled();
//                        }
//                        button3.isEnabled();
//                        while (button3.isSelected()) {
//                            button3.isEnabled();
//                        }
//                        button2.isEnabled();
//                        button2.setClickable(true);
//                        button3.setClickable(true);
//
//                    }
//                }
//        );
//
//
//        button3.setOnClickListener(
//                new Button.OnClickListener() {
//                    public void onClick(View v) {
//                        button3.setText("OFF");
//                        button3.getBackground().setColorFilter(Color.parseColor("#2B292A"), PorterDuff.Mode.MULTIPLY);
//                        button3.setTextColor(WHITE);
//                        button2.setText("News");
//                        button2.setTextColor(BLACK);
//                        button2.getBackground().setColorFilter(Color.LTGRAY, PorterDuff.Mode.MULTIPLY);
//
//                        while (button3.isSelected()) {
//                            button3.isEnabled();
//                        }
//                        button2.isEnabled();
//                        while (button2.isSelected()) {
//                            button2.isEnabled();
//                        }
//                        button3.isEnabled();
//                        button3.setClickable(true);
//                        button2.setClickable(true);
//
//                    }
//                }
//
//        );
//
//        // third row of buttons
//
//        button4.setOnClickListener(
//                new Button.OnClickListener() {
//                    public void onClick(View v) {
//                        button4.setText("ON");
//                        button4.getBackground().setColorFilter(Color.parseColor("#003662"), PorterDuff.Mode.MULTIPLY);
//                        button4.setTextColor(WHITE);
//                        button4.setTextSize(30);
//                        button5.setText("Notifications");
//                        button5.setTextColor(BLACK);
//                        button5.getBackground().setColorFilter(Color.LTGRAY, PorterDuff.Mode.MULTIPLY);
//                        button5.setTextSize(23);
//
//                        while (button4.isSelected()) {
//                            button4.isEnabled();
//                        }
//                        button5.isEnabled();
//                        while (button5.isSelected()) {
//                            button5.isEnabled();
//                        }
//                        button4.isEnabled();
//                        button4.setClickable(true);
//                        button5.setClickable(true);
//
//                    }
//                }
//        );
//
//
//        button5.setOnClickListener(
//                new Button.OnClickListener() {
//                    public void onClick(View v) {
//                        button5.setText("OFF");
//                        button5.getBackground().setColorFilter(Color.parseColor("#2B292A"), PorterDuff.Mode.MULTIPLY);
//                        button5.setTextSize(30);
//                        button5.setTextColor(WHITE);
//                        button4.setText("Notifications");
//                        button4.setTextSize(23);
//                        button4.setTextColor(BLACK);
//                        button4.getBackground().setColorFilter(Color.LTGRAY, PorterDuff.Mode.MULTIPLY);
//
//                        while (button5.isSelected()) {
//                            button5.isEnabled();
//                        }
//                        button4.isEnabled();
//                        while (button4.isSelected()) {
//                            button4.isEnabled();
//                        }
//                        button5.isEnabled();
//                        button5.setClickable(true);
//                        button4.setClickable(true);
//
//                    }
//                }
//
//        );


        bEconCalBlack.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(SettingsActivity.this, WebViewActivity.class));
            }
        });
        bNewsBlack.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {





                Intent intent = new Intent(SettingsActivity.this, HomePageNews.class);
                intent.putExtra("url1", url);

                startActivity(intent);
            }
        });
        bChangePassword.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent openchangepassword = new Intent(SettingsActivity.this,ChangePasswordActivity.class);
                startActivity(openchangepassword);
            }
        });

        signOut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                signOut();
            }
        });

        addAProfile.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(SettingsActivity.this, AddProfileActivity.class));
            }
        });
        ibSearch.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(SettingsActivity.this, GoogleSearchIntentActivity.class));
            }

        });

    }

    //sign out method
    public void signOut() {
        FirebaseAuth.getInstance().signOut();
    }








    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    public Action getIndexApiAction() {
        Thing object = new Thing.Builder()
                .setName("Settings Page") // TODO: Define a title for the content shown.
                // TODO: Make sure this auto-generated URL is correct.
                .setUrl(Uri.parse("http://[ENTER-YOUR-URL-HERE]"))
                .build();
        return new Action.Builder(Action.TYPE_VIEW)
                .setObject(object)
                .setActionStatus(Action.STATUS_TYPE_COMPLETED)
                .build();
    }

    @Override
    public void onStart() {
        super.onStart();
        firebaseAuth.addAuthStateListener(authListener);

    }

    @Override
    public void onStop() {
        super.onStop();
        if (authListener != null) {
            firebaseAuth.removeAuthStateListener(authListener);
        }

    }

}