package ru.job4j.condition;

/**
 * 1.1.2. Тип данных
 * 8. Стороны прямоугольника.[#137735 #127157]
 */
public class SqArea {
    /**
     * Вычеселние площади прямоугольника
     *
     * @param p -периметр
     * @param k - соотношение строн
     * @return площадь
     */
    public static double square(double p, double k) {
        double h = p / (2 * (k + 1));
        double l = h * k;
        return l * h;
    }

    public static void main(String[] args) {
        double result = SqArea.square(6, 2);
        System.out.println("p= 6, k = 2, s = 2, real = " + result);
    }
}
