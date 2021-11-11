package com.savegreen.models;

import javax.persistence.Entity;
import javax.validation.constraints.NotBlank;

@Entity
public class FridgeItem extends AbstractEntity{

    @NotBlank(message= "Name is required")
    private String name;


    private String expires;

    public FridgeItem() {}

    public FridgeItem(String name, String expires) {
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
