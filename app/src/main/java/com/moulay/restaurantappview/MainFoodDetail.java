package com.moulay.restaurantappview;

import android.content.Context;
import android.media.Image;
import android.text.Layout;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MainFoodDetail extends RecyclerView.Adapter {

    List<Integer> images;
    List<String> titles;
    List<String> descriptions;
    List<String> prices;
    LayoutInflater inflater;
    private ViewHolder holder;
    private int position;

    public MainFoodDetail(Context ctx, List<Integer> images, List<String> titles,  List<String> descriptions,List<String> prices){
        this.images=images;
        this.titles=titles;
        this.prices=prices;
        this.descriptions = descriptions;
        this.inflater= LayoutInflater.from(ctx);
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.foods_in_category_item,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        ViewHolder myViewHolder1 = (ViewHolder) holder;
        myViewHolder1.imageFood.setImageResource(images.get(position));
        myViewHolder1.titleFood.setText(titles.get(position));
        myViewHolder1.descriptionFood.setText(descriptions.get(position));
        myViewHolder1.priceFood.setText(prices.get(position));
    }

    @Override
    public int getItemCount() {
        return titles.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView titleFood;
        TextView descriptionFood;
        TextView priceFood;
        ImageView imageFood;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageFood = itemView.findViewById(R.id.imageFood);
            titleFood = itemView.findViewById(R.id.titleFood);
            descriptionFood = itemView.findViewById(R.id.descriptionFood);
            priceFood = itemView.findViewById(R.id.priceFood);
        }
    }




}
