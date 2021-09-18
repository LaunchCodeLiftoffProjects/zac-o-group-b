//package com.prismcortex.stayfreshfridge;
//
//import com.prismcortex.stayfreshfridge.models.Recipe;
//import com.prismcortex.stayfreshfridge.models.RecipeList;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//import org.springframework.boot.test.context.SpringBootTest;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//
//@SpringBootTest
//public class RecipeListTests {
//
//    Recipe testRecipe = new Recipe();
//    Recipe testRecipe1 = new Recipe();
//    RecipeList testRecipeList = new RecipeList();
//
//    @BeforeEach
//    public void createTestRecipe(){
//        testRecipe.setName("Cereal");
//        testRecipe.setIngredients("milk, oats, raisins/fruit");
//        testRecipe.setDirections("Fill a medium bowl halfway with oats. Add desired fruit and milk then stir");
//        testRecipe1.setName("Smashed Potatoes");
//        testRecipe1.setIngredients("8 potatoes, 1 stick butter, 1 cup sour cream, 1 cup milk");
//        testRecipe1.setDirections("SMASH THE POTATOES!!");
//        testRecipeList.addRecipe(testRecipe);
//        testRecipeList.addRecipe(testRecipe1);
//    }
//
//    @Test
//    public void testForListOfRecipes() {
//
//        assertEquals(2, testRecipeList.getRecipeList().size());
//    }
//
//    @Test
//    public void testToDeleteRecipes() {
//        testRecipeList.deleteRecipe(testRecipe1);
//        assertEquals(1, testRecipeList.getRecipeList().size());
//    }
//
//}
