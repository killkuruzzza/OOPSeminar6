package DIP;

public class DieselPetrol implements Engine {
    @Override
    public void start() {
        System.out.println("Запустили дизельный двигатель");
    }
}
