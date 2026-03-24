class Solution {
    public static boolean checkPangram(String s) {
        // code here
        for(int i=0;i<s.length();i++){
            char ch = Character.toLowerCase(s.charAt(i));
            
            if(ch != 'a' && ch != 'b' && ch != 'c' && ch != 'd' && ch != 'e' && ch != 'f' && ch != 'g' && ch != 'h' && ch != 'i' && ch != 'j' && ch != 'k' && ch != 'l' && ch != 'm' && ch != 'n' && ch != 'o' && ch != 'p' && ch != 'q' && ch != 'r' && ch != 's' && ch != 't' && ch != 'u' && ch != 'v' && ch != 'w' && ch != 'x' && ch != 'y' && ch != 'z'){
                return true;
            }
        }
        return false;
    }
    public static void main(String args[]){
       
        // String s = "Bawds jog, flick quartz, vex nymph";
        String s = "sdfs";
        boolean result = checkPangram(s);
        System.out.println(result);
    }
}