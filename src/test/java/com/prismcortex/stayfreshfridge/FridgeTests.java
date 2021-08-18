package com.prismcortex.stayfreshfridge;

import com.prismcortex.stayfreshfridge.models.FoodItem;
import com.prismcortex.stayfreshfridge.models.Fridge;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.ArrayList;

@SpringBootTest
public class FridgeTests {

    FoodItem testFoodItem = new FoodItem();
    FoodItem testFoodItem1 = new FoodItem();

    Fridge testFridge = new Fridge();
    // Write before each that creates two food items and puts them in a hashmap
    @BeforeEach
    public void createFoodAndList() {
        testFoodItem.setName("pork");
        testFoodItem.setExpires("8/22/21");
        testFoodItem1.setName("beans");
        testFoodItem1.setExpires("8/22/21");
        testFridge.addFoodItem(testFoodItem);
        testFridge.addFoodItem(testFoodItem1);

    }

    @Test
    public void testForListOfFoodItems() {

    assertEquals(2, testFridge.getFridgeList().size());
    }
}
