package com.ecommerce.service;

import com.ecommerce.model.Product;
import java.util.*;

public class CartService {
    private ArrayList<Product> cart= new ArrayList<>();
    public void addProduct(Product p) {
        cart.add(p);
    }
    
    public int calculateTotal() {
        int total = 0;
        for(Product p: cart) {
            total += p.getPrice();
        }
        return total;
    }

    public void displayCart() {
        for(Product p: cart) {
            p.display();
        }
    }
}
