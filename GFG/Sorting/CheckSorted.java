package Daily-DSA-Practice-in-Java.GFG.Sorting;

public class CheckSorted {
    public boolean isSorted(int[] arr) {
        // code here
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                return false;
            }
        }
        return true;
    }
    
    public static void main(String [] args){
        int arr[] = {10,20,30,40,50};
        CheckSorted obj = new CheckSorted();
        obj.isSorted(arr);
    }
}
