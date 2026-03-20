package GFG.Searching;



public class FindBitonicPoint {
     public int findMaximum(int[] arr) {
        // code here
        int largest = arr[0];
        for(int i=0;i<arr.length;i++){
            
            for(int j=i+1;j<arr.length;j++){
                if(largest < arr[j]){
                    largest = arr[j];
                }
            }
        }
        return largest;
    }
    public static void main(String args[]){
        FindBitonicPoint obj = new FindBitonicPoint();
        int arr[] = {1,2,4,5,7,8,3};
        int result = obj.findMaximum(arr);
        System.out.println(result);
    }
}
