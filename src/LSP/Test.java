package LSP;

/**
 * Rectangle & Square являются наследниками класса QuadRangle.
 * Еслм создать объект класса QuadRangle и подставить туда объект, который наследуется(имплементируется для интерфейсов) от QuadRangle,
 * то программа не поломается и его функции будут работать правильно.
 * Метод area() будет в любом случае искать площадь фигуры, независимо от того Rectangle это или Square, но будет делать это для разных фигур.
 * НО БУДЕТ!
 */
public class Test {
    public static void main(String[] args) {
        QuadRangle quadRangle = new Rectangle(5, 3);
        System.out.println("Rectangle" + " " + quadRangle.area());
        quadRangle = new Square(5);
        System.out.println("Square" + " " + quadRangle.area());

    }
}
