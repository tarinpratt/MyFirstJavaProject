package com.thinkful.app;
import java.util.Scanner;

public class TemperatureConversion{
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Ask user for a String value
        System.out.printf("Please enter a celsius temperature: ");
        //read the String value into a variable
        Double celsius = scanner.nextDouble();
        //print out the value

        System.out.printf("If the temperature in celsius is %f \n", celsius);
        System.out.printf("Then the temperature in fahrenheit is %f \n", celsius * 1.8 + 32);
    }

}