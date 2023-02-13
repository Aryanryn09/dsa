public class newtonsrapson {
    public static void main(String[] args) {
        System.out.println(sqrt(4));
    }
    static double sqrt(double n ){
        double root;
        double x=n;
        while(true ){
            root = 0.5*(x+(n/x));
            if(Math.abs(root-x)<1){
                break;
            }
x=root;

        }

return root;

    }
}
