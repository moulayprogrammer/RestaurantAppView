package com.moulay.restaurantappview;

import android.animation.ArgbEvaluator;
import android.os.Bundle;

import android.widget.Adapter;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager2.widget.ViewPager2;

import java.util.ArrayList;
import java.util.List;

public class MainCategory extends AppCompatActivity {

    ViewPager viewPager;
    Adapter adapter;
    List<FoodModel> models;
    Integer[] colors = null;
    ArgbEvaluator argbEvaluator = new ArgbEvaluator();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.category);

        models = new ArrayList<>();
        models.add(new FoodModel(R.drawable.food, "Soupe 1", "Brochure is an informative paper document (often also used for advertising) that can be folded into a template",R.drawable.stars,150));
        models.add(new FoodModel(R.drawable.food, "Soupe 2", "Brochure is an informative paper document (often also used for advertising) that can be folded into a template",R.drawable.stars,150));
        models.add(new FoodModel(R.drawable.food, "Soupe 3", "Brochure is an informative paper document (often also used for advertising) that can be folded into a template",R.drawable.stars,150));
        models.add(new FoodModel(R.drawable.food, "Soupe 4", "Brochure is an informative paper document (often also used for advertising) that can be folded into a template",R.drawable.stars,150));


        adapter = (Adapter) new FoodAdapter(models, this);

        viewPager = findViewById(R.id.viewPager);
        viewPager.setAdapter((PagerAdapter)adapter);
        viewPager.setPadding(130, 0, 130, 0);

        Integer[] colors_temp = {
                getResources().getColor(R.color.colorPrimary),
                getResources().getColor(R.color.colorPrimaryDark),
                getResources().getColor(R.color.colorAccent),
                getResources().getColor(R.color.buttonBackground)
        };

        colors = colors_temp;

        viewPager.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

                if (position < (adapter.getCount() -1) && position < (colors.length - 1)) {
                    viewPager.setBackgroundColor(

                            (Integer) argbEvaluator.evaluate(
                                    positionOffset,
                                    colors[position],
                                    colors[position + 1]
                            )
                    );
                }

                else {
                    viewPager.setBackgroundColor(colors[colors.length - 1]);
                }
            }

            @Override
            public void onPageSelected(int position) {

            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });

    }
}