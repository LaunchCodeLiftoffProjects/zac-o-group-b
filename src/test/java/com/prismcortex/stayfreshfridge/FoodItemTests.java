package com.prismcortex.stayfreshfridge;

import com.prismcortex.stayfreshfridge.models.FoodItem;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class FoodItemTests {
    FoodItem testFoodItem = new FoodItem();

    @BeforeEach
    public void createTestFoodItem() {
        testFoodItem.setName("milk");
        testFoodItem.setExpires("8/13/21");
    }


    @Test
    public void testForFoodItemObjectName() {
        assertEquals("milk", testFoodItem.getName());
    }

    @Test
    public void testForFoodItemObjectExpires() {
        assertEquals("8/13/21", testFoodItem.getExpires());
    }
}
