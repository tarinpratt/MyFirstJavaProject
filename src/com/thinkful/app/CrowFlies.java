package com.thinkful.app;
import java.util.Scanner;

public class CrowFlies {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Please enter first x coordinate in degrees: ");
    double xOne = scanner.nextDouble();

    System.out.println("Please enter first y coordinate in degrees: ");
    double yOne = scanner.nextDouble();

    System.out.println("Please enter second x coordinate in degrees: ");
    double xTwo = scanner.nextDouble();

    System.out.println("Please enter second y coordinate in degrees: ");
    double yTwo = scanner.nextDouble();

    double deltaY = Math.toRadians(yTwo - yOne);
    xOne = Math.toRadians(xOne);
    xTwo = Math.toRadians(xTwo);
    double a = Math.pow(Math.sin((xTwo - xOne)/2), 2) + Math.cos(xOne) * Math.cos(xTwo) * Math.pow(Math.sin(deltaY / 2), 2);
    double c  = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));
    double d = 6371 * c;

    if (d < 1) {
        System.out.printf("Dude! We are practically in the same place!");
    } else if ( d > 1 && d < 5) {
        System.out.printf("Hey! That’s close enough, let’s hang out!");
    } else {
        System.out.printf("Whoa! Too far!"); 
    }

    System.out.printf("The calculated distance is %f km", d);

  }

}