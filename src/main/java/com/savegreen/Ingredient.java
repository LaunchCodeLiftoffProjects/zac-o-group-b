package org.launchcode.recipeapp.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
public class Ingredient {
    @Id
    @GeneratedValue (strategy = GenerationType.SEQUENCE, generator = "ingredient_seq")
    private int Ingredient_id;

    @NotBlank(message = "Ingredient Name is required")
    @Size(max = 250, message = "Ingredient Name is too long!")
    private String ingredient_name;

    public int getIngredient_id() {
        return Ingredient_id;
    }

    public String getIngredient_name() {
        return ingredient_name;
    }

    public void setIngredient_name(String ingredient_name) {
        this.ingredient_name = ingredient_name;
    }

    public Ingredient(){

    }
}
