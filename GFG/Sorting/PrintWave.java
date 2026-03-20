package Daily-DSA-Practice-in-Java.GFG.Sorting;

public class PrintWave {
      public void sortInWave(int arr[]) {
        // code here
        for(int i=0;i<arr.length-1;i+=2){
            int temp = arr[i];
            arr[i] = arr[i+1];
            arr[i+1] = temp;
        }
    }
    public static void main(String args[]){
        PrintWave obj = new PrintWave();
        int arr[] = {1,2,3,4,5};
        obj.sortInWave(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
}
