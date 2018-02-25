package com.android.pjott.restaurantapp;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class LunchActivity extends Activity {

    public static final String EXTRA_LUNCHID = "lunchId";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lunch);

        int lunchId = (Integer) getIntent().getExtras().get(EXTRA_LUNCHID);
        Lunch lunch = Lunch.lunchArray[lunchId];

        TextView lunchName = (TextView) findViewById(R.id.lunch_name);
        lunchName.setText(lunch.getLunchName());

        TextView lunchDescription = (TextView) findViewById(R.id.lunch_description);
        lunchDescription.setText(lunch.getLunchDescription());

        ImageView lunchPhoto = (ImageView) findViewById(R.id.lunch_photo);
        lunchPhoto.setImageResource(lunch.getLunchImageResourceId());
        lunchPhoto.setContentDescription(lunch.getLunchName());
    }
}
