package com.company;

public class BigSale implements Discount{
    int price;

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public void discount(int price) {
        System.out.println("you got %50 discount ! !\nNow you will only pay "+ price*50/100+ " instead of "+ price);
    }

}
