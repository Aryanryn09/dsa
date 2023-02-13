import java.util.Arrays;

public class permutation2 {


    public static void main(String[] args) {
arrange("","abc");    }
    static void arrange(String  p,String up)
    {

    if(up.isEmpty()){
        System.out.println(p);
        return;
    }

    char ch = up.charAt(0);
    for (int i = 0; i <=2; i++) {
        String f=p.substring(0,i);
        String s=p.substring(0,p.length());
arrange(f+ch+s,up.substring(1));
    }

}
    }

