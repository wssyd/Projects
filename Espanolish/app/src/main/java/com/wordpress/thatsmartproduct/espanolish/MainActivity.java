package com.wordpress.thatsmartproduct.espanolish;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

/**
 * Created by wssyed on 1/4/2017.
 */

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Opens the main activity
        setContentView(R.layout.activity_main);

        // Find the numbers view
        final TextView numbersActivity = (TextView) findViewById(R.id.numbers);
        // Set an OnClickListener on that view
        numbersActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity(NumbersActivity.class);
            }
        });

        // Find the family view
        TextView wordsActivity = (TextView) findViewById(R.id.words);
        // Set an OnClickListener on that view
        wordsActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity(WordsMainActivity.class);
            }
        });

        // Find the Phrases view
        TextView phrasesActivity = (TextView) findViewById(R.id.phrases);
        // Set an OnClickListener on that view
        phrasesActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity(PhrasesActivity.class);
            }
        });

        // Find the Colors view
        TextView datesActivity = (TextView) findViewById(R.id.dates);
        // Set an OnClickListener on that view
        datesActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity(DatesActivity.class);
            }
        });
    }

    private void openActivity(Class E) {
        // Create an intent to open the Phrases view
        Intent intent = new Intent(MainActivity.this, E);
        //Start the view
        startActivity(intent);
    }
}