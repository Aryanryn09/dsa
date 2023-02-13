public class pattern3 {
    public static void main(String[] args) {
        pattern3(4);
        }
        static void pattern3(int n){

            for(int row=1;row<=n ;row++){
                //for every row run thee column
                for(int col=1;col<=n-row+1 ;col++){
                    System.out.print("*");
                }                      //when one row is printed a new linw is to be printed
                System.out.println();

            }
        }

    }

