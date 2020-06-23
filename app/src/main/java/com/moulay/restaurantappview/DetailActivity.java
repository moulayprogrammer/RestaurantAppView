package com.moulay.restaurantappview;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

public class DetailActivity extends AppCompatActivity {

    private static final String TAG = FoodActivity.class.getSimpleName();
    FragmentManager manager;
    FragmentTransaction transaction;
    //DetailFoodAdapter detail;
    DetailFoodAdapter mainFood;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_food);

        manager = getSupportFragmentManager();
        launchFragmentFactor();
    }

    private void launchFragmentFactor(){
        //detail = new DetailFoodAdapter();
        mainFood = new DetailFoodAdapter();
        transaction = manager.beginTransaction();
        //transaction.add(R.id.foodsContainer,detail,"foodsContainer");
        transaction.add(R.id.detailContainer,mainFood,"detailContainer");
        transaction.addToBackStack(null);
        transaction.commit();
    }
}
