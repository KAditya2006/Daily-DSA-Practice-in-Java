package Loop;
import java.util.*;

public class KeepEntering {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int number;
        do{
            number = sc.nextInt();
            System.out.println(number);
        }
        while(number % 10 != 0);
    }
}
