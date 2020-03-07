package com.thinkful.app;
import java.util.Scanner;

public class CollatzConjecture{
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Ask user for a String value
        System.out.printf("Please enter a number: ");
        //read the String value into a variable
        Integer num = scanner.nextInt();
        //print out the value
        
        do {
        if (num % 2 == 0) {
            num = num / 2;
        } else {
            num = 3 * num + 1;
        }
        System.out.println(num);
        }
        while(num != 1);

    }

}