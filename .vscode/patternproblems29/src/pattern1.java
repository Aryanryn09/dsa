import java.util.Arrays;

public class pattern1 {
    public static void main(String[] args) {
//        pattern1(4,0);
//        pattern2(4,0);
        int []arr={4,3,2,1};
        bubblesort(arr,arr.length,0);
        System.out.println(Arrays.toString(arr));
    }
//    static void pattern1(int r,int c){
//        if(r==0){
//            return ;
//        }
//        if(c<r){
//            System.out.print("*");
//            pattern1(r,c+1);
//        }
//        else{
//            System.out.println();
//            pattern1(r-1,0);
//
//        }
////        return -1 ;
//    }
//    static void pattern2(int r,int c){
//        if(r==0){
//            return ;
//        }
//        if(c<r){
//            System.out.print("*");
//            pattern1(r+1,c);
//        }
//        else{
//            System.out.println();
//            pattern1(0,c-1);
//
//        }
////        return -1 ;
//    }
    static void  bubblesort(int []arr,int r,int c){
        if(r==0){
            return ;

        }
        if(c<r){
            if(arr[c]>arr[c+1]){
                int temp = arr[c];
                arr[c]=arr[c+1];
                arr[c+1]=temp;
            }
            bubblesort(arr,r,c+1);
        }
        else{
            bubblesort(arr,r-1,0);
        }
    }
}
