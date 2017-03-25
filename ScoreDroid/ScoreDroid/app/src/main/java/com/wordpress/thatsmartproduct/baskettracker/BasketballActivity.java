package com.wordpress.thatsmartproduct.baskettracker;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by wssyed on 2/11/2017.
 */
public class BasketballActivity extends AppCompatActivity {

    // Stores Team A score.
    private int scoreTeamA = 0;

    // Stores Team B score.
    private int scoreTeamB = 0;

    // Stores the value of the last button clicked for Team A.
    private int previousScoreTeamA = 0;

    // Stores the value of the last button clicked for Team B.
    private int previousScoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.basketball_activity);

        /**
         * Scores are set to 0 at the start of the application/game.
         * */
        displayForTeamA(0);
        displayForTeamB(0);

        /**
         * This button adds 3 points to the final score of team A.
         * */
        Button teamAIncrementBy3 = (Button) findViewById(R.id.team_a_increment_by_3);
        teamAIncrementBy3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                scoreTeamA = scoreTeamA + 3;
                displayForTeamA(scoreTeamA);
                previousScoreTeamA = 3;
            }
        });

        /**
         * This button adds 3 points to the final score of team B.
         * */
        Button teamBIncrementBy3 = (Button) findViewById(R.id.team_b_increment_by_3);
        teamBIncrementBy3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                scoreTeamB = scoreTeamB + 3;
                displayForTeamB(scoreTeamB);
                previousScoreTeamB = 3;
            }
        });

        /**
         * This button adds 2 points to the final score of team A.
         * */
        Button teamAIncrementBy2 = (Button) findViewById(R.id.team_a_increment_by_2);
        teamAIncrementBy2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                scoreTeamA = scoreTeamA + 2;
                displayForTeamA(scoreTeamA);
                previousScoreTeamA = 2;
            }
        });

        /**
         * This button adds 2 points to the final score of team B.
         * */
        Button teamBIncrementBy2 = (Button) findViewById(R.id.team_b_increment_by_2);
        teamBIncrementBy2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                scoreTeamB = scoreTeamB + 2;
                displayForTeamB(scoreTeamB);
                previousScoreTeamB = 2;
            }
        });

        /**
         * This button adds 1 point to the final score of team A.
         * */
        Button teamAFreeThrow = (Button) findViewById(R.id.team_a_free_throw);
        teamAFreeThrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                scoreTeamA = scoreTeamA + 1;
                displayForTeamA(scoreTeamA);
                previousScoreTeamA = 1;
            }
        });

        /**
         * This button adds 1 point to the final score of team B.
         * */
        Button teamBFreeThrow = (Button) findViewById(R.id.team_b_free_throw);
        teamBFreeThrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                scoreTeamB = scoreTeamB + 1;
                displayForTeamB(scoreTeamB);
                previousScoreTeamB = 1;
            }
        });

        /**
         * This button removes the last score action from  the final score of team A.
         * */
        Button teamAUndo = (Button) findViewById(R.id.team_a_undo);
        teamAUndo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                scoreTeamA -= previousScoreTeamA;
                displayForTeamA(scoreTeamA);
                previousScoreTeamA = 0;
            }
        });

        /**
         * This button removes the last score action from  the final score of team B.
         * */
        Button teamBUndo = (Button) findViewById(R.id.team_b_undo);
        teamBUndo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                scoreTeamB -= previousScoreTeamB;
                displayForTeamB(scoreTeamB);
                previousScoreTeamB = 0;
            }
        });

        /**
         * The RESET button resets scores for both the teams to 0.
         */
        Button reset = (Button) findViewById(R.id.reset);
        reset.setText("reset");
        reset.setAllCaps(true);
        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                scoreTeamA = 0;
                scoreTeamB = 0;
                displayForTeamA(scoreTeamA);
                displayForTeamB(scoreTeamB);
                previousScoreTeamA = 0;
                previousScoreTeamB = 0;
            }
        });

    }


    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
}
