import java.util.Scanner;

public class amstrong {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
int num1=input.nextInt();
int amg =0;
int i;
while(num1!=0){

    int rem =num1%10;
    amg +=rem*rem*rem ;
     num1 =num1/10;
}
        System.out.println(amg);

    }

}
