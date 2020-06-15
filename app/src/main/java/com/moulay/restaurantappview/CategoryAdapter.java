package com.moulay.restaurantappview;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ImageView;
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

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        ViewHolder myViewHolder1 = (ViewHolder) holder;
        myViewHolder1.title.setText(titleCategory.get(position));

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

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            title = itemView.findViewById(R.id.titleCategory);
            foodsInCategory = itemView.findViewById(R.id.foodsInCategory);
        }
    }
}
