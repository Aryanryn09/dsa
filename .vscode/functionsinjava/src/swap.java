public class swap {
    public static void main(String[] args) {
    int a =10;
       int b =20;
//        int temp=a;a=b;
//        b=temp;
//
//        System.out.println(a+"  "+b);
        swap(a, b);
        System.out.println(a+"  "+b);

        String name = ":aryan bansod";
        changedname(name);
        System.out.println(name);
    }
    static String changedname( String name){
        name ="Ryn09";
//        return 0;
        return name;

    }




        static int swap(int a , int b)
        {
            int temp=a;
            a=b;
            temp =b;
return 0;//it did not swap it
        }


        }

