package com.thinkful.app;
import java.util.Scanner;

public class Travel {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Please enter distance in miles: ");
    double distance = scanner.nextDouble();

    System.out.println("Please enter amount of time required to get to destination: ");
    double time = scanner.nextDouble();



    System.out.printf("The calculated speed to drive is %f", distance / time );

  }

}