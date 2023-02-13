package arrays.recursions;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

public class fact {
    public static void main(String[] args) {

        System.out.println(fact(5));
    }
  public  static int fact(int n){
        if(n==1){
            return 1;
        }
        int f1 =fact(n);
        int f= f1*n;
        return  f;
//        System.out.println(n);
    }
}
