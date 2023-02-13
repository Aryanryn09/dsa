import java.util.Arrays;

public class functionoverloading {
    public static void main(String[] args) {
        fun(989);
  fun("ustad kunal kushwaha ");
  sum(9,10);
  sum(3,3,4);
  demo( 123,4,4,4,35);
  demo("aryan ","bansod");

    }
    static void  demo(String ...b ){
        System.out.println(Arrays.toString(b));



    }

    static void  demo(int ...b ){
        System.out.println(Arrays.toString(b));


    }
    static void  sum(int a ,int b ,int c){
        System.out.println("first sum ");
        int sum= a+b+c;
        System.out.println(sum);

//OVH SALAHA THI VOH 5 SAAL KA SILLAHA THA mai koi one song wonder anhi jhooth he hoga if i say ki mare blunders nahi
        ///alike the roli on my wrist i just gotta my true love an d ia dont wanna cry

    }

    static void  sum(int a ,int b ){
        System.out.println("second sum");//this will be printd if two args are passed
        int sum= a+b;
  System.out.println(sum);


    }
        static void fun(int a)
        {
            System.out.println("first one ");
            System.out.println(a);
        }
        static void fun(String b )
        {
            System.out.println("second one");
            System.out.println(b);
        }
    }

