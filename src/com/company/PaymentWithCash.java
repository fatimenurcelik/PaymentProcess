package com.company;

import javax.xml.stream.events.DTD;
import java.util.Scanner;

public class PaymentWithCash extends  Shopping{
    Scanner s= new Scanner(System.in);

    public PaymentWithCash(Product product){
        super(product);
    }
    public PaymentWithCash(){}

    @Override
    public void PaymentMethod() {
        System.out.println("You are paying with cash ...");
        System.out.println("Do you want to buy with credit card? (yes or no)");
        String response1 = s.nextLine();
        if (response1.equals("yes")){
            System.out.println("Your payment is made by credit card . . . ");
            PayWithCreditCard();
        }else if (response1.equals("no")){
            System.out.println("we continue as cash . . .");
        }else{
            System.out.println("Wrong response");
            PaymentMethod();
        }
        paymentType = PaymentType.cash;

    }

    @Override
    public void PayWithCreditCard() {
        Scanner sc= new Scanner(System.in);
        System.out.println("Do you want to save your credit cart information? (yes or no)");
        String response2 = sc.nextLine();
        if (response2.equals("yes")){
            System.out.println("your credit cart information is saving . . . ");
            System.out.println("Paying with credit cart ...");
        }else if (response2.equals("no")){
            System.out.println("Paying with credit cart without saving . . . ");
        }else{
            System.out.println("Wrong response");
            PayWithCreditCard();
        }
    }

}
