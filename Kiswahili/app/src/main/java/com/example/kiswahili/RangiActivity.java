package com.example.kiswahili;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class RangiActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Number> numbers = new ArrayList<Number>();


        //numbers.add ("Zero");
        numbers.add(new Number("Red", "Nyekundu", R.drawable.color_red));
        numbers.add(new Number("Yellow", "Majano", R.drawable.color_mustard_yellow));
       // numbers.add(new Number("Orange", "Machungwa"));
        numbers.add(new Number ("Green", "Kijani Kibichi", R.drawable.color_green));
        numbers.add(new Number("Brown", "Kahawa", R.drawable.color_brown));
        numbers.add(new Number("Gray", "Kijivu", R.drawable.color_gray));
        numbers.add(new Number ("Black", "Nyeusi", R.drawable.color_black));
        numbers.add(new Number("White", "Nyeupe", R.drawable.color_white));
        //numbers.add(new Number("Purple", "Zambarau", ));
        //numbers.add(new Number("Blue", "Samawati"));


        NumberAdapter adapter = new NumberAdapter(this,numbers,R.color.category_rangi);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
//        LinearLayout rootView = (LinearLayout)findViewById(R.id.rootView);
//
//
//
//        for (int index = 0; index < number.size(); index ++){
//
//            TextView numberView = new TextView(this);
//            numberView.setText(number.get(index));
//            rootView.addView(numberView);
//

//        }


    }
}
