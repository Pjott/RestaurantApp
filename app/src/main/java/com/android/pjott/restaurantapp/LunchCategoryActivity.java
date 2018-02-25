package com.android.pjott.restaurantapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class LunchCategoryActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lunch_category);

        ArrayAdapter<Lunch> listAdapter = new ArrayAdapter<Lunch>(this,
                                    android.R.layout.simple_list_item_1,
                                    Lunch.lunchArray);
        ListView lunchList = (ListView) findViewById(R.id.lunch_list);
        lunchList.setAdapter(listAdapter);

        AdapterView.OnItemClickListener itemClickListener =
                new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> lunchList,
                                            View view,
                                            int position,
                                            long id) {
                        Intent intentLunchCategoryActivity = new Intent(LunchCategoryActivity.this,
                                LunchActivity.class);
                        intentLunchCategoryActivity.putExtra(LunchActivity.EXTRA_LUNCHID, (int) id);
                        startActivity(intentLunchCategoryActivity);
                    }
                };

        lunchList.setOnItemClickListener(itemClickListener);
    }
}
