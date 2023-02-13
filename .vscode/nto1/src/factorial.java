public class factorial {
    public static void main(String[] args) {
        int ans=factio(5);
        System.out.println(ans);
        int sum=sum(5);
        System.out.println(sum);
    }
    static int factio(int n){
        if(n==1){
   return 1;
        }
    return n*factio(n-1);
    }//for sum of the vallues =waht to do
    static int sum(int n ){
        if(n<=1){
            return 1;
        }
        return n+sum(n-1);
    }
    static void rev2(int n){
        int digits = (int)( Math.log10(n)+1);
//        return Helper(n,digits)

    }

}
