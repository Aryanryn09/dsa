import java.util.Arrays;

public class bubblesortalgo {
    //wht is bubble osrting algorythm ?
    //what is the best and the worst case senario ?
    //what is the role of i and j in the algorithm stated ?
    //wht is stability ?
    //what is meant by passing ?
    public static void main(String[] args) {
       int []arr={1,3,4,5,2};
       bubblesort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void bubblesort(int []arr){
        boolean swapped;
        for(int i =0;i<arr.length;i++){
         swapped= false;
            //for each step max val will come at the end
            for(int j=1;j<arr.length-i;j++){
                //for each j-1>j swap the element with respect to each other
                if (arr[j]<arr[j-1]){
                    int temp =arr[j];

                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                swapped= true;
                }
            }
            if(swapped==false){
                break;
            }
        }

    }
}
