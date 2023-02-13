import java.util.Scanner;

public class nestedswitch {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int empid = input .nextInt();
        String department = input.next();

        switch(empid){
            case 1:
                System.out.println("aryan bansod ");
                break;
            case 2:
                System.out.println("kunal kushwaha");
                break;
                case 3:
                    System.out.println("ishan sharma");


                    switch(department ){

                    case "it":
                        System.out.println("it department");
                        break;
                    case  "management":
                        System.out.println("management department");
                break;
                    }
            default:
                System.out.println("invalid id");

        }


    }
}
