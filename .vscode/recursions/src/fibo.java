public class fibo {
    public static void main(String[] args) {
     int ans=4;
        System.out.println(fibo(ans));
        System.out.println(fiboformula(50));//
    }
    static int fibo(int n){
        if(n<2){// base condition
            return n;//if n=0return 0 and if n =1 return 1 itself
        }
        return fibo(n-1)+fibo(n-2);//recursive relation
    }
    static int fiboformula(int n){

        return (int)(Math.pow(((1+Math.sqrt(5))/2),n)/Math.sqrt(5));//-Math.pow(((1-Math.sqrt(5)/2)),n)/Math.sqrt(5));less dominating terms can be removed
    }
}
//fibonachi series-0,1,1,2,3,5,8,13,21