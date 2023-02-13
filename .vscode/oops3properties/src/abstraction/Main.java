package abstraction;

public class Main {
    public static void main(String[] args) {
        Son son = new Son(23);
        son.carrer();
        son.Partner();
        Daughter daughter = new Daughter(22);
        daughter.carrer();
        daughter.Partner();

    }
}
