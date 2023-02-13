package oops2;

import java.util.Arrays;

public class innerclasses {
   static  class Test {
       String name;
        public Test(String name){

            this.name=name;

        }


    }

    public static void main(String[] args) {
        Test a=new Test("aryan ");
        Test b=new Test("kunal ");


        System.out.println(a.name);
        Arrays.toString(new int[]{});
        System.out.println(b.name );
        System.out.println(a);//gives its own tostring value which is self defined //default
        System.out.println(b);


   }
}
