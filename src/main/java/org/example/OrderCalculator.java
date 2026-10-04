package org.example;

public class OrderCalculator {

    public double calculateTotal(double price , int quantity){
        if(price  <= 0){
            throw new IllegalArgumentException("Price must be Positive or Greater than zero");
        }
        if(quantity  < 0){
            throw new IllegalArgumentException("Quantity must be Positive");
        }

        return price * quantity;
    }
}
