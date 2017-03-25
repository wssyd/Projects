package com.wordpress.thatsmartproduct.espanolish;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by wssyed on 1/4/2017.
 */

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        // Create a list of words
        final ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("Zero", "Cero"));
        words.add(new Word("One", "Uno"));
        words.add(new Word("Two", "Dos"));
        words.add(new Word("Three", "Tres"));
        words.add(new Word("Four", "Cuatro"));
        words.add(new Word("Five", "Cinco"));
        words.add(new Word("Six", "Sies"));
        words.add(new Word("Seven", "Siete"));
        words.add(new Word("Eight", "Ocho"));
        words.add(new Word("Nine", "Nueve"));
        words.add(new Word("Ten", "Diez"));
        words.add(new Word("Eleven", "Once"));
        words.add(new Word("Twelve", "Doce"));
        words.add(new Word("Thirteen", "Trece"));
        words.add(new Word("Fourteen", "Catorce"));
        words.add(new Word("Fifteen", "Quince"));
        words.add(new Word("Sixteen", "Dieciseis"));
        words.add(new Word("Seventeen", "Diecisiete"));
        words.add(new Word("Eighteen", "Diechiocho"));
        words.add(new Word("Nineteen", "Diecinueve"));
        words.add(new Word("Twenty", "Viente"));
        words.add(new Word("Thirty", "Treinta"));
        words.add(new Word("Forty", "Cuarenta"));
        words.add(new Word("Fifty", "Cincuenta"));
        words.add(new Word("Sixty", "Seisenta"));
        words.add(new Word("Seventy", "Setentata"));
        words.add(new Word("Eighty", "Ochenta"));
        words.add(new Word("Ninety", "Noventa"));
        words.add(new Word("One Hundred", "Cien"));
        words.add(new Word("Two Hundred", "Dos Cientos"));
        words.add(new Word("Five Hundred", "Quinientos"));


        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        WordAdapter adapter = new WordAdapter(this, words, R.color.category_numbers);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml layout file.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);


    }
}