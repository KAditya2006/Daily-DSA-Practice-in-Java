package Methods;

public class Factorial {
    void factorial(int n){
         int fact = 1;

        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        System.out.println("The factorial of " + n + " is: " + fact);
    }

    public static void main(String [] args){
        Factorial obj = new Factorial();
        obj.factorial(4);
    }
}
