package com.example.android.miwok;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class PhrasesFragment extends Fragment {


    public PhrasesFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);
        ArrayList<Word> words=new ArrayList<Word>();
        words.add(new Word("Satu","Hiji"));
        words.add(new Word("Dua","Dua"));
        words.add(new Word("Tiga","Tilu"));
        words.add(new Word("Empat","Opat"));
        words.add(new Word("Lima","Lima"));
        words.add(new Word("Enam","Genep"));
        words.add(new Word("Tujuh","Tujuh"));
        words.add(new Word("Delapan","Dalapan"));
        words.add(new Word("Sembilan","Salapan"));
        words.add(new Word("Sepuluh","Sapuluh"));


        WordAdapter adapter = new WordAdapter(getActivity(), words,R.color.category_phrases);
        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml file.
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setBackgroundColor(R.color.category_phrases);
        // Make the {@link ListView} use the {@link ArrayAdapter} we created above, so that the
        // {@link ListView} will display list items for each word in the list of words.
        // Do this by calling the setAdapter method on the {@link ListView} object and pass in
        // 1 argument, which is the {@link ArrayAdapter} with the variable name itemsAdapter.
        listView.setAdapter(adapter);

        return rootView;
    }

}
