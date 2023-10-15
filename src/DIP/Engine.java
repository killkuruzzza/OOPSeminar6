package DIP;

public interface Engine {
    // Это абстрактный интерфейс, который не зависим от
    // класса Car и классов DieselPetrol и PetrolEngine, но единственный его метод
    // используется ими.
    public void start();
}
