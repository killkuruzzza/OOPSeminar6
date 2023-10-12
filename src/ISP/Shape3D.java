package ISP;

/**
 * Для трехмерных фигур можно найти площадь сторон и ОБЪЕМ фигуры.
 * Здесь мы наследуемся от интерфейса Shape, потому что для трехмерных фигур справедлив подсчёт площади(но нужно учитывать все стороны).
 */
public interface Shape3D extends Shape{
    public double volume();
}
