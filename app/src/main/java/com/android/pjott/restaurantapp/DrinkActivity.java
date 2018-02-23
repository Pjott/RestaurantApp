package com.android.pjott.restaurantapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DrinkActivity extends Activity {

    public static final String EXTRA_DRINKID = "drinkId";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drink);

        //Gettig intetn fromDrinkCategoryActivity
        int drinkId = (Integer) getIntent().getExtras().get(EXTRA_DRINKID);
        Drink drink = Drink.drinks[drinkId];

        TextView drinkName = (TextView) findViewById(R.id.drink_name);
        drinkName.setText(drink.getDrinkName());

        TextView drinkDescription = (TextView) findViewById(R.id.drink_description);
        drinkDescription.setText(drink.getDrinkDescription());

        ImageView drinkPhoto = (ImageView) findViewById(R.id.drink_photo);
        drinkPhoto.setImageResource(drink.getDrinkImageResourceId());
        drinkPhoto.setContentDescription(drink.getDrinkName());
    }
}
