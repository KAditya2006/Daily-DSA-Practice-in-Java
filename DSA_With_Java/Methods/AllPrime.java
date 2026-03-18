package Methods;

public class AllPrime {

    void prime(int n) {
        for (int i = 2; i <= n; i++) {

            boolean isPrime = true;

            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.println(i + " is a prime number");
            }
        }
    }

    public static void main(String[] args) {
        AllPrime obj = new AllPrime();
        obj.prime(10);
    }
}
