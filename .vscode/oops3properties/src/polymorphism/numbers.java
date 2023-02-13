package polymorphism;

public class numbers {
    public static void main(String[] args) {
        numbers obj = new numbers();
        obj.sum(2, 3);
        obj.sum(2345, 324, 34);
    }

    double sum(double a, int b) {
        return a + b;

    }

    int sum(int a, int b, int c) {
        return a + b;
    }
}
