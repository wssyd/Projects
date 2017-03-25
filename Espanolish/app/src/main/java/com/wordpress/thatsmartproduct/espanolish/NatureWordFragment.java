package com.wordpress.thatsmartproduct.espanolish;

/**
 * Created by wssyed on 1/4/2017.
 */

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import java.util.ArrayList;

/**
 * {@link Fragment} that displays a list of number vocabulary words.
 */
public class NatureWordFragment extends Fragment {


    public NatureWordFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);

        // Create a list of words
        final ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("Dog", "Perro/a"));
        words.add(new Word("Cat", "Gato/a"));
        words.add(new Word("Mouse", "Ratón"));
        words.add(new Word("Bird", "Ave"));
        words.add(new Word("Chicken/Rooster", "Gallina/Gallo"));
        words.add(new Word("Cow", "La Vaca"));
        words.add(new Word("Duck", "Pato/a"));
        words.add(new Word("Goat", "La Cabra"));
        words.add(new Word("Horse", "El Caballo"));
        words.add(new Word("Pig", "Cerdo/a"));
        words.add(new Word("Sheep", "Oveja"));
        words.add(new Word("Lion", "El Lión"));
        words.add(new Word("Tiger", "El Tigre"));
        words.add(new Word("Bear", "El Oso"));
        words.add(new Word("Wolf", "El Lobo"));
        words.add(new Word("Skunk", "La Mofeta"));
        words.add(new Word("Fish", "Pez"));
        words.add(new Word("Forest", "El Bosque"));
        words.add(new Word("Trees", "Los árboles"));
        words.add(new Word("Plants", "Planta"));
        words.add(new Word("Flower", "Flor"));
        words.add(new Word("Jungle", "Selva"));
        words.add(new Word("Ocean", "El Océano"));
        words.add(new Word("River", "El Río"));
        words.add(new Word("Lake", "El Lago"));
        words.add(new Word("Hill", "La Colina"));
        words.add(new Word("Mountain", "La Montaña"));
        words.add(new Word("Waterfall", "Cascada"));
        words.add(new Word("Rainbow", "El Arco Iris"));
        words.add(new Word("Sky", "El Ceilo"));
        words.add(new Word("Cloud", "Niebla"));
        words.add(new Word("Rain", "La Lluvia"));
        words.add(new Word("Snow", "El Nieve"));
        words.add(new Word("Hail", "El Granizo"));
        words.add(new Word("Fog", "La Niebla"));
        words.add(new Word("Field/Meadow", "El Campo"));
        words.add(new Word("Lightning", "El Relámpago"));


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