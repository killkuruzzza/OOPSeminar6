package DIP;

/**
 * Класс Car - модуль верхнего уровня. Он зависит от абстракции Engine.
 */
public class Car {
    public Engine engine;

    public Car(Engine engine) {
        this.engine = engine;
    }
    public void start(){
        engine.start();
    }
}
