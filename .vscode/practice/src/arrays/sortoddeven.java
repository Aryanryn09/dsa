package arrays;

import java.util.Arrays;

public class sortoddeven {
    public static void main(String[] args) {
int []arr={1,2,34,5,6,7,8,9,3};
SortedbyevenParity(arr);
    }
    static void SortedbyevenParity(int []arr){
        int n= arr.length;
        int left =0;
        int right = n-1;
        while(left<right){
        if(arr[left]%2==1&&arr[right]==0){
            swap(arr,left,right);
left++;
right--;
        }
        if(arr[left]%2==0){
            left++;
        }
        if(arr[right]%2==1){
            right ++;
        }
        }
        System.out.println(Arrays.toString(arr));
    }
    static void swap(int []arr,int index1,int index2){
        int temp = index1;
        index1 =index2;
        index2=temp;
    }
}
