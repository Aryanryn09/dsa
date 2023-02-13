import java.util.Arrays;

public class selectionsort {
    public static void main(String[] args) {
        int[] arr={-23,-3,-1,0,2,34,5,16,5};
        selectionsort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void selectionsort(int []arr){
        for(int i=0;i<arr.length;i++){
            //for all the elements in arr find the max element in array and swap with correct index
            int last =arr.length-i-1;//max element will bwe swapped with the max index
            int maxindex=getmaxelement(arr,0,last);
        swap(arr,maxindex,last);
        }
    }

    public static int getmaxelement(int[] arr, int start, int end) {
        int max=start;
        for(int i=start;i<=end;i++){
            if(arr[max]<arr[i]){
                max=i;
            }
        }
        return max;
    }
    static void swap(int []arr,int first,int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;

    }
}
