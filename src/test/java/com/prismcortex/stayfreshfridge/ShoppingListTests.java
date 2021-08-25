package com.prismcortex.stayfreshfridge;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.prismcortex.stayfreshfridge.models.GroceryItem;
import com.prismcortex.stayfreshfridge.models.ShoppingList;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ShoppingListTests {

    // ShoppingList class should create and store FoodItems


    ShoppingList testShoppingList = new ShoppingList();
    GroceryItem testFood = testShoppingList.createItem("pork", "08/22/21");
    GroceryItem testFood1 = testShoppingList.createItem("beans", "08/22/21");
    @BeforeEach
    public void createList() {
        testShoppingList.addItem(testFood);
        testShoppingList.addItem(testFood1);
    }




    @Test
    public void testForCreateItemMethod() {
        assertTrue(testShoppingList.getShoppingList().contains(testFood));
    }

    @Test
    public void testForMultipleItemsInList() {
        assertEquals(2, testShoppingList.getShoppingList().size());
    }

    @Test
    public void testToDeleteItem() {
        testShoppingList.deleteItem(testFood);
        assertEquals(1, testShoppingList.getShoppingList().size());
    }
}
