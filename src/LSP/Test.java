package LSP;

public class Test {
    public static void main(String[] args) {
        QuadRangle quadRangle = new Rectangle(5, 3);
        System.out.println("Rectangle" + " " + quadRangle.area());
        quadRangle = new Square(5);
        System.out.println("Square" + " " + quadRangle.area());

    }
}
