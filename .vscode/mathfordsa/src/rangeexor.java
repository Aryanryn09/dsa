public class rangeexor {
    public static void main(String[] args) {
int a =8;
int b=7;
        System.out.println(rangeexo(a));
        //this gives exor from a-b
    int ans =0;
    }

    static int rangeexo(int a) {
        if (a % 4 == 0) {
            return a;
        }

        if (a % 4 == 0) {
            return 1;
        }
            if (a % 4 == 0) {
                return a-1;

            }   if (a % 4 == 0) {
                return 0;
            }

        return 0;
    }


}


