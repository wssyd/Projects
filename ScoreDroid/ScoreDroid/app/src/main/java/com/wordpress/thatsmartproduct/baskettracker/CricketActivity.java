package com.wordpress.thatsmartproduct.baskettracker;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by IJ Syed Wasif Saleem on 2/12/2017.
 */

public class CricketActivity extends AppCompatActivity{
    // Stores Team A score.
    private int scoreTeamA = 0;

    // Stores Team B score.
    private int scoreTeamB = 0;

    // Records the number of wickets.
    private int wicketsTeamA = 0;

    private int wicketsTeamB = 0;

    // Records the number of overs completed.
    private int oversTeamA = 0;
    private int oversTeamB = 0;

    // Stores the value of the last button clicked for Team A.
    private int previousScoreTeamA = 0;

    // Stores the value of the last button clicked for Team B.
    private int previousScoreTeamB = 0;

    // Stores the value of the last Wickets.
    private int previousWicketTeamA = 0;
    private int previousWicketTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cricket_activity);

        /**
         * Scores and wickets are set to 0 at the start of the application/game.
         * */
        displayScoreForTeamA(0);
        displayWicketForTeamA(0);
        displayScoreForTeamB(0);
        displayWicketForTeamB(0);

        Button teamAOversInc = (Button) findViewById(R.id.team_a_increment);
        teamAOversInc.setText("+");
        teamAOversInc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (oversTeamA < 100){
                    displayOversForTeamA(++oversTeamA);
                }
            }
        });

        Button teamAOversDec = (Button) findViewById(R.id.team_a_decrement);
        teamAOversDec.setText("-");
        teamAOversDec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (oversTeamA > 0){
                    displayOversForTeamA(--oversTeamA);
                }
            }
        });

        Button teamBOversInc = (Button) findViewById(R.id.team_b_increment);
        teamBOversInc.setText("+");
        teamBOversInc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (oversTeamB < 100){
                    displayOversForTeamB(++oversTeamB);
                }
            }
        });

        Button teamBOversDec = (Button) findViewById(R.id.team_b_decrement);
        teamBOversDec.setText("-");
        teamBOversDec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (oversTeamB > 0){
                    displayOversForTeamB(--oversTeamB);
                }
            }
        });


        /**
         * This button adds 6 points to the final score of team A.
         * */
        Button teamAIncrementBy6 = (Button) findViewById(R.id.cricket_team_a_increment_by_6);
        teamAIncrementBy6.setText("6");
        teamAIncrementBy6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                scoreTeamA = scoreTeamA + 6;
                displayScoreForTeamA(scoreTeamA);
                previousScoreTeamA = 6;
            }
        });

        /**
         * This button adds 6 points to the final score of team B.
         * */
        Button teamBIncrementBy6 = (Button) findViewById(R.id.cricket_team_b_increment_by_6);
        teamBIncrementBy6.setText("6");
        teamBIncrementBy6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                scoreTeamB = scoreTeamB + 6;
                displayScoreForTeamB(scoreTeamB);
                previousScoreTeamB = 6;
            }
        });

        /**
         * This button adds 4 points to the final score of team A.
         * */
        Button teamAIncrementBy4= (Button) findViewById(R.id.cricket_team_a_increment_by_4);
        teamAIncrementBy4.setText("4");
        teamAIncrementBy4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                scoreTeamA = scoreTeamA + 4;
                displayScoreForTeamA(scoreTeamA);
                previousScoreTeamA = 4;
            }
        });

        /**
         * This button adds 4 points to the final score of team B.
         * */
        Button teamBIncrementBy4 = (Button) findViewById(R.id.cricket_team_b_increment_by_4);
        teamBIncrementBy4.setText("4");
        teamBIncrementBy4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                scoreTeamB = scoreTeamB + 4;
                displayScoreForTeamB(scoreTeamB);
                previousScoreTeamB = 4;
            }
        });

        /**
         * This button adds 1 point to the final score of team A.
         * */
        Button teamASingle = (Button) findViewById(R.id.cricket_team_a_increment_by_1);
        teamASingle.setText("1");
        teamASingle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                scoreTeamA = scoreTeamA + 1;
                displayScoreForTeamA(scoreTeamA);
                previousScoreTeamA = 1;
            }
        });

        /**
         * This button adds 1 point to the final score of team B.
         * */
        Button teamBSingle = (Button) findViewById(R.id.cricket_team_b_increment_by_1);
        teamBSingle.setText("1");
        teamBSingle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                scoreTeamB = scoreTeamB + 1;
                displayScoreForTeamB(scoreTeamB);
                previousScoreTeamB = 1;
            }
        });


        /**
         * This increments team A's wickets by 1.
         * */
        Button teamAWicket = (Button) findViewById(R.id.cricket_team_a_wicket_inc);
        teamAWicket.setText("WICKET");
        teamAWicket.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(wicketsTeamA < 9){
                    wicketsTeamA += 1;
                    displayWicketForTeamA(wicketsTeamA);
                    previousWicketTeamA = 1;
                }
            }
        });

        Button teamAWicketUndo = (Button) findViewById(R.id.cricket_team_a_wicket_dec);
        teamAWicketUndo.setText("-");
        teamAWicketUndo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                wicketsTeamA = wicketsTeamA - previousWicketTeamA;
                displayWicketForTeamA(wicketsTeamA);
                previousWicketTeamA = 0;
            }
        });


        /**
         * This increments team A's wickets by 1.
         * */
        Button teamBWicket = (Button) findViewById(R.id.cricket_team_b_wicket_inc);
        teamBWicket.setText("WICKET");
        teamBWicket.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(wicketsTeamB < 9){
                    wicketsTeamB += 1;
                    displayWicketForTeamB(wicketsTeamB);
                    previousWicketTeamB = 1;
                }
            }
        });

        Button teamBWicketUndo = (Button) findViewById(R.id.cricket_team_b_wicket_dec);
        teamBWicketUndo.setText("-");
        teamBWicketUndo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                wicketsTeamB -= previousWicketTeamB;
                displayWicketForTeamB(wicketsTeamB);
                previousWicketTeamB = 0;
            }
        });


        /**
         * This button removes the last score action from  the final score of team A.
         * */
        Button teamAUndo = (Button) findViewById(R.id.cricket_team_a_undo);
        teamAUndo.setText("UNDO");
        teamAUndo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                scoreTeamA -= previousScoreTeamA;
                displayScoreForTeamA(scoreTeamA);
                previousScoreTeamA = 0;
            }
        });

        /**
         * This button removes the last score action from  the final score of team B.
         * */
        Button teamBUndo = (Button) findViewById(R.id.cricket_team_b_undo);
        teamBUndo.setText("UNDO");
        teamBUndo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                scoreTeamB -= previousScoreTeamB;
                displayScoreForTeamB(scoreTeamB);
                previousScoreTeamB = 0;
            }
        });



        /**
         * The RESET button resets scores for both the teams to 0.
         */
        Button reset = (Button) findViewById(R.id.cricket_reset);
        reset.setText("reset");
        reset.setAllCaps(true);
        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                scoreTeamA = 0;
                scoreTeamB = 0;
                wicketsTeamA = 0;
                wicketsTeamB = 0;
                oversTeamA = 0;
                oversTeamB = 0;
                displayScoreForTeamA(scoreTeamA);
                displayScoreForTeamB(scoreTeamB);
                displayWicketForTeamA(wicketsTeamA);
                displayWicketForTeamB(wicketsTeamB);
                displayOversForTeamA(oversTeamA);
                displayOversForTeamB(oversTeamB);
                previousScoreTeamA = 0;
                previousScoreTeamA = 0;
                previousScoreTeamB = 0;
                previousWicketTeamB = 0;
            }
        });

    }

    /**
     * Displays the score for Team A.
     */
    public void displayScoreForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.cricket_team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the score for Team B.
     */
    public void displayScoreForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.cricket_team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the number of wickets taken for Team A.
     */
    private void displayWicketForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.cricket_team_a_wicket_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the number of wickets taken for Team B.
     */
    private void displayWicketForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.cricket_team_b_wicket_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the number of overs completed by Team A.
     */
    private void displayOversForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.cricket_team_a_overs);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the number of overs completed by Team B.
     */
    private void displayOversForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.cricket_team_b_overs);
        scoreView.setText(String.valueOf(score));
    }

}