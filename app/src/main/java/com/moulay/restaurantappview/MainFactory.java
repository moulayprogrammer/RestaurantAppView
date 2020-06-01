package com.moulay.restaurantappview;

import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainFactory  extends AppCompatActivity {

    RecyclerView dataList;
    List<Integer> images;
    List<String> titles;
    List<String> prices;
    FactoryAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.facture);

        dataList = findViewById(R.id.dataList);
        images = new ArrayList<>();
        titles = new ArrayList<>();
        prices = new ArrayList<>();

        titles.add("Soupe de poisson");
        titles.add("Salade variée");
        titles.add("Pizza Neapolitan");

        prices.add("300 DA");
        prices.add("500 DA");
        prices.add("700 DA");

        images.add(R.drawable.food);
        images.add(R.drawable.food);
        images.add(R.drawable.food);

        adapter = new FactoryAdapter(this, images, titles, prices);

        GridLayoutManager gridLayoutManager = new GridLayoutManager(this, 1, GridLayoutManager.VERTICAL, false);
        dataList.setLayoutManager(gridLayoutManager);
        dataList.setAdapter(adapter);
    }

}
