package com.moulay.restaurantappview;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

public class FoodActivity extends AppCompatActivity {

    private static final String TAG = FoodActivity.class.getSimpleName();

    FragmentManager manager;
    FragmentTransaction transaction;
    MainFactory factory;
    MainCategories mainCategory;
    DetailFragment detailFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_category);

        manager = getSupportFragmentManager();

        launchFragmentFactor();
    }

    private void launchFragmentFactor(){

        factory = new MainFactory();
        mainCategory = new MainCategories();
        detailFragment = new DetailFragment(manager,transaction);
        transaction = manager.beginTransaction();
        transaction.add(R.id.factorContainer,factory,"FactorFragment");
        transaction.add(R.id.categoryContainer,detailFragment,"DetailFragment");
//        transaction.add(R.id.categoryContainer,mainCategory,"CategoryFragment");
        transaction.commit();
    }



}
