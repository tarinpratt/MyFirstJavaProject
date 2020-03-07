package com.thinkful.app;
import java.util.Scanner;

public class WeightConverter {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Ask user for a String value
        System.out.printf("Please enter your weight in pounds: ");
        //read the String value into a variable

        Double weight = scanner.nextDouble();
        //print out the value

        Double kilos = 2.205;

        System.out.printf("%f is your weight in kilograms", weight / kilos );
    }

}