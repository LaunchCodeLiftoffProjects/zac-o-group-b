package com.savegreen;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

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
