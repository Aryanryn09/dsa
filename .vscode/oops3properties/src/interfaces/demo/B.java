package interfaces.demo;

public interface B {

    default void greet() {
        System.out.println("i am in greeting");

    }
}
