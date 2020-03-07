package com.thinkful.app;
import java.util.Scanner;

public class SalaryCalculator {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Ask user for a String value
        System.out.print("Please enter your hourly rate: ");
        //read the String value into a variable

        int hrlyRate = scanner.nextInt();
        //print out the value

        System.out.print("Please enter how many hours you work per week: ");
        //read the String value into a variable
        int numOfHours = scanner.nextInt();
        //print out the value
        int overtime = 0;

        if(numOfHours > 40) {
            overtime = numOfHours - 40;
            numOfHours = 40;
        }

        //int salary = Math.multiplyExact(hrlyRate, numOfHours);

        System.out.println(hrlyRate * numOfHours + 1.5 * hrlyRate * overtime);
    }

}