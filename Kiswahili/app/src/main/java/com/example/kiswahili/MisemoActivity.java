package com.example.kiswahili;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MisemoActivity extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Number> numbers = new ArrayList<Number>();


        //numbers.add ("Zero");
        numbers.add(new Number("What's your name?", "Jina lako ni nani?/ Unaitwaje"));
        numbers.add(new Number("How are you?", "Uko aje?"));
        numbers.add(new Number("Where are you?", "Uko wapi?"));
        numbers.add(new Number("I love you", "Nakupenda"));
        numbers.add(new Number("I don't love you", "Sikupendi"));
        numbers.add(new Number ("Good night", "Usiku mwema"));
        numbers.add(new Number("Sleep well ", "Lala salama/ Lala unono"));
        numbers.add(new Number("See you later", "Tuonane baadaye"));
        numbers.add(new Number ("Please", "Tafadhali"));
        numbers.add(new Number("Sorry", "Pole"));
        numbers.add(new Number("Excuse me", "Samahani"));
        numbers.add(new Number("Yes", "Ndiyo"));
        numbers.add(new Number("No", "No/ La"));



        NumberAdapter adapter = new NumberAdapter(this,numbers, R.color.category_misemo);
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
