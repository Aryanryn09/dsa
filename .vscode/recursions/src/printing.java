public class printing {
    public static void main(String[] args) {
        print(1);//write a function and call it only once which prints the numbers from 1-5
    }
    static void print(int n){
        System.out.println(n);
        print1(1);
    }
    static void print1(int n){
        System.out.println(n);
        print2(2);
    }static void print2(int n){
        System.out.println(n);
        print3(3);
    }static void print3(int n){
        System.out.println(n);
        print4(4);
    }static void print4(int n){
        System.out.println(n);

    }



}
