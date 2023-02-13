import java.lang.reflect.Array;
import java.util.Arrays;

public class hybridsort {
    public static void main(String[] args) {
        int []nums={5,4,3,2,1};
        sort(nums,0,nums.length-1);
        System.out.println(Arrays.toString(nums));


        
        Arrays.sort();
    }
    static void sort(int []nums,int low,int hi){
        if(hi<=low) {
            return;
        }
        int s=low;
        int e=hi;
        int m = s+e-s/2;
        int pivit = nums[m];
        while(s<=e) {
            while (nums [s] < pivit) {//sorteds
                s++;
            }
            while (nums[e] > pivit) {
                e--;
            }
        if(s<=e){
            int temp=nums[s];
            nums[s]=nums[e];
            temp=nums[e];
            s++;
            e--;
        }
        }
            sort(nums,low ,e);
            sort(nums,s ,hi);

        }
    }

