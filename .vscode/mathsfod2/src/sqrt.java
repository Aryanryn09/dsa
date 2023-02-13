public class sqrt {
    public static void main(String[] args) {
int n=40;
        System.out.println("%.3f"+ sqrt( 40,3));
    }
    static int sqrt(int n,int p){
        int s=0;
        double root=0.0;
        int e=n;
        while(s<e){
            int m=s+e-s/2;
            if(m*m==n){
                return m;
            }
            if(m*m>n){
                s=m+1;
            }
            if(m*m<n){
                e=m-1;
            }

        }
 double incr=0.1;
       for(int i=0;i<=n;i++){
           while(root*root<n) {
               root += incr;


           }

       root-=incr;
 incr /=10;
           System.out.println(root);
       }
       return -1;
    }
}

