package com.moulay.restaurantappview;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

public class DetailFragment extends Fragment {

    private static final String TAG = DetailFragment.class.getSimpleName();
    View rootView;

    FragmentManager manager;
    FragmentTransaction transaction;

    DetailCategoryFragment detailCategoryFragment;
    DetailFoodFragment detailFoodFragment;


    public DetailFragment(FragmentManager manager, FragmentTransaction transaction) {
        this.manager = manager;
        this.transaction = transaction;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.fragment_detail_category_food,container,false);
        InitUI();
        return rootView;
    }

    private void InitUI() {

        launchFragmentFactor();
    }

    private void launchFragmentFactor(){
        detailCategoryFragment = new DetailCategoryFragment();
        detailFoodFragment = new DetailFoodFragment();
        transaction = manager.beginTransaction();
        transaction.add(R.id.categoryDetailContainer, detailCategoryFragment,"DetailFoodFragment");
        transaction.add(R.id.foodDetailContainer,detailFoodFragment,"DetailFoodFragment");
//        transaction.add(R.id.categoryContainer,detailFragment,"DetailFragment");
//        transaction.add(R.id.categoryContainer,mainCategory,"CategoryFragment");
        transaction.commit();
    }
}
