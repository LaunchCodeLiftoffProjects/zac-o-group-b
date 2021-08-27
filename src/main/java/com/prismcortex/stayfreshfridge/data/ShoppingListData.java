package com.prismcortex.stayfreshfridge.data;

import com.prismcortex.stayfreshfridge.models.GroceryItem;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class ShoppingListData {

    // store GroceryItems
    private static final Map<Integer, GroceryItem> shoppingList = new HashMap<>();
    // list all items
    public static Collection<GroceryItem> getAll() {
        return shoppingList.values();
    }
    // add groceryItem
    public static void add(GroceryItem item){
        shoppingList.put(item.getId(), item);
    }
    // delete groceryItem
    public static void remove(int id) {
        shoppingList.remove(id);
    }
}
