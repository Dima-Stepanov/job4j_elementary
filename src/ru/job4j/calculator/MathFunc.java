package ru.job4j.calculator;

/**
 * 1.1.2. Тип данных
 * 4.2. Результат работы метода [#232622 #127145]
 */
public class MathFunc {
    public static int func1(int x) {
        return x * x + 1;
    }

    public static int func2(int x) {
        return x * 10;
    }

    public static void main(String[] args) {
        int result1 = MathFunc.func1(3);
        int result2 = MathFunc.func2(5);
        int result3 = MathFunc.func1(100);
        System.out.println(result3);
        System.out.println(result1 + result2 + result3);
    }
}
