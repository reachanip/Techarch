package car;

public class Bike extends Vehicle {
    boolean hasHelmet;

    @Override
    public void start() {
        System.out.println(" I am a bike");
    }
}
