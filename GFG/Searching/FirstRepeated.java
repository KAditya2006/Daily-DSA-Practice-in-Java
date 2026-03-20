package GFG.Searching;

public class FirstRepeated {
     public static int firstRepeated(int[] arr) {
        // code here
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i] == arr[j]){
                    return i+1;
                }
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int arr[] = {1,5,3,4,3,5,6};
        int result = firstRepeated(arr);
        System.out.println(result);
    }
}
