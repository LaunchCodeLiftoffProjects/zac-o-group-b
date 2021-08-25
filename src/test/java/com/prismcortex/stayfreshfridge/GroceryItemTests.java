package com.prismcortex.stayfreshfridge;

import com.prismcortex.stayfreshfridge.models.GroceryItem;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class GroceryItemTests {
    GroceryItem testGroceryItem = new GroceryItem();

    @BeforeEach
    public void createTestFoodItem() {
        testGroceryItem.setName("milk");
        testGroceryItem.setExpires("8/13/21");
    }


    @Test
    public void testForFoodItemObjectName() {
        assertEquals("milk", testGroceryItem.getName());
    }

    @Test
    public void testForFoodItemObjectExpires() {
        assertEquals("8/13/21", testGroceryItem.getExpires());
    }
}
