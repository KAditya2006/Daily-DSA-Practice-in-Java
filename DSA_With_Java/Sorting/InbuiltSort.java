package Sorting;

import java.util.*;
public class InbuiltSort{
    public static void main(String [] args){
        int arr[] = { 5,4,1,3,2};
        System.out.println("Original Arrays: ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        Arrays.sort(arr);
         System.out.println("\nSorted Arrays: ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
}
