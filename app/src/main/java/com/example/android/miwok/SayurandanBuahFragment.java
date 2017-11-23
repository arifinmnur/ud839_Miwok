package com.example.android.miwok;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class SayurandanBuahFragment extends Fragment {

    private ArrayList<SayurandanBuah> sayurandanBuahs = new ArrayList<>();
    private RecyclerView recyclerView;
    private SayurandanBuahAdapter mAdapter;

    public SayurandanBuahFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.recycle_main_layout, container, false);

        recyclerView = (RecyclerView) rootView.findViewById(R.id.recycler_view);

        recyclerView.setHasFixedSize(true);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getActivity().getApplicationContext());

        sayurandanBuahs=new ArrayList<>();
        sayurandanBuahs.add(new SayurandanBuah("Tomat","Sayuran",R.drawable.color_black));
        sayurandanBuahs.add(new SayurandanBuah("Pisang","Sayuran",R.drawable.color_black));
        sayurandanBuahs.add(new SayurandanBuah("Mangga","Sayuran",R.drawable.color_black));
        sayurandanBuahs.add(new SayurandanBuah("Sayur","Sayuran",R.drawable.color_black));
        sayurandanBuahs.add(new SayurandanBuah("Tomat2","Sayuran",R.drawable.color_black));
        sayurandanBuahs.add(new SayurandanBuah("Pisang2","Sayuran",R.drawable.color_black));
        sayurandanBuahs.add(new SayurandanBuah("Mangga2","Sayuran",R.drawable.color_black));
        sayurandanBuahs.add(new SayurandanBuah("Sayur2","Sayuran",R.drawable.color_black));
        sayurandanBuahs.add(new SayurandanBuah("Tomat3","Sayuran",R.drawable.color_black));
        sayurandanBuahs.add(new SayurandanBuah("Pisang3","Sayuran",R.drawable.color_black));
        sayurandanBuahs.add(new SayurandanBuah("Mangga3","Sayuran",R.drawable.color_black));
        sayurandanBuahs.add(new SayurandanBuah("Sayur3","Sayuran",R.drawable.color_black));

        mAdapter = new SayurandanBuahAdapter(sayurandanBuahs);
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());

        recyclerView.addItemDecoration(new MyDividerItemDecoration(getActivity(), LinearLayoutManager.VERTICAL, 16));
        recyclerView.setAdapter(mAdapter);

        // row click listener
        recyclerView.addOnItemTouchListener(new RecyclerTouchListener(getActivity().getApplicationContext(), recyclerView, new RecyclerTouchListener.ClickListener() {
            @Override
            public void onClick(View view, int position) {
                SayurandanBuah sayurandanBuah = sayurandanBuahs.get(position);
                Toast.makeText(getActivity().getApplicationContext(), sayurandanBuah.getNamaBuah() + " is selected!", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onLongClick(View view, int position) {

            }
        }));

        return rootView;
    }


}
