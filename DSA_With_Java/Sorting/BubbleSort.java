package Sorting;

public class BubbleSort {
    void bubbleSort(int arr[]){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
    public static void main(String [] args){
        BubbleSort obj = new BubbleSort();
        int arr[] = {5,4,1,3,2};
        System.out.println("Original Array: ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }

        obj.bubbleSort(arr);
        System.out.println("\nSorted array: ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }

        
    }
}
