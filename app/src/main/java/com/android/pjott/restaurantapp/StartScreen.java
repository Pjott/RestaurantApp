package com.android.pjott.restaurantapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class StartScreen extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_screen);

        AdapterView.OnItemClickListener itemClickListener =
                new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> listView, View itemView, int position, long id) {
                        if (position == 0) {
                            Intent startIntent = new Intent(StartScreen.this, Menu.class);
                            startActivity(startIntent);
                        }
                    }
                };

        ListView startScreenListView = (ListView) findViewById(R.id.main_options_list);
        startScreenListView.setOnItemClickListener(itemClickListener);

    }
}
