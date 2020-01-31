package com.example.kiswahili;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public TextView familia;
    public  TextView misemo;
    public  TextView nambari;
    public  TextView rangi;
    public TextView alphabet;
    public TextView greeting;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        familia = findViewById(R.id.Familia);
        familia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent familiaIntent = new Intent (MainActivity.this, FamiliaActivity.class);

                startActivity(familiaIntent);
            }
        });

        misemo = findViewById(R.id.Misemo);
        misemo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent misemoIntent = new Intent (MainActivity.this, MisemoActivity.class);

                startActivity(misemoIntent);
            }
        });
        nambari = findViewById(R.id.Nambari);
        nambari.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent nambariIntent = new Intent (MainActivity.this, NambariActivity.class);

                startActivity(nambariIntent);


            }
        });

        rangi = findViewById(R.id.Rangi);
        rangi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent rangiIntent = new Intent (MainActivity.this, RangiActivity.class);

                startActivity(rangiIntent);
            }
        });



    }

}