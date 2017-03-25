package com.wordpress.thatsmartproduct.baskettracker;

import android.graphics.Color;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by IJ Syed Wasif Saleem on 2/12/2017.
 */

public class SnookerActivity extends AppCompatActivity {
    private int p1Score = 0;
    private int p2Score = 0;
    private int p1Previous = 0;
    private int p2Previous = 0;
    int j;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.snooker_activity);

        Button p1Red = (Button)  findViewById(R.id.p1_red);
        p1Red.setText("+1");
        p1Red.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                p1Score += 1;
                displayP1Score(p1Score);
                p1Previous = 1;
            }
        });

        Button p2Red = (Button)  findViewById(R.id.p2_red);
        p2Red.setText("+1");
        p2Red.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                p2Score += 1;
                displayP2Score(p2Score);
                p2Previous = 1;
            }
        });


        Button p1Yellow = (Button)  findViewById(R.id.p1_yellow);
        p1Yellow.setText("+2");
        p1Yellow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                p1Score += 2;
                displayP1Score(p1Score);
                p1Previous = 2;
            }
        });

        Button p2Yellow = (Button)  findViewById(R.id.p2_yellow);
        p2Yellow.setText("+2");
        p2Yellow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                p2Score += 2;
                displayP2Score(p2Score);
                p2Previous = 2;
            }
        });

        Button p1Green = (Button)  findViewById(R.id.p1_green);
        p1Green.setText("+3");
        p1Green.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                p1Score += 3;
                displayP1Score(p1Score);
                p1Previous = 3;
            }
        });

        Button p2Green = (Button)  findViewById(R.id.p2_green);
        p2Green.setText("+3");
        p2Green.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                p2Score += 3;
                displayP2Score(p2Score);
                p2Previous = 3;
            }
        });


        Button p1Brown = (Button)  findViewById(R.id.p1_brown);
        p1Brown.setText("+4");
        p1Brown.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                p1Score += 4;
                displayP1Score(p1Score);
                p1Previous = 4;
            }
        });

        Button p2Brown = (Button)  findViewById(R.id.p2_brown);
        p2Brown.setText("+4");
        p2Brown.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                p2Score += 4;
                displayP2Score(p2Score);
                p2Previous = 4;
            }
        });


        Button p1Blue = (Button)  findViewById(R.id.p1_blue);
        p1Blue.setText("+5");
        p1Blue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                p1Score += 5;
                displayP1Score(p1Score);
                p1Previous = 5;
            }
        });

        Button p2Blue = (Button)  findViewById(R.id.p2_blue);
        p2Blue.setText("+5");
        p2Blue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                p2Score += 5;
                displayP2Score(p2Score);
                p2Previous = 5;
            }
        });


        Button p1Pink = (Button)  findViewById(R.id.p1_pink);
        p1Pink.setText("+6");
        p1Pink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                p1Score += 6;
                displayP1Score(p1Score);
                p1Previous = 6;
            }
        });

        Button p2Pink = (Button)  findViewById(R.id.p2_pink);
        p2Pink.setText("+6");
        p2Pink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                p2Score += 6;
                displayP2Score(p2Score);
                p2Previous = 6;
            }
        });

        Button p1Black = (Button)  findViewById(R.id.p1_black);
        p1Black.setText("+7");
        p1Black.setTextColor(Color.WHITE);
        p1Black.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                p1Score += 7;
                displayP1Score(p1Score);
                p1Previous = 7;
            }
        });

        Button p2Black = (Button)  findViewById(R.id.p2_black);
        p2Black.setText("+7");
        p2Black.setTextColor(Color.WHITE);
        p2Black.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                p2Score += 7;
                displayP2Score(p2Score);
                p2Previous = 7;
            }
        });


        Button p1Undo = (Button)  findViewById(R.id.p1_undo);
        p1Undo.setText("-");
        p1Undo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                p1Score -= p1Previous;
                displayP1Score(p1Score);
                p1Previous = 0;
            }
        });

        Button p2Undo = (Button)  findViewById(R.id.p2_undo);
        p2Undo.setText("-");
        p2Undo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                p2Score -= p2Previous;
                displayP2Score(p2Score);
                p2Previous = 0;
            }
        });

        Button reset = (Button) findViewById(R.id.snooker_reset);
        reset.setText("reset");
        reset.setAllCaps(true);
        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                p1Score = 0;
                p2Score = 0;
                displayP1Score(p1Score);
                displayP2Score(p2Score);
                p1Previous = 0;
                p2Previous = 0;
            }
        });
    }

//    private void setCustomListener(View v, int j){
//        v.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//                j += 1;
//                displayP2Score(j);
//            }
//        });
//
//    }

    private void displayP1Score(int p1Score) {
        TextView scoreView = (TextView) findViewById(R.id.p1_score);
        scoreView.setText(String.valueOf(p1Score));
    }

    private void displayP2Score(int p1Score) {
        TextView scoreView = (TextView) findViewById(R.id.p2_score);
        scoreView.setText(String.valueOf(p2Score));
    }


}
