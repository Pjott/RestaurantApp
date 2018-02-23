package com.android.pjott.restaurantapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class DrinkCategoryActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drink_category);

        //Bind data from Drink class
        ArrayAdapter<Drink> listAdapter = new ArrayAdapter<>(this,
                                    android.R.layout.simple_list_item_1,
                                    Drink.drinks);
        ListView listDrinks = (ListView) findViewById(R.id.drinks_list);
        listDrinks.setAdapter(listAdapter);

        AdapterView.OnItemClickListener itemClickListener =
                new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> listDrinks,
                                            View itemView,
                                            int position,
                                            long id) {
                        Intent intentDrinkCategoryActivity = new Intent(DrinkCategoryActivity.this,
                                DrinkActivity.class);
                        intentDrinkCategoryActivity
                                .putExtra(DrinkActivity.EXTRA_DRINKID, (int) id);
                        startActivity(intentDrinkCategoryActivity);
                    }
                };

        listDrinks.setOnItemClickListener(itemClickListener);
    }
}
