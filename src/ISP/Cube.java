package ISP;

public class Cube implements Shape3D {
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
