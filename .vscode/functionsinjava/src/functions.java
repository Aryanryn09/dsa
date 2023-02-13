import java.util.Scanner;

public class functions {
    public static void main(String[] args) {

        sum2();
//        sum();// this is all calling the function by its name
//        sum();

    }
        static void sum2(){

            Scanner in = new Scanner(System.in);
            System.out.println("enter the first number ");

            int num1 = in.nextInt();
            System.out.println("enter the second number ");

            int num2 =in.nextInt();
            System.out.println("the sum of two numbers is");

         int add =num1 +num2;
            System.out.println(add);//            System.out.println(sum);

        }

    }
