import java.util.Scanner;

public class sum2 {
    public static void main(String[] args) {
            int ans = sum3();
        System.out.println(sum3());
        }
// return the value
        static int sum3() {
            Scanner in = new Scanner(System.in);
            System.out.println("enter the first number :");
            int num1 = in.nextInt();
            System.out.println("enter the second number :");
            int num2 = in.nextInt();

            System.out.println("the sum of two numbers is :");
            int sum = num1 + num2;
            return sum;
        }

}

