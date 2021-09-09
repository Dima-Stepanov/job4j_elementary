package ru.job4j.condition;

import static java.lang.Math.sqrt;
import static java.lang.Math.pow;

/**
 * 1.1.2. Тип данных
 * 7. Расстояние между точками в системе координат [#188 #127151]
 * Math.sqrt(a) - корень квадратный от числа а.
 * Math.pow(a, b) - возведение числа а в степень b.
 * 1.2.1.Классы и объекты
 * 2.1.Рефакторинг - Расстояние между точками.[#122587#127044]
 */
public class Point {
    private int x;
    private int y;

    public Point(int first, int second) {
        this.x = first;
        this.y = second;
    }

    public double distance(Point that) {
        return sqrt(pow(this.x - that.x, 2)
                + pow(this.y - that.y, 2));
    }

    public static void main(String[] args) {
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        double dist = a.distance(b);
        System.out.println(dist);
    }
}
