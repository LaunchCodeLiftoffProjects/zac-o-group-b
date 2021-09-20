package com.savegreen.models;
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