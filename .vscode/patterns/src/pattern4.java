public class pattern4 {
    public static void main(String[] args) {
        pattern4(5);
        pattern5(3);
    }

    static void pattern4(int n) {

        for (int row = 1; row <= n; row++) {
            //for every row run thee column
            int ans = 0;
            for (int col = 1; col <= row; col++) {
                ans = ans + 1;
                System.out.print("  " + ans);
            }                      //when one row is printed a new linw is to be printed
            System.out.println();

        }
    }

    static void pattern5(int n) {

        for (int row = 1; row <= n; row++) {
            //for every row run thee column
            for (int col = 1; col <= row; col++) {
                System.out.print(col+"   ");
            }                      //when one row is printed a new linw is to be printed
            System.out.println();

        }
    }
}