public class pattern7 {
    public static void main(String[] args) {
pattern7(3);
    }
    static  void pattern7(int n){
        for(int row=0;row<=2*n;row++){
            int totalcols=row>n ? 2*n-row :row;
            int totalspaces=n-totalcols;
            for(int s=0;s<=totalspaces;s++) {
                System.out.print(" ");
            }
            for(int col=0;col<=totalcols;col++){
                    System.out.print("* ");
                }
                System.out.println();
            }


    }
}
