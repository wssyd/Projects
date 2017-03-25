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
public class PlacesWordFragment extends Fragment {



    public PlacesWordFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);

        // Create a list of words
        final ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("Airport", "El Aeropuerto"));
        words.add(new Word("Bakery", "Lapanaderia"));
        words.add(new Word("Bank", "El Banco"));
        words.add(new Word("Cafe", "El Café"));
        words.add(new Word("Church", "La Iglesia"));
        words.add(new Word("Factory", "La Fábrica"));
        words.add(new Word("Garden", "El Gardin"));
        words.add(new Word("Grocery Store", "Almacén"));
        words.add(new Word("Home", "El Hogar"));
        words.add(new Word("Hospital", "La Hospital"));
        words.add(new Word("Library", "Biblioteca"));
        words.add(new Word("Market", "El Marcado"));
        words.add(new Word("Movie Theater", "El Cine"));
        words.add(new Word("Museum", "El Museo"));
        words.add(new Word("Park", "El Parque"));
        words.add(new Word("Pharmacy", "La Farmacia"));
        words.add(new Word("Post Office", "Los Correos"));
        words.add(new Word("Pool", "La Piscina"));
        words.add(new Word("Restaurant", "El Restaurante"));
        words.add(new Word("School", "La Escula"));
        words.add(new Word("Stadium", "El Estadio"));
        words.add(new Word("Store", "Tienda"));
        words.add(new Word("Town Hall", "Pasillo de Ciudad"));
        words.add(new Word("Bookstore", "Librería"));
        words.add(new Word("Zoo", "Parque Zoológico"));

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