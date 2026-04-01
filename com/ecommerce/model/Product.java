package com.ecommerce.model;

public class Product {
    private int id;
    private String name;
    private int price;
    public Product(int id, String name, int price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
    public int getPrice() {
        return price;
    }
    public void display() {
        System.out.println();
        System.out.println("Product ID: " + id);
        System.out.println("Product Name: " + name);
        System.out.println("Product Price: $" + price);
    }
   /*  public String getName() {
        return name;
    }
    public int getId() {
        return id;
    }*/
}
