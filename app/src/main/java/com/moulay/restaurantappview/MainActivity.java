package com.moulay.restaurantappview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.annotation.SuppressLint;
import android.graphics.Typeface;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridLayout;
import android.widget.GridView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    GridView gridTables;
    TextView table1;
    int width;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Init View
        gridTables = findViewById(R.id.gridTables);

        // create table list
        List<Table> tables = new ArrayList<>();
        for (int i = 0; i < 40; i++) {
            Table table = new Table(i,i);
            tables.add(table);
        }

        // display tables in gridView
        TablesAdapter adapter = new TablesAdapter(this,tables);
        gridTables.setAdapter(adapter);
        gridTables.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, "you click id = "+id, Toast.LENGTH_SHORT).show();
            }
        });


    }

}
