package com.thinkful.app;
import java.util.Scanner;
import java.util.Arrays; 

public class ArrayMerger {
    private static int[] mergeArray(int[] arr1, int[] arr2) {
        int arr1Length = arr1.length;
        int arr2Length = arr2.length;
        
        int[] newArr = new int[arr1Length + arr2Length];
        int i=0, j=0, k=0; 

        while( i < arr1Length) {
            newArr[k] = arr1[i];
            i++;
            k++;
        }

        while( j < arr2Length) {
            newArr[k] = arr2[j];
            j++;
            k++;
        }

        Arrays.sort(newArr);
        return newArr;
    }
    public static void main(String[] args) 
    {
        int[] arr1 = new int[] {3, 5, 9, 14, 65, 98};
         
        int[] arr2= new int[] {4, 17, 36, 45};
         
        int[] newArr = mergeArray(arr1, arr2);
         
        System.out.println("Merged Array : "+Arrays.toString(newArr));
    }


}