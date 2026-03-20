package GFG.Searching;

import java.util.Arrays;



public class SecondLargest {
     public int getSecondLargest(int[] arr) {
        // code here
        Arrays.sort(arr);
        int n= arr.length;
        int largest = arr[n-1];
        for(int i=n-2;i>=0;i--){
            if(arr[i] != largest){
            return arr[i];
        }
        }
        return -1;
        
    }
    
    public static void main(String args[]){
        SecondLargest obj = new SecondLargest();
        int arr[] = {12,35,1,10,34,1};
        int result = obj.getSecondLargest(arr);
        System.out.println(result);
    }
}
