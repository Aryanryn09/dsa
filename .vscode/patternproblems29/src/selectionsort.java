public class selectionsort {
    public static void main(String[] args) {

    }

    static void bubblesort(int[] arr, int r, int c, int max) {
        if (r == 0) {
            return;

        }
        if (c < r) {
            if(arr[max]<arr[c]){
                bubblesort(arr,r,c+1,c);
            }
            else{
//                return bubblesort(arr,r,c+1,max);
            }
        }
    }
}