package com.prismcortex.stayfreshfridge;

import com.prismcortex.stayfreshfridge.models.GroceryItem;
import com.prismcortex.stayfreshfridge.models.Fridge;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class FridgeTests {

    GroceryItem testGroceryItem = new GroceryItem();
    GroceryItem testGroceryItem1 = new GroceryItem();

    Fridge testFridge = new Fridge();
    // Write before each that creates two food items and puts them in an ArrayList
    @BeforeEach
    public void createFoodAndList() {
        testGroceryItem.setName("pork");
        testGroceryItem.setExpires(10);
        testGroceryItem1.setName("beans");
        testGroceryItem1.setExpires(0);
        testFridge.addFoodItem(testGroceryItem);
        testFridge.addFoodItem(testGroceryItem1);

    }

    @Test
    public void testForListOfFoodItems() {

    assertEquals(2, testFridge.getFridgeList().size());
    }


}
