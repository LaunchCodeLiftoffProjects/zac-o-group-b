package org.launchcode.recipeapp.models;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
public class RecipeIngredient {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer recipe_ingredients_id;

//    @ManyToOne
//    @NotNull(message = "Recipe is required")
//    private Recipe recipe;

    private Integer ingredient_id_r;

    public Integer getIngredient_id_r() {
        return ingredient_id_r;
    }

    public void setIngredient_id_r(Integer ingredient_id_r) {
        this.ingredient_id_r = ingredient_id_r;
    }

//    public Recipe getRecipe() {
//        return recipe;
//    }
//
//    public void setRecipe(Recipe recipe) {
//        this.recipe = recipe;
//    }

    public Integer getRecipe_ingredients_id() {
        return recipe_ingredients_id;
    }

    private Integer recipe_id_r;

    public Integer getRecipe_id_r() {
        return recipe_id_r;
    }

    public void setRecipe_id_r(Integer recipe_id_r) {
        this.recipe_id_r = recipe_id_r;
    }
}
