//package com.prismcortex.stayfreshfridge;
//
//import com.prismcortex.stayfreshfridge.models.Recipe;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//import org.springframework.boot.test.context.SpringBootTest;
//import static org.junit.jupiter.api.Assertions.assertEquals;
//
//@SpringBootTest
//public class RecipeTests {
//
//    // Write test to create recipe object that has id, name, ingredients, and directions.
//
//    Recipe testRecipe = new Recipe();
//
//    @BeforeEach
//    public void createTestRecipe(){
//        testRecipe.setName("Cereal");
//        testRecipe.setIngredients("milk, oats, raisins/fruit");
//        testRecipe.setDirections("Fill a medium bowl halfway with oats. Add desired fruit and milk then stir");
//    }
//
//    @Test
//    public void testForRecipeObjectName() {
//        assertEquals("Cereal", testRecipe.getName());
//    }
//
//    @Test
//    public void testForRecipeObjectIngredients() {
//        assertEquals("milk, oats, raisins/fruit", testRecipe.getIngredients());
//    }
//
//    @Test
//    public void testForRecipeObjectDirections() {
//        assertEquals("Fill a medium bowl halfway with oats. Add desired fruit and milk then stir", testRecipe.getDirections());
//    }
//}
