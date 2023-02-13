package exception;

public class Main {
    public static void main(String[] args) {

        int a = 5;
        int b = 0;
        int d = a / b;
        System.out.println(d);
        try {
//            int c = a / b;
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("normal exception");
        } finally {
            System.out.println("thi swill always excecute");
        }


    }

    static int divide(int a, int b) throws ArithmeticException {

        if (b == 0) {
            throw new ArithmeticException("please do not divide by zero");
        }
        return a / b;
    }
}
