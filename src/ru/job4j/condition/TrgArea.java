package ru.job4j.condition;

/**
 * 1.1.2. Тип данных
 * 9. Площадь треугольника.[#175474 #127152]
 */
public class TrgArea {
    /**
     * Метод вычисляет площадь треугольника
     *
     * @param a сторона
     * @param b сторона
     * @param c сторона
     * @return площадь треугольника
     */
    public static double area(double a, double b, double c) {
        double p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    public static void main(String[] args) {
        double rsl = TrgArea.area(2, 2, 2);
        System.out.println("area (2, 2, 2) = " + rsl);
    }
}
