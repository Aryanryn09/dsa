package arrays;

import java.util.Arrays;


public class Zerosones {
    public static void main(String[] args) {
        int[]arr ={0,1,0,1,0,0};
//        Sortzerosones(arr);
        sort(arr);

    }
    static void sort(int[]arr){
        int n =arr.length;
        int left=0;int rigth=n-1;
        while( left <rigth){

    if( arr[left]==0 && arr[rigth]==1 ){
        swap(arr,left,rigth);
        left++;
        rigth--;
    }
    if(arr[rigth]==1){
        rigth--;
    }
    if(arr[left]==0){
        left++;
    }
}
        System.out.println(Arrays.toString(arr));

        }


        static void swap(int []arr,int index1,int index2){
        int temp=index1;
        index1=index2;
        index2=temp;
        }

    static void Sortzerosones(int []arr){
        int n = arr.length;
        int zeros = 0;
        for (int i = 0; i <n ; i++) {
            if(arr[i]==0){
                zeros++;
            }
        }
        for(int i=0 ;i<n;i++){
            if(i<zeros){
                arr[i] =0;
            }
            else{
                arr[i]=1;
            }

        }
        System.out.println(Arrays.toString(arr));
    }
}
