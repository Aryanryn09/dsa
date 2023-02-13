import java.util.Locale;
import java.util.Scanner;

public class palindromestring {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str =input.next();
        char ch;
String reverse="" ;
        for(int i=str.length()-1;i>=0;i--){

ch =str.charAt(i);
reverse=reverse+ch;

        }
        System.out.println(reverse);
if(reverse.toLowerCase(Locale.ROOT).equals(str.toLowerCase(Locale.ROOT))){
    System.out.println("the string is a palindrome string");
}
else{
    System.out.println("the string is not palindrome");
}
    }
}
