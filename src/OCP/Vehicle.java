package OCP;

/**
 * Классы Car & Bus наследуются от класса Vehicle. Он остается неизменным, то есть закрытым для модификации,
 * но доступен для расширения(что и делают его дочерние классы).
 */
public class Vehicle {
    private int maxSpeed;
    private String type;

    public double calculateAllowedSpeed(){
        return maxSpeed;
    }
    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Vehicle(int maxSpeed, String type) {
        this.maxSpeed = maxSpeed;
        this.type = type;
    }


}
