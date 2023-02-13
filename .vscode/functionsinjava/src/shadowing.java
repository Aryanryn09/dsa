public class shadowing {
    static int c=90;//this will be shadowed at line 10
    public static void main(String[] args) {
        System.out.println(c);
        int  c =9;
        System.out.println(c);
        fun();
    }

static void fun(){

    System.out.println(c);
}
}
