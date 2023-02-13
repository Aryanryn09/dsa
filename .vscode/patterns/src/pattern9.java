public class pattern9 {
    public  static void main(String[] args) {
           pattern9(5);
    }
    static void pattern9(int n){
        for (int row=1;row<=2*n;row++){
int newcol=row>n ? 2*n-row:row;
            for(int s=0;s<n-newcol;s++){
                System.out.print("  ");
            }
            for(int col=newcol;col>=1;col--){
                System.out.print(col+" ");
            }
            for(int col=2;col<=newcol;col++){
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }

}
