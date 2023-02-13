package interfaces.demo;

public interface A {
    static void greetings() {
        System.out.println("i am in greeting");
    }

    static void endgame() {
        System.out.println("two static methods can be called by the name of the interface itself and not by the name of the obj ");

    }

    default void fun() {

        System.out.println("i am in A");
    }
}
