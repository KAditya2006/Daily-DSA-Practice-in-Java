package Loop;
import java.util.*;

public class Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int evenSum = 0;
        int oddSum = 0;
        int choice;

        do {
            System.out.print("Enter an integer: ");
            int n = sc.nextInt();

            if (n % 2 == 0) {
                evenSum += n;
            } else {
                oddSum += n;
            }

            System.out.print("Do you want to continue? (1 for yes, 0 for no): ");
            choice = sc.nextInt();

        } while (choice == 1);

        System.out.println("Sum of even numbers: " + evenSum);
        System.out.println("Sum of odd numbers: " + oddSum);
    }
}
