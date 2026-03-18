package Loop;
import java.util.*;
public class KeepDisplaying {
    public static void main(String [] args){
        Scanner sc =new Scanner(System.in);
        int number;
        do{
            System.out.print("Enter a number: ");
            number = sc.nextInt();
            System.out.println("You entered: " + number);
            continue;
        }
        while(number % 10 != 0);
    }
}
