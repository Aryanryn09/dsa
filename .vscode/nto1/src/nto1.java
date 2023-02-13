public class nto1 {
    public static void main(String[] args) {
 fun(3);
    }
    static void fun(int n ){
        if (n==0){
            return ;
        }
        System.out.println(n);
        fun(n-1);
    }
    static void fun1(int n ){
        if (n==0){
            return ;
        }
        System.out.println(n);
        fun(n-1);
    }
}
