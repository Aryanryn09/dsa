public class pssingvalues {
    public static void main(String[] args) {
        String name ="aryan bansod";

        changedname(name);//going down baby

        
        System.out.println(name);
    }
    static String changedname(String sir ){

         sir ="kunal kushwah";
            System.out.println(sir);//printed first
         return sir;//here the name is pointing to aryan bansod but sir isd pointing to another object that is kunal kushwaha
        //so aryan bansod is printed over here

    }
}
