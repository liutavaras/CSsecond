package com.example.liutaurasmazonas.cslogintrying;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.HorizontalScrollView;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.Toast;

import com.daimajia.easing.linear.Linear;
import com.firebase.client.Firebase;
import com.firebase.client.FirebaseError;
import com.firebase.client.ValueEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.io.InputStream;
import java.util.ArrayList;

import static android.R.attr.id;
import static android.R.attr.layout_width;
import static java.security.AccessController.getContext;


public class HomePageNews extends AppCompatActivity {
    RecyclerView recyclerView;
    ImageButton button;

    DatabaseReference databaseClients;

//    public static final String SAVE = "MySavedHomeFile";

    @Override
    protected void onCreate(Bundle savedInstantState) {
        super.onCreate(savedInstantState);
        setContentView(R.layout.home_page_news);


        button = (ImageButton) findViewById(R.id.googleImgBtn);
        button.setTag(1);
        //button.setOnClickListener(imageButtonHandler);


        recyclerView = (RecyclerView) findViewById(R.id.recyclerview);
        ReadRss readRss = new ReadRss(this, recyclerView);
        readRss.execute();

        ImageButton bSettingsBlack = (ImageButton) findViewById(R.id.ibSettingsBlack);
        ImageButton bEconCalBlack = (ImageButton) findViewById(R.id.ibEconCalBlack);
        ImageButton bLiveRates = (ImageButton) findViewById(R.id.ibLiveRates);
        ImageButton addAProfile = (ImageButton) findViewById(R.id.addAProfile);
        final ImageButton bbutton = (ImageButton) findViewById(R.id.button2);

        bSettingsBlack.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(HomePageNews.this, SettingsActivity.class));
            }
        });
        bEconCalBlack.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(HomePageNews.this, WebViewActivity.class));
            }
        });
        bLiveRates.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(HomePageNews.this, sortingrates.class));
            }
        });

        addAProfile.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(HomePageNews.this, AddProfileActivity.class));
            }
        });


        final SharedPreferences prefs  = getSharedPreferences("MySavedHomeFile", MODE_PRIVATE);
        final int backgroundRes1 = prefs.getInt("savedImageButton1" , R.drawable.a);
        final int backgroundRes2 = prefs.getInt("savedImageButton2" , R.drawable.b);
        final LinearLayout Row = (LinearLayout) findViewById(R.id.LinearLayoutScrollView);


                bbutton.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {

                Intent intent = getIntent();
                Intent b = getIntent();
                Intent c = getIntent();
                Intent d = getIntent();
                Intent e = getIntent();
                Intent f = getIntent();
                Intent g = getIntent();
                Intent h = getIntent();
                Intent i = getIntent();
                Intent j = getIntent();
                Intent k = getIntent();
                Intent l = getIntent();
                Intent m = getIntent();
                Intent n = getIntent();
                Intent o = getIntent();
                Intent p = getIntent();
                Intent q = getIntent();
                Intent r = getIntent();
                Intent s = getIntent();
                Intent t = getIntent();
                Intent u = getIntent();
                Intent vv = getIntent();
                Intent w = getIntent();
                Intent x = getIntent();
                Intent y = getIntent();
                Intent z = getIntent();

                String url1 = intent.getStringExtra("url1");
                String url2 = b.getStringExtra("url2");
                String url3 = c.getStringExtra("url3");
                String url4 = d.getStringExtra("url4");
                String url5 = e.getStringExtra("url5");
                String url6 = f.getStringExtra("url6");
                String url7 = g.getStringExtra("url7");
                String url8 = h.getStringExtra("url8");
                String url9 = i.getStringExtra("url9");
                String url10 = j.getStringExtra("url10");
                String url11 = k.getStringExtra("url11");
                String url12 = l.getStringExtra("url12");
                String url13 = m.getStringExtra("url13");
                String url14 = n.getStringExtra("url14");
                String url15 = o.getStringExtra("url15");
                String url16 = p.getStringExtra("url16");
                String url17 = q.getStringExtra("url17");
                String url18 = r.getStringExtra("url18");
                String url19 = s.getStringExtra("url19");
                String url20 = t.getStringExtra("url20");
                String url21 = u.getStringExtra("url21");
                String url22 = vv.getStringExtra("url22");
                String url23 = w.getStringExtra("url23");
                String url24 = x.getStringExtra("url24");
                String url25 = y.getStringExtra("url25");
                String url26 = z.getStringExtra("url26");

//                Toast.makeText(HomePageNews.this,"nom est : "+url1 ,Toast.LENGTH_SHORT).show();

                if (url1 == null && url2 == null && url3 == null) {
                    Toast.makeText(getApplication(), "No new clients added!", Toast.LENGTH_SHORT).show();
                } else if (url1 != null) {
                    final ArrayList<String> Keys = new ArrayList<String>();
                    for(int ii = 0; ii < 1; ii ++){
                        Keys.add("Keys is : " + String.valueOf(ii));
                    }

                    LinearLayout Row = (LinearLayout) findViewById(R.id.LinearLayoutScrollView);

                    int width = 240;
                    int height = 240;

                    final ImageButton[] my_button = new ImageButton[Keys.size()];

                    for (int bt = 0; bt < Keys.size(); bt ++) {
                        final int Index = bt;

                        my_button[Index] = new ImageButton(HomePageNews.this);

                        RelativeLayout.LayoutParams lp = new RelativeLayout.LayoutParams(width, height);
                        lp.addRule(RelativeLayout.ALIGN_PARENT_LEFT, R.id.imageButton11);

                        my_button[Index].setLayoutParams(lp);
                        my_button[Index].setId(Index);
                        my_button[Index].setBackgroundResource(backgroundRes1);


//                        my_button[bt].setOnClickListener(new View.OnClickListener() {
//                            @Override
//                            public void onClick(View v) {
//                                if (my_button[Index].getId() == ((ImageButton) v).getId()) {
//                                    String key = (String) getIntent().getExtras().get("key");
//                                    String address = "https://console.firebase.google.com/project/cssecond-92a2d/database/data/clients/";
//                                    Firebase ref = new Firebase(address);
//
//                                    Intent intent = new Intent(HomePageNews.this, ClientsList.class);
//                                    intent.putExtra("key", key);
//                                    Toast.makeText(HomePageNews.this,"You have: " +key ,Toast.LENGTH_LONG).show();
//
//                                    ref.addListenerForSingleValueEvent(new ValueEventListener() {
//                                        @Override
//                                        public void onDataChange(com.firebase.client.DataSnapshot dataSnapshot) {
//                                         String ClientName = (String) dataSnapshot.child("key").getValue().toString();
//                                            Toast.makeText(HomePageNews.this,"You have: " + ClientName ,Toast.LENGTH_LONG).show();
//
//                                        }
//
//                                        @Override
//                                        public void onCancelled(FirebaseError firebaseError) {
//                                            Toast.makeText(HomePageNews.this,"You have: NOUT" ,Toast.LENGTH_LONG).show();
//                                        }
//                                    });
//                                    startActivity(intent);


//                                }
//                            }
//                        });
//                                    String id = (String) getIntent().getExtras().get("id");
//                                    String name = databaseClients.child(id).child("name").toString();
//                                    Toast.makeText(HomePageNews.this,"In your hands you have: "+ name ,Toast.LENGTH_LONG).show();

                        Row.addView(my_button[Index]);
                    }

                    SharedPreferences prefs = getSharedPreferences("MySavedHomeFile", MODE_PRIVATE);
                    SharedPreferences.Editor editor = prefs.edit();
                    editor.putString("savedImageButton", getResources().getResourceName(R.drawable.a));
                    editor.apply();

                }else if (url2 != null) {
                    final ArrayList<String> Keys2 = new ArrayList<String>();
                    for(int ee = 0; ee < 1; ee ++){
                        Keys2.add("Keys is : " + String.valueOf(ee));
                    }

                    LinearLayout Row2 = (LinearLayout) findViewById(R.id.LinearLayoutScrollView);

                    int width = 240;
                    int height = 240;

                    final ImageButton[] my_button2 = new ImageButton[Keys2.size()];

                    for (int bt2 = 0; bt2 < Keys2.size(); bt2 ++){
                        final int Index2 = bt2;

                        my_button2[Index2] = new ImageButton(HomePageNews.this);

                        RelativeLayout.LayoutParams lp = new RelativeLayout.LayoutParams(width, height);
                        lp.addRule(RelativeLayout.ALIGN_PARENT_LEFT, R.id.imageButton11);

                        my_button2[Index2].setLayoutParams(lp);
                        my_button2[Index2].setId(Index2);
                        my_button2[Index2].setBackgroundResource(backgroundRes2);

                        my_button2[bt2].setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                if (my_button2[Index2].getId() == ((ImageButton) v).getId()){
                                }
                            }
                        });

                        Row2.addView(my_button2[Index2]);
                    }


                    SharedPreferences prefs = getSharedPreferences("MySavedHomeFile", MODE_PRIVATE);
                    SharedPreferences.Editor editor = prefs.edit();
                    editor.putString("savedImageButton", getResources().getResourceName(R.drawable.b));
                    editor.apply();


                } else if (url3 != null) {
                    new HomePageNews.DownloadImageTask((ImageButton) findViewById(R.id.imageButton11))
                            .execute(url3);
                } else if (url4 != null) {
                    new HomePageNews.DownloadImageTask((ImageButton) findViewById(R.id.imageButton11))
                            .execute(url4);
                } else if (url5 != null) {
                    new HomePageNews.DownloadImageTask((ImageButton) findViewById(R.id.imageButton11))
                            .execute(url5);
                } else if (url6 != null) {
                    new HomePageNews.DownloadImageTask((ImageButton) findViewById(R.id.imageButton11))
                            .execute(url6);
                } else if (url7 != null) {
                    new HomePageNews.DownloadImageTask((ImageButton) findViewById(R.id.imageButton11))
                            .execute(url7);
                } else if (url8 != null) {
                    new HomePageNews.DownloadImageTask((ImageButton) findViewById(R.id.imageButton11))
                            .execute(url8);
                } else if (url9 != null) {
                    new HomePageNews.DownloadImageTask((ImageButton) findViewById(R.id.imageButton11))
                            .execute(url9);
                } else if (url10 != null) {
                    new HomePageNews.DownloadImageTask((ImageButton) findViewById(R.id.imageButton11))
                            .execute(url10);
                } else if (url11 != null) {
                    new HomePageNews.DownloadImageTask((ImageButton) findViewById(R.id.imageButton11))
                            .execute(url11);
                } else if (url12 != null) {
                    new HomePageNews.DownloadImageTask((ImageButton) findViewById(R.id.imageButton11))
                            .execute(url12);
                } else if (url13 != null) {
                    new HomePageNews.DownloadImageTask((ImageButton) findViewById(R.id.imageButton11))
                            .execute(url13);
                } else if (url14 != null) {
                    new HomePageNews.DownloadImageTask((ImageButton) findViewById(R.id.imageButton11))
                            .execute(url14);
                } else if (url15 != null) {
                    new HomePageNews.DownloadImageTask((ImageButton) findViewById(R.id.imageButton11))
                            .execute(url15);
                } else if (url16 != null) {
                    new HomePageNews.DownloadImageTask((ImageButton) findViewById(R.id.imageButton11))
                            .execute(url16);
                } else if (url17 != null) {
                    new HomePageNews.DownloadImageTask((ImageButton) findViewById(R.id.imageButton11))
                            .execute(url17);
                } else if (url18 != null) {
                    new HomePageNews.DownloadImageTask((ImageButton) findViewById(R.id.imageButton11))
                            .execute(url18);
                } else if (url19 != null) {
                    new HomePageNews.DownloadImageTask((ImageButton) findViewById(R.id.imageButton11))
                            .execute(url19);
                } else if (url20 != null) {
                    new HomePageNews.DownloadImageTask((ImageButton) findViewById(R.id.imageButton11))
                            .execute(url20);
                } else if (url21 != null) {
                    new HomePageNews.DownloadImageTask((ImageButton) findViewById(R.id.imageButton11))
                            .execute(url21);
                } else if (url22 != null) {
                    new HomePageNews.DownloadImageTask((ImageButton) findViewById(R.id.imageButton11))
                            .execute(url22);
                } else if (url23 != null) {
                    new HomePageNews.DownloadImageTask((ImageButton) findViewById(R.id.imageButton11))
                            .execute(url23);
                } else if (url24 != null) {
                    new HomePageNews.DownloadImageTask((ImageButton) findViewById(R.id.imageButton11))
                            .execute(url24);
                } else if (url25 != null) {
                    new HomePageNews.DownloadImageTask((ImageButton) findViewById(R.id.imageButton11))
                            .execute(url25);
                } else if (url25 != null) {
                    new HomePageNews.DownloadImageTask((ImageButton) findViewById(R.id.imageButton11))
                            .execute(url25);
                } else if (url26 != null) {
                    new HomePageNews.DownloadImageTask((ImageButton) findViewById(R.id.imageButton11))
                            .execute(url26);
//                }else if (url27 != null) {
//                    new HomePageNews.DownloadImageTask((ImageButton) findViewById(R.id.imageView9))
//                            .execute(url27);
//                }else if (url28 != null) {
//                    new HomePageNews.DownloadImageTask((ImageButton) findViewById(R.id.imageView9))
//                            .execute(url28);
//                }else if (url29 != null) {
//                    new HomePageNews.DownloadImageTask((ImageButton) findViewById(R.id.imageView9))
//                            .execute(url29);
//                }else if (url30 != null) {
//                    new HomePageNews.DownloadImageTask((ImageButton) findViewById(R.id.imageView9))
//                            .execute(url30);
//                }else if (url31 != null) {
//                    new HomePageNews.DownloadImageTask((ImageButton) findViewById(R.id.imageView9))
//                            .execute(url31);
//                }else if (url32 != null) {
//                    new HomePageNews.DownloadImageTask((ImageButton) findViewById(R.id.imageView9))
//                            .execute(url32);
//                }else if (url33 != null) {
//                    new HomePageNews.DownloadImageTask((ImageButton) findViewById(R.id.imageView9))
//                            .execute(url33);
                }
                else{
                    Toast.makeText(HomePageNews.this,"BOOM",Toast.LENGTH_SHORT).show();
                }
            }
        });

    }

//    View.OnClickListener imageButtonHandler = new View.OnClickListener() {
//
//        public void onClick(View v) {
//            button.setImageResource(R.drawable.circlesgooglegrey);
//
//            if (((int) button.getTag()) == 1) {
//                button.setImageResource(R.drawable.circlesgooglegrey);
//                button.setTag(2);
//            } else {
//                button.setImageResource(R.drawable.circlesgreen);
//                button.setTag(1);
//            }
//        }
//    };


    private class DownloadImageTask extends AsyncTask<String, Void, Bitmap> {
        ImageButton imageButton9;

        public DownloadImageTask(ImageButton imageButton9) {
            this.imageButton9 = imageButton9;
        }

        protected Bitmap doInBackground(String... urls) {
            String urldisplay = urls[0];
            Bitmap mIcon11 = null;
            try {
                InputStream in = new java.net.URL(urldisplay).openStream();
                mIcon11 = BitmapFactory.decodeStream(in);
            } catch (Exception e) {
                Log.e("Error", e.getMessage());
                e.printStackTrace();
            }
            return mIcon11;
        }

        protected void onPostExecute(Bitmap result) {
            imageButton9.setImageBitmap(result);


        }

    }


    ////                                        Intent b = getIntent();
////                                    String url2 = b.getStringExtra("url");
////                                    new HomePageNews.DownloadImageTask((ImageButton) findViewById(R.id.imageButton11))
////                                    .execute(url2);

}