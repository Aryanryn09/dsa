package arrays;

import java.util.Arrays;

public class Prefixsumofarr {
    public static void main(String[] args) {

        int[]arr={1,2,3,4,5};
        int n=arr.length;
        int [] pref =new int [n];

        System.out.println(Arrays.toString( prefixsum(arr,pref)));

    }
    static int[] prefixsum(int []arr,int []pref){
       int n =arr.length;
      ;
       pref[0]=arr[0];
       for(int i=0;i<n;i++){
           pref[i] = pref[i-1] + arr[i];

       }
        System.out.println(pref);;
return pref;
    }

}
