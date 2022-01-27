package com.company;

public abstract class Product {
    private String productName;
    private int price;

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Discount getDiscount() {
        return discount;
    }

    public void setDiscount(Discount discount) {
        this.discount = discount;
    }

    Discount discount;
    cargo cargo;
    canBeGiftWrapped gift;

    public Product(){}
    public Product(String productName, int price){
        this.price=price;
        this.productName= productName;
    }

    public void applyDiscount(int price){
        discount.discount(price);
    }

    public  void putCargo(){
        cargo.cargoBehavior();
    }

    public void giftWrapped(){
        gift.GiftWrapped();
    }
}
