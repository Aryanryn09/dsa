public class permutation {
    public static void main(String[] args) {
        System.out.println( skip1("baccadh"));
        System.out.println(skipapple("bacchapplenh"));

    }
    static void skip(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch =up.charAt(0);
        if(ch=='a'){
            skip(p,up.substring(1));
        }else{
            skip(p,up.substring(1));

        }
    }
    static String  skip1(String up) {
        if (up.isEmpty()) {
            return " ";
        }
        char ch = up.charAt(0);
        if (ch == 'a') {
          return  skip1(up.substring(1));
        } else {
             return ch +skip1(up.substring(1));

        }
    }
    static String  skipapple(String up) {
        if (up.isEmpty()) {
            return " ";
        }
        char ch = up.charAt(0);
        if (up.startsWith("apple")) {
            return  skipapple(up.substring(5));
        } else {
            return up.charAt(0) +skipapple(up.substring(1));

        }
    }
}
