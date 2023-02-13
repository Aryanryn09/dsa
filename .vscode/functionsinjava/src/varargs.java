import java.lang.reflect.Array;
import java.util.Arrays;

public class varargs {
    public static void main(String[] args) {
//        fun(2,3,4,55,56, 0,5,656,6,6,656);
//  fun( "aryan","ban","sod");
  multiple(932,23,23,32,32,4,23,23234,2234,234,23,4,324,23,423);
    }
    static void fun(String ...v){
        System.out.println(Arrays.toString(v));

    }

//    multiple( 2)
    static void multiple(int a,int b,int ...v){
//        System.out.println(Arrays.toString(v " "+ a + b));
    }
}
