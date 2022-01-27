package com.company;

public class Clothes extends Product{
    public Clothes(String productName , int price) {
        super(productName, price);
        discount = new BigSale();
        cargo = new PochetteCargo();
    }
}
