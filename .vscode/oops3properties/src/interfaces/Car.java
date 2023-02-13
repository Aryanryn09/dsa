package interfaces;

public class Car implements engine, brakes, media {

    @Override
    public void brakes() {
        System.out.println(" i applied brakes");
    }

    @Override
    public void start() {
        System.out.println("i started the car ");
    }

    @Override
    public void stop() {
        System.out.println(" i stoped the ca r= ");
    }

    @Override
    public void acc() {
        System.out.println("i acclerated the car");

    }
}
