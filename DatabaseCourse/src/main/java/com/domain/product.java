package com.domain;

public class product {
   public Integer price;
   public String name;

    @Override
    public String toString() {
        return "product{" + price + name + "}";
    }

    public Integer getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }
}
