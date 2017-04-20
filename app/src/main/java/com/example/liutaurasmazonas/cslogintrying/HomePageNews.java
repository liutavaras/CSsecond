package com.example.liutaurasmazonas.cslogintrying;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.Toast;

import java.io.InputStream;


public class HomePageNews extends AppCompatActivity {
    RecyclerView recyclerView;
    ImageButton button;


    @Override
    protected void onCreate(Bundle savedInstantState) {
        super.onCreate(savedInstantState);
        setContentView(R.layout.home_page_news);

        button = (ImageButton) findViewById(R.id.googleImgBtn);
        button.setTag(1);
        button.setOnClickListener(imageButtonHandler);


        recyclerView = (RecyclerView) findViewById(R.id.recyclerview);
        ReadRss readRss = new ReadRss(this, recyclerView);
        readRss.execute();

        ImageButton bSettingsBlack = (ImageButton) findViewById(R.id.ibSettingsBlack);
        ImageButton bEconCalBlack = (ImageButton) findViewById(R.id.ibEconCalBlack);
        ImageButton bLiveRates = (ImageButton) findViewById(R.id.ibLiveRates);
        ImageButton addAProfile = (ImageButton) findViewById(R.id.addAProfile);
        final Button bbutton = (Button) findViewById(R.id.button2);

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


        bbutton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                Intent a = getIntent();
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

                String url1 = a.getStringExtra("url");
                String url2 = b.getStringExtra("url");
                String url3 = c.getStringExtra("url");
                String url4 = d.getStringExtra("url");
                String url5 = e.getStringExtra("url");
                String url6 = f.getStringExtra("url");
                String url7 = g.getStringExtra("url");
                String url8 = h.getStringExtra("url");
                String url9 = i.getStringExtra("url");
                String url10 = j.getStringExtra("url");
                String url11 = k.getStringExtra("url");
                String url12 = l.getStringExtra("url");
                String url13 = m.getStringExtra("url");
                String url14 = n.getStringExtra("url");
                String url15 = o.getStringExtra("url");
                String url16 = p.getStringExtra("url");
                String url17 = q.getStringExtra("url");
                String url18 = r.getStringExtra("url");
                String url19 = s.getStringExtra("url");
                String url20 = t.getStringExtra("url");
                String url21 = u.getStringExtra("url");
                String url22 = vv.getStringExtra("url");
                String url23 = w.getStringExtra("url");
                String url24 = x.getStringExtra("url");
                String url25 = y.getStringExtra("url");
                String url26 = z.getStringExtra("url");

//                Toast.makeText(HomePageNews.this,"nom est : "+url1 ,Toast.LENGTH_SHORT).show();

                if (url1 == null && url2 == null && url3 == null) {
                    Toast.makeText(getApplication(), "No new clients added!", Toast.LENGTH_SHORT).show();
                } else if (url1 != null) {
                    ImageButton ib = new ImageButton(HomePageNews.this);
                    ib.setImageResource(R.drawable.commoditiesbuttonfinalinverse2);
                    RelativeLayout rl = (RelativeLayout) findViewById(R.id.relativeLayout4);
                    RelativeLayout.LayoutParams lp = new RelativeLayout.LayoutParams(
                            RelativeLayout.LayoutParams.WRAP_CONTENT,
                            RelativeLayout.LayoutParams.WRAP_CONTENT);
                    lp.addRule(RelativeLayout.LEFT_OF, R.id.imageButton11);
                    lp.addRule(RelativeLayout.ALIGN_PARENT_LEFT);
                    rl.addView(ib, lp);
                    new HomePageNews.DownloadImageTask((ImageButton) findViewById(R.id.imageButton11))
                            .execute(url1);
                } else if (url2 != null) {
                    new HomePageNews.DownloadImageTask((ImageButton) findViewById(R.id.imageButton11))
                            .execute(url2);
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
            }
        });

    }

    View.OnClickListener imageButtonHandler = new View.OnClickListener() {

        public void onClick(View v) {
            button.setImageResource(R.drawable.circlesgooglegrey);

            if (((int) button.getTag()) == 1) {
                button.setImageResource(R.drawable.circlesgooglegrey);
                button.setTag(2);
            } else {
                button.setImageResource(R.drawable.circlesgreen);
                button.setTag(1);
            }
        }
    };


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

}
//hjk