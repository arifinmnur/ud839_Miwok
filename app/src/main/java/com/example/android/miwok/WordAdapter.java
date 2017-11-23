package com.example.android.miwok;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by ArieDZ_2 on 9/9/2017.
 */

public class WordAdapter extends ArrayAdapter<Word> {


    /**
     *
     *
     */
    private int mColorBackground;

    public WordAdapter(Activity context, ArrayList<Word> word,int colorBackground) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, word);
        mColorBackground=colorBackground;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        Word currentAndroidFlavor = getItem(position);

        TextView defaultTranslation = (TextView) listItemView.findViewById(R.id.deskripsiBuah_textview_id);
        defaultTranslation.setText(currentAndroidFlavor.getDefaultTranslation());

        TextView miworkTranslation = (TextView) listItemView.findViewById(R.id.namabuah_textview_id);
        miworkTranslation.setText(currentAndroidFlavor.getMiwokTranslation());

        ImageView imageview = (ImageView) listItemView.findViewById(R.id.images1);
        if (currentAndroidFlavor.has_image()) {
            imageview.setImageResource(currentAndroidFlavor.getImageMiwork());
            imageview.setVisibility(View.VISIBLE);
        }
        else
        {
            imageview.setVisibility(View.GONE);
        }
        View textContainer = listItemView.findViewById(R.id.text_container);

        int color = ContextCompat.getColor(getContext(),mColorBackground);
        textContainer.setBackgroundColor(color);

        return listItemView;
    }
}


