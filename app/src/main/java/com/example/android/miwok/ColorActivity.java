/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.miwok;

import android.content.Context;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class ColorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);
        ArrayList<Word> words=new ArrayList<Word>();
        words.add(new Word("Satu","Hiji",R.drawable.number_one,R.raw.number_one));
        words.add(new Word("Dua","Dua",R.drawable.number_two,R.raw.number_two));
        words.add(new Word("Tiga","Tilu",R.drawable.number_three,R.raw.number_three));
        words.add(new Word("Empat","Opat",R.drawable.number_four,R.raw.number_four));
        words.add(new Word("Lima","Lima",R.drawable.number_five,R.raw.number_five));
        words.add(new Word("Enam","Genep",R.drawable.number_six,R.raw.number_six));
        words.add(new Word("Tujuh","Tujuh",R.drawable.number_seven,R.raw.number_seven));
        words.add(new Word("Delapan","Dalapan",R.drawable.number_eight,R.raw.number_eight));
        words.add(new Word("Sembilan","Salapan",R.drawable.number_nine,R.raw.number_nine));
        words.add(new Word("Sepuluh","Sapuluh",R.drawable.number_ten,R.raw.number_ten));


        WordAdapter adapter = new WordAdapter(this, words,R.color.category_colors);
        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml file.
        ListView listView = (ListView) findViewById(R.id.list);
        // Make the {@link ListView} use the {@link ArrayAdapter} we created above, so that the
        // {@link ListView} will display list items for each word in the list of words.
        // Do this by calling the setAdapter method on the {@link ListView} object and pass in
        // 1 argument, which is the {@link ArrayAdapter} with the variable name itemsAdapter.



        listView.setAdapter(adapter);





    }
}
