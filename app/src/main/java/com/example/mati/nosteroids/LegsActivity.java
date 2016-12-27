package com.example.mati.nosteroids;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;

public class LegsActivity extends YouTubeBaseActivity {


    Button bPlay, bPlay2, bPlay3;
    private YouTubePlayerView youTubePlayerView, youTubePlayerView2, youTubePlayerView3;
    private YouTubePlayer.OnInitializedListener onInitializedListener;
    private YouTubePlayer.OnInitializedListener film2;
    private YouTubePlayer.OnInitializedListener film3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_legs);

        youTubePlayerView = (YouTubePlayerView) findViewById(R.id.ytChest);
        onInitializedListener = new YouTubePlayer.OnInitializedListener() {
            @Override
            public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {
                youTubePlayer.loadVideo("artFx1gn52s");
            }

            @Override
            public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {

            }
        };

        bPlay = (Button) findViewById(R.id.bPlay);
        bPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                youTubePlayerView.initialize("AIzaSyBSsm8BpCh_ISb0di22bbZ6xNm7hPcbzww", onInitializedListener);
            }
        });


        youTubePlayerView2 = (YouTubePlayerView) findViewById(R.id.ytChest2);
        film2 = new YouTubePlayer.OnInitializedListener() {
            @Override
            public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {
                youTubePlayer.loadVideo("c5KjZ_43owM");
            }

            @Override
            public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {

            }
        };

        bPlay2 = (Button) findViewById(R.id.bPlay2);
        bPlay2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                youTubePlayerView2.initialize("AIzaSyBSsm8BpCh_ISb0di22bbZ6xNm7hPcbzww", film2);
            }
        });


        youTubePlayerView3 = (YouTubePlayerView) findViewById(R.id.ytChest3);
        film3 = new YouTubePlayer.OnInitializedListener() {
            @Override
            public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {
                youTubePlayer.loadVideo("rdCcNWe7j1s");
            }

            @Override
            public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {

            }
        };


        bPlay3 = (Button) findViewById(R.id.bPlay3);
        bPlay3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                youTubePlayerView3.initialize("AIzaSyBSsm8BpCh_ISb0di22bbZ6xNm7hPcbzww", film3);
            }
        });



    }
}
