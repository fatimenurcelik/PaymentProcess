package com.company;

public abstract class Shopping {

    protected PaymentType paymentType;
    private int maxDeliveryTime = 10;
    private Product product;

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Shopping(){}

    public int getMaxDeliveryTime() {
        return maxDeliveryTime;
    }

    public void setMaxDeliveryTime(int maxDeliveryTime) {
        this.maxDeliveryTime = maxDeliveryTime;
    }

    public Shopping(Product product){
      this.product=product;
    }

    void Start() {
        System.out.println("Payment operation is start :) ");
    }
    void showProduct(String p){
        System.out.println("Your "+product.getProductName()+" getting ready.");
    }
    abstract public void PaymentMethod();
    abstract public void PayWithCreditCard();
    void Finish(String p) {
        System.out.println("Shopping done. "+product.getProductName()+" bought with "+paymentType + ". Use it in good times. :)  Thank you for choosing us.");
    }
    public void TemplateMethod()
    {
        Start();
        showProduct(product.getProductName());
        PaymentMethod();
        Finish(product.getProductName());
    }
}
