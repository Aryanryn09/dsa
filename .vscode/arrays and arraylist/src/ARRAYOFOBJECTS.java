import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class ARRAYOFOBJECTS {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        String[] arr= new String[5];
        for(int i=0;i< arr.length;i++){
            arr[i]= input.next();
        }
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        System.out.println(Arrays.toString(arr));

        //modify
        ;


        arr[0]="to";
        System.out.println(Arrays.toString(arr));
    }
}
