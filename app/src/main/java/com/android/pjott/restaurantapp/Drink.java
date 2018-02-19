package com.android.pjott.restaurantapp;

public class Drink {
    private String drinkName;
    private String drinkDescription;
    private int drinkImageResourceId;

    private Drink(String drinkName, String drinkDescription, int drinkImageResourceId) {
        this.drinkName = drinkName;
        this.drinkDescription  = drinkDescription;
        this.drinkImageResourceId = drinkImageResourceId;
    }

    public static final Drink[] drinks = {
            new Drink("Coffee", "Coffee with milk", R.drawable.coffee),
            new Drink("Beer", "A delicious beer", R.drawable.beer),
            new Drink("Proseco", "Proseco", R.drawable.prosecco)
    };

    public String getDrinkName() {
        return drinkName;
    }

    public String getDrinkDescription() {
        return drinkDescription;
    }

    public int getDrinkImageResourceId() {
        return drinkImageResourceId;
    }

    public String toString() {
        return this.drinkName;
    }
}
