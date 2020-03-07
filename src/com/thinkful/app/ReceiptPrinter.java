package com.thinkful.app;

public class ReceiptPrinter {
    public static void main (String[] args) {
        String title = "Bill";
        System.out.println(title);

        String dashes = "------------------";
        System.out.println(dashes);

        String pizza = "Pizza       $12.99";
        System.out.println(pizza);

        String soda = "Soda         $1.25";
        System.out.println(soda);

        String cookies = "Cookies      $2.50";
        System.out.println(cookies);

        String subtotal = "SubTotal:   $16.74";
        System.out.println(subtotal);

        String tax = "Tax(10%):    $1.67";
        System.out.println(tax);

        String service = "Service(15%):$2.51";
        System.out.println(service);
        System.out.println(dashes);

        String total = "Total:      $20.92";
        System.out.println(total);
        System.out.println(dashes);
   
    }

}