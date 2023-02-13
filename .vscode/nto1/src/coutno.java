public class coutno {
//    public static void main(String[] args) {
//     int ans=count(2034032050);
//        System.out.println(ans);
//        System.out.println(count(92139000));
//    }
//    private static int count(int n,int c 5){
////        return  helper(n,0)
//        if (n == 0) {
//            return c;
//        }
//        int rem =n%10;
//        if(rem ==0){
////            return helper (n/10,c)
//        }
////return helper(n/10,c)
//        return -1;//jsut fpr jen
//    }
//
public static void main(String[] args) {
//int ans=    numberofsteps(41,0);
//    System.out.println(ans);
}
public int numberofsteps(int num ,int steps)
{
    return helper( num, steps);
}
private int helper(int num ,int steps){
    if (num ==0){
        return steps;
    }

    if(num %2==0){
        return helper(num/2,steps +1);
    }
    return -1;
}
}