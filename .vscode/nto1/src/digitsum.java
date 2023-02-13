public class digitsum {
    public static void main(String[] args) {
        System.out.println(prod(1342));
    }
    static int prod(int n ){
        if(n<=1){
            return 1;
        }
        return n%10+prod(n/10);
    }

}
