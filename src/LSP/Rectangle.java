package LSP;

public class Rectangle extends QuadRangle {
    // Класс расширяет QuadRangle, добавили два поля, переопределили метод нахождения
    // площади.
    private int width;
    private int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public int area() {
        return this.height * this.width;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }


}
