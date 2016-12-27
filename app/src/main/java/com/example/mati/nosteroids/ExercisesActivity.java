package com.example.mati.nosteroids;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

public class ExercisesActivity extends AppCompatActivity {
    Button bChest, bBack, bLegs, bBiceps, bTriceps, bShoulders, bAbs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercises);

        bChest = (Button) findViewById(R.id.bChest);
        bChest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getBaseContext(), ChestActivity.class);
                startActivity(intent);
            }
        });
        bBack = (Button) findViewById(R.id.bBack);
        bBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getBaseContext(), BackActivity.class);
                startActivity(intent);
            }
        });

        bLegs = (Button) findViewById(R.id.bLegs);
        bLegs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getBaseContext(), LegsActivity.class);
                startActivity(intent);
            }
        });


        bBiceps = (Button) findViewById(R.id.bBiceps);
        bBiceps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getBaseContext(), BicepsActivity.class);
                startActivity(intent);
            }
        });


        bTriceps = (Button) findViewById(R.id.bTriceps);
        bTriceps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getBaseContext(), TricepsActivity.class);
                startActivity(intent);
            }
        });


        bShoulders = (Button) findViewById(R.id.bShoulders);
        bShoulders.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getBaseContext(), ShouldersActivity.class);
                startActivity(intent);
            }
        });


        bAbs = (Button) findViewById(R.id.bAbs);
        bAbs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getBaseContext(), AbsActivity.class);
                startActivity(intent);
            }
        });

    }
}