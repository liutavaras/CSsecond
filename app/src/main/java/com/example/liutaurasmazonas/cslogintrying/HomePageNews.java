package com.example.liutaurasmazonas.cslogintrying;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.AsyncTask;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.util.Base64;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Toast;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
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

//                    DatabaseReference databaseClients;
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

        final SharedPreferences sharedPref = PreferenceManager.getDefaultSharedPreferences(this);

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

        //Intializing Circles:
        final ImageButton plusgrey1 = (ImageButton) findViewById(R.id.plusgrey1);
        final ImageButton plusgrey2 = (ImageButton) findViewById(R.id.plusgrey2);
        final ImageButton plusgrey3 = (ImageButton) findViewById(R.id.plusgrey3);
        final ImageButton plusgrey4 = (ImageButton) findViewById(R.id.plusgrey4);
        final ImageButton plusgrey5 = (ImageButton) findViewById(R.id.plusgrey5);
        final ImageButton plusgrey6 = (ImageButton) findViewById(R.id.plusgrey6);

//        final SharedPreferences sharedPref = PreferenceManager.getDefaultSharedPreferences(this);
//        SharedPreferences.Editor editor = sharedPref.edit();
//        editor.putInt("drawableAgreen", R.drawable.a);
//        editor.commit();

//        final Drawable circlesplusgrey1 = getResources().getDrawable(R.drawable.circlesplusgrey1);
//        final Bitmap grey11 = ((BitmapDrawable) circlesplusgrey1).getBitmap();
//        Drawable circlesplusgrey2 = getResources().getDrawable(R.drawable.circlesplusgrey2);
//        Bitmap grey21 = ((BitmapDrawable) circlesplusgrey2).getBitmap();
//        Drawable circlesplusgrey3 = getResources().getDrawable(R.drawable.circlesplusgrey3);
//        Bitmap grey31 = ((BitmapDrawable) circlesplusgrey3).getBitmap();
//        Drawable circlesplusgrey4 = getResources().getDrawable(R.drawable.circlesplusgrey4);
//        Bitmap grey41 = ((BitmapDrawable) circlesplusgrey4).getBitmap();
//        Drawable circlesplusgrey5 = getResources().getDrawable(R.drawable.circlesplusgrey5);
//        Bitmap grey51 = ((BitmapDrawable) circlesplusgrey5).getBitmap();
//        Drawable circlesplusgrey6 = getResources().getDrawable(R.drawable.circlesplusgrey6);
//        Bitmap grey61 = ((BitmapDrawable) circlesplusgrey6).getBitmap();
//
//        BitmapDrawable Grey11asDrawable = new BitmapDrawable(getResources(), grey11);
//        plusgrey1.setBackgroundDrawable(Grey11asDrawable);
//
//        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
//        grey11.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
//        final byte[] grey11base64 = byteArrayOutputStream.toByteArray();
//        final String encodedGrey11 = Base64.encodeToString(grey11base64, Base64.DEFAULT);
//
//        Bitmap grey12 = BitmapFactory.decodeFile(encodedGrey11);


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



        final LinearLayout Row = (LinearLayout) findViewById(R.id.LinearLayoutScrollView);


                bbutton.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {


                        String gurl111 = sharedPref.getString("gurl1", "");
                        String gurl211 = sharedPref.getString("gurl2", "");
                        if (gurl111 == "" && gurl211 == "") {
                            Toast.makeText(HomePageNews.this, "Haha", Toast.LENGTH_LONG);
                        } else if (gurl111 != ""){
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey1).execute(gurl111);
                        } else if (gurl211 != ""){
                            new HomePageNews.DownloadImageTask((ImageButton) plusgrey1).execute(gurl211);
                        } else {
                            Toast.makeText(HomePageNews.this, "I dont know!", Toast.LENGTH_LONG);
                        }


//                      int drawableId = sharedPref.getInt("drawableId", 0);
//                      ImageButton imageButton = (ImageButton) findViewById(R.id.plusgrey1);
//                      imageButton.setBackgroundResource(drawableId);


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
//
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


                if (gurl1 == null && gurl2 == null && gurl3 == null && gurl4 == null && gurl5 == null && gurl6 == null  && gurl7 == null  && gurl8 == null  && gurl9 == null  && gurl10 == null  && gurl11 == null  && gurl12 == null  && gurl13 == null  && gurl14 == null  && gurl15 == null  && gurl16 == null  && gurl17 == null  && gurl18 == null  && gurl19 == null  && gurl20 == null  && gurl21 == null  && gurl22 == null  && gurl23 == null  && gurl24 == null  && gurl25 == null  && gurl26 == null &&
                        aurl1 == null && aurl2 == null && aurl3 == null && aurl4 == null && aurl5 == null && aurl6 == null  && aurl7 == null  && aurl8 == null  && aurl9 == null  && aurl10 == null  && aurl11 == null  && aurl12 == null  && aurl13 == null  && aurl14 == null  && aurl15 == null  && aurl16 == null  && aurl17 == null  && aurl18 == null  && aurl19 == null  && aurl20 == null  && aurl21 == null  && aurl22 == null  && aurl23 == null  && aurl24 == null  && aurl25 == null  && aurl26 == null &&
                          rurl1 == null && rurl2 == null && rurl3 == null && rurl4 == null && rurl5 == null && rurl6 == null  && rurl7 == null  && rurl8 == null  && rurl9 == null  && rurl10 == null  && rurl11 == null  && rurl12 == null  && rurl13 == null  && rurl14 == null  && rurl15 == null  && rurl16 == null  && rurl17 == null  && rurl18 == null  && rurl19 == null  && rurl20 == null  && rurl21 == null  && rurl22 == null  && rurl23 == null  && rurl24 == null  && rurl25 == null  && rurl26 == null) {
                    Toast.makeText(getApplication(), "No new clients added!", Toast.LENGTH_SHORT).show();
                } else if (gurl1 != null) {
                    SharedPreferences.Editor editor = sharedPref.edit();
                    editor.putString("gurl1", gurl1);
                    editor.commit();

                    plusgrey1.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                    startActivity(new Intent(HomePageNews.this, Circlegrey1.class));
                    }
                    });
                }else if (gurl2 != null) {
                    SharedPreferences.Editor editor = sharedPref.edit();
                    editor.putString("gurl2", gurl2);
                    editor.commit();

                    plusgrey1.setOnClickListener(new View.OnClickListener() {
                        public void onClick(View v) {
                            startActivity(new Intent(HomePageNews.this, Circlegrey1.class));
                        }
                    });
                } else if (gurl3 != null) {
                    SharedPreferences.Editor editor = sharedPref.edit();
                    editor.putString("gurl3", gurl3);
                    editor.commit();

                    plusgrey1.setOnClickListener(new View.OnClickListener() {
                        public void onClick(View v) {
                            startActivity(new Intent(HomePageNews.this, Circlegrey1.class));
                        }
                    });
                } else if (gurl4 != null) {
                    SharedPreferences.Editor editor = sharedPref.edit();
                    editor.putString("gurl4", gurl4);
                    editor.commit();

                    plusgrey1.setOnClickListener(new View.OnClickListener() {
                        public void onClick(View v) {
                            startActivity(new Intent(HomePageNews.this, Circlegrey1.class));
                        }
                    });
                } else if (gurl5 != null) {
                    SharedPreferences.Editor editor = sharedPref.edit();
                    editor.putString("gurl5", gurl5);
                    editor.commit();

                    plusgrey1.setOnClickListener(new View.OnClickListener() {
                        public void onClick(View v) {
                            startActivity(new Intent(HomePageNews.this, Circlegrey1.class));
                        }
                    });
                } else if (gurl6 != null) {
                    SharedPreferences.Editor editor = sharedPref.edit();
                    editor.putString("gurl6", gurl6);
                    editor.commit();

                    plusgrey1.setOnClickListener(new View.OnClickListener() {
                        public void onClick(View v) {
                            startActivity(new Intent(HomePageNews.this, Circlegrey1.class));
                        }
                    });
                } else if (gurl7 != null) {
                    SharedPreferences.Editor editor = sharedPref.edit();
                    editor.putString("gurl7", gurl7);
                    editor.commit();

                    plusgrey1.setOnClickListener(new View.OnClickListener() {
                        public void onClick(View v) {
                            startActivity(new Intent(HomePageNews.this, Circlegrey1.class));
                        }
                    });
                } else if (gurl8 != null) {
                    SharedPreferences.Editor editor = sharedPref.edit();
                    editor.putString("gurl8", gurl8);
                    editor.commit();

                    plusgrey1.setOnClickListener(new View.OnClickListener() {
                        public void onClick(View v) {
                            startActivity(new Intent(HomePageNews.this, Circlegrey1.class));
                        }
                    });
                } else if (gurl9 != null) {
                    SharedPreferences.Editor editor = sharedPref.edit();
                    editor.putString("gurl9", gurl9);
                    editor.commit();

                    plusgrey1.setOnClickListener(new View.OnClickListener() {
                        public void onClick(View v) {
                            startActivity(new Intent(HomePageNews.this, Circlegrey1.class));
                        }
                    });
                } else if (gurl10 != null) {
                    SharedPreferences.Editor editor = sharedPref.edit();
                    editor.putString("gurl10", gurl10);
                    editor.commit();

                    plusgrey1.setOnClickListener(new View.OnClickListener() {
                        public void onClick(View v) {
                            startActivity(new Intent(HomePageNews.this, Circlegrey1.class));
                        }
                    });
                } else if (gurl11 != null) {
                    SharedPreferences.Editor editor = sharedPref.edit();
                    editor.putString("gurl11", gurl11);
                    editor.commit();

                    plusgrey1.setOnClickListener(new View.OnClickListener() {
                        public void onClick(View v) {
                            startActivity(new Intent(HomePageNews.this, Circlegrey1.class));
                        }
                    });
                } else if (gurl12 != null) {
                    SharedPreferences.Editor editor = sharedPref.edit();
                    editor.putString("gurl2", gurl2);
                    editor.commit();

                    plusgrey1.setOnClickListener(new View.OnClickListener() {
                        public void onClick(View v) {
                            startActivity(new Intent(HomePageNews.this, Circlegrey1.class));
                        }
                    });
                } else if (gurl13 != null) {
                    SharedPreferences.Editor editor = sharedPref.edit();
                    editor.putString("gurl13", gurl13);
                    editor.commit();

                    plusgrey1.setOnClickListener(new View.OnClickListener() {
                        public void onClick(View v) {
                            startActivity(new Intent(HomePageNews.this, Circlegrey1.class));
                        }
                    });
                } else if (gurl14 != null) {
                    SharedPreferences.Editor editor = sharedPref.edit();
                    editor.putString("gurl14", gurl14);
                    editor.commit();

                    plusgrey1.setOnClickListener(new View.OnClickListener() {
                        public void onClick(View v) {
                            startActivity(new Intent(HomePageNews.this, Circlegrey1.class));
                        }
                    });
                } else if (gurl15 != null) {
                    SharedPreferences.Editor editor = sharedPref.edit();
                    editor.putString("gurl15", gurl15);
                    editor.commit();

                    plusgrey1.setOnClickListener(new View.OnClickListener() {
                        public void onClick(View v) {
                            startActivity(new Intent(HomePageNews.this, Circlegrey1.class));
                        }
                    });
                } else if (gurl16 != null) {
                    SharedPreferences.Editor editor = sharedPref.edit();
                    editor.putString("gurl16", gurl16);
                    editor.commit();

                    plusgrey1.setOnClickListener(new View.OnClickListener() {
                        public void onClick(View v) {
                            startActivity(new Intent(HomePageNews.this, Circlegrey1.class));
                        }
                    });
                } else if (gurl17 != null) {
                    SharedPreferences.Editor editor = sharedPref.edit();
                    editor.putString("gurl17", gurl17);
                    editor.commit();

                    plusgrey1.setOnClickListener(new View.OnClickListener() {
                        public void onClick(View v) {
                            startActivity(new Intent(HomePageNews.this, Circlegrey1.class));
                        }
                    });
                } else if (gurl18 != null) {
                    SharedPreferences.Editor editor = sharedPref.edit();
                    editor.putString("gurl18", gurl18);
                    editor.commit();

                    plusgrey1.setOnClickListener(new View.OnClickListener() {
                        public void onClick(View v) {
                            startActivity(new Intent(HomePageNews.this, Circlegrey1.class));
                        }
                    });
                } else if (gurl19 != null) {
                    SharedPreferences.Editor editor = sharedPref.edit();
                    editor.putString("gurl19", gurl19);
                    editor.commit();

                    plusgrey1.setOnClickListener(new View.OnClickListener() {
                        public void onClick(View v) {
                            startActivity(new Intent(HomePageNews.this, Circlegrey1.class));
                        }
                    });
                } else if (gurl20 != null) {
                    SharedPreferences.Editor editor = sharedPref.edit();
                    editor.putString("gurl20", gurl20);
                    editor.commit();

                    plusgrey1.setOnClickListener(new View.OnClickListener() {
                        public void onClick(View v) {
                            startActivity(new Intent(HomePageNews.this, Circlegrey1.class));
                        }
                    });
                } else if (gurl21 != null) {
                    SharedPreferences.Editor editor = sharedPref.edit();
                    editor.putString("gurl21", gurl21);
                    editor.commit();

                    plusgrey1.setOnClickListener(new View.OnClickListener() {
                        public void onClick(View v) {
                            startActivity(new Intent(HomePageNews.this, Circlegrey1.class));
                        }
                    });
                } else if (gurl21 != null) {
                    SharedPreferences.Editor editor = sharedPref.edit();
                    editor.putString("gurl21", gurl21);
                    editor.commit();

                    plusgrey1.setOnClickListener(new View.OnClickListener() {
                        public void onClick(View v) {
                            startActivity(new Intent(HomePageNews.this, Circlegrey1.class));
                        }
                    });
                } else if (gurl22 != null) {
                    SharedPreferences.Editor editor = sharedPref.edit();
                    editor.putString("gurl22", gurl23);
                    editor.commit();

                    plusgrey1.setOnClickListener(new View.OnClickListener() {
                        public void onClick(View v) {
                            startActivity(new Intent(HomePageNews.this, Circlegrey1.class));
                        }
                    });
                } else if (gurl24 != null) {
                    SharedPreferences.Editor editor = sharedPref.edit();
                    editor.putString("gurl24", gurl24);
                    editor.commit();

                    plusgrey1.setOnClickListener(new View.OnClickListener() {
                        public void onClick(View v) {
                            startActivity(new Intent(HomePageNews.this, Circlegrey1.class));
                        }
                    });
                } else if (gurl25 != null) {
                    SharedPreferences.Editor editor = sharedPref.edit();
                    editor.putString("gurl25", gurl25);
                    editor.commit();

                    plusgrey1.setOnClickListener(new View.OnClickListener() {
                        public void onClick(View v) {
                            startActivity(new Intent(HomePageNews.this, Circlegrey1.class));
                        }
                    });
                } else if (gurl26 != null) {
                    SharedPreferences.Editor editor = sharedPref.edit();
                    editor.putString("gurl26", gurl26);
                    editor.commit();

                    plusgrey1.setOnClickListener(new View.OnClickListener() {
                        public void onClick(View v) {
                            startActivity(new Intent(HomePageNews.this, Circlegrey1.class));
                        }
                    });
                } else if (aurl1 != null) {
                    SharedPreferences.Editor editor = sharedPref.edit();
                    editor.putString("aurl1", aurl1);
                    editor.commit();

                    plusgrey1.setOnClickListener(new View.OnClickListener() {
                        public void onClick(View v) {
                            startActivity(new Intent(HomePageNews.this, Circlegrey1.class));
                        }
                    });
                }else if (aurl2 != null) {
                    SharedPreferences.Editor editor = sharedPref.edit();
                    editor.putString("aurl2", aurl2);
                    editor.commit();

                    plusgrey1.setOnClickListener(new View.OnClickListener() {
                        public void onClick(View v) {
                            startActivity(new Intent(HomePageNews.this, Circlegrey1.class));
                        }
                    });
                } else if (aurl3 != null) {
                    SharedPreferences.Editor editor = sharedPref.edit();
                    editor.putString("aurl3", aurl3);
                    editor.commit();

                    plusgrey1.setOnClickListener(new View.OnClickListener() {
                        public void onClick(View v) {
                            startActivity(new Intent(HomePageNews.this, Circlegrey1.class));
                        }
                    });
                } else if (aurl4 != null) {
                    SharedPreferences.Editor editor = sharedPref.edit();
                    editor.putString("aurl4", aurl4);
                    editor.commit();

                    plusgrey1.setOnClickListener(new View.OnClickListener() {
                        public void onClick(View v) {
                            startActivity(new Intent(HomePageNews.this, Circlegrey1.class));
                        }
                    });
                } else if (aurl5 != null) {
                    SharedPreferences.Editor editor = sharedPref.edit();
                    editor.putString("aurl5", aurl5);
                    editor.commit();

                    plusgrey1.setOnClickListener(new View.OnClickListener() {
                        public void onClick(View v) {
                            startActivity(new Intent(HomePageNews.this, Circlegrey1.class));
                        }
                    });
                } else if (aurl6 != null) {
                    SharedPreferences.Editor editor = sharedPref.edit();
                    editor.putString("aurl6", aurl6);
                    editor.commit();

                    plusgrey1.setOnClickListener(new View.OnClickListener() {
                        public void onClick(View v) {
                            startActivity(new Intent(HomePageNews.this, Circlegrey1.class));
                        }
                    });
                } else if (aurl7 != null) {
                    SharedPreferences.Editor editor = sharedPref.edit();
                    editor.putString("aurl7", aurl7);
                    editor.commit();

                    plusgrey1.setOnClickListener(new View.OnClickListener() {
                        public void onClick(View v) {
                            startActivity(new Intent(HomePageNews.this, Circlegrey1.class));
                        }
                    });
                } else if (aurl8 != null) {
                    SharedPreferences.Editor editor = sharedPref.edit();
                    editor.putString("aurl8", aurl8);
                    editor.commit();

                    plusgrey1.setOnClickListener(new View.OnClickListener() {
                        public void onClick(View v) {
                            startActivity(new Intent(HomePageNews.this, Circlegrey1.class));
                        }
                    });
                } else if (aurl10 != null) {
                    SharedPreferences.Editor editor = sharedPref.edit();
                    editor.putString("aurl10", aurl10);
                    editor.commit();

                    plusgrey1.setOnClickListener(new View.OnClickListener() {
                        public void onClick(View v) {
                            startActivity(new Intent(HomePageNews.this, Circlegrey1.class));
                        }
                    });
                } else if (aurl11 != null) {
                    SharedPreferences.Editor editor = sharedPref.edit();
                    editor.putString("aurl11", aurl11);
                    editor.commit();

                    plusgrey1.setOnClickListener(new View.OnClickListener() {
                        public void onClick(View v) {
                            startActivity(new Intent(HomePageNews.this, Circlegrey1.class));
                        }
                    });
                } else if (aurl12 != null) {
                    SharedPreferences.Editor editor = sharedPref.edit();
                    editor.putString("aurl2", aurl2);
                    editor.commit();

                    plusgrey1.setOnClickListener(new View.OnClickListener() {
                        public void onClick(View v) {
                            startActivity(new Intent(HomePageNews.this, Circlegrey1.class));
                        }
                    });
                } else if (aurl13 != null) {
                    SharedPreferences.Editor editor = sharedPref.edit();
                    editor.putString("aurl3", aurl3);
                    editor.commit();

                    plusgrey1.setOnClickListener(new View.OnClickListener() {
                        public void onClick(View v) {
                            startActivity(new Intent(HomePageNews.this, Circlegrey1.class));
                        }
                    });
                } else if (aurl14 != null) {
                    SharedPreferences.Editor editor = sharedPref.edit();
                    editor.putString("aurl4", aurl4);
                    editor.commit();

                    plusgrey1.setOnClickListener(new View.OnClickListener() {
                        public void onClick(View v) {
                            startActivity(new Intent(HomePageNews.this, Circlegrey1.class));
                        }
                    });
                } else if (aurl15 != null) {
                    SharedPreferences.Editor editor = sharedPref.edit();
                    editor.putString("aurl5", aurl5);
                    editor.commit();

                    plusgrey1.setOnClickListener(new View.OnClickListener() {
                        public void onClick(View v) {
                            startActivity(new Intent(HomePageNews.this, Circlegrey1.class));
                        }
                    });
                } else if (aurl16 != null) {
                    SharedPreferences.Editor editor = sharedPref.edit();
                    editor.putString("aurl6", aurl6);
                    editor.commit();

                    plusgrey1.setOnClickListener(new View.OnClickListener() {
                        public void onClick(View v) {
                            startActivity(new Intent(HomePageNews.this, Circlegrey1.class));
                        }
                    });
                } else if (aurl17 != null) {
                    SharedPreferences.Editor editor = sharedPref.edit();
                    editor.putString("aurl7", aurl7);
                    editor.commit();

                    plusgrey1.setOnClickListener(new View.OnClickListener() {
                        public void onClick(View v) {
                            startActivity(new Intent(HomePageNews.this, Circlegrey1.class));
                        }
                    });
                }else if (aurl18 != null) {
                    SharedPreferences.Editor editor = sharedPref.edit();
                    editor.putString("aurl8", aurl8);
                    editor.commit();

                    plusgrey1.setOnClickListener(new View.OnClickListener() {
                        public void onClick(View v) {
                            startActivity(new Intent(HomePageNews.this, Circlegrey1.class));
                        }
                    });
                }else if (aurl19 != null) {
                    SharedPreferences.Editor editor = sharedPref.edit();
                    editor.putString("aurl9", aurl9);
                    editor.commit();

                    plusgrey1.setOnClickListener(new View.OnClickListener() {
                        public void onClick(View v) {
                            startActivity(new Intent(HomePageNews.this, Circlegrey1.class));
                        }
                    });
                }else if (aurl20 != null) {
                    SharedPreferences.Editor editor = sharedPref.edit();
                    editor.putString("aurl20", aurl20);
                    editor.commit();

                    plusgrey1.setOnClickListener(new View.OnClickListener() {
                        public void onClick(View v) {
                            startActivity(new Intent(HomePageNews.this, Circlegrey1.class));
                        }
                    });
                }else if (aurl21 != null) {
                    SharedPreferences.Editor editor = sharedPref.edit();
                    editor.putString("aurl21", aurl21);
                    editor.commit();

                    plusgrey1.setOnClickListener(new View.OnClickListener() {
                        public void onClick(View v) {
                            startActivity(new Intent(HomePageNews.this, Circlegrey1.class));
                        }
                    });
                }else if (aurl22 != null) {
                    SharedPreferences.Editor editor = sharedPref.edit();
                    editor.putString("aurl22", aurl22);
                    editor.commit();

                    plusgrey1.setOnClickListener(new View.OnClickListener() {
                        public void onClick(View v) {
                            startActivity(new Intent(HomePageNews.this, Circlegrey1.class));
                        }
                    });
                }else if (aurl23 != null) {
                    SharedPreferences.Editor editor = sharedPref.edit();
                    editor.putString("aurl23", aurl23);
                    editor.commit();

                    plusgrey1.setOnClickListener(new View.OnClickListener() {
                        public void onClick(View v) {
                            startActivity(new Intent(HomePageNews.this, Circlegrey1.class));
                        }
                    });
                }else if (aurl24 != null) {
                    SharedPreferences.Editor editor = sharedPref.edit();
                    editor.putString("aurl24", aurl24);
                    editor.commit();

                    plusgrey1.setOnClickListener(new View.OnClickListener() {
                        public void onClick(View v) {
                            startActivity(new Intent(HomePageNews.this, Circlegrey1.class));
                        }
                    });
                }else if (aurl25 != null) {
                    SharedPreferences.Editor editor = sharedPref.edit();
                    editor.putString("aurl25", aurl25);
                    editor.commit();

                    plusgrey1.setOnClickListener(new View.OnClickListener() {
                        public void onClick(View v) {
                            startActivity(new Intent(HomePageNews.this, Circlegrey1.class));
                        }
                    });
                }else if (aurl26 != null) {
                    SharedPreferences.Editor editor = sharedPref.edit();
                    editor.putString("aurl26", aurl26);
                    editor.commit();

                    plusgrey1.setOnClickListener(new View.OnClickListener() {
                        public void onClick(View v) {
                            startActivity(new Intent(HomePageNews.this, Circlegrey1.class));
                        }
                    });
                } else if (rurl1 != null) {
                    SharedPreferences.Editor editor = sharedPref.edit();
                    editor.putString("rurl1", rurl1);
                    editor.commit();

                    plusgrey1.setOnClickListener(new View.OnClickListener() {
                        public void onClick(View v) {
                            startActivity(new Intent(HomePageNews.this, Circlegrey1.class));
                        }
                    });
                }else if (rurl2 != null) {
                    SharedPreferences.Editor editor = sharedPref.edit();
                    editor.putString("rurl2", rurl2);
                    editor.commit();

                    plusgrey1.setOnClickListener(new View.OnClickListener() {
                        public void onClick(View v) {
                            startActivity(new Intent(HomePageNews.this, Circlegrey1.class));
                        }
                    });
                } else if (rurl3 != null) {
                    SharedPreferences.Editor editor = sharedPref.edit();
                    editor.putString("rurl3", rurl3);
                    editor.commit();

                    plusgrey1.setOnClickListener(new View.OnClickListener() {
                        public void onClick(View v) {
                            startActivity(new Intent(HomePageNews.this, Circlegrey1.class));
                        }
                    });
                } else if (rurl4 != null) {
                    SharedPreferences.Editor editor = sharedPref.edit();
                    editor.putString("rurl4", rurl4);
                    editor.commit();

                    plusgrey1.setOnClickListener(new View.OnClickListener() {
                        public void onClick(View v) {
                            startActivity(new Intent(HomePageNews.this, Circlegrey1.class));
                        }
                    });
                } else if (rurl5 != null) {
                    SharedPreferences.Editor editor = sharedPref.edit();
                    editor.putString("rurl5", rurl5);
                    editor.commit();

                    plusgrey1.setOnClickListener(new View.OnClickListener() {
                        public void onClick(View v) {
                            startActivity(new Intent(HomePageNews.this, Circlegrey1.class));
                        }
                    });
                } else if (rurl6 != null) {
                    SharedPreferences.Editor editor = sharedPref.edit();
                    editor.putString("rurl6", rurl6);
                    editor.commit();

                    plusgrey1.setOnClickListener(new View.OnClickListener() {
                        public void onClick(View v) {
                            startActivity(new Intent(HomePageNews.this, Circlegrey1.class));
                        }
                    });
                } else if (rurl7 != null) {
                    SharedPreferences.Editor editor = sharedPref.edit();
                    editor.putString("rurl7", rurl7);
                    editor.commit();

                    plusgrey1.setOnClickListener(new View.OnClickListener() {
                        public void onClick(View v) {
                            startActivity(new Intent(HomePageNews.this, Circlegrey1.class));
                        }
                    });
                } else if (rurl8 != null) {
                    SharedPreferences.Editor editor = sharedPref.edit();
                    editor.putString("rurl8", rurl8);
                    editor.commit();

                    plusgrey1.setOnClickListener(new View.OnClickListener() {
                        public void onClick(View v) {
                            startActivity(new Intent(HomePageNews.this, Circlegrey1.class));
                        }
                    });
                } else if (rurl10 != null) {
                    SharedPreferences.Editor editor = sharedPref.edit();
                    editor.putString("rurl10", rurl10);
                    editor.commit();

                    plusgrey1.setOnClickListener(new View.OnClickListener() {
                        public void onClick(View v) {
                            startActivity(new Intent(HomePageNews.this, Circlegrey1.class));
                        }
                    });
                } else if (rurl11 != null) {
                    SharedPreferences.Editor editor = sharedPref.edit();
                    editor.putString("rurl11", rurl11);
                    editor.commit();

                    plusgrey1.setOnClickListener(new View.OnClickListener() {
                        public void onClick(View v) {
                            startActivity(new Intent(HomePageNews.this, Circlegrey1.class));
                        }
                    });
                } else if (rurl12 != null) {
                    SharedPreferences.Editor editor = sharedPref.edit();
                    editor.putString("rurl2", rurl2);
                    editor.commit();

                    plusgrey1.setOnClickListener(new View.OnClickListener() {
                        public void onClick(View v) {
                            startActivity(new Intent(HomePageNews.this, Circlegrey1.class));
                        }
                    });
                } else if (rurl13 != null) {
                    SharedPreferences.Editor editor = sharedPref.edit();
                    editor.putString("rurl3", rurl3);
                    editor.commit();

                    plusgrey1.setOnClickListener(new View.OnClickListener() {
                        public void onClick(View v) {
                            startActivity(new Intent(HomePageNews.this, Circlegrey1.class));
                        }
                    });
                } else if (rurl14 != null) {
                    SharedPreferences.Editor editor = sharedPref.edit();
                    editor.putString("rurl4", rurl4);
                    editor.commit();

                    plusgrey1.setOnClickListener(new View.OnClickListener() {
                        public void onClick(View v) {
                            startActivity(new Intent(HomePageNews.this, Circlegrey1.class));
                        }
                    });
                } else if (rurl15 != null) {
                    SharedPreferences.Editor editor = sharedPref.edit();
                    editor.putString("rurl5", rurl5);
                    editor.commit();

                    plusgrey1.setOnClickListener(new View.OnClickListener() {
                        public void onClick(View v) {
                            startActivity(new Intent(HomePageNews.this, Circlegrey1.class));
                        }
                    });
                } else if (rurl16 != null) {
                    SharedPreferences.Editor editor = sharedPref.edit();
                    editor.putString("rurl6", rurl6);
                    editor.commit();

                    plusgrey1.setOnClickListener(new View.OnClickListener() {
                        public void onClick(View v) {
                            startActivity(new Intent(HomePageNews.this, Circlegrey1.class));
                        }
                    });
                } else if (rurl17 != null) {
                    SharedPreferences.Editor editor = sharedPref.edit();
                    editor.putString("rurl7", gurl7);
                    editor.commit();

                    plusgrey1.setOnClickListener(new View.OnClickListener() {
                        public void onClick(View v) {
                            startActivity(new Intent(HomePageNews.this, Circlegrey1.class));
                        }
                    });
                }else if (rurl18 != null) {
                    SharedPreferences.Editor editor = sharedPref.edit();
                    editor.putString("rurl8", rurl8);
                    editor.commit();

                    plusgrey1.setOnClickListener(new View.OnClickListener() {
                        public void onClick(View v) {
                            startActivity(new Intent(HomePageNews.this, Circlegrey1.class));
                        }
                    });
                }else if (rurl19 != null) {
                    SharedPreferences.Editor editor = sharedPref.edit();
                    editor.putString("rurl9", rurl9);
                    editor.commit();

                    plusgrey1.setOnClickListener(new View.OnClickListener() {
                        public void onClick(View v) {
                            startActivity(new Intent(HomePageNews.this, Circlegrey1.class));
                        }
                    });
                }else if (rurl20 != null) {
                    SharedPreferences.Editor editor = sharedPref.edit();
                    editor.putString("rurl20", rurl20);
                    editor.commit();

                    plusgrey1.setOnClickListener(new View.OnClickListener() {
                        public void onClick(View v) {
                            startActivity(new Intent(HomePageNews.this, Circlegrey1.class));
                        }
                    });
                }else if (rurl21 != null) {
                    SharedPreferences.Editor editor = sharedPref.edit();
                    editor.putString("rurl21", rurl21);
                    editor.commit();

                    plusgrey1.setOnClickListener(new View.OnClickListener() {
                        public void onClick(View v) {
                            startActivity(new Intent(HomePageNews.this, Circlegrey1.class));
                        }
                    });
                }else if (rurl22 != null) {
                    SharedPreferences.Editor editor = sharedPref.edit();
                    editor.putString("rurl22", rurl22);
                    editor.commit();

                    plusgrey1.setOnClickListener(new View.OnClickListener() {
                        public void onClick(View v) {
                            startActivity(new Intent(HomePageNews.this, Circlegrey1.class));
                        }
                    });
                }else if (rurl23 != null) {
                    SharedPreferences.Editor editor = sharedPref.edit();
                    editor.putString("rurl23", rurl23);
                    editor.commit();

                    plusgrey1.setOnClickListener(new View.OnClickListener() {
                        public void onClick(View v) {
                            startActivity(new Intent(HomePageNews.this, Circlegrey1.class));
                        }
                    });
                }else if (rurl24 != null) {
                    SharedPreferences.Editor editor = sharedPref.edit();
                    editor.putString("rurl24", rurl24);
                    editor.commit();

                    plusgrey1.setOnClickListener(new View.OnClickListener() {
                        public void onClick(View v) {
                            startActivity(new Intent(HomePageNews.this, Circlegrey1.class));
                        }
                    });
                }else if (rurl25 != null) {
                    SharedPreferences.Editor editor = sharedPref.edit();
                    editor.putString("rurl25", rurl25);
                    editor.commit();

                    plusgrey1.setOnClickListener(new View.OnClickListener() {
                        public void onClick(View v) {
                            startActivity(new Intent(HomePageNews.this, Circlegrey1.class));
                        }
                    });
                }else if (rurl26 != null) {
                    SharedPreferences.Editor editor = sharedPref.edit();
                    editor.putString("rurl26", rurl26);
                    editor.commit();

                    plusgrey1.setOnClickListener(new View.OnClickListener() {
                        public void onClick(View v) {
                            startActivity(new Intent(HomePageNews.this, Circlegrey1.class));
                        }
                    });
                }else{
                    Toast.makeText(HomePageNews.this,"BOOM",Toast.LENGTH_SHORT).show();
                }

































































                        if (ggurl1 == null && ggurl2 == null && ggurl3 == null && ggurl4 == null && ggurl5 == null && ggurl6 == null  && ggurl7 == null  && ggurl8 == null  && ggurl9 == null  && ggurl10 == null  && ggurl11 == null  && ggurl12 == null  && ggurl13 == null  && ggurl14 == null  && ggurl15 == null  && ggurl16 == null  && ggurl17 == null  && ggurl18 == null  && ggurl19 == null  && ggurl20 == null  && ggurl21 == null  && ggurl22 == null  && ggurl23 == null  && ggurl24 == null  && ggurl25 == null  && ggurl26 == null &&
                                aaurl1 == null && aaurl2 == null && aaurl3 == null && aaurl4 == null && aaurl5 == null && aaurl6 == null  && aaurl7 == null  && aaurl8 == null  && aaurl9 == null  && aaurl10 == null  && aaurl11 == null  && aaurl12 == null  && aaurl13 == null  && aaurl14 == null  && aaurl15 == null  && aaurl16 == null  && aaurl17 == null  && aaurl18 == null  && aaurl19 == null  && aaurl20 == null  && aaurl21 == null  && aaurl22 == null  && aaurl23 == null  && aaurl24 == null  && aaurl25 == null  && aaurl26 == null &&
                                rrurl1 == null && rrurl2 == null && rrurl3 == null && rrurl4 == null && rrurl5 == null && rrurl6 == null  && rrurl7 == null  && rrurl8 == null  && rrurl9 == null  && rrurl10 == null  && rrurl11 == null  && rrurl12 == null  && rrurl13 == null  && rrurl14 == null  && rrurl15 == null  && rrurl16 == null  && rrurl17 == null  && rrurl18 == null  && rrurl19 == null  && rrurl20 == null  && rrurl21 == null  && rrurl22 == null  && rrurl23 == null  && rrurl24 == null  && rrurl25 == null  && rrurl26 == null) {
                            Toast.makeText(getApplication(), "No new clients added!", Toast.LENGTH_SHORT).show();
                        } else if (ggurl1 != null) {
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("ggurl1", ggurl1);
                            editor.commit();

                            plusgrey1.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    startActivity(new Intent(HomePageNews.this, Circlegrey2.class));
                                }
                            });
                        }else if (ggurl2 != null) {
                        SharedPreferences.Editor editor = sharedPref.edit();
                        editor.putString("ggurl2", ggurl2);
                        editor.commit();

                        plusgrey1.setOnClickListener(new View.OnClickListener() {
                            public void onClick(View v) {
                                startActivity(new Intent(HomePageNews.this, Circlegrey2.class));
                            }
                        });
                    } else if (ggurl3 != null) {
                        SharedPreferences.Editor editor = sharedPref.edit();
                        editor.putString("ggurl3", ggurl3);
                        editor.commit();

                        plusgrey1.setOnClickListener(new View.OnClickListener() {
                            public void onClick(View v) {
                                startActivity(new Intent(HomePageNews.this, Circlegrey2.class));
                            }
                        });
                    } else if (ggurl4 != null) {
                        SharedPreferences.Editor editor = sharedPref.edit();
                        editor.putString("ggurl4", ggurl4);
                        editor.commit();

                        plusgrey1.setOnClickListener(new View.OnClickListener() {
                            public void onClick(View v) {
                                startActivity(new Intent(HomePageNews.this, Circlegrey2.class));
                            }
                        });
                    } else if (ggurl5 != null) {
                        SharedPreferences.Editor editor = sharedPref.edit();
                        editor.putString("ggurl5", ggurl5);
                        editor.commit();

                        plusgrey1.setOnClickListener(new View.OnClickListener() {
                            public void onClick(View v) {
                                startActivity(new Intent(HomePageNews.this, Circlegrey2.class));
                            }
                        });
                    } else if (ggurl6 != null) {
                        SharedPreferences.Editor editor = sharedPref.edit();
                        editor.putString("ggurl6", ggurl6);
                        editor.commit();

                        plusgrey1.setOnClickListener(new View.OnClickListener() {
                            public void onClick(View v) {
                                startActivity(new Intent(HomePageNews.this, Circlegrey2.class));
                            }
                        });
                    } else if (ggurl7 != null) {
                        SharedPreferences.Editor editor = sharedPref.edit();
                        editor.putString("ggurl7", ggurl7);
                        editor.commit();

                        plusgrey1.setOnClickListener(new View.OnClickListener() {
                            public void onClick(View v) {
                                startActivity(new Intent(HomePageNews.this, Circlegrey2.class));
                            }
                        });
                    } else if (ggurl8 != null) {
                        SharedPreferences.Editor editor = sharedPref.edit();
                        editor.putString("ggurl8", ggurl8);
                        editor.commit();

                        plusgrey1.setOnClickListener(new View.OnClickListener() {
                            public void onClick(View v) {
                                startActivity(new Intent(HomePageNews.this, Circlegrey2.class));
                            }
                        });
                    } else if (ggurl9 != null) {
                        SharedPreferences.Editor editor = sharedPref.edit();
                        editor.putString("ggurl9", ggurl9);
                        editor.commit();

                        plusgrey1.setOnClickListener(new View.OnClickListener() {
                            public void onClick(View v) {
                                startActivity(new Intent(HomePageNews.this, Circlegrey2.class));
                            }
                        });
                    } else if (ggurl10 != null) {
                        SharedPreferences.Editor editor = sharedPref.edit();
                        editor.putString("ggurl10", ggurl10);
                        editor.commit();

                        plusgrey1.setOnClickListener(new View.OnClickListener() {
                            public void onClick(View v) {
                                startActivity(new Intent(HomePageNews.this, Circlegrey2.class));
                            }
                        });
                    } else if (ggurl11 != null) {
                        SharedPreferences.Editor editor = sharedPref.edit();
                        editor.putString("ggurl11", ggurl11);
                        editor.commit();

                        plusgrey1.setOnClickListener(new View.OnClickListener() {
                            public void onClick(View v) {
                                startActivity(new Intent(HomePageNews.this, Circlegrey2.class));
                            }
                        });
                    } else if (ggurl12 != null) {
                        SharedPreferences.Editor editor = sharedPref.edit();
                        editor.putString("ggurl2", ggurl2);
                        editor.commit();

                        plusgrey1.setOnClickListener(new View.OnClickListener() {
                            public void onClick(View v) {
                                startActivity(new Intent(HomePageNews.this, Circlegrey2.class));
                            }
                        });
                    } else if (ggurl13 != null) {
                        SharedPreferences.Editor editor = sharedPref.edit();
                        editor.putString("ggurl13", ggurl13);
                        editor.commit();

                        plusgrey1.setOnClickListener(new View.OnClickListener() {
                            public void onClick(View v) {
                                startActivity(new Intent(HomePageNews.this, Circlegrey2.class));
                            }
                        });
                    } else if (ggurl14 != null) {
                        SharedPreferences.Editor editor = sharedPref.edit();
                        editor.putString("ggurl14", ggurl14);
                        editor.commit();

                        plusgrey1.setOnClickListener(new View.OnClickListener() {
                            public void onClick(View v) {
                                startActivity(new Intent(HomePageNews.this, Circlegrey2.class));
                            }
                        });
                    } else if (ggurl15 != null) {
                        SharedPreferences.Editor editor = sharedPref.edit();
                        editor.putString("ggurl15", ggurl15);
                        editor.commit();

                        plusgrey1.setOnClickListener(new View.OnClickListener() {
                            public void onClick(View v) {
                                startActivity(new Intent(HomePageNews.this, Circlegrey2.class));
                            }
                        });
                    } else if (ggurl16 != null) {
                        SharedPreferences.Editor editor = sharedPref.edit();
                        editor.putString("ggurl16", ggurl16);
                        editor.commit();

                        plusgrey1.setOnClickListener(new View.OnClickListener() {
                            public void onClick(View v) {
                                startActivity(new Intent(HomePageNews.this, Circlegrey2.class));
                            }
                        });
                    } else if (ggurl17 != null) {
                        SharedPreferences.Editor editor = sharedPref.edit();
                        editor.putString("ggurl17", ggurl17);
                        editor.commit();

                        plusgrey1.setOnClickListener(new View.OnClickListener() {
                            public void onClick(View v) {
                                startActivity(new Intent(HomePageNews.this, Circlegrey2.class));
                            }
                        });
                    } else if (ggurl18 != null) {
                        SharedPreferences.Editor editor = sharedPref.edit();
                        editor.putString("ggurl18", ggurl18);
                        editor.commit();

                        plusgrey1.setOnClickListener(new View.OnClickListener() {
                            public void onClick(View v) {
                                startActivity(new Intent(HomePageNews.this, Circlegrey2.class));
                            }
                        });
                    } else if (ggurl19 != null) {
                        SharedPreferences.Editor editor = sharedPref.edit();
                        editor.putString("ggurl19", ggurl19);
                        editor.commit();

                        plusgrey1.setOnClickListener(new View.OnClickListener() {
                            public void onClick(View v) {
                                startActivity(new Intent(HomePageNews.this, Circlegrey2.class));
                            }
                        });
                    } else if (ggurl20 != null) {
                        SharedPreferences.Editor editor = sharedPref.edit();
                        editor.putString("ggurl20", ggurl20);
                        editor.commit();

                        plusgrey1.setOnClickListener(new View.OnClickListener() {
                            public void onClick(View v) {
                                startActivity(new Intent(HomePageNews.this, Circlegrey2.class));
                            }
                        });
                    } else if (ggurl21 != null) {
                        SharedPreferences.Editor editor = sharedPref.edit();
                        editor.putString("ggurl21", ggurl21);
                        editor.commit();

                        plusgrey1.setOnClickListener(new View.OnClickListener() {
                            public void onClick(View v) {
                                startActivity(new Intent(HomePageNews.this, Circlegrey2.class));
                            }
                        });
                    } else if (ggurl22 != null) {
                        SharedPreferences.Editor editor = sharedPref.edit();
                        editor.putString("ggurl2", ggurl22);
                        editor.commit();

                        plusgrey1.setOnClickListener(new View.OnClickListener() {
                            public void onClick(View v) {
                                startActivity(new Intent(HomePageNews.this, Circlegrey2.class));
                            }
                        });
                    } else if (ggurl23 != null) {
                        SharedPreferences.Editor editor = sharedPref.edit();
                        editor.putString("ggurl23", ggurl23);
                        editor.commit();

                        plusgrey1.setOnClickListener(new View.OnClickListener() {
                            public void onClick(View v) {
                                startActivity(new Intent(HomePageNews.this, Circlegrey2.class));
                            }
                        });
                    } else if (ggurl24 != null) {
                        SharedPreferences.Editor editor = sharedPref.edit();
                        editor.putString("ggurl24", ggurl24);
                        editor.commit();

                        plusgrey1.setOnClickListener(new View.OnClickListener() {
                            public void onClick(View v) {
                                startActivity(new Intent(HomePageNews.this, Circlegrey2.class));
                            }
                        });
                    } else if (ggurl25 != null) {
                        SharedPreferences.Editor editor = sharedPref.edit();
                        editor.putString("ggurl25", ggurl25);
                        editor.commit();

                        plusgrey1.setOnClickListener(new View.OnClickListener() {
                            public void onClick(View v) {
                                startActivity(new Intent(HomePageNews.this, Circlegrey2.class));
                            }
                        });
                    } else if (ggurl26 != null) {
                        SharedPreferences.Editor editor = sharedPref.edit();
                        editor.putString("ggurl26", ggurl26);
                        editor.commit();

                        plusgrey1.setOnClickListener(new View.OnClickListener() {
                            public void onClick(View v) {
                                startActivity(new Intent(HomePageNews.this, Circlegrey2.class));
                            }
                        });
                    } else if (aaurl1 != null) {
                        SharedPreferences.Editor editor = sharedPref.edit();
                        editor.putString("aaurl1", aaurl1);
                        editor.commit();

                        plusgrey1.setOnClickListener(new View.OnClickListener() {
                            public void onClick(View v) {
                                startActivity(new Intent(HomePageNews.this, Circlegrey2.class));
                            }
                        });
                    }else if (aaurl2 != null) {
                        SharedPreferences.Editor editor = sharedPref.edit();
                        editor.putString("aaurl2", aaurl2);
                        editor.commit();

                        plusgrey1.setOnClickListener(new View.OnClickListener() {
                            public void onClick(View v) {
                                startActivity(new Intent(HomePageNews.this, Circlegrey2.class));
                            }
                        });
                    } else if (aaurl3 != null) {
                        SharedPreferences.Editor editor = sharedPref.edit();
                        editor.putString("aaurl3", aaurl3);
                        editor.commit();

                        plusgrey1.setOnClickListener(new View.OnClickListener() {
                            public void onClick(View v) {
                                startActivity(new Intent(HomePageNews.this, Circlegrey2.class));
                            }
                        });
                    } else if (aaurl4 != null) {
                        SharedPreferences.Editor editor = sharedPref.edit();
                        editor.putString("aaurl4", aaurl4);
                        editor.commit();

                        plusgrey1.setOnClickListener(new View.OnClickListener() {
                            public void onClick(View v) {
                                startActivity(new Intent(HomePageNews.this, Circlegrey2.class));
                            }
                        });
                    } else if (aaurl5 != null) {
                        SharedPreferences.Editor editor = sharedPref.edit();
                        editor.putString("aaurl5", aaurl5);
                        editor.commit();

                        plusgrey1.setOnClickListener(new View.OnClickListener() {
                            public void onClick(View v) {
                                startActivity(new Intent(HomePageNews.this, Circlegrey2.class));
                            }
                        });
                    } else if (aaurl6 != null) {
                        SharedPreferences.Editor editor = sharedPref.edit();
                        editor.putString("aaurl6", aaurl6);
                        editor.commit();

                        plusgrey1.setOnClickListener(new View.OnClickListener() {
                            public void onClick(View v) {
                                startActivity(new Intent(HomePageNews.this, Circlegrey2.class));
                            }
                        });
                    } else if (aaurl7 != null) {
                        SharedPreferences.Editor editor = sharedPref.edit();
                        editor.putString("aaurl7", aaurl7);
                        editor.commit();

                        plusgrey1.setOnClickListener(new View.OnClickListener() {
                            public void onClick(View v) {
                                startActivity(new Intent(HomePageNews.this, Circlegrey2.class));
                            }
                        });
                    } else if (aaurl8 != null) {
                        SharedPreferences.Editor editor = sharedPref.edit();
                        editor.putString("aaurl8", aaurl8);
                        editor.commit();

                        plusgrey1.setOnClickListener(new View.OnClickListener() {
                            public void onClick(View v) {
                                startActivity(new Intent(HomePageNews.this, Circlegrey2.class));
                            }
                        });
                    } else if (aaurl10 != null) {
                        SharedPreferences.Editor editor = sharedPref.edit();
                        editor.putString("aaurl10", aaurl10);
                        editor.commit();

                        plusgrey1.setOnClickListener(new View.OnClickListener() {
                            public void onClick(View v) {
                                startActivity(new Intent(HomePageNews.this, Circlegrey2.class));
                            }
                        });
                    } else if (aaurl11 != null) {
                        SharedPreferences.Editor editor = sharedPref.edit();
                        editor.putString("aaurl11", aaurl11);
                        editor.commit();

                        plusgrey1.setOnClickListener(new View.OnClickListener() {
                            public void onClick(View v) {
                                startActivity(new Intent(HomePageNews.this, Circlegrey2.class));
                            }
                        });
                    } else if (aaurl12 != null) {
                        SharedPreferences.Editor editor = sharedPref.edit();
                        editor.putString("aaurl2", aaurl2);
                        editor.commit();

                        plusgrey1.setOnClickListener(new View.OnClickListener() {
                            public void onClick(View v) {
                                startActivity(new Intent(HomePageNews.this, Circlegrey2.class));
                            }
                        });
                    } else if (aaurl13 != null) {
                        SharedPreferences.Editor editor = sharedPref.edit();
                        editor.putString("aaurl3", aaurl3);
                        editor.commit();

                        plusgrey1.setOnClickListener(new View.OnClickListener() {
                            public void onClick(View v) {
                                startActivity(new Intent(HomePageNews.this, Circlegrey2.class));
                            }
                        });
                    } else if (aaurl14 != null) {
                        SharedPreferences.Editor editor = sharedPref.edit();
                        editor.putString("aaurl4", aaurl4);
                        editor.commit();

                        plusgrey1.setOnClickListener(new View.OnClickListener() {
                            public void onClick(View v) {
                                startActivity(new Intent(HomePageNews.this, Circlegrey2.class));
                            }
                        });
                    } else if (aaurl15 != null) {
                        SharedPreferences.Editor editor = sharedPref.edit();
                        editor.putString("aaurl5", aaurl5);
                        editor.commit();

                        plusgrey1.setOnClickListener(new View.OnClickListener() {
                            public void onClick(View v) {
                                startActivity(new Intent(HomePageNews.this, Circlegrey2.class));
                            }
                        });
                    } else if (aaurl16 != null) {
                        SharedPreferences.Editor editor = sharedPref.edit();
                        editor.putString("aaurl6", aaurl6);
                        editor.commit();

                        plusgrey1.setOnClickListener(new View.OnClickListener() {
                            public void onClick(View v) {
                                startActivity(new Intent(HomePageNews.this, Circlegrey2.class));
                            }
                        });
                    } else if (aaurl17 != null) {
                        SharedPreferences.Editor editor = sharedPref.edit();
                        editor.putString("aaurl7", aaurl7);
                        editor.commit();

                        plusgrey1.setOnClickListener(new View.OnClickListener() {
                            public void onClick(View v) {
                                startActivity(new Intent(HomePageNews.this, Circlegrey2.class));
                            }
                        });
                    }else if (aaurl18 != null) {
                        SharedPreferences.Editor editor = sharedPref.edit();
                        editor.putString("aaurl8", aaurl8);
                        editor.commit();

                        plusgrey1.setOnClickListener(new View.OnClickListener() {
                            public void onClick(View v) {
                                startActivity(new Intent(HomePageNews.this, Circlegrey2.class));
                            }
                        });
                    }else if (aaurl19 != null) {
                        SharedPreferences.Editor editor = sharedPref.edit();
                        editor.putString("aaurl9", aaurl9);
                        editor.commit();

                        plusgrey1.setOnClickListener(new View.OnClickListener() {
                            public void onClick(View v) {
                                startActivity(new Intent(HomePageNews.this, Circlegrey2.class));
                            }
                        });
                    }else if (aaurl20 != null) {
                        SharedPreferences.Editor editor = sharedPref.edit();
                        editor.putString("aaurl20", aaurl20);
                        editor.commit();

                        plusgrey1.setOnClickListener(new View.OnClickListener() {
                            public void onClick(View v) {
                                startActivity(new Intent(HomePageNews.this, Circlegrey2.class));
                            }
                        });
                    }else if (aaurl21 != null) {
                        SharedPreferences.Editor editor = sharedPref.edit();
                        editor.putString("aaurl21", aaurl21);
                        editor.commit();

                        plusgrey1.setOnClickListener(new View.OnClickListener() {
                            public void onClick(View v) {
                                startActivity(new Intent(HomePageNews.this, Circlegrey2.class));
                            }
                        });
                    }else if (aaurl22 != null) {
                        SharedPreferences.Editor editor = sharedPref.edit();
                        editor.putString("aaurl22", aaurl22);
                        editor.commit();

                        plusgrey1.setOnClickListener(new View.OnClickListener() {
                            public void onClick(View v) {
                                startActivity(new Intent(HomePageNews.this, Circlegrey2.class));
                            }
                        });
                    }else if (aaurl23 != null) {
                        SharedPreferences.Editor editor = sharedPref.edit();
                        editor.putString("aaurl23", aaurl23);
                        editor.commit();

                        plusgrey1.setOnClickListener(new View.OnClickListener() {
                            public void onClick(View v) {
                                startActivity(new Intent(HomePageNews.this, Circlegrey2.class));
                            }
                        });
                    }else if (aaurl24 != null) {
                        SharedPreferences.Editor editor = sharedPref.edit();
                        editor.putString("aaurl24", aaurl24);
                        editor.commit();

                        plusgrey1.setOnClickListener(new View.OnClickListener() {
                            public void onClick(View v) {
                                startActivity(new Intent(HomePageNews.this, Circlegrey2.class));
                            }
                        });
                    }else if (aaurl25 != null) {
                        SharedPreferences.Editor editor = sharedPref.edit();
                        editor.putString("aaurl25", aaurl25);
                        editor.commit();

                        plusgrey1.setOnClickListener(new View.OnClickListener() {
                            public void onClick(View v) {
                                startActivity(new Intent(HomePageNews.this, Circlegrey2.class));
                            }
                        });
                    }else if (aaurl26 != null) {
                        SharedPreferences.Editor editor = sharedPref.edit();
                        editor.putString("aaurl26", aaurl26);
                        editor.commit();

                        plusgrey1.setOnClickListener(new View.OnClickListener() {
                            public void onClick(View v) {
                                startActivity(new Intent(HomePageNews.this, Circlegrey2.class));
                            }
                        });
                    } else if (rrurl1 != null) {
                        SharedPreferences.Editor editor = sharedPref.edit();
                        editor.putString("rrurl1", rrurl1);
                        editor.commit();

                        plusgrey1.setOnClickListener(new View.OnClickListener() {
                            public void onClick(View v) {
                                startActivity(new Intent(HomePageNews.this, Circlegrey2.class));
                            }
                        });
                    }else if (rrurl2 != null) {
                        SharedPreferences.Editor editor = sharedPref.edit();
                        editor.putString("rrurl2", rrurl2);
                        editor.commit();

                        plusgrey1.setOnClickListener(new View.OnClickListener() {
                            public void onClick(View v) {
                                startActivity(new Intent(HomePageNews.this, Circlegrey2.class));
                            }
                        });
                    } else if (rrurl3 != null) {
                        SharedPreferences.Editor editor = sharedPref.edit();
                        editor.putString("rrurl3", rrurl3);
                        editor.commit();

                        plusgrey1.setOnClickListener(new View.OnClickListener() {
                            public void onClick(View v) {
                                startActivity(new Intent(HomePageNews.this, Circlegrey2.class));
                            }
                        });
                    } else if (rrurl4 != null) {
                        SharedPreferences.Editor editor = sharedPref.edit();
                        editor.putString("rrurl4", rrurl4);
                        editor.commit();

                        plusgrey1.setOnClickListener(new View.OnClickListener() {
                            public void onClick(View v) {
                                startActivity(new Intent(HomePageNews.this, Circlegrey2.class));
                            }
                        });
                    } else if (rrurl5 != null) {
                        SharedPreferences.Editor editor = sharedPref.edit();
                        editor.putString("rrurl5", rrurl5);
                        editor.commit();

                        plusgrey1.setOnClickListener(new View.OnClickListener() {
                            public void onClick(View v) {
                                startActivity(new Intent(HomePageNews.this, Circlegrey2.class));
                            }
                        });
                    } else if (rrurl6 != null) {
                        SharedPreferences.Editor editor = sharedPref.edit();
                        editor.putString("rrurl6", rrurl6);
                        editor.commit();

                        plusgrey1.setOnClickListener(new View.OnClickListener() {
                            public void onClick(View v) {
                                startActivity(new Intent(HomePageNews.this, Circlegrey2.class));
                            }
                        });
                    } else if (rrurl7 != null) {
                        SharedPreferences.Editor editor = sharedPref.edit();
                        editor.putString("rrurl7", rrurl7);
                        editor.commit();

                        plusgrey1.setOnClickListener(new View.OnClickListener() {
                            public void onClick(View v) {
                                startActivity(new Intent(HomePageNews.this, Circlegrey2.class));
                            }
                        });
                    } else if (rrurl8 != null) {
                        SharedPreferences.Editor editor = sharedPref.edit();
                        editor.putString("rrurl8", rrurl8);
                        editor.commit();

                        plusgrey1.setOnClickListener(new View.OnClickListener() {
                            public void onClick(View v) {
                                startActivity(new Intent(HomePageNews.this, Circlegrey2.class));
                            }
                        });
                    } else if (rrurl10 != null) {
                        SharedPreferences.Editor editor = sharedPref.edit();
                        editor.putString("rrurl10", rrurl10);
                        editor.commit();

                        plusgrey1.setOnClickListener(new View.OnClickListener() {
                            public void onClick(View v) {
                                startActivity(new Intent(HomePageNews.this, Circlegrey2.class));
                            }
                        });
                    } else if (rrurl11 != null) {
                        SharedPreferences.Editor editor = sharedPref.edit();
                        editor.putString("rrurl11", rrurl11);
                        editor.commit();

                        plusgrey1.setOnClickListener(new View.OnClickListener() {
                            public void onClick(View v) {
                                startActivity(new Intent(HomePageNews.this, Circlegrey2.class));
                            }
                        });
                    } else if (rrurl12 != null) {
                        SharedPreferences.Editor editor = sharedPref.edit();
                        editor.putString("rrurl2", rrurl2);
                        editor.commit();

                        plusgrey1.setOnClickListener(new View.OnClickListener() {
                            public void onClick(View v) {
                                startActivity(new Intent(HomePageNews.this, Circlegrey2.class));
                            }
                        });
                    } else if (rrurl13 != null) {
                        SharedPreferences.Editor editor = sharedPref.edit();
                        editor.putString("rrurl3", rrurl3);
                        editor.commit();

                        plusgrey1.setOnClickListener(new View.OnClickListener() {
                            public void onClick(View v) {
                                startActivity(new Intent(HomePageNews.this, Circlegrey2.class));
                            }
                        });
                    } else if (rrurl14 != null) {
                        SharedPreferences.Editor editor = sharedPref.edit();
                        editor.putString("rrurl4", rrurl4);
                        editor.commit();

                        plusgrey1.setOnClickListener(new View.OnClickListener() {
                            public void onClick(View v) {
                                startActivity(new Intent(HomePageNews.this, Circlegrey2.class));
                            }
                        });
                    } else if (rrurl15 != null) {
                        SharedPreferences.Editor editor = sharedPref.edit();
                        editor.putString("rrurl5", rrurl5);
                        editor.commit();

                        plusgrey1.setOnClickListener(new View.OnClickListener() {
                            public void onClick(View v) {
                                startActivity(new Intent(HomePageNews.this, Circlegrey2.class));
                            }
                        });
                    } else if (rrurl16 != null) {
                        SharedPreferences.Editor editor = sharedPref.edit();
                        editor.putString("rrurl6", rrurl6);
                        editor.commit();

                        plusgrey1.setOnClickListener(new View.OnClickListener() {
                            public void onClick(View v) {
                                startActivity(new Intent(HomePageNews.this, Circlegrey2.class));
                            }
                        });
                    } else if (rrurl17 != null) {
                        SharedPreferences.Editor editor = sharedPref.edit();
                        editor.putString("rrurl7", ggurl7);
                        editor.commit();

                        plusgrey1.setOnClickListener(new View.OnClickListener() {
                            public void onClick(View v) {
                                startActivity(new Intent(HomePageNews.this, Circlegrey2.class));
                            }
                        });
                    }else if (rrurl18 != null) {
                        SharedPreferences.Editor editor = sharedPref.edit();
                        editor.putString("rrurl8", rrurl8);
                        editor.commit();

                        plusgrey1.setOnClickListener(new View.OnClickListener() {
                            public void onClick(View v) {
                                startActivity(new Intent(HomePageNews.this, Circlegrey2.class));
                            }
                        });
                    }else if (rrurl19 != null) {
                        SharedPreferences.Editor editor = sharedPref.edit();
                        editor.putString("rrurl9", rrurl9);
                        editor.commit();

                        plusgrey1.setOnClickListener(new View.OnClickListener() {
                            public void onClick(View v) {
                                startActivity(new Intent(HomePageNews.this, Circlegrey2.class));
                            }
                        });
                    }else if (rrurl20 != null) {
                        SharedPreferences.Editor editor = sharedPref.edit();
                        editor.putString("rrurl20", rrurl20);
                        editor.commit();

                        plusgrey1.setOnClickListener(new View.OnClickListener() {
                            public void onClick(View v) {
                                startActivity(new Intent(HomePageNews.this, Circlegrey2.class));
                            }
                        });
                    }else if (rrurl21 != null) {
                        SharedPreferences.Editor editor = sharedPref.edit();
                        editor.putString("rrurl21", rrurl21);
                        editor.commit();

                        plusgrey1.setOnClickListener(new View.OnClickListener() {
                            public void onClick(View v) {
                                startActivity(new Intent(HomePageNews.this, Circlegrey2.class));
                            }
                        });
                    }else if (rrurl22 != null) {
                        SharedPreferences.Editor editor = sharedPref.edit();
                        editor.putString("rrurl22", rrurl22);
                        editor.commit();

                        plusgrey1.setOnClickListener(new View.OnClickListener() {
                            public void onClick(View v) {
                                startActivity(new Intent(HomePageNews.this, Circlegrey2.class));
                            }
                        });
                    }else if (rrurl23 != null) {
                        SharedPreferences.Editor editor = sharedPref.edit();
                        editor.putString("rrurl23", rrurl23);
                        editor.commit();

                        plusgrey1.setOnClickListener(new View.OnClickListener() {
                            public void onClick(View v) {
                                startActivity(new Intent(HomePageNews.this, Circlegrey2.class));
                            }
                        });
                    }else if (rrurl24 != null) {
                        SharedPreferences.Editor editor = sharedPref.edit();
                        editor.putString("rrurl24", rrurl24);
                        editor.commit();

                        plusgrey1.setOnClickListener(new View.OnClickListener() {
                            public void onClick(View v) {
                                startActivity(new Intent(HomePageNews.this, Circlegrey2.class));
                            }
                        });
                    }else if (rrurl25 != null) {
                        SharedPreferences.Editor editor = sharedPref.edit();
                        editor.putString("rrurl25", rrurl25);
                        editor.commit();

                        plusgrey1.setOnClickListener(new View.OnClickListener() {
                            public void onClick(View v) {
                                startActivity(new Intent(HomePageNews.this, Circlegrey2.class));
                            }
                        });
                    }else if (rrurl26 != null) {
                        SharedPreferences.Editor editor = sharedPref.edit();
                        editor.putString("rrurl26", rrurl26);
                        editor.commit();

                        plusgrey1.setOnClickListener(new View.OnClickListener() {
                            public void onClick(View v) {
                                startActivity(new Intent(HomePageNews.this, Circlegrey2.class));
                            }
                        });
                    }else{
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