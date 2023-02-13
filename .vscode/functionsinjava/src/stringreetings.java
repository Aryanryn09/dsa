public class stringreetings {
    public static void main(String[] args) {

        String personalised = greet( "aryan bansod");

        System.out.println(personalised);


    }

     static String greet(String name) {
        String msg="hey i am aryan bansod "+name;
//         System.out.println("hey there i am aryan bansod");
        return msg;


    }
}