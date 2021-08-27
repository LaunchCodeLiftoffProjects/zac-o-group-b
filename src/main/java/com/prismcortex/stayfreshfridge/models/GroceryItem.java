package com.prismcortex.stayfreshfridge.models;

import java.util.Objects;

public class GroceryItem {
    // create FoodItem with id, name, and expiration date. Possibly nutrition facts as well in future.

    private int id;

    private static int nextId = 1;

    private String name;

    private String expires = "";

    // constructor to assign a unique ID number to each food item
    public GroceryItem() {
        id = nextId;
        nextId++;
    }

    public GroceryItem(String name, String expires) {
        this(); this.name=name; this.expires=expires;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getExpires() {
        return expires;
    }

    public void setExpires(String expires) {
        this.expires = expires;
    }

    @Override
    public String toString() {return name;}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GroceryItem groceryItem = (GroceryItem) o;
        return id == groceryItem.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
