package com.savegreen.models;

import javax.persistence.Entity;

@Entity
public class FridgeItem extends AbstractEntity{

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
