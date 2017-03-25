package com.wordpress.thatsmartproduct.espanolish;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by wssyed on 1/4/2017.
 */

public class DatesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        // Create a list of words
        final ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("Sunday", "Domingo"));
        words.add(new Word("Monday", "Lunes"));
        words.add(new Word("Tuesday", "Martes"));
        words.add(new Word("Wednesday", "Miércoles"));
        words.add(new Word("Thursday", "Jueves"));
        words.add(new Word("Friday", "Viernes"));
        words.add(new Word("Saturday", "Sábado"));
        words.add(new Word("January", "Enero"));
        words.add(new Word("February", "Febrero"));
        words.add(new Word("March", "Marzo"));
        words.add(new Word("April", "Abril"));
        words.add(new Word("May", "Mayo"));
        words.add(new Word("June", "Junio"));
        words.add(new Word("July", "Julio"));
        words.add(new Word("August", "Agosto"));
        words.add(new Word("September", "Se(p)tiembre"));
        words.add(new Word("October", "Octubre"));
        words.add(new Word("November", "Noviembre"));
        words.add(new Word("December", "Diciembre"));
        words.add(new Word("Spring", "La Primavera"));
        words.add(new Word("Summer", "El Verano"));
        words.add(new Word("Autumn", "El Otoño"));
        words.add(new Word("Winter", "El Invierno"));
        words.add(new Word("Today", "Hoy"));
        words.add(new Word("Yesterday", "Ayer"));
        words.add(new Word("Tomorrow", "Mañana"));
        words.add(new Word("Week", "La Semana"));
        words.add(new Word("Month", "Mez"));
        words.add(new Word("Year", "Año "));
        words.add(new Word("Day after tomorrow", "Pasado mañana"));
        words.add(new Word("Day before yesterday", "Anteayar"));


        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        WordAdapter adapter = new WordAdapter(this, words, R.color.category_dates);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml layout file.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);


    }
}