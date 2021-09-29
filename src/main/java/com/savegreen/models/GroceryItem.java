package com.savegreen.models;

import javax.persistence.Entity;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
public class GroceryItem extends AbstractEntity{

    @NotBlank(message = "Name is required")
    @Size(max = 100, message = "Name too long!")
    private String name;

    private String expires;

    public GroceryItem() {}

    public GroceryItem(String name, String expires) {
        this.name=name; this.expires=expires;
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

}
