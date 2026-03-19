package GFG;



public class SearchInArray {
     public int search(int arr[], int x) {
        // code here
        for(int i=0;i<arr.length;i++){
            if(arr[i] == x){
                return i;
            }
            
        }
        return -1;
    }
    
    public static void main(String args[]){
        int arr[] = {1,2,3,4};
        int x = 3;
        
        SearchInArray obj = new SearchInArray();
        int result = obj.search(arr,x);
        System.out.println(result);
    }
}
