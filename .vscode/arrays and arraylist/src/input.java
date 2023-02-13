import java.util.Arrays;
import java.util.Scanner;
//ARRAY OF PRIMITIVE

public class input {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr =new int[5];
        arr[0]=23;
        arr[1]=2;
        arr[2]=28;
        arr[3]=299;
        arr[4]=233;
//        arr[5]=23;mistake  method 0 to print the elements in array
        System.out.println(arr[0]+" " + arr[1]+ " " +arr[2]+" "+ arr[3] );
        for( int i=0; i < arr.length;i++){
            arr[i]=input.nextInt();
//method 1
        }
        for(int i=0;i < arr.length;i++){
            System.out.println(arr[i] +  " ");
}//method 2
        for(int num :arr){
            System.out.println(num);//enhanced for loop where num represents the elements in arra
        }
        //or Method 3
        System.out.println(Arrays.toString(arr));
    }
}
