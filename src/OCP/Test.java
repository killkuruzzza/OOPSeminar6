package OCP;

public class Test {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle(100, "SOLID");
        System.out.println(vehicle.getType() + " " + vehicle.calculateAllowedSpeed());
        Vehicle car = new Car(200);
        System.out.println(car.getType() + " " + car.calculateAllowedSpeed());
        Vehicle bus = new Bus(100);
        System.out.println(bus.getType() + " " + bus.calculateAllowedSpeed());

    }
}
