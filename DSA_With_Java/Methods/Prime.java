package Methods;

public class Prime {
    void  prime(int n){
        for(int i=1; i<=n; i++){
            if(n%i==0 && n!=1 && n!=i){
                System.out.println(n + " is a prime number");
                break;
            }

            else{
                System.out.println(n + " is not a prime number");
                break;
            }
        }
    }

    public static void main(String [] args){
        Prime obj = new Prime();
        obj.prime(7);
    }
}
