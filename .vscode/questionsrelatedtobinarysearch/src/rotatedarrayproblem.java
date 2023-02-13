public class rotatedarrayproblem {
    public static void main(String[] args) {
        //find the pivit in the array and along the pivit the numbers will bw sorted in ascending or descending order
 int []arr ={ 3,4,5,6,7,0,1,2};
 int ans=search(arr,1);
 System.out.println(ans);
        System.out.println("what could possibly be the ans ");
    }
    static int search(int []arr,int target ) {
        int pivit = findingpivot(arr);
        //if you do not finsd==d pivqit it means that the arr is not rotated array
        if (pivit == -1) {
            return binarysearch(arr, target, 0, arr.length);

            //if pivit is found
        }
            if (arr[pivit] == target) {
                return pivit;//target csught but if thisre is an exception that the element is not int this range o bina
                //search for the ascending values of array before and after the array

            }

            if (target >= arr[0]) {
                binarysearch(arr, target, 0, pivit - 1);

            }
            if (target <= arr[0]) {
                return binarysearch(arr, target, pivit + 1, arr.length);
            }
        return -1;

        }



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





   static   int findingpivot(int [] arr){
        int s=0;
        int e = arr.length-1;
 //four cases over here
        while(s<=e){
            int mid=s+e-s/2;
            if(mid < e && arr[mid]>arr[mid +1]){ // 7 ,0
                return mid;//it should not excedd last indesx of the array otherwise mid +1 will have no value

            }//case 1=
            if( mid > s && arr[mid]<arr[mid-1]){// 7, 0
                return mid-1;

            }//caswe 2
            if(arr[mid]<=arr[s] ){//checking ki apka element pivit k rhs me hai ki lhs me ahi voh bhi start se compare kar kar
                //ig noring the elements from th middle same goes with this
//thsts the only possible logic behind
            e=mid - 1;
            }
            else{
                s=mid +1;
            }
        }
       return -1;//retturns the indesx of the largest array

    }

}
//for the duplicat values