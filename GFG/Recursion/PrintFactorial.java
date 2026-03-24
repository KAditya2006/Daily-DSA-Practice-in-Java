package Recursion;

public class PrintFactorial {
     int factorial(int n) {
        
        if(n == 0 || n == 1){
            return 1;
        }
        
        
        return n * factorial(n - 1);
    }

    public static void main(String args[]){
        PrintFactorial obj = new PrintFactorial();
        int n = 5;
        int result = obj.factorial(n);
        System.out.println(result);
    }
}
