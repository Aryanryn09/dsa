import java.util.ArrayList;
import java.util.Arrays;

import java.util.List;

public class findlistofmissingnumber {
    public static void main(String[] args) {

        int[] arr = {3, 1, 2, 4, 5};
        System.out.println(missingindex(arr));
        ;
        System.out.println("hey what did you missed here");
    }

    static int[] missingindex(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1;
            System.out.println("aryan bansod");
            if (arr[i] != correct) {//my intuition says that this condition is only true for if the numbers are continous
                swap(arr, i, correct);
            } else {
                i++;
            }
        }
        List<Integer> ans = new ArrayList<>();
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index + 1) {
                ans.add(index + 1);
            }
        }



//return ans;

    }


    



        static void swap(int[]arr ,int first,int second){
            int temp =arr[first];
            arr[first]=arr[second];
            arr[second]=temp;
        }

    }


