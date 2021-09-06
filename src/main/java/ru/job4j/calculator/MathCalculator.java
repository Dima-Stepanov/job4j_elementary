package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

/**
 * 1.1.3.Тестирование
 * 1.1. Что такое import [#504773]
 */
public class MathCalculator {
    /**
     * sumAndMultiply
     *
     * @param first double
     * @param second double
     * @return sum + multiply
     */
    public static double sumAndMultiply(double first, double second) {
        return sum(first, second) + multiply(first, second);
    }

    /**
     * sumDifferAndDivide
     *
     * @param first double
     * @param second double
     * @return difference + divide
     */
    public static double sumDifferAndDivide(double first, double second) {
        return difference(first, second) + divide(first, second);
    }

    /**
     * sumAllMathFunction
     *
     * @param first double
     * @param second double
     * @return sum + multiply + difference + divide
     */
    public static double sumAllMathFunction(double first, double second) {
        return sum(first, second) + multiply(first, second) + difference(first, second) + divide(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета равен: " + sumAndMultiply(10, 20));
        System.out.println("Результат расчета равен: " + sumDifferAndDivide(10, 20));
        System.out.println("Результат расчета равен: " + sumAllMathFunction(10, 20));
    }
}
