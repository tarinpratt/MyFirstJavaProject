package com.thinkful.app;
import java.util.Scanner;

public class TotalBill {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Ask user for a String value
        System.out.printf("Please enter total bill amount: ");
        //read the String value into a variable
        Double totalBill = scanner.nextDouble();
        //print out the value
        System.out.printf("Please enter tax rate: ");
        //read the String value into a variable
        Double tax = scanner.nextDouble();
        //print out the value
        System.out.printf("Please enter service charge: ");
        //read the String value into a variable
        Double service = scanner.nextDouble();
        //print out the value


        System.out.printf("The tax amount owed is %f \n", totalBill * tax / 100);
        System.out.printf("The service amount owed is %f \n", totalBill * service/ 100);
        System.out.printf("Total amount owed is %f \n", totalBill + totalBill * service / 100 + totalBill * tax / 100);
    }

}