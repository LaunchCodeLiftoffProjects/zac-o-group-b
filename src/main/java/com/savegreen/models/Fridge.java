package com.savegreen.models;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Fridge {

    private static final Map<Integer, GroceryItem> fridgeList = new HashMap<>();


    public static Collection<GroceryItem> getFridgeList() {
        return fridgeList.values();
    }

    public static GroceryItem getById(Integer id) {
        return fridgeList.get(id);
    }


    public static void add(GroceryItem item){
        fridgeList.put(item.getId(), item);
    }

    public static void remove(Integer id) {
        if(fridgeList.containsKey(id)) {
            fridgeList.remove(id);
        }

    }

}
