package com.prismcortex.stayfreshfridge;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


import com.prismcortex.stayfreshfridge.data.ShoppingListData;
import com.prismcortex.stayfreshfridge.models.GroceryItem;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

//@SpringBootTest
//public class ShoppingListTests {
//
//    // ShoppingList class should create and store FoodItems
//    GroceryItem testItem = new GroceryItem("pork", 10);
//    GroceryItem testItem1 = new GroceryItem("beans", 0);
//
//
//    @Test
//    public void testForAddItem() {
//        ShoppingListData.getShoppingList();
//
//        ShoppingListData.add(testItem);
//        assertTrue(ShoppingListData.getShoppingList().contains(testItem));
//    }
//
//    @Test
//    public void testForMultipleItemsInList() {
//
//        ShoppingListData.add(testItem);
//        ShoppingListData.add(testItem1);
//        assertEquals(2, ShoppingListData.getShoppingList().size());
//    }
//
//    @Test
//    public void testToDeleteItem() {
//        ShoppingListData.getShoppingList().removeAll(ShoppingListData.getShoppingList());
//        ShoppingListData.add(testItem);
//        ShoppingListData.add(testItem1);
//        ShoppingListData.remove(testItem.getId());
//        assertEquals(1, ShoppingListData.getShoppingList().size());
//    }
//}
