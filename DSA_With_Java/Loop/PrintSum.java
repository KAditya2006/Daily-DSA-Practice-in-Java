package Loop;

public class PrintSum {
    public static void main(String [] args){
        int n = 5;
        int sum = 0;
        int i = 1;

        while(i <= n){
            sum = sum + i;
            i++;
        }
        System.out.println("The sum of first " + n + " natural numbers is: " + sum);
    }
}
