package com.thinkful.app;

public class OddSummer {
    public static void main(String[] args) {
        int[] keys = { 34, 12, 14, 17, 8, 3, 45, 56, 37, 27, 30, 19, 18, 53, 24 };
        int sum = 0;
        int count = 0;
        int even = 0;
        for(int i = 0; i < keys.length; i++) {
            if (keys[i] % 2 == 0) {
                even++;
            } else if (keys[i] % 2 != 0) {
                count++;
                sum += keys[i];
            }

        }

        System.out.printf("The sum of odd numbers is %d   ", sum);
    }
}