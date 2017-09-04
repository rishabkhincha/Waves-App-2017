package org.bits_waves.waves2017;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

public class ItemOneFragment extends Fragment {
    private View myFragmentView;
    public static ItemOneFragment newInstance() {
        ItemOneFragment fragment = new ItemOneFragment();
        return fragment;
    }
    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private List<EventItem> listItems = new ArrayList<>();

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);



    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        myFragmentView=inflater.inflate(R.layout.fragment_item_one, container, false);

        recyclerView = (RecyclerView) myFragmentView.findViewById(R.id.recycle1);
        recyclerView.setHasFixedSize(true);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getActivity().getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);
        listItems = new ArrayList<>();
        recyclerView.setItemAnimator(new DefaultItemAnimator());

        adapter = new EventAdapter(listItems,getActivity().getApplicationContext());

        recyclerView.setAdapter(adapter);
        for (int i = 0; i <= 10; i++) {
            EventItem listItem = new EventItem(
                    "heading " + (i+1),
                    "Hello"
            );
            listItems.add(listItem);
        }
        return myFragmentView;

    }


}
