public class math {
    public static void main(String[] args) {
        int n=66;
        System.out.println(isodd(n));
    }
    static boolean isodd(int n){

        return (n & 1)==0;
  //else you can put it as n&1==1 for odd once
    }
}
