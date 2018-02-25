package com.android.pjott.restaurantapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class Menu extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        AdapterView.OnItemClickListener itemClickListener =
                new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> listView, View itemView, int position, long id) {
                        if (position == 0) {
                            Intent menuIntent = new Intent(Menu.this, LunchCategoryActivity.class);
                            startActivity(menuIntent);
                        } else if(position ==1) {
                            Intent menuIntent = new Intent(Menu.this, DessertCategoryActivity.class);
                            startActivity(menuIntent);
                        } else if (position == 2) {
                            Intent menuIntent = new Intent(Menu.this, DrinkCategoryActivity.class);
                            startActivity(menuIntent);
                        }
                    }
                };

        ListView menuListView = (ListView) findViewById(R.id.main_options_list);
        menuListView.setOnItemClickListener(itemClickListener);
    }
}
