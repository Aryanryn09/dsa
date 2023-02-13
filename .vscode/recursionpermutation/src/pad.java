import java.util.ArrayList;
import java.util.Arrays;

public class pad {
    public static void main(String[] args) {
pad("","12");
        System.out.println(padarr("","12"));
        System.out.println(padcount("","12"));
    }

    static void pad(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
        return ;
        }
        int digit= up.charAt(0)-'0';
        for (int i = (digit-1)*3; i < digit*3; i++) {
char ch= (char)('a'+i);
pad(p+ch,up.substring(1));
        }
    }
    static ArrayList<String> padarr(String p,String up) {
        if (up.isEmpty()) {
            ArrayList<String> ans = new ArrayList<>();

            ans.add(p);
        return ans;
        }
        int digit = up.charAt(0) - '0';
        ArrayList<String> ans = new ArrayList<>();

        for (int i = (digit - 1) * 3; i < digit * 3; i++) {
            char ch = (char) ('a' + i);

         ans.addAll(padarr(p + ch, up.substring(1)));


        }
        return ans;
    }
    static int  padcount(String p,String up){
        if(up.isEmpty()){
//            System.out.println(p);
            return 1;
        }
        int digit= up.charAt(0)-'0';
        int count =0;
        for (int i = (digit-1)*3; i < digit*3; i++) {
            char ch= (char)('a'+i);
          count =  padcount(p+ch,up.substring(1)) + count;
        }
        return count;
    }
}
