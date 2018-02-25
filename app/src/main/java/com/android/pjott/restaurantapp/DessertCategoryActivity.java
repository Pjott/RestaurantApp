package com.android.pjott.restaurantapp;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class DessertCategoryActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dessert_category);

        ArrayAdapter<Dessert> listAdapter = new ArrayAdapter<Dessert>(this,
                                        android.R.layout.simple_list_item_1,
                                        Dessert.desserts);
        ListView dessertsList = (ListView) findViewById(R.id.desserts_list);
        dessertsList.setAdapter(listAdapter);
    }
}
