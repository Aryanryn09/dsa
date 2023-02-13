import java.util.Scanner;

public class fibonachi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int a = 0;
        int b = 1;
        int count = 2;
        for (int i = 2; i <= n; i++) {
            int temp = b;
            b = a + b;
            a = temp;

        }
        System.out.println(b);


    }
}