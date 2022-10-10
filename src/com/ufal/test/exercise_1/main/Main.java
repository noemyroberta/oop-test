package com.ufal.test.exercise_1.main;

import com.ufal.test.exercise_1.beans.Item;
import com.ufal.test.exercise_1.beans.Product;
import com.ufal.test.exercise_1.beans.Purchase;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Item> skirtItems = new ArrayList<Item>();
        skirtItems.add(new Item("tecido", "2m"));
        skirtItems.add(new Item("tinta", "10ml"));

        Product skirt = new Product(skirtItems, "saia rosa", 25.00);
        Purchase purchase = new Purchase();
        purchase.addToProductList(skirt);
        purchase.productsList();
        purchase.buy();
    }
}
