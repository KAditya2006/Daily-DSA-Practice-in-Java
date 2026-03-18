package Conditional_Statement;

public class Calculator {
    public static void main(String [] args){
        int a = 10, b = 5;
        char operator = '+';
       switch(operator){
        case '+':
            System.out.println(a + b);
            break;
        case '-':
            System.out.println(a - b);
            break;
        case '*':
            System.out.println(a * b);
            break;
        case '/':
            System.out.println(a / b);
            break;

            case '%':
            System.out.println(a % b);
            break;

        default:
            System.out.println("Invalid operator"); 
            
       }
    }
}
