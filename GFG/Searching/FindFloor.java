package GFG.Searching;



public class FindFloor {
     public int findFloor(int[] arr, int x) {
        // code here
        int index = -1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<= x){
                index = i;
                
            }
        }
        return index;
    }
    public static void main(String args[]){
        FindFloor obj = new FindFloor();
        int arr[] = {1,2,8,10,10,12,19};
        int x = 5;
        int result = obj.findFloor(arr,x);
        System.out.println(result);
    }
}
