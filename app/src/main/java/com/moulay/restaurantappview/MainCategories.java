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

public class MainCategories  extends Fragment {

    private View rootView;

    RecyclerView allCategories;
    List<Integer> imageFood;
    List<String> titleFood;
    List<String> descriptionFood;
    List<String> priceFood;
    List<String> titleCategory;
    CategoryAdapter adapter;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.foods_categories,container,false);
        InitUI();
        return rootView;
    }

    private void InitUI() {

        allCategories = rootView.findViewById(R.id.allCategories);
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


        // Second Category and its foods
        titleCategory.add("Legumes");


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


        adapter = new CategoryAdapter(getContext(), imageFood, titleFood, descriptionFood, priceFood, titleCategory);

        GridLayoutManager gridLayoutManager = new GridLayoutManager(getContext(), 1, GridLayoutManager.VERTICAL, false);
        allCategories.setLayoutManager(gridLayoutManager);
        allCategories.setAdapter(adapter);
    }

}
