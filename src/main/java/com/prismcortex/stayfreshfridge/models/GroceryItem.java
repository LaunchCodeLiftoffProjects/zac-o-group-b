package com.prismcortex.stayfreshfridge.models;

import javax.persistence.Entity;
import java.util.Objects;
@Entity
public class GroceryItem extends AbstractEntity{

    private String expires;

    public GroceryItem() {}

    public GroceryItem(String name, String expires) {
        this.expires=expires;
    }

    public String getExpires() {
        return expires;
    }

    public void setExpires(String expires) {
        this.expires = expires;
    }

}
