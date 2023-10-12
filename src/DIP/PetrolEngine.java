package DIP;
/**
 * Класс PetrolEngine модуль нижнего класса. Он зависит от абстракции Engine.
 */
public class PetrolEngine implements Engine {
    @Override
    public void start(){
        System.out.println("Бензиновый двигатель запущен");
    }
}
