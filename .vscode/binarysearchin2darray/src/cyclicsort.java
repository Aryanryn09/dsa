import java.util.Arrays;

public class cyclicsort {
    public static void main(String[] args) {
       int []arr={3,1,2,4,5};
       syclicsort(arr);
        System.out.println(Arrays.toString(arr));
    }
static void syclicsort(int[]arr ){
        int i=0;
        while(i<arr.length){
            int correct=arr[i]-1;
            if(arr[i]!=correct){//my intuition says that this condition is only true for if the numbers are continous
                swap(arr,i,correct);
                i++;
            }
            else{
                i++;
            }

            }
        }

    static void swap(int[]arr ,int first,int second){
int temp =arr[first];
arr[first]=arr[second];
arr[second]=temp;
    }

}
