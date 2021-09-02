package com.prismcortex.stayfreshfridge.models;

import java.util.Objects;

public class GroceryItem {
    // create FoodItem with name, and expiration date. Possibly nutrition facts as well in future.
    private int id;
    private static int nextId = 1;

    private String name;

    private Integer expires;


    public GroceryItem() {

    }

    public GroceryItem(String name, Integer expires) {
        this(); this.name=name; this.expires=expires; this.id=nextId; nextId++;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getExpires() {
        return expires;
    }

    public void setExpires(Integer expires) {
        this.expires = expires;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {return name;}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GroceryItem that = (GroceryItem) o;
        return id == that.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
