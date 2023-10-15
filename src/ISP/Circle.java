package ISP;

public class Circle implements Shape {
    // Этот класс использует только интерфейс Shape для подсчета площади,
    // окружности не нужен метод вычесления объема, поэтому интерфейсы
    // разделены.
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
        return 2 * 3.14 * radius;
    }
}
