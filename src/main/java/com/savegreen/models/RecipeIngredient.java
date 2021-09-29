package com.savegreen.models;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
public class RecipeIngredient {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

//    @ManyToOne
//    @NotNull(message = "Recipe is required")
//    private Recipe recipe;

    private Integer ingredientid;

    public Integer getIngredientid() {
        return ingredientid;
    }

    public void setIngredientid(Integer ingredientid) {
        this.ingredientid = ingredientid;
    }

    public Integer getid() {
        return id;
    }

    private Integer recipeid;

    public Integer getRecipeid() {
        return recipeid;
    }

    public void setRecipeid(Integer recipeid) {
        this.recipeid = recipeid;
    }
}
