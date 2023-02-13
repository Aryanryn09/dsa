public class peakymountainproblem{
    public static void main(String[] args) {
      int[] nums = {1, 2, 3, 5, 6, 4, 3, 2};
maxelement(nums);
//        System.out.println(ans);
//        System.out.println("hey iam aryan bansod");
    }

  public  static int maxelement(int[] nums){
        int s = 0;
        int e = nums.length - 1;
        while (s < e) {
            int mid = s + s - e / 2;
            if (nums[mid] < nums[mid + 1]) {
                s = mid + 1;

            } else {//you are inn decreasing part of an arra  y
                mid = e;

            }
            return e;
        }
        return -1 ;
    }//her are start and end both are pointing to the the largest value and that is it gives the smwe largest value
}
