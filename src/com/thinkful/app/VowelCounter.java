package com.thinkful.app;
import java.util.Scanner;

public class VowelCounter {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Ask user for a String value
        System.out.println("Please enter a string: ");
        //read the String value into a variable
        String str = scanner.next();
        //print out the value
        int vowelCount = 0;

        for( int i = 0; i < str.length(); i++) {
            char letter = str.charAt(i);
            if(letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter =='u'
                ||letter == 'A' || letter == 'E' || letter == 'I' || letter == 'O' || letter =='U') {
                    vowelCount++;
                }
        }


        System.out.println("Number of Vowels: " + vowelCount);
    }

}