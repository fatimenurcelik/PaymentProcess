package com.company;

public class Phone extends Product{
    public Phone(String productName , int price){
        super(productName, price);
        discount = new BigSale();
        cargo = new CardBoardBoxCargo();
        gift = new EmbossedPattern();
    }
}
