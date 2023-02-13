package arrays;

import java.util.Arrays;

public class Reverseofanarray {
    public static void main(String[] args) {
       int []arr={1,2,3,4,5};
        Reverse(arr);

    }
    static  void Reverse(int[]arr){
          int i=0;int j= arr.length-1;
            while (i<j){
               swap(arr,arr[i],arr[j]);
               i++;
               j--;
                System.out.println(Arrays.toString(arr));

            }
//        int []num=new int[arr.length];
//        for (int i = arr.length-1; i >=0 ; i--) {
//
//
//            arr[i]=num[i];
//        }
//        System.out.println(Arrays.toString(arr));
//        System.out.println(Arrays.toString(num));
    }

    static void swap(int[]arr ,int  index1,int index2){
        int temp=index1;
        index1=index2;
        index2=temp;
    }
}
