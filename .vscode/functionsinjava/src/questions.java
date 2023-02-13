import java.util.Scanner;

public class questions {
    public static void main(String[] args) {
        //prime number
//        int n;
        Scanner input = new Scanner(System.in);
//          int n =input.nextInt();
//        System.out.println(isprime(n));
        System.out.println(armstrong(153));
        for(int i=100;1<=999;i++){
if(armstrong(i)){
    System.out.println(i);
}

        }
    }
    //check if the number is an armstrong number or not
//taking and summing the squares of individual digits for a given number =
static boolean armstrong(int n)
{
    int original =n;
    int sum=0;
while(n>0){

    int rem = n%10;
    n=n/10;
    sum = sum+ rem*rem*rem;

}
if(sum == original){
    return true;
}                                      ///return sum==original
else{
    return false;
}


}





    static boolean isprime( int n)
    {
        if (n <= 1) {
            return false;
        }
        int c = 2;
        while (c * c <= n) {
            if (n % c == 0) {
//                System.out.println("not prime");
                return false;
            }
            c++;


        }
//return c*c>n;
        return c*c>n;
    }
    }

