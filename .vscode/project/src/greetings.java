import java.util.Scanner;

public class greetings {
    public static void main(String[] args) {
        message("aryan ");
        Scanner input=new Scanner(System.in);
        String name=input.next();

    }
    static void message(String name){
        System.out.println("holla !! ,happy diwali " + name);
    }
}
