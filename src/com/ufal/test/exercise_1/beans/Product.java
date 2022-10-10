package com.ufal.test.exercise_1.beans;

import java.util.ArrayList;

public class Product {
    private ArrayList<Item> items;
    private String product;
    private double price;

    public Product() {

    }

    public Product(ArrayList<Item> items, String product, double price) {
        this.items = items;
        this.product = product;
        this.price = price;
    }

    public String getProduct() {
        return product;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "items=" + items +
                ", product='" + product + '\'' +
                ", price=" + price +
                '}';
    }
}
