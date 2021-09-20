package com.savegreen.models;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class ShoppingList {

    private static Map<Integer, GroceryItem> shoppingList = new HashMap<>();

    public static Collection<GroceryItem> getShoppingList() {
        return shoppingList.values();
    }

    public static GroceryItem getById(Integer id) {
        return shoppingList.get(id);
    }

    public static void add(GroceryItem item) {
        shoppingList.put(item.getId(), item);
    }

    public static void remove(Integer id) {
        if (shoppingList.containsKey(id)) {
            shoppingList.remove(id);
        }
    }
}
