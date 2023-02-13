package abstraction;

public class Son extends Parent {


    private static final int value = 56846;

    public Son(int age) {
        super(age, value);
    }

    @Override
    void carrer() {
        System.out.println("ia ma going top doctor");

    }

    @Override
    void Partner() {
        System.out.println("i am your partner");
    }

}
