package com.moulay.restaurantappview;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class CategoryAdapter  extends RecyclerView.Adapter{

    private View rootView;

    RecyclerView foodsInCategory;
    List<Integer> imageFood;
    List<String> titleFood;
    List<String> descriptionFood;
    List<String> priceFood;
    List<String> titleCategory;
    FoodAdapter adapter;
    LayoutInflater inflater;
    private FoodAdapter.ViewHolder holder;
    private int position;
    Context context;

    public CategoryAdapter(Context ctx, List<Integer> imageFood, List<String> titleFood, List<String> descriptionFood, List<String> priceFood, List<String> titleCategory){
        this.context = ctx;
        this.imageFood=imageFood;
        this.titleFood=titleFood;
        this.descriptionFood=descriptionFood;
        this.priceFood = priceFood;
        this.titleCategory = titleCategory;
        this.inflater= LayoutInflater.from(ctx);
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.category,parent,false);
        return new ViewHolder(view);
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        ViewHolder myViewHolder1 = (ViewHolder) holder;
        myViewHolder1.title.setText(titleCategory.get(position));


        GradientDrawable gradientDrawable   =   new GradientDrawable();
        gradientDrawable.setCornerRadii(new float[]{10, 10, 10, 10, 10, 10, 10, 10});
        gradientDrawable.setColor(ContextCompat.getColorStateList(context,R.color.colorPrimary));
        myViewHolder1.categoryLayout.setBackground(gradientDrawable);

       /* myViewHolder1.categoryLayout.setBackground(ContextCompat.getDrawable(context, R.drawable.category_container_bg_2));
        myViewHolder1.showAllFoods.setBackgroundResource(R.color.colorPrimary2);*/


        adapter = new FoodAdapter(context, imageFood, titleFood, descriptionFood, priceFood);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(context, 1, GridLayoutManager.HORIZONTAL, false);
        foodsInCategory.setLayoutManager(gridLayoutManager);
        foodsInCategory.setAdapter(adapter);
    }



    @Override
    public int getItemCount() {
        return titleCategory.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView title;
        Button showAllFoods;
        LinearLayout categoryLayout;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            title = itemView.findViewById(R.id.titleCategory);
            foodsInCategory = itemView.findViewById(R.id.foodsInCategory);
            showAllFoods = itemView.findViewById(R.id.showAllFoods);
            categoryLayout = itemView.findViewById(R.id.categoryLayout);
        }
    }
}
