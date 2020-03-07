package com.thinkful.app;
import java.util.Scanner;

public class SayHello {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter your name: ");
        String name = scanner.next();
        System.out.printf("hello %d, very nice to meet you!", name);    
    }
}

// Change the word “String” on line 4 to “string”
//compile time - invalid syntax
// Change the word “public” on line 3 to “Public”
//compile time - invalid syntax
// Change the word “Hello” on line 8 to “hello”.
//no error
// Change the ‘%s’ on line 8 to ‘%d’.
// run time  alters what argument type is taken from string to decimal integer at time of printing
// Move the open curly brace at the end of line 4 to the beginning of line 5.
//no error
// Change the word “println” on line 6 to “print”.
//no error
// Remove the square brackets on line 4.
//run time error - args must be an array
