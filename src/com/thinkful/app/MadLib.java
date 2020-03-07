package com.thinkful.app;
import java.util.Scanner;

public class MadLib {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Ask user for a String value
        System.out.println("Please enter your name: ");
        //read the String value into a variable
        String name = scanner.next();
        //print out the value

        System.out.println("Please enter 1 adjective: ");
        //read the String value into a variable
        String adj1 = scanner.next();
        //print out the value

        System.out.println("Please enter a second adjective: ");
        //read the String value into a variable
        String adj2 = scanner.next();
        //print out the value

        System.out.println("Please enter a 3rd adjective ");
        //read the String value into a variable
        String adj3 = scanner.next();
        //print out the value

        System.out.println("Please enter a 4th adjective: ");
        //read the String value into a variable
        String adj4 = scanner.next();
        //print out the value

        System.out.println("Please enter a 5th adjective: ");
        //read the String value into a variable
        String adj5 = scanner.next();
        //print out the value

        System.out.println("Please enter a workplace type: ");
        //read the String value into a variable
        String workplace = scanner.next();
        //print out the value

        System.out.println("Please enter a personal characteristic: ");
        //read the String value into a variable
        String personalCharacteristic = scanner.next();
        //print out the value

        System.out.println("Please enter a personality trait: ");
        //read the String value into a variable
        String personalityTrait = scanner.next();
        //print out the value

        System.out.println("Please enter a verb: ");
        //read the String value into a variable
        String verb = scanner.next();
        //print out the value

        System.out.println("Please enter a pronoun to be referred by: ");
        //read the String value into a variable
        String pronoun = scanner.next();
        //print out the value
        
        System.out.printf(
            "%s is a person of an %s disposition and is %s in the %s for his %s and %s of his %s."
             + " This This circumstance, added to his well-known %s and %s courage, made me very desirous to %s  %s.",
              name, adj1, adj2,
               workplace, adj3, adj4,
                personalCharacteristic, personalityTrait,
                 adj5, verb, pronoun);
    }

}