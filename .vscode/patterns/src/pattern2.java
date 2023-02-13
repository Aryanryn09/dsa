public class pattern2 {
    public static void main(String[] args) {
        //****
        //****
        //****
        pattern2(4,3);

        }
        static void pattern2(int n ,int m){
        //here no of rows =n no of col =no of rows =n
            for(int row=1;row<=n;row ++){
                for(int col=1;col<=m;col++){
                    System.out.print(" * ");//print is used for not skipping lines in the individual code o\itself
                }
                System.out.println();
            }
        }
}
