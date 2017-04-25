package com.example.liutaurasmazonas.cslogintrying;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Toast;

import java.io.InputStream;
import java.util.ArrayList;


public class HomePageNews extends AppCompatActivity {
    RecyclerView recyclerView;
    ImageButton button;


    private ImageButton plusgrey1;
    private ImageButton plusgrey2;
    private ImageButton plusgrey3;
    private ImageButton plusgrey4;
    private ImageButton plusgrey5;
    private ImageButton plusgrey6;

//    DatabaseReference databaseClients;

    //                    Bitmap bmp = BitmapFactory.decodeStream(url.openConnection().getInputStream());
//                    imageView.setImageBitmap(bmp);

//                    String urlas = "\"http://res.cloudinary.com/liutavaras/image/upload/v1492506105/a_oufued.png\"";
//                    try {
//                        URL url = new URL(urlas);
//                    } catch (MalformedURLException e) {
//                        Toast.makeText(HomePageNews.this, "blabla", Toast.LENGTH_LONG).show();
//                    }
//                    byte [] imageByte = Base64.decode(urlas, Base64.DEFAULT);
//                    Bitmap bmp = BitmapFactory.decodeStream(urlas.openConnection().getInputStream());
//                    imageView.setImageBitmap(bmp);

    @Override
    protected void onCreate(Bundle savedInstantState) {
        super.onCreate(savedInstantState);
        setContentView(R.layout.home_page_news);

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


        final ImageButton plusgrey1 = (ImageButton) findViewById(R.id.plusgrey1);
        ImageButton plusgrey2 = (ImageButton) findViewById(R.id.plusgrey2);
        ImageButton plusgrey3 = (ImageButton) findViewById(R.id.plusgrey3);
        ImageButton plusgrey4 = (ImageButton) findViewById(R.id.plusgrey4);
        ImageButton plusgrey5 = (ImageButton) findViewById(R.id.plusgrey5);
        ImageButton plusgrey6 = (ImageButton) findViewById(R.id.plusgrey6);

        SharedPreferences homepagenews = getSharedPreferences("MyPrefs", 0);

        plusgrey1.setResource(homepagenews).getString


        //Grey buttons navigations:
        plusgrey1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(HomePageNews.this, Circlegrey1.class));
            }
        });
        plusgrey2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(HomePageNews.this, Circlegrey2.class));
            }
        });
        plusgrey3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(HomePageNews.this, Circlegrey3.class));
            }
        });
        plusgrey4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(HomePageNews.this, Circlegrey4.class));
            }
        });
        plusgrey5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(HomePageNews.this, Circlegrey5.class));
            }
        });
        plusgrey6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(HomePageNews.this, Circlegrey6.class));
            }
        });

        final String photo1 = (String) ("http://res.cloudinary.com/liutavaras/image/upload/v1492506105/a_oufued.png");
        final String photo2 = (String) ("http://res.cloudinary.com/liutavaras/image/upload/v1492503937/b_eawxmg.png");
        final String photo3 = (String) ("http://res.cloudinary.com/liutavaras/image/upload/v1492506105/c_jouf2t.png");
        final String photo4 = (String) ("http://res.cloudinary.com/liutavaras/image/upload/v1492506105/d_isx7x3.png");

        final SharedPreferences prefs  = getSharedPreferences("MySavedHomeFile", MODE_PRIVATE);
        final String backgroundRes1 = prefs.getString("savedImageButton1", photo1);
        final String backgroundRes2 = prefs.getString("savedImageButton2" , photo2);
        final String backgroundRes3 = prefs.getString("savedImageButton3" , photo3);
        final LinearLayout Row = (LinearLayout) findViewById(R.id.LinearLayoutScrollView);


                bbutton.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {

                Intent intent1 = getIntent();
                Intent intent2 = getIntent();
                Intent intent3 = getIntent();
                Intent intent4 = getIntent();
                Intent intent5 = getIntent();
                Intent intent6 = getIntent();
                Intent intent7 = getIntent();
                Intent intent8 = getIntent();
                Intent intent9 = getIntent();
                Intent intent10 = getIntent();
                Intent intent11 = getIntent();
                Intent intent12 = getIntent();
                Intent intent13 = getIntent();
                Intent intent14 = getIntent();
                Intent intent15 = getIntent();
                Intent intent16 = getIntent();
                Intent intent17 = getIntent();
                Intent intent18 = getIntent();
                Intent intent19 = getIntent();
                Intent intent20 = getIntent();
                Intent intent21 = getIntent();
                Intent intent22 = getIntent();
                Intent intent23 = getIntent();
                Intent intent24 = getIntent();
                Intent intent25 = getIntent();
                Intent intent26 = getIntent();


                String gurl1 = intent1.getStringExtra("gurl1");
                String gurl2 = intent2.getStringExtra("gurl2");
                String gurl3 = intent3.getStringExtra("gurl3");
                String gurl4 = intent4.getStringExtra("gurl4");
                String gurl5 = intent5.getStringExtra("gurl5");
                String gurl6 = intent6.getStringExtra("gurl6");
                String gurl7 = intent7.getStringExtra("gurl7");
                String gurl8 = intent8.getStringExtra("gurl8");
                String gurl9 = intent9.getStringExtra("gurl9");
                String gurl10 = intent10.getStringExtra("gurl10");
                String gurl11 = intent11.getStringExtra("gurl11");
                String gurl12 = intent12.getStringExtra("gurl12");
                String gurl13 = intent13.getStringExtra("gurl13");
                String gurl14 = intent14.getStringExtra("gurl14");
                String gurl15 = intent15.getStringExtra("gurl15");
                String gurl16 = intent16.getStringExtra("gurl16");
                String gurl17 = intent17.getStringExtra("gurl17");
                String gurl18 = intent18.getStringExtra("gurl18");
                String gurl19 = intent19.getStringExtra("gurl19");
                String gurl20 = intent20.getStringExtra("gurl20");
                String gurl21 = intent21.getStringExtra("gurl21");
                String gurl22 = intent22.getStringExtra("gurl22");
                String gurl23 = intent23.getStringExtra("gurl23");
                String gurl24 = intent24.getStringExtra("gurl24");
                String gurl25 = intent25.getStringExtra("gurl25");
                String gurl26 = intent26.getStringExtra("gurl26");

                        String rurl1 = intent1.getStringExtra("rurl1");
                        String rurl2 = intent2.getStringExtra("rurl2");
                        String rurl3 = intent3.getStringExtra("rurl3");
                        String rurl4 = intent4.getStringExtra("rurl4");
                        String rurl5 = intent5.getStringExtra("rurl5");
                        String rurl6 = intent6.getStringExtra("rurl6");
                        String rurl7 = intent7.getStringExtra("rurl7");
                        String rurl8 = intent8.getStringExtra("rurl8");
                        String rurl9 = intent9.getStringExtra("rurl9");
                        String rurl10 = intent10.getStringExtra("rurl10");
                        String rurl11 = intent11.getStringExtra("rurl11");
                        String rurl12 = intent12.getStringExtra("rurl12");
                        String rurl13 = intent13.getStringExtra("rurl13");
                        String rurl14 = intent14.getStringExtra("rurl14");
                        String rurl15 = intent15.getStringExtra("rurl15");
                        String rurl16 = intent16.getStringExtra("rurl16");
                        String rurl17 = intent17.getStringExtra("rurl17");
                        String rurl18 = intent18.getStringExtra("rurl18");
                        String rurl19 = intent19.getStringExtra("rurl19");
                        String rurl20 = intent20.getStringExtra("rurl20");
                        String rurl21 = intent21.getStringExtra("gurl21");
                        String rurl22 = intent22.getStringExtra("gurl22");
                        String rurl23 = intent23.getStringExtra("gurl23");
                        String rurl24 = intent24.getStringExtra("gurl24");
                        String rurl25 = intent25.getStringExtra("gurl25");
                        String rurl26 = intent26.getStringExtra("gurl26");

                        String aurl1 = intent1.getStringExtra("aurl1");
                        String aurl2 = intent2.getStringExtra("aurl2");
                        String aurl3 = intent3.getStringExtra("aurl3");
                        String aurl4 = intent4.getStringExtra("aurl4");
                        String aurl5 = intent5.getStringExtra("aurl5");
                        String aurl6 = intent6.getStringExtra("aurl6");
                        String aurl7 = intent7.getStringExtra("aurl7");
                        String aurl8 = intent8.getStringExtra("aurl8");
                        String aurl9 = intent9.getStringExtra("aurl9");
                        String aurl10 = intent10.getStringExtra("aurl10");
                        String aurl11 = intent11.getStringExtra("aurl11");
                        String aurl12 = intent12.getStringExtra("aurl12");
                        String aurl13 = intent13.getStringExtra("aurl13");
                        String aurl14 = intent14.getStringExtra("aurl14");
                        String aurl15 = intent15.getStringExtra("aurl15");
                        String aurl16 = intent16.getStringExtra("aurl16");
                        String aurl17 = intent17.getStringExtra("aurl17");
                        String aurl18 = intent18.getStringExtra("aurl18");
                        String aurl19 = intent19.getStringExtra("aurl19");
                        String aurl20 = intent20.getStringExtra("aurl20");
                        String aurl21 = intent21.getStringExtra("aurl21");
                        String aurl22 = intent22.getStringExtra("aurl22");
                        String aurl23 = intent23.getStringExtra("aurl23");
                        String aurl24 = intent24.getStringExtra("aurl24");
                        String aurl25 = intent25.getStringExtra("aurl25");
                        String aurl26 = intent26.getStringExtra("aurl26");

//                Toast.makeText(HomePageNews.this,"nom est : "+url1 ,Toast.LENGTH_SHORT).show();


//                for (i = ur)
                if (gurl1 == null && gurl2 == null && gurl3 == null && gurl4 == null) {
                    Toast.makeText(getApplication(), "No new clients added!", Toast.LENGTH_SHORT).show();
                } else if (gurl1 != null) {
                    new HomePageNews.DownloadImageTask((ImageButton) plusgrey1).execute(gurl1);

//                    final ArrayList<String> Keys = new ArrayList<String>();
//                    for(int ii = 0; ii < 1; ii ++){
//                        Keys.add("Keys is : " + String.valueOf(ii));
//                    }
//
//                    int width = 240;
//                    int height = 240;
//
//                    final ImageButton[] my_button = new ImageButton[Keys.size()];
//
//                    for (int bt = 0; bt < Keys.size(); bt ++) {
//                        final int Index = bt;
//
//                        my_button[Index] = new ImageButton(HomePageNews.this);
//
//                        RelativeLayout.LayoutParams lp = new RelativeLayout.LayoutParams(width, height);
//                        lp.addRule(RelativeLayout.ALIGN_PARENT_LEFT, R.id.plusgrey6);
//
//                        my_button[Index].setLayoutParams(lp);
//                        my_button[Index].setId(Index);
////                      my_button[Index].setBackgroundResource(R.drawable.a);
//
//                        if (photo1 == null) {
//                            Toast.makeText(getApplication(), "No new photo!", Toast.LENGTH_SHORT).show();
//                        } else if (photo1 != null) {
//
//                            new HomePageNews.DownloadImageTask((ImageButton) my_button[Index])
//                                    .execute(photo1);
//                            Row.addView(my_button[Index]);
//                        }
//
//                        Toast.makeText(HomePageNews.this,"The client has been added!" ,Toast.LENGTH_LONG).show();
//
//

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
//
//                                  Toast.makeText(HomePageNews.this,"You have: " +key ,Toast.LENGTH_LONG).show();



//                                    ref.addListenerForSingleValueEvent(new ValueEventListener() {
//                                        @Override
//                                        public void onDataChange(DataSnapshot dataSnapshot) {
//                                            for (DataSnapshot child : children) {
//                                            HomePageNews clientName = child.getValue(HomePageNews.class);
//                                        }
//
//                                        @Override
//                                        public void onCancelled(FirebaseError firebaseError) {
//                                            Log.w("Firebase Error:", "onCancelled:", firebaseError.toException());
//                                            Toast.makeText(HomePageNews.this, "Failed to load question!", Toast.LENGTH_SHORT).show();
//                                        }
//
//                                    });
//


//                                }
//                            }
//                        });


//                                    String id = (String) getIntent().getExtras().get("id");
//                                    String name = databaseClients.child(id).child("name").toString();
//                                    Toast.makeText(HomePageNews.this,"In your hands you have: "+ name ,Toast.LENGTH_LONG).show();

//                        Row.addView(my_button[Index]);

//                    SharedPreferences.Editor editor = prefs.edit();
//                    editor.putString("savedImageButton1", (photo1));
//                    editor.apply();

                }else if (gurl2 != null) {
                    final ArrayList<String> Keys2 = new ArrayList<String>();
                    for(int ee = 0; ee < 1; ee ++){
                        Keys2.add("Keys is : " + String.valueOf(ee));
                    }

                    int width = 240;
                    int height = 240;

                    final ImageButton[] my_button2 = new ImageButton[Keys2.size()];

                    for (int bt2 = 0; bt2 < Keys2.size(); bt2 ++) {
                        final int Index2 = bt2;

                        my_button2[Index2] = new ImageButton(HomePageNews.this);

                        RelativeLayout.LayoutParams lp = new RelativeLayout.LayoutParams(width, height);
                        lp.addRule(RelativeLayout.ALIGN_PARENT_LEFT, R.id.plusgrey6);

                        my_button2[Index2].setLayoutParams(lp);
                        my_button2[Index2].setId(Index2);
//                      my_button2[Index2].setBackgroundResource(R.drawable.b);

                        if (photo2 == null) {
                            Toast.makeText(getApplication(), "No new photo!", Toast.LENGTH_SHORT).show();
                        } else if (photo2 != null) {

                            new HomePageNews.DownloadImageTask((ImageButton) my_button2[Index2])
                                    .execute(photo2);
                            Row.addView(my_button2[Index2]);
                        }

                        Toast.makeText(HomePageNews.this, "The client has been added!", Toast.LENGTH_LONG).show();


                        Row.addView(my_button2[Index2]);
                    }

                    SharedPreferences.Editor editor = prefs.edit();
                    editor.putString("savedImageButton2", getResources().getResourceName(R.drawable.b));
                    editor.apply();


                } else if (gurl3 != null) {
                    final ArrayList<String> Keys3 = new ArrayList<String>();
                    for(int tt = 0; tt < 1; tt ++){
                        Keys3.add("Keys is : " + String.valueOf(tt));
                    }

                    int width = 240;
                    int height = 240;

                    final ImageButton[] my_button3 = new ImageButton[Keys3.size()];

                    for (int bt3 = 0; bt3 < Keys3.size(); bt3 ++) {
                        final int Index3 = bt3;

                        my_button3[Index3] = new ImageButton(HomePageNews.this);

                        RelativeLayout.LayoutParams lp = new RelativeLayout.LayoutParams(width, height);
                        lp.addRule(RelativeLayout.ALIGN_PARENT_LEFT, R.id.plusgrey6);

                        my_button3[Index3].setLayoutParams(lp);
                        my_button3[Index3].setId(Index3);
//                      my_button3[Index3].setBackgroundResource(R.drawable.a);

                        if (photo3 == null) {
                            Toast.makeText(getApplication(), "No new photo!", Toast.LENGTH_SHORT).show();
                        } else if (photo3 != null) {

                            new HomePageNews.DownloadImageTask((ImageButton) my_button3[Index3])
                                    .execute(photo3);
                            Row.addView(my_button3[Index3]);
                        }

                        Toast.makeText(HomePageNews.this, "The client has been added!", Toast.LENGTH_LONG).show();


                        Row.addView(my_button3[Index3]);
                    }

                    SharedPreferences.Editor editor = prefs.edit();
                    editor.putString("savedImageButton3", getResources().getResourceName(R.drawable.c));
                    editor.apply();

                } else if (gurl4 != null) {
                    new HomePageNews.DownloadImageTask((ImageButton) findViewById(R.id.plusgrey6))
                            .execute(gurl4);
                } else if (gurl5 != null) {
                    new HomePageNews.DownloadImageTask((ImageButton) findViewById(R.id.plusgrey6))
                            .execute(gurl5);
                } else if (gurl6 != null) {
                    new HomePageNews.DownloadImageTask((ImageButton) findViewById(R.id.plusgrey6))
                            .execute(gurl6);
//                } else if (url7 != null) {
//                    new HomePageNews.DownloadImageTask((ImageButton) findViewById(R.id.imageButton11))
//                            .execute(url7);
//                } else if (url8 != null) {
//                    new HomePageNews.DownloadImageTask((ImageButton) findViewById(R.id.imageButton11))
//                            .execute(url8);
//                } else if (url9 != null) {
//                    new HomePageNews.DownloadImageTask((ImageButton) findViewById(R.id.imageButton11))
//                            .execute(url9);
//                } else if (url10 != null) {
//                    new HomePageNews.DownloadImageTask((ImageButton) findViewById(R.id.imageButton11))
//                            .execute(url10);
//                } else if (url11 != null) {
//                    new HomePageNews.DownloadImageTask((ImageButton) findViewById(R.id.imageButton11))
//                            .execute(url11);
//                } else if (url12 != null) {
//                    new HomePageNews.DownloadImageTask((ImageButton) findViewById(R.id.imageButton11))
//                            .execute(url12);
//                } else if (url13 != null) {
//                    new HomePageNews.DownloadImageTask((ImageButton) findViewById(R.id.imageButton11))
//                            .execute(url13);
//                } else if (url14 != null) {
//                    new HomePageNews.DownloadImageTask((ImageButton) findViewById(R.id.imageButton11))
//                            .execute(url14);
//                } else if (url15 != null) {
//                    new HomePageNews.DownloadImageTask((ImageButton) findViewById(R.id.imageButton11))
//                            .execute(url15);
//                } else if (url16 != null) {
//                    new HomePageNews.DownloadImageTask((ImageButton) findViewById(R.id.imageButton11))
//                            .execute(url16);
//                } else if (url17 != null) {
//                    new HomePageNews.DownloadImageTask((ImageButton) findViewById(R.id.imageButton11))
//                            .execute(url17);
//                } else if (url18 != null) {
//                    new HomePageNews.DownloadImageTask((ImageButton) findViewById(R.id.imageButton11))
//                            .execute(url18);
//                } else if (url19 != null) {
//                    new HomePageNews.DownloadImageTask((ImageButton) findViewById(R.id.imageButton11))
//                            .execute(url19);
//                } else if (url20 != null) {
//                    new HomePageNews.DownloadImageTask((ImageButton) findViewById(R.id.imageButton11))
//                            .execute(url20);
//                } else if (url21 != null) {
//                    new HomePageNews.DownloadImageTask((ImageButton) findViewById(R.id.imageButton11))
//                            .execute(url21);
//                } else if (url22 != null) {
//                    new HomePageNews.DownloadImageTask((ImageButton) findViewById(R.id.imageButton11))
//                            .execute(url22);
//                } else if (url23 != null) {
//                    new HomePageNews.DownloadImageTask((ImageButton) findViewById(R.id.imageButton11))
//                            .execute(url23);
//                } else if (url24 != null) {
//                    new HomePageNews.DownloadImageTask((ImageButton) findViewById(R.id.imageButton11))
//                            .execute(url24);
//                } else if (url25 != null) {
//                    new HomePageNews.DownloadImageTask((ImageButton) findViewById(R.id.imageButton11))
//                            .execute(url25);
//                } else if (url25 != null) {
//                    new HomePageNews.DownloadImageTask((ImageButton) findViewById(R.id.imageButton11))
//                            .execute(url25);
//                } else if (url26 != null) {
//                    new HomePageNews.DownloadImageTask((ImageButton) findViewById(R.id.imageButton11))
//                            .execute(url26);
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