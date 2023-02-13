public class infintesizearrquestions {

    public static void main(String[] args) {
//start with the box of 2
        int[]arr ={3,5,7,9,10,90,100,130,140,160,170};
        int target =10;
        System.out.println(ans(arr,target));

    }
    //for ans we are writing this code
    static int ans( int []arr,int target ){
        int start =0;//start with ther chunk of two boxes
        int end =1;
        while(target>arr[end]){

            int temp=end +1;//initializing the new value of start s 2es  4 es   8    e
            end = end + ( end-start +1)*2;//here we have to use the previous start so we are using w=swapping of the elements
            start=temp;
        }
        return binarysearch(arr,target,start,end);

    }
    //copy pate binary search
    static int binarysearch(int []arr ,int target,int start,int end ){
//        int start =0;
//        int end = arr.length-1;//here start and are going to be passed by thre usee=r
        while(start<end){

            int mid = start+ (end -start)/2;
            if( target<arr[mid]){
                end =mid -1;
            }
            if(target>arr[mid]){
                start=mid+1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
}
