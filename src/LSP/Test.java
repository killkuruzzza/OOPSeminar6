package LSP;

public class Test {
//    Проверяем класс QuadRangle и отнаследованные от него классы Rectangle и Square,  если мы заменим все использования класса
//    QuadRangle на Rectangle или Square, ничего не меняется в работе программы. Ведь классы Rectangle и Square всего лишь
//    расширяют функционал класса QuadRangle.
//    Проверка работает, значит программа соответствует принципу подстановки Лисков.
    public static void main(String[] args) {
        QuadRangle quadRangle = new Rectangle(5, 3);
        System.out.println("Rectangle" + " " + quadRangle.area());
        quadRangle = new Square(5);
        System.out.println("Square" + " " + quadRangle.area());

    }
}
