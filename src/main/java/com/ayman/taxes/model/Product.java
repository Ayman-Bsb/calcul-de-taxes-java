package com.ayman.taxes.model;

import com.ayman.taxes.type.ProductType;

public class Product {
    private String name;
    private double price;
    private boolean isImported;
    private ProductType type;

    public Product(String name, double price, boolean isImported, ProductType type) {
        this.name = name;
        this.price = price;
        this.isImported = isImported;
        this.type = type;
    }

    public String getName() {
        return name;
    }
    public double getPrice() {
        return price;
    }
    public boolean isImported() {
        return isImported;
    }
    public ProductType getType() {
        return type;
    }
}

