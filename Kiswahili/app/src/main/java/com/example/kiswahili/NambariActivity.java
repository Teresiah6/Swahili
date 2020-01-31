package com.example.kiswahili;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class NambariActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList <Number> numbers = new ArrayList<Number>();


          //numbers.add ("Zero");
       // numbers.add(new Number("Zero", "Sufuri"));
        numbers.add(new Number("One", "Moja", R.drawable.number_one));
        numbers.add(new Number("Two", "Mbili", R.drawable.number_two));
        numbers.add(new Number ("Three", "Tatu", R.drawable.number_three));
        numbers.add(new Number("Four", "Nne", R.drawable.number_four));
        numbers.add(new Number("five", "Tano", R.drawable.number_five));
        numbers.add(new Number ("six", "Sita", R.drawable.number_six));
        numbers.add(new Number("seven", "Saba", R.drawable.number_seven));
        numbers.add(new Number("eight", "Nane", R.drawable.number_eight));
        numbers.add (new Number("nine", "Tisa", R.drawable.number_nine));
        numbers.add(new Number("ten", "kumi", R.drawable.number_ten));



        NumberAdapter adapter = new NumberAdapter(this,numbers, R.color.category_nambari);
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
