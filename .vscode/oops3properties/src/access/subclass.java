package access;

public class subclass extends A {


    public subclass(int num, String name) {
        super(num, name);
//        Object.
    }

    public static void main(String[] args) {

        subclass obj = new subclass(23, "kunla kushwaha ");
        System.out.println(obj instanceof A);
    }

    class subsubclass extends subclass {

        public subsubclass(int num, String name) {
            super(num, name);
        }
    }


}
