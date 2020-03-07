package com.thinkful.app;
import java.util.Arrays;

public class Insertion {
    public static void main(String[] args) {

        int[] keys = {34, 12, 14, 17, 8, 3, 45, 56, 37, 27, 30, 19, 18, 53, 24};
        Arrays.sort(keys);
        for (int i : keys) {
          System.out.println(i);
        }
      }
   
}