package Objectorientedpro;

public class Parkinglot {
    public static void main(String[] args) {
        Car car= new Car("bmw");
        Car car2= new Car("TESLA");
        Car car3= new Car("MERCEDESE");
        Car car4= new Car("BLACK STALLION");
        Garage garage= new Garage();
        garage.park(car);

        garage.park(car2);
        garage.park(car3);
        garage.park(car4);
    }

}
