package com.prismcortex.stayfreshfridge.models;

import java.util.ArrayList;

public class ShoppingList {

    private ArrayList<FoodItem> shoppingList = new ArrayList<>();

    public FoodItem createFood(String name, String expires) {
        FoodItem food = new FoodItem();
        food.setName(name); food.setExpires(expires);
        return food;
    }

    public ArrayList<FoodItem> getShoppingList() {
        return shoppingList;
    }

    public void addFoodToShopping(FoodItem food) {
        shoppingList.add(food);
    }
}
