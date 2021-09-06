package ru.job4j.condition;

/**
 * 1.1.4.Оператор ветвления
 * 4.2.Тернарное сравнение[#189#127107]
 */
public class Max {
    public static int max(int left, int right) {
        int result = left >= right ? left : right;
        return result;
    }
}
