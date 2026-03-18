package Methods;

public class Average {
    void printAverage(int a, int b, int c){
        int sum = a+b+c;
        int average = sum/3;
        System.out.println("The average of "+a+", "+b+" and "+c+" is: "+average);
    }

    public static void main(String[] args) {
        Average avg = new Average();
        avg.printAverage(10, 20, 30);
    }
}
