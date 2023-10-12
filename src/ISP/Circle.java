package ISP;

/**
 * Класс Circle имплементирует интерфейс Shape. Для 2D фигуры мы можем найти площадь.
 * Если бы мы сделали один интерфейс с методами для площади и объема, то нам бы пришлось реализовать методы этого интерфейса.
 * НО! мы не можем найти объем у круга. Объем характерен только для трехмерных фигур. Поэтому мы разделяем интерфейсы
 * Shape & Shape3D.
 */
public class Circle implements Shape {
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }


    @Override
    public double area() {
        return 2 * Math.PI * radius;
    }
}
