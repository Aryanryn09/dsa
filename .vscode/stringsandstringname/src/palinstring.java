import java.util.Locale;

public class palinstring {
    public static void main(String[] args) {
String str="cabab";
        System.out.println(palindrome(str));
    }
    static boolean palindrome(String str){
        if(str.length()==0||str==null){
            
            return true;
        }
        str.toLowerCase();
        for(int i=0;i<str.length()/2;i++){
            char s=str.charAt(i);
            char e=str.charAt(str.length()-i-1);
            if (s != e){
                return false;
            }
        }
return true;
    }
}
