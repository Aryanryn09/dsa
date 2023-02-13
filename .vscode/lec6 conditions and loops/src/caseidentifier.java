import java.util.Scanner;

public class caseidentifier {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
          char ch= input.next().trim().charAt(0);
        System.out.println(ch);//        String name  = "aryan";
//        System.out.println(name.charAt(1));

    if(ch >='a'&& ch <='z'){
        System.out.println("the char is lower case ");
    }
    else{

        System.out.println("the char is upper case");
    }

    }
}
