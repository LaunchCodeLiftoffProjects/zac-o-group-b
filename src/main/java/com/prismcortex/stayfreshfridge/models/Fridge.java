package com.prismcortex.stayfreshfridge.models;

import java.util.ArrayList;

public class Fridge {

    private ArrayList<GroceryItem> fridgeList = new ArrayList<>();


    public ArrayList<GroceryItem> getFridgeList() {
        return fridgeList;
    }

    public void addFoodItem(GroceryItem food) {
        fridgeList.add(food);
    }

    public void deleteFoodItem(GroceryItem food) {
        fridgeList.remove(food);
    }

}
