public class Palindrome {
    public static void main(String[] args) {
        
        String val = "1237688";
        boolean res = palind(val);
        if(res){
            System.out.println("String is palindrome");
        }else{
            System.out.println("not palindrome");
        }
    } 

    static boolean palind(String val){
        int s = 0;
        int e = val.length()-1;
        while(s<=e){
            if(val.charAt(s) == val.charAt(e)){
                s= s+1;
                e = e-1;
            }else{
                return false;
            }
        }
        return true;
    }
}
