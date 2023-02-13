import org.w3c.dom.ls.LSOutput;

public class floorandceilingquestions {
    public static void main(String[] args) {
        //ceiling of number
        int[] arr = {2, 3, 5, 9, 14, 16,18};

//        int target = 15;
        int ans = ceiling(arr, 4);
        System.out.println(ans);
//        System.out.println("  ss  ");

    }
//
//    static int floor(int[] arr, int target) {
//        int s = 0;
//        int e = arr.length - 1;
//        while (s <= e) {
//            int mid = s + (e - s) / 2;
//            if (target < arr[mid]) {
//                e = mid - 1;
//            } else if (target > arr[mid]) {                          //this code is usede for floorn function
//                s = mid + 1;
//            } else {                                                  sout("we got this one )
//                return mid;
//            }
//        }
//    return end
//}
//}

        static int ceiling ( int[] arr, int target){
            int s = 0;
            int e = arr.length - 1;
            while (s <= e) {
                int mid = s + (e - s) / 2;
                if (target < arr[mid]) {
                    e = mid - 1;
                } else if (target > arr[mid]) {
                    s = mid + 1;
                } else {
                    return mid;
                }
                System.out.println("rabbessi s pitstrom is th");
            }
            return s;

        }



}//output is giving the index number of that particular element//lets see what happens
