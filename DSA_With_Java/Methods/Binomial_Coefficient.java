package Methods;

public class Binomial_Coefficient {
  void binomialCoefficient(int n, int r){
    int fact1 = 1;
    int fact2 = 1;
    int fact3 = 1;
    for(int i=1;i<=n;i++){
        fact1 = fact1 * i;
    }
    for(int i=1;i<=r;i++){
        fact2 = fact2 * i;
    }
    for(int i=1;i<=(n-r);i++){
        fact3 = fact3 * i;
    }

    int result = fact1/ (fact2 * fact3);
    System.out.println("The binomial coefficient of " + n + " and " + r + " is: " + result);
  }

  public static void main(String [] args){
    Binomial_Coefficient obj = new Binomial_Coefficient();
    obj.binomialCoefficient(5, 2);
  }
}
