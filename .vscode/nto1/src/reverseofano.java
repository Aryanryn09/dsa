import javax.crypto.spec.PSource;

public class reverseofano {
    public static void main(String[] args) {
         rev(5);

    }

    static int sum = 0;

    static void rev(int n) {
        if (n == 0) {
            return ;
        }
        int rem = n % 10;
        sum = sum * 10 + rem;
        rev(n / 10);
//return -1;
    }
//    PSourc
}
