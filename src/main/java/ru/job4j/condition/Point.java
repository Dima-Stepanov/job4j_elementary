package ru.job4j.condition;

/**
 * 1.1.2. Тип данных
 * 7. Расстояние между точками в системе координат [#188 #127151]
 * Math.sqrt(a) - корень квадратный от числа а.
 * Math.pow(a, b) - возведение числа а в степень b.
 */
public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        double x = x2 - x1;
        double y = y2 - y1;
        double powX = Math.pow(x, 2);
        double powY = Math.pow(y, 2);
        return Math.sqrt((powX - powY));
    }

    public static void main(String[] args) {
        double result = Point.distance(0, 0, 2, 0);
        System.out.println("result (0, 0) to (2, 0) " + result);
        result = Point.distance(2, 5, 5, 3);
        System.out.println("result (2, 5) to (5, 3) " + result);
    }
}
