package OCP;

public class Car extends Vehicle{
    //    Класс наследник для расширения класса Vehicle
    public Car(int maxSpeed) {
        super(maxSpeed, "Car");
    }

    @Override
    public double calculateAllowedSpeed() {
        return super.getMaxSpeed() * 0.8;
    }
}
