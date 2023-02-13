package arrays.recursions;

import java.util.Arrays;

public class oneton {
    public static void main(String[] args) {
//int ans=print(7);
//        System.out.println(print(7));
    print( 7);
    }
static  void print(int n){
        if(n==1){
            System.out.println(1);
            return;
        }
        print(n-1);
    System.out.println(n);

    }
}
