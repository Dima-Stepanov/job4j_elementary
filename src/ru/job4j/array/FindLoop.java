package ru.job4j.array;

/**
 * 1.1.6.Массивы
 * 6.1.Классический поиск перебором.[#33489#127117]
 */
public class FindLoop {
    public static int indexOf(int[] data, int el) {
        int rsl = -1;
        for (int i = 0; i < data.length; i++) {
            if (data[i] == el) {
                rsl = i;
                break;
            }
        }
        return rsl;
    }
}
