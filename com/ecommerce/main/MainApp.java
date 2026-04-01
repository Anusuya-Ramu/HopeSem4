package com.ecommerce.main;
import com.ecommerce.model.Product;
import com.ecommerce.service.CartService;
import com.ecommerce.util.DiscountUtil;



public class MainApp {
    public static void main(String[] args) {
        CartService cart = new CartService();
        Product p1 = new Product(1, "iPhone 18 pro max", DiscountUtil.applyDiscount(175000));
        Product p2 = new Product(2, "Samsung Galaxy S30", DiscountUtil.applyDiscount(6000));
        cart.addProduct(p1);
        cart.addProduct(p2);
        cart.displayCart();
        int totalAmount = cart.calculateTotal();
        System.out.println("Total Amount: $" + totalAmount);
    }
}
