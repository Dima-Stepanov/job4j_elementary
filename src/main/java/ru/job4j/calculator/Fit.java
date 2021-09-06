package ru.job4j.calculator;

/**
 * 1.1.2. Тип данных
 * 6. Идеальный вес [#41584 #127150]
 */
public class Fit {
    /*
    вес мужчины
     */
    public static double manWeitght(short height) {
        return (height - 100) * 1.15;
    }

    /*
    вес женщины
     */
    public static double womanWeight(short height) {
        return (height - 110) * 1.15;
    }

    public static void main(String[] args) {
        short height = 187;
        double man = Fit.manWeitght(height);
        double woman = Fit.womanWeight(height);
        System.out.println("Man 187 is " + man);
        System.out.println("Woman 187 is " + woman);
    }
}
