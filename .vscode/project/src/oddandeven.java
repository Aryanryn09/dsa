import java.util.Scanner;

public class oddandeven {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int a=input.nextInt();
        if(a==0||a%2==0){
            System.out.println("the number is even");
        }
        else{
            System.out.println("the number is od ");

        }

    }
}
