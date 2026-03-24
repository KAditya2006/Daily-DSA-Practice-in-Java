public class CheckForBinary {
      boolean isBinary(String s) {
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            
            if(ch != '0' && ch != '1'){
                return false;
            }
        }
        return true;
    }
    
    public static void main(String args[]){
        CheckForBinary obj = new CheckForBinary();
        String s = "101";
        boolean result = obj.isBinary(s);
        System.out.println(result);
    }
}
