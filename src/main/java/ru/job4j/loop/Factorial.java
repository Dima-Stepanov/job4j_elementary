package ru.job4j.loop;

/**
 * 1.1.5. Циклы
 * 5.2.Создать программу, вычисляющую факториал.[#193#127184]
 */
public class Factorial {
    public static int calc(int n) {
        int result = 1;
        if (n > 0) {
            for (int i = 1; i <= n; i++) {
                result *= i;
            }
        }
        return result;
    }
}
