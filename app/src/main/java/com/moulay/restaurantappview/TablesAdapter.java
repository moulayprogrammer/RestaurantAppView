package com.moulay.restaurantappview;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class TablesAdapter extends BaseAdapter {

    private Context context;
    private List<Table> tables;
    private static LayoutInflater inflater = null;

    public TablesAdapter(Context context, List<Table> tables) {
        this.context = context;
        this.tables = tables;
        inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return tables.size();
    }

    @Override
    public Table getItem(int position) {
        return tables.get(position);
    }

    @Override
    public long getItemId(int position) {
        return tables.get(position).getId();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        @SuppressLint("ViewHolder")
        View itemView = inflater.inflate(R.layout.table_item,parent,false);

        TextView tableId = itemView.findViewById(R.id.table_id);
        TextView tableNumber = itemView.findViewById(R.id.table_number);
        ImageView tableImage = itemView.findViewById(R.id.table_image);


        int id = tables.get(position).getId();
        int number = tables.get(position).getNumber();

        tableId.setText(String.valueOf(id));
        tableNumber.setText(String.valueOf(number));
        tableImage.setImageResource(R.drawable.tablelarge);

        return itemView;
    }
}
