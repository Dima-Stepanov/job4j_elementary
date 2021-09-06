package ru.job4j.array;

/**
 * 1.1.6.Массивы
 * 6.4.1.Сравнить последние элементы двух массивов[#304228]
 */
public class EqLast {
    public static boolean check(int[] left, int[] right) {
        return left[left.length - 1] == right[right.length - 1];
    }
}
