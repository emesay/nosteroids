package com.example.mati.nosteroids;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView bExercises, bTrainingPlans, bDiets, bSupplements, bCalculators, bChallenges;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bExercises = (ImageView) findViewById(R.id.bExercises);
        bExercises.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getBaseContext(), ExercisesActivity.class);
                startActivity(intent);
            }
        });

        bTrainingPlans = (ImageView)findViewById(R.id.bTrainingPlans);
       // bTrainingPlans.setImageResource(R.drawable.plany_treningowe);
        bTrainingPlans.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getBaseContext(), TrainingPlansActivity.class);
                startActivity(intent);
            }


        });

        bDiets = (ImageView)findViewById(R.id.bDiets);
        bDiets.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =  new Intent(getBaseContext(),DietsActivity.class );
                startActivity(intent);
            }
        });

        bSupplements = (ImageView)findViewById(R.id.bSupplements);
        bSupplements.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =  new Intent(getBaseContext(), SupplementsActivity.class);
                startActivity(intent);
            }
        });

        bCalculators = (ImageView)findViewById(R.id.bCalculators);
        bCalculators.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getBaseContext(), CalculatorsActivity.class);
                startActivity(intent);
            }
        });

        bChallenges = (ImageView)findViewById(R.id.bChallenges);
        bChallenges.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getBaseContext(), ChallengesActivity.class );
                startActivity(intent);
            }
        });

    }
}
