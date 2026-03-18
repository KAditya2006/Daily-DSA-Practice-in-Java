package Methods;

public class printProduct {
    void printProduct(int a, int b) {
        int product = a * b;
        System.out.println("The product of " + a + " and " + b + " is: " + product);
    }

    public static void main(String [] args){
        printProduct obj = new printProduct();
        obj.printProduct(3, 5);
    }
}
