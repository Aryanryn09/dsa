public class sumofarray {
    public static void main(String[] args) {

    int [] arr = {1,2,3,4};
    int[] results=  sumofarray(arr);
        System.out.println(results);
    }
    static int[] sumofarray(int []arr ){
        int []ans=new int[4];
        for(int i=1;i<arr.length;i++){
            ans[i] = arr[i]+arr[i-1];

        }
        return ans;
    }
}
