package com.prismcortex.stayfreshfridge.models;

import java.util.ArrayList;

public class ShoppingList {

    private ArrayList<GroceryItem> shoppingList = new ArrayList<>();

    public GroceryItem createItem(String name, String expires) {
        GroceryItem food = new GroceryItem();
        food.setName(name); food.setExpires(expires);
        return food;
    }

    public ArrayList<GroceryItem> getShoppingList() {
        return shoppingList;
    }

    public void addItem(GroceryItem food) {
        shoppingList.add(food);
    }

    public void deleteItem(GroceryItem food) {shoppingList.remove(food);}
}
