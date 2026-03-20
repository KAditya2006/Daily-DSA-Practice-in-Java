package GFG.Searching;



public class CountZeroes {
     int countZeroes(int[] arr) {
        // code here
        int count = 0;
        for(int i=0;i<arr.length;i++){
            
            if(arr[i] == 0){
                count = count+1;
            }
        }
        
        return count;
    }
    public static void main(String args[]){
        CountZeroes obj = new CountZeroes();
        int arr[] = {1,1,1,1,1,1,1,1,1,0,0,0};
        int result = obj.countZeroes(arr);
        System.out.println(result);
    }
}
