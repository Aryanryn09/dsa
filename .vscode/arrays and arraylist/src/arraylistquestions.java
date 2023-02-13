import java.lang.reflect.Array;
import java.util.Arrays;

public class arraylistquestions {
    public static void main(String[] args) {
        int[] arr ={1,33,44,2,44};
        swap(arr,2,3);
        System.out.println(Arrays.toString(arr));
//        System.out.println(reverse(arr));
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }

     static void reverse( int[] arr ) {
        int start =0;
        int end = arr.length-1;//gives the actuallength of an array
        while(start<end){

            swap(arr,start,end);
            start++;
            end--;
        }
        System.out.println();

    }

    static void swap(int [] arr ,int index1,int index2){
        int temp=arr[index1];
        arr[index1]=arr[index2];
        arr[index2]=temp;
    }
}
