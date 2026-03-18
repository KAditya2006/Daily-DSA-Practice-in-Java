package Methods;

public class Pallindrome {
    void checkPallindrome(int num){
        int originalNum = num;
        int rev = 0;
        while(num > 0){
            int rem = num % 10;
            rev = rev * 10 + rem;
            num = num / 10;
        }
        if(originalNum == rev){
            System.out.println(originalNum + " is a pallindrome number.");
        } else {
            System.out.println(originalNum + " is not a pallindrome number.");
        }
    }
    
    public static void main(String[] args) {
        Pallindrome p = new Pallindrome();
        p.checkPallindrome(121);
        p.checkPallindrome(123);
    }
}
