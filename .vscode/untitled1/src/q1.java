public class q1 {
    public static void main(String[] args) {
        int n = 4;


        for (int i = 0; i < 2 * n; i++) {
            int totalcolinrow = i > n ? 2 * n - i : i;
            int totalspaces = n - totalcolinrow;
            for (int s = 0; s <= totalspaces; s++) {
                System.out.print(" ");
            }
                for (int j = 1; j <= totalcolinrow; j++) {
                    System.out.print("" + j);
                }
                System.out.println("");
            }

    }


}