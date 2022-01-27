package com.company;

import java.util.Locale;
import java.util.Scanner;

public class PaymentWithHirePurchase extends Shopping{
    Scanner s = new Scanner(System.in);

    public PaymentWithHirePurchase(Product product){
        super(product);
    }

    @Override
    public void PaymentMethod() {
        System.out.println("You are paying with hire-purchase . . . ");
        PayWithCreditCard();
        paymentType = PaymentType.hirePurchase;
    }

    @Override
    public void PayWithCreditCard() {
        howManyInstallments();
        System.out.println("Do you want to save your credit cart information? (yes or no)");
        Scanner sca = new Scanner(System.in);
        String response3 = sca.nextLine();
        if (response3.equals("yes")) {
            System.out.println("your credit cart information is saving . . .");
            System.out.println("Paying with credit cart ...");
        } else if (response3.equals("no")) {
            System.out.println("Paying with credit cart without saving . . .");
        } else {
            System.out.println("Wrong response");
            PayWithCreditCard();
        }
    }

    public void howManyInstallments(){
        System.out.println("How many installments do you want to pay? (You can make up to 12 installments.)");
        int response2 = s.nextInt();
        for (int i = 1; i < 13; i++) {
            if (response2 == i) {
                System.out.println("your transaction is divided into " + response2 + " installments");
            }
        }
        if (response2 < 1 || response2 > 12) {
            System.out.println("Wrong response");
            howManyInstallments();
        }
    }
}
