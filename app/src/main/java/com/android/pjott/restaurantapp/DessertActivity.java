package com.android.pjott.restaurantapp;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DessertActivity extends Activity {

    public static final String EXTRA_DESSERTID = "dessertId";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dessert);

        int dessertId = (Integer) getIntent().getExtras().get(EXTRA_DESSERTID);
        Dessert dessert = Dessert.desserts[dessertId];

        TextView drinkName = (TextView) findViewById(R.id.dessert_name);
        drinkName.setText(dessert.getDessertName());

        TextView drinkDescription = (TextView) findViewById(R.id.dessert_description);
        drinkDescription.setText(dessert.getDessertDescription());

        ImageView drinkPhoto = (ImageView) findViewById(R.id.dessert_photo);
        drinkPhoto.setImageResource(dessert.getDessertImageResourceId());
        drinkPhoto.setContentDescription(dessert.getDessertName());
    }
}
