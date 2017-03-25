package com.wordpress.thatsmartproduct.espanolish;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import java.util.ArrayList;

/**
 * Created by wssyed on 1/4/2017.
 */

/**
 * {@link Fragment} that displays a list of number vocabulary words.
 */
public class SchoolWordFragment extends Fragment {



    public SchoolWordFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);

        // Create a list of words
        final ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("Algebra", "Algebra"));
        words.add(new Word("Art", "Arte"));
        words.add(new Word("Biology", "Biologia"));
        words.add(new Word("Business", "Negocio"));
        words.add(new Word("Calculus", "Calculo"));
        words.add(new Word("Chemistry", "Quimica"));
        words.add(new Word("Computer Sciences", "Informática"));
        words.add(new Word("Dance", "Danza"));
        words.add(new Word("Economics", "Economia"));
        words.add(new Word("Geography", "Geografia"));
        words.add(new Word("Geometry", "Geometria"));
        words.add(new Word("History", "Historia"));
        words.add(new Word("Maths", "Matemáticas"));
        words.add(new Word("Physics", "Fisica"));
        words.add(new Word("Political Sciences", "Ciencia Politica"));
        words.add(new Word("Music", "Música"));
        words.add(new Word("Physical Education", "Educación Fisica"));
        words.add(new Word("Book", "El Libro"));
        words.add(new Word("College", "El Colegio"));
        words.add(new Word("Computer", "La Computadora"));
        words.add(new Word("Dictionary", "El Diccionário"));
        words.add(new Word("Paper", "El Papel"));
        words.add(new Word("Pencil", "El Lapiz"));
        words.add(new Word("Pen", "El Lapicero"));
        words.add(new Word("Professor", "Profesor/a"));
        words.add(new Word("School", "Escuela"));
        words.add(new Word("Student", "Estudiente"));
        words.add(new Word("Teacher", "Maestro/a"));
        words.add(new Word("Quiz / Exam ", "El Examen"));
        words.add(new Word("University", "La Universidad"));


        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        WordAdapter adapter = new WordAdapter(getActivity(), words, R.color.category_words);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml layout file.
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);


        return rootView;
    }
}