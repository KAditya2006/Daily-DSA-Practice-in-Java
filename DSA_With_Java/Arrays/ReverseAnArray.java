package Arrays;

public class ReverseAnArray {
    void reverseArray(int arr[]){
        int start = 0, end = arr.length-1;
        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;

        }
    }
    public static void main(String[] args){
        int array [] = { 2, 4, 6, 8, 10};
        ReverseAnArray obj = new ReverseAnArray();
        System.out.println("Original array:");
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
        obj.reverseArray(array);
        System.out.println("\nReversed array:");
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
    }
}
