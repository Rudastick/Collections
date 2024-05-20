package pl.kurs.list.homework06.services.homework07.model;

import java.util.*;

public class ShoppingCart {
    private Stack<Product> products;

    public ShoppingCart() {
        this.products = new Stack<>();
    }

    public void addProduct(Product product) {
        products.push(product);
    }
    public void takeProduct(){
        products.pop();
    }

    @Override
    public String toString() {
        return "ShoppingCart{" +
                "products=" + products +
                ']';
    }
}
