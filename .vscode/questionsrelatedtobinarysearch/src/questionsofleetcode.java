
import java.util.Scanner;

public class questionsofleetcode {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
       int  sum=0;
        for (int i = 0; i <= n; i++) {
            int rem = n%10;
            sum =sum+rem;
            n=n/10;

        }
        System.out.println(sum);
//        int pro =1;
        int pro;
        for (int j = 0; j <= n; j++){
             pro =1;

            int rem = n%10;
             pro = pro*rem;
            n=n/10;
            System.out.println(pro);
            System.out.println("hey iam aryan bansod no ans  has been found hence give the start element ");
        }
//        System.out.println(pro);
    }

}