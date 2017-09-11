package org.bits_waves.waves2017;

import android.content.Intent;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import java.util.ArrayList;
import java.util.List;

import me.relex.circleindicator.CircleIndicator;

public class ItemFourFragment extends Fragment {
    ViewPager viewPager, viewPager2, viewPager3;

    public static ItemFourFragment newInstance() {
        ItemFourFragment fragment = new ItemFourFragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    public ItemFourFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_item_four, container, false);

        viewPager = (ViewPager) view.findViewById(R.id.viewPager);
        viewPager2 = (ViewPager) view.findViewById(R.id.viewPager2);
        viewPager3 = (ViewPager) view.findViewById(R.id.viewPager3);


        CircleIndicator indicator = (CircleIndicator) view.findViewById(R.id.indicator);
        ViewPagerAdapterOne viewPagerAdapterOne = new ViewPagerAdapterOne(getContext());
        ViewPagerAdapterTwo viewPagerAdapterTwo = new ViewPagerAdapterTwo(getContext());
        ViewPagerAdapterThree viewPagerAdapterThree = new ViewPagerAdapterThree(getContext());

        indicator.setViewPager(viewPager);
        viewPager.setAdapter(viewPagerAdapterOne);
        viewPager2.setAdapter(viewPagerAdapterTwo);
        viewPager3.setAdapter(viewPagerAdapterThree);
        return view;
    }


}
