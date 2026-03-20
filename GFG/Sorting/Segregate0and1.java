import java.util.*;
class Segregate0and1 {
    void segregate0and1(int[] arr) {
        // code here
        // for(int i=0;i<arr.length;i++){
        //     for(int j=i+1;j<arr.length;j++){
        //         if(arr[i]>arr[j]){
        //             int temp = arr[i];
        //             arr[i] = arr[j];
        //             arr[j] = temp;
        //         }
        //     }
        // }
        Arrays.sort(arr);
    }
    public static void main(String [] args){
        Segregate0and1 obj = new Segregate0and1();
        int arr[] = {0,0,1,1,0};
        obj.segregate0and1(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
}
