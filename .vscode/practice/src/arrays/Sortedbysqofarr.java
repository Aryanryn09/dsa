package arrays;

import java.util.Arrays;

public class Sortedbysqofarr {
    public static void main(String[] args) {
int []arr={-10,-3,-2,3,4,5};
Sortdedsq(arr);
    }
    static void Sortdedsq(int[]arr){
        int n=arr.length;
        int  left=0;
        int right=n-1;
        int k=0;
        int []ans=new int [arr.length];
    while(left <= right){
        if(Math.abs(arr[left])>=Math.abs(arr[right])){
           ans[k++]=arr[left]*arr[left];
            left++;
        }else {
            ans[k++]=arr[right]*arr[right];
            right--;

        }

    }
        System.out.println(Arrays.toString(ans));    }
}
