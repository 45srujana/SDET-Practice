package org.example;

public class Flipkart_Check_Out_Flow_A1 {
    String product_name="Iphone-16 Pro";
    String address="XYZ COLONY";
    String payment_type="COD";
    String success_mesg="Thank you !!";
    public String select_product(){
return "Product name : "+ product_name;
    }
    public String product_checkout(){
        return "Delivering Address : "+address+"\n"+"Payment mode : "+payment_type;
    }
    public String Oder_placed(){
        return success_mesg +product_name+" placed will be delivered soon.";
    }
}
