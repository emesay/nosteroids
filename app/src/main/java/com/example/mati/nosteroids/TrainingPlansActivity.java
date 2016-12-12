package com.example.mati.nosteroids;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class TrainingPlansActivity extends AppCompatActivity {
Button bFbw;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_training_plans);


        bFbw = (Button) findViewById(R.id.bFbw);
        bFbw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getBaseContext(), ChallengesActivity.class );
                startActivity(intent);
            }
        });

    }
}
