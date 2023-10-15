package DIP;

public class DieselPetrol implements Engine {
    // Этот класс нижнего уровня он зависим от абстрактного
    // интерфейса Engine и не имеет влияния на класс Car, т.к. создается
    // через интерфейс.
    @Override
    public void start() {
        System.out.println("Запустили дизельный двигатель");
    }
}
