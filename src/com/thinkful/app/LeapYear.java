package com.thinkful.app;
import java.util.Scanner;

public class LeapYear{
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        String goAgain = "y";
        do {
        //Ask user for a String value
        System.out.printf("Please enter a year: ");
        //read the String value into a variable
        Integer year = scanner.nextInt();
        //print out the value
        if (year < 1584 || year > 3000) {
            System.out.println("Enter a year that is between 1584 and 3000");
        } else if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println("It's a leap year");
        } else {
            System.out.println("It's not a leap year");
        }

        System.out.println("Continue (y/n)?: ");
        goAgain = scanner.next();

        }
        while(goAgain.equals("y") || goAgain.equals("yes"));

    }

}