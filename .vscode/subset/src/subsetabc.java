import java.util.ArrayList;
import java.util.Arrays;

public class subsetabc {
    public static void main(String[] args) {

   subset("","abc");
        System.out.println(subsett("","abc"));
        System.out.println(asciirett("","abc"));

    }
    static void  subset(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch=up.charAt(0);
        subset(ch +p,up.substring(1));
        subset(p,up.substring(1));
    }
     static ArrayList<String> subsett(String p,String up){
        if(up.isEmpty()){
            ArrayList<String> list= new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch =up.charAt(0);
         ArrayList<String> left=subsett(ch +p,up.substring(1));//for ascii values add 0 to the processed string
         ArrayList<String> right=subsett(p,up.substring(1));

left.addAll(right);

return left;
     }
    static ArrayList<String> asciirett(String p,String up){
        if(up.isEmpty()){
            ArrayList<String> list= new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch =up.charAt(0);
        ArrayList<String> left=asciirett((ch+0) +p,up.substring(1));//for ascii values add 0 to the processed string
        ArrayList<String> right=asciirett(p,up.substring(1));

        left.addAll(right);

        return left;
    }
}


