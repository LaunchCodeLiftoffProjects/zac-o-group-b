package com.prismcortex.stayfreshfridge.models;
<<<<<<< HEAD
import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Recipe {

    @Id
    @GeneratedValue
    private int recipe_id;

//    @OneToMany(mappedBy = "recipe")
//    @JoinColumn(name = "recipe_id",table = "recipe_ingredients")

    @NotBlank(message = "Recipe Name is required")
    @Size(max = 250, message = "Recipe Name is too long!")
    private String recipe_name;

    @NotBlank(message = "Recipe Description is required")
    private String recipe_description;

    @NotBlank(message = "Recipe Details is required")
    private String recipe_details;

    @Size(max = 6000, message = "Image URL is too long!")
    private String recipe_img_url;

    public String getRecipe_description() {
        return recipe_description;
    }

    public String getRecipe_img_url() {
        return recipe_img_url;
    }

    public void setRecipe_img_url(String recipe_img_url) {
        this.recipe_img_url = recipe_img_url;
    }

    public void setRecipe_description(String recipe_description) {
        this.recipe_description = recipe_description;
    }

    public String getRecipe_details() {
        return recipe_details;
    }

    public void setRecipe_details(String recipe_details) {
        this.recipe_details = recipe_details;
    }

    public int getRecipe_id() {
        return recipe_id;
    }

    public String getRecipe_name() {
        return recipe_name;
    }

    public void setRecipe_name(String recipe_name) {
        this.recipe_name = recipe_name;
    }

    public Recipe(){

    }

}
=======

import java.util.Objects;

public class Recipe {

    private int id;

    private static int nextId = 1;

    private String name;

    private String ingredients;

    private String directions;

    public Recipe() {
        id = nextId;
        nextId++;
    }

    public Recipe(String name, String ingredients, String directions) {
        this.name=name; this.ingredients=ingredients; this.directions=directions;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIngredients() {
        return ingredients;
    }

    public void setIngredients(String ingredients) {
        this.ingredients = ingredients;
    }

    public String getDirections() {
        return directions;
    }

    public void setDirections(String directions) {
        this.directions = directions;
    }

    @Override
    public String toString() {return name;}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Recipe recipe = (Recipe) o;
        return id == recipe.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
>>>>>>> Nates_Branch
