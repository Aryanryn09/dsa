public class gcdandlcm {
    public static void main(String[] args) {

        System.out.println(gcd(2,8));
    }
    static int gcd(int a,int b){
        if(a==0){
            return b;
        }
        return gcd(b%a,b);

    }//wwhat =about the lsc m
    static int lcm(int a ,int b){
        return a*b/gcd(a,b);

    }
//fuck j lage dil utte asth sochte 9yaa sale k mai gaya kive bajh
}
