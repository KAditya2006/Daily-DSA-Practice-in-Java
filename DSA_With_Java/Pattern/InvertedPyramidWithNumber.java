package Pattern;

public class InvertedPyramidWithNumber{
    void printInvertedPyramidWithNumber(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i+1;j++){
                System.out.print(j);
                
            }
            System.out.println("");
        }
    }
    
    public static void main(String []args){
        InvertedPyramidWithNumber obj = new InvertedPyramidWithNumber();
        obj.printInvertedPyramidWithNumber(5);
    }
}
