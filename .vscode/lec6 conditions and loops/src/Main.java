import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

          int sal;
        Scanner input = new Scanner(System.in);
        sal = input.nextInt();

//         if ( sal>=10000)
//         {
//             sal = sal +2000;
//         }
//    else {
//        sal = sal +1000;
//         }
//        System.out.println2("sal is "+sal);
//multyiple if else stase ment
        if (sal >=300000)
        {
            sal+=3000;
        }

    else if (sal >=20000)
        {
            sal +=2000;
        }
    else{
        sal +=1000;
        }
        System.out.println("sal is "+ sal);
    }

}
