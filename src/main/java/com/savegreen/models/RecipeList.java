package com.savegreen.models;

import java.util.ArrayList;

public class RecipeList {

    private ArrayList<Recipe> recipeList = new ArrayList<>();

    public ArrayList<Recipe> getRecipeList() {
        return recipeList;
    }

    public void addRecipe(Recipe recipe) {
        recipeList.add(recipe);
    }

    public void deleteRecipe(Recipe recipe) {
        recipeList.remove(recipe);
    }
}
