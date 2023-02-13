public class count {
    public static void main(String[] args) {

    }
    static int maze(int up, int r) {
        if (r == 1 || up == 1) {

            return 1;
        }
        int count =0;
        int left = maze(up - 1, r);
        int right = maze(up, r - 1);
        return left +right;
    }
}
