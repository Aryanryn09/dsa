public class evennumbersinarray {
    public static void main(String[] args) {
        int[][] arr = {
                {23, 35, 667, 88, 8},
                {22, 3, 4, 567, 98, 90},
                {23, 454, 566778, 80, 90, 32},

        };
        System.out.println(evennumbers(arr));
    }
//    static int digits(int num){
//        int digits=0,n=0;
//        while(n>0){
//



    static int evennumbers(int[][] arr) {
        int even = 0;

        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] % 2 == 0) {
even++;
                }
            }


        }

        return even++;

    }
}