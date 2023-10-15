package OCP;

public class Bus extends Vehicle{
    //    Класс наследник для расширения класса Vehicle
    @Override
    public double calculateAllowedSpeed() {
        return super.getMaxSpeed() * 0.5;
    }

    public Bus(int maxSpeed) {
        super(maxSpeed, "Bus");
    }
}
