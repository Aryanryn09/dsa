public class rotationcountinanarray {
    public static void main(String[] args) {

        int[]arr={4,5,6,7,0,1,2};
        System.out.println(rotationcount(arr));

    }


    static int rotationcount(int []arr){
        int pivit= findingpivot(arr);//for duplicate array use duplicat array


       //only two lines of code
        return pivit+1;
    }

    static   int
    findingpivot(int [] arr){
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
            if(arr[mid]==arr[s]&&arr[mid]==arr[e]){
                s=s+1;
                e=e-1;
            }//just skioppign th edu[licat  value
            //note:chek that the s or e is pivit or not =

        }
        return -1;//retturns the indesx of the largest array

    }

}
//for the duplicat values



