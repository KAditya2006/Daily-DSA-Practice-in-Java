package Conditional_Statement;

public class LargestOf3 {
    public static void main(String [] args){
        int a=1, b=3, c = 6;
        if(a> b && a> c){
            System.out.println("a is largest");
        }
        else if(b> a && b> c){
            System.out.println("b is largest");
        }
        else{
            System.out.println("c is largest");
        }
    }
}
