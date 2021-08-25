package com.prismcortex.stayfreshfridge;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.prismcortex.stayfreshfridge.models.FoodItem;
import com.prismcortex.stayfreshfridge.models.ShoppingList;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ShoppingListTests {

    // ShoppingList class should create and store FoodItems

    ShoppingList testShoppingList = new ShoppingList();


    @Test

    public void testForCreateFoodMethod() {
        FoodItem testFood = testShoppingList.createFood("pork", "08/22/21");
        testShoppingList.addFoodToShopping(testFood);
       assertTrue(testShoppingList.getShoppingList().contains(testFood));
    }
}
