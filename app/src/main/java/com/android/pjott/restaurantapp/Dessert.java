package com.android.pjott.restaurantapp;

public class Dessert {

    private String dessertName;
    private String dessertDescription;
    private int dessertImageResourceId;

    public Dessert(String dessertName, String dessertDescription, int dessertImageResourceId) {
        this.dessertName = dessertName;
        this.dessertDescription = dessertDescription;
        this.dessertImageResourceId = dessertImageResourceId;
    }

    public static final Dessert[] desserts = {
            new Dessert("Chocolate Brownie", "Chocolate, pistachios, raspberry", R.drawable.chocolate_brownie),
            new Dessert("Pancakes", "Pancakes with chocolate sauce", R.drawable.pancakes),
            new Dessert("Strawberry  Pudding", "Granola, strawy, yogurth, berries", R.drawable.strawberry_pudding)
    };

    public String getDessertName() {
        return dessertName;
    }

    public String getDessertDescription() {
        return dessertDescription;
    }

    public int getDessertImageResourceId() {
        return dessertImageResourceId;
    }

    public String toString() {
        return this.dessertName;
    }
}
