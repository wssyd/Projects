package com.wordpress.thatsmartproduct.espanolish;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;
import java.util.ArrayList;

/**
 * Created by wssyed on 1/4/2017.
 */

public class PhrasesActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        // Create a list of words
        final ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("Good Morning.", "Buenos días."));
        words.add(new Word("Good afternoon.", "Buenas tardes."));
        words.add(new Word("Good evening. (greeting)", "Buenas noches."));
        words.add(new Word("What is your name?", "¿Cómo se llama usted?"));
        words.add(new Word("Hello, my name is ...", "Hola, me llamo ..."));
        words.add(new Word("How are you?", "¿Cómo está usted?"));
        words.add(new Word("I am fine.", "Estoy bien."));
        words.add(new Word("Nice to meet you.", "Mucho gusto."));
        words.add(new Word("Goodbye.", "Adiós."));
        words.add(new Word("See you later.", "Hasta luego."));
        words.add(new Word("Excuse me.", "Con permiso."));
        words.add(new Word("Please.", "Por Favor."));
        words.add(new Word("Thank you.", "Gracias."));
        words.add(new Word("I'm sorry.", "Lo siento."));
        words.add(new Word("Bless you.", "Salud."));
        words.add(new Word("You are welcome.", "De nada."));
        words.add(new Word("What time is it?", "¿Qué hora es?"));
        words.add(new Word("I do not understand.", "Yo no comprendo."));


        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        WordAdapter adapter = new WordAdapter(this, words, R.color.category_phrases);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml layout file.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);


    }
}
