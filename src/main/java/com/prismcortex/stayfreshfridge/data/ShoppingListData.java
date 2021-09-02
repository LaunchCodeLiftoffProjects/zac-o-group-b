package com.prismcortex.stayfreshfridge.data;

import com.prismcortex.stayfreshfridge.models.GroceryItem;

import java.util.*;

public class ShoppingListData {

    // store GroceryItems
    private static final Map<Integer, GroceryItem> shoppingList = new HashMap<>();
    // list all items

    public static Collection<GroceryItem> getShoppingList() {
        return shoppingList.values();
    }

    public static GroceryItem getById(Integer id) {
        return shoppingList.get(id);
    }

    // add groceryItem
    public static void add(GroceryItem item){
        shoppingList.put(item.getId(), item);
    }
    // delete groceryItem
    public static void remove(Integer id) {
        if(shoppingList.containsKey(id)) {
            shoppingList.remove(id);
        }

    }
}
