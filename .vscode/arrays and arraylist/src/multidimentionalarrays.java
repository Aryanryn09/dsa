import com.sun.security.jgss.GSSUtil;

import java.util.Arrays;
import java.util.Scanner;

public class multidimentionalarrays {
    public static void main(String[] args) {
        /*
            1 2 3
            4 5 6
            7 8 9
         */
        Scanner input = new Scanner(System.in);

//int[][] arr=new int[3][];
//        int[][] arr={
//                {1,2,3},//0 th index
//                {4,5,6,7},//first index
//                {8,9}//second index
//        };
//        System.out.println(arr[1][0]);
//        //input and out put of a multidimentionla array

        int[][] arr = new int[3][3];
        for (int row = 0; row < arr.length; row++) {//arr,length gives the actual length of that array
//for thew length of columns =
            for (int col = 0; col < arr[row].length; col++) {

                arr[row][col] = input.nextInt();

            }
        }
            //out put
//            for (int row = 0; row < arr.length; row++) {//arr,length gives the actual length of that array
////for thew length of columns =
//                for (int col = 0; col < arr[row].length; col++) {
//
//                    System.out.print(arr[row][col] + " " );
//                }
//                System.out.println();//for adding anothe rline for row and column
//            }
//optimised

        for(int row=0;row <arr.length;row ++){
            System.out.println(Arrays.toString(arr[row]));
        }
for(int[] a :arr){
    System.out.println(Arrays.toString(a));
}


}
        }
