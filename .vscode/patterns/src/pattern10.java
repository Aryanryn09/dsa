public class pattern10 {
    public static void main(String[] args) {
        pattern10(4);
    }
    static void pattern10(int n){
    int originalN=n;
        n=n*2;
    for(int r=0;r<=n;r++) {
    for(int c=0;c<=n;c++){
        int everindex= originalN-Math.min(Math.min(r,c),Math.min(n-c,n-r));//neglect original n and see the mageic
        System.out.print(everindex +" ");

    }
        System.out.println( );

    }
    }
}
