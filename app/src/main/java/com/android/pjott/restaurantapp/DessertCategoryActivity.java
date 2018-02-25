package com.android.pjott.restaurantapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
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

        AdapterView.OnItemClickListener itemClickListener =
                new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> listDesserts,
                                            View listView,
                                            int position,
                                            long id) {
                        Intent intentDessertCategoryActivity = new Intent(DessertCategoryActivity.this,
                                DessertActivity.class);
                        intentDessertCategoryActivity
                                .putExtra(DessertActivity.EXTRA_DESSERTID, (int) id);
                        startActivity(intentDessertCategoryActivity);
                    }
                };

        dessertsList.setOnItemClickListener(itemClickListener);
    }
}
