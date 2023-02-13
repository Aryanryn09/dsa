public class nonswap {
    public static void main(String[] args) {
        Integer a = 10;
        Integer b = 10;
        System.out.println(swap(a,b));

      final   A kunal = new A ("aryan bansod ");
kunal.name ="other name";

A obj=new A("random variable");
        System.out.println(obj);


//        for (int i = 0; i <1000000000000000l ; i++) {
//            obj=new A("random object");
//        }

    }


    static int  swap(Integer  a, Integer b) {
        int temp = a;
        a = b;
        temp = b;
        return 1;
    }


}

class A {
        final int num =10;
String name;

public A(String name){
    System.out.println("object created ");
    this.name=name;
}

    @Override
    protected void finalize() throws Throwable {
        System.out.println("object is destroyed ");
    }
}

