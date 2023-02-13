import java.util.Arrays;
import java.util.Collections;

import static java.util.Collections.swap;

public class duplicateelement {
    public static void main(String[] args) {
        System.out.println("the duplicate elemnnt is ");
        int []arr={1,4,3,2,2};
        System.out.println(cyclicsort(arr));
    }
    //copy paste the cyclic sort algoriuthm at first
     static  int cyclicsort(int []arr) {
         int i = 0;
         while (i < arr.length) {
             if (arr[i] != i + 1) {
                 int correct = arr[i] - 1;
                 if (arr[i] != correct) {
                     swap(arr, i, correct);
                 } else {
                     return arr[i];
                 }
                 i++;
             }
         }
         return -1;
     }

    static void swap(int []arr,int first,int second){
        int temp=arr[first];
        arr[first ]=arr[second];
        arr[second]=temp;
    }
}
