package DIP;

/**
 * Класс DieselPetrol модуль нижнего класса. Он зависит от абстракции Engine.
 */
public class DieselPetrol implements Engine {
    @Override
    public void start() {
        System.out.println("Запустили дизельный двигатель");
    }
}
