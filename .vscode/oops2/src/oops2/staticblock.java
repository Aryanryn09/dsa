package oops2;

public class staticblock {
        static int a=4;
        static int b;

        static{
            System.out.println("i am in static block");
        b= a*5;

        }

    public static void main(String[] args) {
        staticblock obj=new staticblock();
        System.out.println(staticblock.a +" "+staticblock.b);
staticblock.b+=3;
        System.out.println(staticblock.a+" "+staticblock.b);

        }

    }


