package LSP;

public class Square extends QuadRangle{
    // Класс расширяет QuadRangle, добавили поле, переопределили метод нахождения
    // площади.
    private int length;

    public Square(int length) {
        this.length = length;
    }

    @Override
    public int area() {
        return this.length * this.length;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
}
