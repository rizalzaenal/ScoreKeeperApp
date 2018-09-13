package com.rizalzaenal.scorekeeperapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ScoreKeeperActivity extends AppCompatActivity {

    private TextView textViewScoreTeamA;
    private TextView textViewScoreTeamB;
    private TextView textViewRedCardTeamA;
    private TextView textViewRedCardTeamB;
    private Button buttonAddScoreTeamA;
    private Button buttonAddScoreTeamB;
    private Button buttonAddRedCardTeamA;
    private Button buttonAddRedCardTeamB;
    private Button buttonReset;

    private int scoreTeamA;
    private int scoreTeamB;
    private int redCardTeamA;
    private int redCardTeamB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score_keeper);

        textViewScoreTeamA = findViewById(R.id.tv_score_team_a);
        textViewScoreTeamB = findViewById(R.id.tv_score_team_b);
        textViewRedCardTeamA = findViewById(R.id.tv_red_card_team_a);
        textViewRedCardTeamB = findViewById(R.id.tv_red_card_team_b);
        buttonAddScoreTeamA = findViewById(R.id.btn_add_score_team_a);
        buttonAddScoreTeamB = findViewById(R.id.btn_add_score_team_b);
        buttonAddRedCardTeamA = findViewById(R.id.btn_add_red_card_team_a);
        buttonAddRedCardTeamB = findViewById(R.id.btn_add_red_card_team_b);
        buttonReset = findViewById(R.id.btn_reset);


        buttonAddScoreTeamA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scoreTeamA++;
                textViewScoreTeamA.setText(String.valueOf(scoreTeamA));

            }
        });

        buttonAddScoreTeamB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scoreTeamB++;
                textViewScoreTeamB.setText(String.valueOf(scoreTeamB));
            }
        });

        buttonAddRedCardTeamA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                redCardTeamA++;
                textViewRedCardTeamA.setText(String.valueOf(redCardTeamA));
            }
        });

        buttonAddRedCardTeamB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                redCardTeamB++;
                textViewRedCardTeamB.setText(String.valueOf(redCardTeamB));
            }
        });

        buttonReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scoreTeamA = 0;
                scoreTeamB = 0;
                redCardTeamA = 0;
                redCardTeamB = 0;

                textViewScoreTeamA.setText(String.valueOf(scoreTeamA));
                textViewScoreTeamB.setText(String.valueOf(scoreTeamB));
                textViewRedCardTeamA.setText(String.valueOf(redCardTeamA));
                textViewRedCardTeamB.setText(String.valueOf(redCardTeamB));
            }
        });
    }
}
