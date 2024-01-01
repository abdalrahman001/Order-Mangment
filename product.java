
package com.company;

import java.util.ArrayList;
import java.util.List;

public class Product {
    public List<Product> products=new ArrayList<>();
    private String serialNumber;
    private String category;
    private double price;
    private String name;
    private int quantity;
    private String vendor;

    public Product(String serialNumber, String category, double price, String name, int quantity, String vendor) {
        this.serialNumber = serialNumber;
        this.category = category;
        this.price = price;
        this.name = name;
        this.quantity = quantity;
        this.vendor = vendor;
    }
    public void increaseQuantity(){
        quantity++;
    }
    public String getSerialNumber() {
        return serialNumber;
    }
    public String getCategory() {
        return category;
    }
    public double getPrice() {
        return price;
    }
    public String getName() {
        return name;
    }
    public int getQuantity() {
        return quantity;
    }
    public boolean decreaseQuantity() {
        if ( quantity > 0 ) {
            quantity -= 1;
            return true;
        } else {
            System.out.println("No more product in stock");
            return false;
        }
    }
}
