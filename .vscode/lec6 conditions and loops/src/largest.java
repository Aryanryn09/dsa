import java.util.Scanner;

public class largest {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int a = input.nextInt();
        int b= input.nextInt();
        int c= input.nextInt();

        //find the larg est of the three numbers

//        int max = a;
//        if(b>max){
//            max = b;
//        }
//        if(c>max) {
//            max = c;
//        }
//
//        System.out.println(max);
//
        //another method
//        int max=0;
//        if(a>b){
//            max=a;
//        }
//else{
//    max=b;
//        }
//if(c>max){
//    max =c;
//}
//        System.out.println(max);
        int max = Math.max(c,Math.max(a,b));//optimised code for amx value of an integer =
        System.out.println(max);

    }
}
