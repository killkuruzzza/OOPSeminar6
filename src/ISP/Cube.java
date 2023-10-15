package ISP;

public class Cube implements Shape, Shape3D {
    // Этот класс использует интерфейс Shape и Shape3D  для подсчета площади
    // и объема.
    private int length;

    public Cube(int length) {
        this.length = length;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public double area() {
        return this.length * this.length * 6;
    }

    @Override
    public double volume() {
        return Math.pow(length, 3);
    }
}
