import java.sql.SQLOutput;
import java.util.Arrays;

public class searchingina2darray {
    public static void main(String[] args) {
        int [][] arr = {
                {1, 2, 3},
                {4, 5, 6, 7},
                {8, 9} ,
                {10, 11, 12, 13, 14}
            };
    int target=10;
    int[] ans = search(arr ,target);
        System.out.println(Arrays.toString(ans));
    }//used when we are finding an arrray of elements

    static int[] search(int[][]arr ,int target) {

        target = 10;
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] == target) {
                    return new int[]{row, col};//here new is used as an object to specify each row and column
                }


            }
        }
return new int[]{-1,-1};

    }


}
