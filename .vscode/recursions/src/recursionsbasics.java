public class recursionsbasics {
    public static void main(String[] args) {
        //write a fxn theat prints hwllo
    msg();
    }
    static void msg(){
        System.out.println("hello");
        msg1();
    }
    static void msg1(){
        System.out.println("hello");
    msg2();
    } static void msg2(){
        System.out.println("hello");
   msg3();
    } static void msg3(){
        System.out.println("hello");
    }
}
