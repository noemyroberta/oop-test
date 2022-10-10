package com.ufal.test.exercise_1.beans;

import java.util.ArrayList;

public class Purchase {
    //revisar nome da classe
    private final ArrayList<Product> products = new ArrayList<Product>();

    public Purchase() {

    }

    public void addToProductList(Product product) {
        products.add(product);
        System.out.println("Produto " + product.getProduct() + " added successfully!");
    }

    public void buy() {
        double totalPrice = 0.0;

        for (Product p : products) {
            totalPrice += p.getPrice();
        }

        System.out.println("Purchase total value R$" + totalPrice + ".");
    }

    public void productsList() {
        StringBuilder productsName = new StringBuilder();

        for (Product p : products) {
            productsName.append(p.getProduct().toString());
            productsName.append("\n");
        }

        System.out.println("Products [ " + productsName + "]");
    }
}
