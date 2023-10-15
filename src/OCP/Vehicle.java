package OCP;

public class Vehicle {
    //    При создании разных типов транспортных средств придется каждый раз
    //    вносить изменения в этот класс. Чтобы этого избежать расширяем его путем
    //    создания классов наследников Car и Bus. И в них переопределяем метод
    //    вычисления максимальной скорости.
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
