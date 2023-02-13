import java.util.Arrays;

public class changedvalue {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        change(arr);
        System.out.println(Arrays.toString(arr));
    }
    static int change(int[] num ){
         num[0]=99;
     return 0;
    }

}
