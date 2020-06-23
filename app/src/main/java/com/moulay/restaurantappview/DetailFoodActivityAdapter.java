package com.moulay.restaurantappview;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class DetailFoodActivityAdapter extends Fragment {

    private View rootView;

    RecyclerView foodsInCategory;
    List<Integer> imageFood;
    List<String> titleFood;
    List<String> descriptionFood;
    List<String> priceFood;
    List<String> titleCategory;
    DetailFood adapter;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.detail_category,container,false);
        InitUI();
        return rootView;
    }
    private void InitUI() {
        foodsInCategory = rootView.findViewById(R.id.foodsInCategory);
        imageFood = new ArrayList<>();
        titleFood = new ArrayList<>();
        descriptionFood = new ArrayList<>();
        priceFood = new ArrayList<>();
        titleCategory = new ArrayList<>();

        // First Category and its foods
        titleCategory.add("Soupes");

        // First food
        imageFood.add(R.drawable.food);
        titleFood.add("Soupe de poisson");
        descriptionFood.add("La description de premiere repas");
        priceFood.add("300 DA");

        // Second Food
        imageFood.add(R.drawable.food);
        titleFood.add("Salade variée");
        descriptionFood.add("La description de deuxieme repas");
        priceFood.add("500 DA");

        // Third Food
        imageFood.add(R.drawable.food);
        titleFood.add("Pizza Neapolitan");
        descriptionFood.add("La description de troiseieme repas");
        priceFood.add("700 DA");



        adapter = new DetailFood(getContext(), imageFood, titleFood, descriptionFood, priceFood);

        GridLayoutManager gridLayoutManager = new GridLayoutManager(getContext(), 1, GridLayoutManager.VERTICAL, false);
        foodsInCategory.setLayoutManager(gridLayoutManager);
        foodsInCategory.setAdapter(adapter);
    }
}
