package Methods;
import java.util.*;
public class SumOfDigit {
    void calculateSum(int num){
        int sum = 0;
        while(num > 0){
            int rem = num % 10;
            sum += rem;
            num = num / 10;
        }
        System.out.println("The sum of the digits is: "+sum);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        SumOfDigit s = new SumOfDigit();
        s.calculateSum(num);
    }
}
