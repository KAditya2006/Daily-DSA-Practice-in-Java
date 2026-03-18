

package Conditional_Statement;
import java.util.*;

public class IncomeTaxCalculator {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        double income;
        System.out.print("Enter your annual income:");
        income = sc.nextDouble();

        float tax;

        if(income < 500000){
            tax = 0;
            System.out.println("No tax applicable.");
        }

        else if(income >= 500000 && income < 1000000){
            tax = (float)income * 0.2f;

            System.out.println("Your tax is: " + tax);
        }
        else{
            tax =(float) income * 0.3f;
            System.out.println("Your tax is: " + tax);
        }

    }
}
