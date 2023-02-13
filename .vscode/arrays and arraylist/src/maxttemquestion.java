public record maxttemquestion() {
    public static void main(String[] args) {
        int[] arr ={23,34,64,23,6575,23,234,5473};// find the max valued ir=tem from here
        System.out.println(max(arr,0,4));
//        System.out.println(reverse(arr));
    }//adding of edge cases

//    private static int  reverse(int[] arr  ) {
//        int start = 0;
//        int end = arr.length - 1;
//        while (start < end) {
//            swap(arr, start, end);
//            start++;
//            end--;
//
//        }


    static int max( int [] arr ,int start,int end ){
    if(arr.length ==0){
        return -1;
    }
    if(arr==null){
        return -1;
    }

         int maxval = arr[start];
        for(int i=1;i<arr.length;i++){
            if(arr[end]>maxval ){
                maxval=arr[end];
            }
        }
    return maxval;

    }

}
