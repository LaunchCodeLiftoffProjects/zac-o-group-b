package com.prismcortex.stayfreshfridge.models;

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
