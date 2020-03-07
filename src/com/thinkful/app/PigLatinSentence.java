package com.thinkful.app;
import java.util.Arrays;
import java.util.Scanner;


public class PigLatinSentence {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a string: ");
        String plainText = scanner.next();
    
        final char[] vowels = "aeiou".toCharArray();
        final char[] consonants = "bcdfghjklmnpqrstvwxyz".toCharArray();
    
        String[] words = plainText.split("\\s");

        StringBuffer sb = new StringBuffer();
    
        for (String word : words) {
          if (Arrays.binarySearch(vowels, word.toLowerCase().charAt(0)) > -1 || word.length() == 1) {
            sb.append(word).append("ay");
          } else if (Arrays.binarySearch(consonants, word.toLowerCase().charAt(0)) > -1) {
            sb.append(word.substring(1)).append(word.charAt(0)).append("ay");
          }
          sb.append(" ");
        }
    
        System.out.println(sb.toString());

    }

}