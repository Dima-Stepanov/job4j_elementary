package ru.job4j.array;

/**
 * 1.1.6.Массивы
 * 6.5.1.Поиск минимального числа в массиве.[#179803#127131]
 */
public class Min {
    public static int findMin(int[] array) {
        int min = array[0];
        for (int j : array) {
            if (min > j) {
                min = j;
            }
        }
        return min;
    }
}
