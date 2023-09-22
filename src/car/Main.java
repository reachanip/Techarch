package car;

public class Main {
    public static void start(Vehicle car) {
        car.start();
    }

    public static void main(String[] args) {
        Vehicle vehicle = new Car();
        Car car = new Car();
        Bike bike = new Bike();
        start(vehicle);
    }
}
