import static java.util.Collections.min;

public class findmaxandmin {
    public static void main(String[] args) {
        int []arr={6,4,3,1,3,45,34};
        System.out.println(min(arr));
    }

     static int  min( int[] arr )
     {
         int minval=arr[0];
    for(int i=0;i<arr.length;i++){
        if(arr[i]<minval){
minval=arr[i];
        }
        System.out.println("hey ia m aryan bansod " +
                "" + "");
    }
         return minval;

     }
}
