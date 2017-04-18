//package com.example.liutaurasmazonas.cslogintrying;
//
//import android.support.v7.app.AppCompatActivity;
//import android.os.Bundle;
//import android.widget.ImageView;
//import android.widget.Spinner;
//
//import java.util.HashMap;
//
//public class MainActivity21 extends AppCompatActivity {
//
//    Spinner spinner6;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main21);
//    }
//
//    // stores the image database icons
//    private static Integer[] imageIconDatabase = { R.drawable.a,
//            R.drawable.b, R.drawable.c, R.drawable.d,
//            R.drawable.e, R.drawable.f, R.drawable.g };
//
//    // stores the image database names
//    private String[] imageNameDatabase = { "A", "B", "C", "D",
//            "E", "F", "G" };
//
//
//    private void initializeImageList() {
//        // TODO Auto-generated method stub
//        for (int i = 0; i < imageNameDatabase.length; i++) {
//
//            HashMap map = new HashMap<String, Object>();
//
//            map.put("Name", imageNameDatabase[i]);
//            map.put("Icon", imageIconDatabase[i]);
//            spinner6.add(map);
//        }
//        ImageView imageView = new ImageView(this);
//        imageView.setBackgroundResource((spinner6.get(0).get("Icon"));
//        spinner6.get(0).get("Name");
//    }
//
//
//
//
//}
