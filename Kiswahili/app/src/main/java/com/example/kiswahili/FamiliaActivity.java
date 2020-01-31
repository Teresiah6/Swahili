package com.example.kiswahili;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class FamiliaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Number> numbers = new ArrayList<Number>();


        //numbers.add ("Zero");
        numbers.add(new Number("Father", "Baba", R.drawable.family_father));
        numbers.add(new Number("Mother", "Mother", R.drawable.family_mother));
        numbers.add(new Number("Son", "Mwana", R.drawable.family_son));
        numbers.add(new Number ("Daughter", "Binti", R.drawable.family_daughter));
        numbers.add(new Number("Grandmother", "Nyanya", R.drawable.family_grandmother));
        numbers.add(new Number("Grandfather", "Babu", R.drawable.family_grandfather));
        numbers.add(new Number ("Cousin", "Binamu", R.drawable.family_older_brother));
        numbers.add(new Number("Niece", "mpwa", R.drawable.family_younger_sister));
        numbers.add(new Number("Nephew", "mpwa", R.drawable.family_younger_brother));
//        numbers.add(new Number("Mother-in-law", "Mama mkwe"));
//        numbers.add(new Number("Father-in-law", "Baba mkwe"));


        NumberAdapter adapter = new NumberAdapter(this,numbers, R.color.category_familia);
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
