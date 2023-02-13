package interfaces.demo.nestedinterfaces;

public class A {
    public interface nestedinter {
        boolean isOdd(int num);
    }
}

class B implements A.nestedinter {


    @Override
    public boolean isOdd(int num) {
        return (num & 1) == 1;
    }
}