package com.savegreen.data;

import com.savegreen.models.GroceryItem;

import java.util.*;

public class ShoppingListData {


    private static final Map<Integer, GroceryItem> shoppingList = new HashMap<>();


    public static Collection<GroceryItem> getShoppingList() {
        return shoppingList.values();
    }

    public static GroceryItem getById(Integer id) {
        return shoppingList.get(id);
    }


    public static void add(GroceryItem item){
        shoppingList.put(item.getId(), item);
    }

    public static void remove(Integer id) {
        if(shoppingList.containsKey(id)) {
            shoppingList.remove(id);
        }

    }
}
