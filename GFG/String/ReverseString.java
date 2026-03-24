public class ReverseString {
     public static String reverseString(String s) {
        String rev = "";

        for(int i = s.length() - 1; i >= 0; i--) {
            rev = rev + s.charAt(i);
        }

        return rev;
    }

    public static void main(String[] args) {
        String str = "Geeks";
        String rev = reverseString(str);

        System.out.println("Original String: " + str);
        System.out.println("Reverse String: " + rev);
    }
}
