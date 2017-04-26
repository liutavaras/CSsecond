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
//        SharedPreferences.Editor editor = sharedPref.edit();
//        editor.putInt("drawableId", R.drawable.a);
//        editor.commit();

//        final String urlgrey = "http://res.cloudinary.com/liutavaras/image/upload/v1493215723/circlesplusgrey1_tflklm.png";
//        new HomePageNews.DownloadImageTask((ImageButton) plusgrey1).execute(urlgrey);
//        new HomePageNews.DownloadImageTask((ImageButton) plusgrey2).execute(urlgrey);
//        new HomePageNews.DownloadImageTask((ImageButton) plusgrey3).execute(urlgrey);
//        new HomePageNews.DownloadImageTask((ImageButton) plusgrey4).execute(urlgrey);
//        new HomePageNews.DownloadImageTask((ImageButton) plusgrey5).execute(urlgrey);
//        new HomePageNews.DownloadImageTask((ImageButton) plusgrey5).execute(urlgrey);

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
                        new HomePageNews.DownloadImageTask((ImageButton) plusgrey1).execute(gurl111);
                        new HomePageNews.DownloadImageTask((ImageButton) plusgrey1).execute(gurl211);

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


                final String gurl1 = intent1.getStringExtra("gurl1");
                final String gurl2 = intent2.getStringExtra("gurl2");
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
//                        String rurl1 = intent1.getStringExtra("rurl1");
//                        String rurl2 = intent2.getStringExtra("rurl2");
//                        String rurl3 = intent3.getStringExtra("rurl3");
//                        String rurl4 = intent4.getStringExtra("rurl4");
//                        String rurl5 = intent5.getStringExtra("rurl5");
//                        String rurl6 = intent6.getStringExtra("rurl6");
//                        String rurl7 = intent7.getStringExtra("rurl7");
//                        String rurl8 = intent8.getStringExtra("rurl8");
//                        String rurl9 = intent9.getStringExtra("rurl9");
//                        String rurl10 = intent10.getStringExtra("rurl10");
//                        String rurl11 = intent11.getStringExtra("rurl11");
//                        String rurl12 = intent12.getStringExtra("rurl12");
//                        String rurl13 = intent13.getStringExtra("rurl13");
//                        String rurl14 = intent14.getStringExtra("rurl14");
//                        String rurl15 = intent15.getStringExtra("rurl15");
//                        String rurl16 = intent16.getStringExtra("rurl16");
//                        String rurl17 = intent17.getStringExtra("rurl17");
//                        String rurl18 = intent18.getStringExtra("rurl18");
//                        String rurl19 = intent19.getStringExtra("rurl19");
//                        String rurl20 = intent20.getStringExtra("rurl20");
//                        String rurl21 = intent21.getStringExtra("gurl21");
//                        String rurl22 = intent22.getStringExtra("gurl22");
//                        String rurl23 = intent23.getStringExtra("gurl23");
//                        String rurl24 = intent24.getStringExtra("gurl24");
//                        String rurl25 = intent25.getStringExtra("gurl25");
//                        String rurl26 = intent26.getStringExtra("gurl26");
//
//                        String aurl1 = intent1.getStringExtra("aurl1");
//                        String aurl2 = intent2.getStringExtra("aurl2");
//                        String aurl3 = intent3.getStringExtra("aurl3");
//                        String aurl4 = intent4.getStringExtra("aurl4");
//                        String aurl5 = intent5.getStringExtra("aurl5");
//                        String aurl6 = intent6.getStringExtra("aurl6");
//                        String aurl7 = intent7.getStringExtra("aurl7");
//                        String aurl8 = intent8.getStringExtra("aurl8");
//                        String aurl9 = intent9.getStringExtra("aurl9");
//                        String aurl10 = intent10.getStringExtra("aurl10");
//                        String aurl11 = intent11.getStringExtra("aurl11");
//                        String aurl12 = intent12.getStringExtra("aurl12");
//                        String aurl13 = intent13.getStringExtra("aurl13");
//                        String aurl14 = intent14.getStringExtra("aurl14");
//                        String aurl15 = intent15.getStringExtra("aurl15");
//                        String aurl16 = intent16.getStringExtra("aurl16");
//                        String aurl17 = intent17.getStringExtra("aurl17");
//                        String aurl18 = intent18.getStringExtra("aurl18");
//                        String aurl19 = intent19.getStringExtra("aurl19");
//                        String aurl20 = intent20.getStringExtra("aurl20");
//                        String aurl21 = intent21.getStringExtra("aurl21");
//                        String aurl22 = intent22.getStringExtra("aurl22");
//                        String aurl23 = intent23.getStringExtra("aurl23");
//                        String aurl24 = intent24.getStringExtra("aurl24");
//                        String aurl25 = intent25.getStringExtra("aurl25");
//                        String aurl26 = intent26.getStringExtra("aurl26");

//                Toast.makeText(HomePageNews.this,"nom est : "+url1 ,Toast.LENGTH_SHORT).show();


                if (gurl1 == null && gurl2 == null && gurl3 == null && gurl4 == null) {
                    Toast.makeText(getApplication(), "No new clients added!", Toast.LENGTH_SHORT).show();
                } else if (gurl1 != null) {

                    final  SharedPreferences.Editor editor = sharedPref.edit();
                    editor.putString("gurl1", gurl1);
                    editor.commit();


                    plusgrey1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(HomePageNews.this, Circlegrey1.class));
            }
        });

//                    new HomePageNews.DownloadImageTask((ImageButton) plusgrey1).execute(gurl1);
//                    plusgrey1.setBackgroundResource(R.drawable.a);
//                        Drawable a = getResources().getDrawable(R.drawable.a);
//                        Bitmap amberA = ((BitmapDrawable) a).getBitmap();
//
//                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
//                    amberA.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
//                    byte[] AmberABase64 = byteArrayOutputStream .toByteArray();
//                    String encodedAmberA = Base64.encodeToString(AmberABase64, Base64.DEFAULT);
//
//                    SharedPreferences myPreference = getPreferences(MODE_PRIVATE);
//                    String imageS = myPreference.getString("imagePreferance", encodedGrey11);
//                    plusgrey1.setBackgroundResource(imageS);

//                    Bitmap imageB;
//                    if(!imageS.equals("")) {
//                        imageB = BitmapFactory.decodeFile(imageS);
//                    }


                }else if (gurl2 != null) {
//                    plusgrey1.setBackgroundResource(R.drawable.b);

                    final  SharedPreferences.Editor editor = sharedPref.edit();
                    editor.putString("gurl2", gurl2);
                    editor.commit();

                    plusgrey1.setOnClickListener(new View.OnClickListener() {
                        public void onClick(View v) {
                            startActivity(new Intent(HomePageNews.this, Circlegrey1.class));
                        }
                    });

                }

//                } else if (gurl3 != null) {
//                    plusgrey1.setBackgroundResource(R.drawable.c);
//
//                } else if (gurl4 != null) {
//                    new HomePageNews.DownloadImageTask((ImageButton) findViewById(R.id.plusgrey6))
//                            .execute(gurl4);
//                } else if (gurl5 != null) {
//                    new HomePageNews.DownloadImageTask((ImageButton) findViewById(R.id.plusgrey6))
//                            .execute(gurl5);
//                } else if (gurl6 != null) {
//                    new HomePageNews.DownloadImageTask((ImageButton) findViewById(R.id.plusgrey6))
//                            .execute(gurl6);
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
                else{
                    Toast.makeText(HomePageNews.this,"BOOM",Toast.LENGTH_SHORT).show();
                }



//                if (rurl1 == null && rurl2 == null && rurl3 == null && rurl4 == null) {
//                            Toast.makeText(getApplication(), "No new clients added!", Toast.LENGTH_SHORT).show();
//                } else if (rurl1 != null) {
//                    plusgrey2.setBackgroundResource(R.drawable.a);
//                }

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