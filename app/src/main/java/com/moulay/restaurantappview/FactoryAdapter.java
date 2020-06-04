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

public class FactoryAdapter extends RecyclerView.Adapter {

    List<Integer> images;
    List<String> titles;
    List<String> prices;
    LayoutInflater inflater;
    private ViewHolder holder;
    private int position;

    public FactoryAdapter(Context ctx, List<Integer> images, List<String> titles, List<String> prices){
        this.images=images;
        this.titles=titles;
        this.prices=prices;
        this.inflater= LayoutInflater.from(ctx);
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.factory_items,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        ViewHolder myViewHolder1 = (ViewHolder) holder;
//        myViewHolder1.title.setText(titles.get(position));
        myViewHolder1.price.setText(prices.get(position));
        myViewHolder1.image.setImageResource(images.get(position));
    }

    @Override
    public int getItemCount() {
        return titles.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView title;
        TextView price;
        ImageView image;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            title = itemView.findViewById(R.id.titleOfFood);
            price = itemView.findViewById(R.id.priceOfFood);
            image = itemView.findViewById(R.id.imageOfFood);
        }
    }




}
