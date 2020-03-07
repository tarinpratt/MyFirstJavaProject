package com.thinkful.app;
import java.util.Scanner;

public class NumberPrinter {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Please enter a 5 digit number: ");
    Integer number = scanner.nextInt();
    Integer numberCopy = number;

    while(numberCopy > 0) {
        int nums = numberCopy % 10;
        numberCopy = numberCopy / 10;
        System.out.println(nums);

    }

  }

}