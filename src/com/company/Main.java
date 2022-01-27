package com.company;

public class Main {

    public static void main(String[] args) {
        
        Product p = new Phone("xiaomi mi 11 lite", 50000);
        p.applyDiscount(p.getPrice());
        p.putCargo();
        p.giftWrapped();

        Shopping s1 = new PaymentWithCash(p);
        s1.TemplateMethod();

        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++");

        Product p2 = new Clothes("tshirt",50);
        p2.applyDiscount(p2.getPrice());
        p2.putCargo();

        Shopping s2 = new PaymentWithHirePurchase(p2);
        s2.TemplateMethod();

    }
}

