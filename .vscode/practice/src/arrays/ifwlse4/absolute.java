package arrays.ifwlse4;
import java.util.Scanner;
public class absolute {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter any numbetr");
        int in =input.nextInt();
        if(in<0){
            in=in*-1;
        }
        System.out.println(in);


    }
}
