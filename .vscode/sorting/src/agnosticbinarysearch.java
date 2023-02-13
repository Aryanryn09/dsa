public class agnosticbinarysearch {
    public static void main(String[] args) {


    }

    static int agnosticbinarysesrch(int[] arr, int target) {


        int start = 0;
        int end = arr.length - 1;
        boolean isasc = arr[start] < arr[end];


        while (start < end) {
            int mid = start + (end - start) / 2;
            if (mid == target) {
                return mid;
            }

            if (isasc) {//ascending == true
                if (target < arr[mid]) {
                    end = mid - 1;
                }
                if (target > arr[mid]) {
                    start = mid + 1;
                } else {
                    return mid;
                }
            } else {
                if (target < arr[mid]) {
                    start = mid + 1;
                }
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    return mid;


                }
            }


        }
        return -1;
    }
}

