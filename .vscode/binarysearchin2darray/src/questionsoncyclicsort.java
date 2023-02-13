import java.lang.reflect.Array;
import java.util.Arrays;

 public class questionsoncyclicsort{
     public static void main(String[] args) {
int[]arr={1,3,2,5,0};
         System.out.println(missingnumber(arr));
     }

    static int missingnumber(int[]arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i];//here the the correct non missing element will be at its correct index only not correct index-1
            if (arr[i] < arr.length && arr[i] != arr[correct]) {
                swap(arr, i, correct);

            } else {
                i++;
            }

        }
            //search for first missing number
            for (int index = 0; index < arr.length; index++) {
                if (arr[index] != index) {
                    return index;
                }
            }
            return arr.length;

    }

     static void swap(int[] arr, int i, int correct) {
    int temp = arr[i];
    arr[i]=arr[correct];
    arr[correct]=temp;

    }
}
