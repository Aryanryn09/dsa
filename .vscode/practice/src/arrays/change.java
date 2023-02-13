package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class change {
    public static void main(String[] args) {
        int []nums = {1,2,3,4,5};
int []arr = new int[nums.length];

   change(arr);    }
    public static void change(int []arr){

        Scanner inp=new Scanner(System.in);

        for (int i=0;i<arr.length;i++){
            arr[i]=inp.nextInt();
        }
        System.out.println(Arrays.toString(arr));
     }
}
