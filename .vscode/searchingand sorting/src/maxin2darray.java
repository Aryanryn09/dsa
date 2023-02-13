import static java.util.Collections.max;

public class maxin2darray {
    public static void main(String[] args) {
        int[][] arr= new int[][]{
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
            };

        System.out.println(max(arr));


        }

     static int max(int[][] arr) {

       int  maxval=Integer.MIN_VALUE;//compare the values in array with yhe value-2934235 which is the min value of the integer for the system
        for(int row=0;row<arr.length;row++){
            for(int col=0;col<arr[row].length;col++){
                if(arr[row][col]>maxval){
                    maxval=arr[row][col];

                }
            }

    }
         return maxval;

    }
}
