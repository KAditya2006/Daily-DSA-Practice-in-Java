package GFG;

public class getAlternate {
    void printAlternate(int arr[]){
        for(int i=0;i<arr.length;i+=2){
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String [] args){
        getAlternate obj = new getAlternate();
        int arr[] = {1,2,3,4,5};
        obj.printAlternate(arr);
    }
}
