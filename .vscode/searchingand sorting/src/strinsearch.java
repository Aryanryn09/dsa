import java.util.Arrays;

public class strinsearch {
    public static void main(String[] args) {
        String name ="aryaan bansod";
        char target ='o';
        System.out.println(search(name,target));
        System.out.println(Arrays.toString(name.toCharArray()));
    }
    static boolean search(String str ,char target ){
        if(str.length() ==0){
            return false;
        }

        for(char i=0; i<str.length();i++){
            if(target==str.charAt(i));
            return true;

        }
        return false;
    }




}
