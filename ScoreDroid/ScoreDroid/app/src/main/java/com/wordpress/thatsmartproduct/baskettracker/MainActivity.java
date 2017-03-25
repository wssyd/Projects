package com.wordpress.thatsmartproduct.baskettracker;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import static com.wordpress.thatsmartproduct.baskettracker.R.id.about;

/**
 * Created by wssyed on 2/11/2017.
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /**
         * The Basketball layout opens a new activity (BasketballActivity.class) that records and
         * displays the scores of a basketball game.
         */
        LinearLayout basketballLayout = (LinearLayout) findViewById(R.id.basketball_layout);
        TextView basketballTextView = (TextView) findViewById(R.id.basketball_textview);
        basketballTextView.setText("Basketball");

        basketballLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, BasketballActivity.class);
                startActivity(intent);
            }
        });

        /**
         * The Cricket layout opens a new activity (CricketActivity.class) that records and
         * displays the scores of a Cricket game.
         */
        LinearLayout cricketLayout = (LinearLayout) findViewById(R.id.cricket_layout);
        TextView cricketTextView = (TextView) findViewById(R.id.cricket_textview);
        cricketTextView.setText("Cricket");

        cricketLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, CricketActivity.class);
                startActivity(intent);
            }
        });

        /**
         * The Snooker layout opens a new activity (SnookerActivity.class) that records and
         * displays the scores of a Cricket game.
         */
        LinearLayout snookerLayout = (LinearLayout) findViewById(R.id.snooker_layout);
        TextView snookerTextView = (TextView) findViewById(R.id.snooker_textview);
        snookerTextView.setText("Snooker");

        snookerLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, SnookerActivity.class);
                startActivity(intent);
            }
        });

        /**
         * The About TextView opens a new activity (AboutActivity.class) that has information about
         * the author and includes a button to send suggestions for future upgrade of the application.
         */
        TextView aboutTextView = (TextView) findViewById(about);
        aboutTextView.setText("about");
        aboutTextView.setAllCaps(true);
        aboutTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, AboutActivity.class);
                startActivity(intent);
            }
        });
    }
}
