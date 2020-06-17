package com.moulay.restaurantappview;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainFactory  extends Fragment {

    private View rootView;

    RecyclerView dataList;
    List<Integer> images;
    List<String> titles;
    List<String> prices;
    FactoryAdapter adapter;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.facture,container,false);
        InitUI();
        return rootView;
    }

    private void InitUI() {

        dataList = rootView.findViewById(R.id.dataList);
        dataList.setNestedScrollingEnabled(false);
        images = new ArrayList<>();
        titles = new ArrayList<>();
        prices = new ArrayList<>();

        titles.add("Soupe de poisson ");
        titles.add("Salade variée");
        titles.add("Pizza Neapolitan");
        titles.add("Soupe de poisson ");
        titles.add("Salade variée");
        titles.add("Pizza Neapolitan");
        titles.add("Soupe de poisson ");
        titles.add("Salade variée");
        titles.add("Pizza Neapolitan");

        prices.add("300 DA");
        prices.add("500 DA");
        prices.add("700 DA");
        prices.add("300 DA");
        prices.add("500 DA");
        prices.add("700 DA");
        prices.add("300 DA");
        prices.add("500 DA");
        prices.add("700 DA");

        images.add(R.drawable.food);
        images.add(R.drawable.food);
        images.add(R.drawable.food);
        images.add(R.drawable.food);
        images.add(R.drawable.food);
        images.add(R.drawable.food);
        images.add(R.drawable.food);
        images.add(R.drawable.food);
        images.add(R.drawable.food);

        adapter = new FactoryAdapter(getContext(), images, titles, prices);

        GridLayoutManager gridLayoutManager = new GridLayoutManager(getContext(), 1, GridLayoutManager.VERTICAL, false);
        dataList.setLayoutManager(gridLayoutManager);
        dataList.setAdapter(adapter);
    }

}
