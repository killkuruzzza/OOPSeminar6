package DIP;

/**
 * Объекту типа Car всё равно какой у него будет двигатель. Главное чтобы он
 * был в зависимости от абстракции Engine.
 */
public class Test {
    public static void main(String[] args) {
        Car car = new Car(new PetrolEngine());
        car.start();
        car = new Car(new DieselPetrol());
        car.start();
    }
}
