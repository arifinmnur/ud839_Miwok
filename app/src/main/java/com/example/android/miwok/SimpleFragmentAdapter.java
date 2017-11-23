package com.example.android.miwok;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.view.LayoutInflater;
import android.view.View;

import com.example.android.miwok.PageFragment;

/**
 * A simple {@link Fragment} subclass.
 */
public class SimpleFragmentAdapter extends FragmentPagerAdapter {

    final int PAGE_COUNT = 4;
    private String tabTitles[] = new String[] { "Tab1", "Tab2", "Tab3" ,"Tab4"};

    private int[] imageResId = {
            R.drawable.ic_home_white_48dp,
            R.drawable.ic_local_grocery_store_white_48dp,
            R.drawable.ic_library_books_white_48dp,
            R.drawable.ic_person_pin_white_48dp};


    private Context context;

    public SimpleFragmentAdapter(FragmentManager fm, Context context) {
        super(fm);
        this.context = context;
    }

    public SimpleFragmentAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public int getCount() {
        return PAGE_COUNT;
    }

    @Override
    public Fragment getItem(int position) {


        switch (position) {
            case 0:return new NumbersFragment();
            case 1:return new ColorFragment();
            case 2:return new SayurandanBuahFragment();
            case 3:return new PhrasesFragment();
        }
        //return PageFragment.newInstance(position + 1);
        return null;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        // Generate title based on item position
        //return tabTitles[position];

        return null;
    }







}
