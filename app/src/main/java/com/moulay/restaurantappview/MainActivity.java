package com.moulay.restaurantappview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridLayout;
import android.widget.GridView;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.Toolbar;

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
        setFonts();

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

        // Start Toolbar
        /*androidx.appcompat.widget.Toolbar toolbar = (androidx.appcompat.widget.Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowTitleEnabled(false);*/
        // End Toolbar

        // Get Resolution
       /* DisplayMetrics displayMetrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        int height = displayMetrics.heightPixels;
        width = displayMetrics.widthPixels;*/
        // Get Resolution

        // Fonts


        // choisisTable
        // tabletitre
        /*TextView tabletitre = (TextView)findViewById(R.id.tabletitre);
        tabletitre.setTypeface(Typeface.createFromAsset(getAssets(),  "fonts/Poppins-Regular.ttf"));
        // tabletitre
        // table1
        TextView table1 = (TextView)findViewById(R.id.table1);
        table1.setTypeface(Typeface.createFromAsset(getAssets(),  "fonts/Poppins-Regular.ttf"));*/
        // table1
        // tabletitre2
       /* TextView tabletitre2 = (TextView)findViewById(R.id.tabletitre2);
        tabletitre2.setTypeface(Typeface.createFromAsset(getAssets(),  "fonts/Poppins-Regular.ttf"));
        // tabletitre2
        // table2
        TextView table2 = (TextView)findViewById(R.id.table2);
        table2.setTypeface(Typeface.createFromAsset(getAssets(),  "fonts/Poppins-Regular.ttf"));
        //table2
        // tabletitre3
        TextView tabletitre3 = (TextView)findViewById(R.id.tabletitre3);
        tabletitre3.setTypeface(Typeface.createFromAsset(getAssets(),  "fonts/Poppins-Regular.ttf"));
        // tabletitre3
        // table3
        TextView table3 = (TextView)findViewById(R.id.table3);
        table3.setTypeface(Typeface.createFromAsset(getAssets(),  "fonts/Poppins-Regular.ttf"));
        //table3
        // tabletitre4
        TextView tabletitre4 = (TextView)findViewById(R.id.tabletitre4);
        tabletitre4.setTypeface(Typeface.createFromAsset(getAssets(),  "fonts/Poppins-Regular.ttf"));
        // tabletitre4
        // table4
        TextView table4 = (TextView)findViewById(R.id.table4);
        table4.setTypeface(Typeface.createFromAsset(getAssets(),  "fonts/Poppins-Regular.ttf"));
        //table4
        // tabletitre5
        TextView tabletitre5 = (TextView)findViewById(R.id.tabletitre5);
        tabletitre5.setTypeface(Typeface.createFromAsset(getAssets(),  "fonts/Poppins-Regular.ttf"));
        // tabletitre5
        // table5
        TextView table5 = (TextView)findViewById(R.id.table5);
        table5.setTypeface(Typeface.createFromAsset(getAssets(),  "fonts/Poppins-Regular.ttf"));
        //table5
        // tabletitre6
        TextView tabletitre6 = (TextView)findViewById(R.id.tabletitre6);
        tabletitre6.setTypeface(Typeface.createFromAsset(getAssets(),  "fonts/Poppins-Regular.ttf"));
        // tabletitre6
        // table6
        TextView table6 = (TextView)findViewById(R.id.table6);
        table6.setTypeface(Typeface.createFromAsset(getAssets(),  "fonts/Poppins-Regular.ttf"));
        //table6

        // End Fonts

        gridTables = (GridLayout) findViewById(R.id.gridTables);
        table1 = (TextView) findViewById(R.id.table2);
        //Set Event
        setSingleEvent(gridTables);*/

    }

    private void setFonts(){
        // app
        TextView app = (TextView)findViewById(R.id.app);
        app.setTypeface(Typeface.createFromAsset(getAssets(),  "fonts/Poppins-Regular.ttf"));
        // app
        // Restaurant
        TextView restaurant = (TextView)findViewById(R.id.restaurant);
        restaurant.setTypeface(Typeface.createFromAsset(getAssets(),  "fonts/Poppins-Regular.ttf"));
        // Restaurant
        // Bonne apetit
        TextView bonneApetit = (TextView)findViewById(R.id.bonneApetit);
        bonneApetit.setTypeface(Typeface.createFromAsset(getAssets(),  "fonts/Poppins-Regular.ttf"));
        // Bonne apetit
        // bienvenue
        TextView bienvenue = (TextView)findViewById(R.id.bienvenue);
        bienvenue.setTypeface(Typeface.createFromAsset(getAssets(),  "fonts/Poppins-Regular.ttf"));
        // bienvenue
        // choisisTable
        TextView choisisTable = (TextView)findViewById(R.id.choisisTable);
        choisisTable.setTypeface(Typeface.createFromAsset(getAssets(),  "fonts/Poppins-Regular.ttf"));
    }

    private void setSingleEvent(GridLayout mainGrid) {
        //Loop all child item of Main Grid
        for (int i = 0; i < mainGrid.getChildCount(); i++) {
            //You can see , all child item is CardView , so we just cast object to CardView
            CardView cardView = (CardView) mainGrid.getChildAt(i);
            final int finalI = i;
            cardView.setOnClickListener(new View.OnClickListener() {
                @SuppressLint("ShowToast")
                @Override
                public void onClick(View view) {
                    Log.d("Main","Clicked on"+finalI);
//                    Toast.makeText(MainActivity.this,, Toast.LENGTH_SHORT);
//                    table1.setText("the width is " + Resources.getSystem().getDisplayMetrics().widthPixels);
                    /*Intent intent = new Intent(MainActivity.this,ActivityOne.class);
                    intent.putExtra("info","This is activity from card item index  "+finalI);
                    startActivity(intent);*/
                }
            });
        }
    }
}
