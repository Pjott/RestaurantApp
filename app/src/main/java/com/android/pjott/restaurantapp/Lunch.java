package com.android.pjott.restaurantapp;

public class Lunch {

    private String lunchName;
    private String lunchDescription;
    private int lunchImageResourceId;

    private Lunch(String lunchName, String lunchDescription, int lunchImageResourceId) {
        this.lunchName = lunchName;
        this.lunchDescription = lunchDescription;
        this.lunchImageResourceId = lunchImageResourceId;
    }

    public static final Lunch[] lunchArray = {
            new Lunch("Paella", "Rice, prawns, chicken, vegetables", R.drawable.paella),
            new Lunch("Springrolls", "Rice wrappers, rice, chilli, beef, soy sauce", R.drawable.springrolls),
            new Lunch("Vege Burger", "tomatoes, beetroot, hummus, broad beans, carrots, cucumber, salad, avocado", R.drawable.vege_burger),
            new Lunch("Avocado", "avocado, eggs, bacon, chive, chicken", R.drawable.avocado)
    };

    public String getLunchName() {
        return lunchName;
    }

    public String getLunchDescription() {
        return lunchDescription;
    }

    public int getLunchImageResourceId() {
        return lunchImageResourceId;
    }

    public String toString() {
        return this.lunchName;
    }

}
