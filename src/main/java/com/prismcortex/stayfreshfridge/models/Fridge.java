package com.prismcortex.stayfreshfridge.models;

import java.util.ArrayList;
import java.util.HashMap;

public class Fridge {

    private ArrayList<FoodItem> fridgeList = new ArrayList<>();


    public ArrayList<FoodItem> getFridgeList() {
        return fridgeList;
    }

    public void addFoodItem(FoodItem food) {
        fridgeList.add(food);
    }

    public void deleteFoodItem(FoodItem food) {
        fridgeList.remove(food);
    }

}
