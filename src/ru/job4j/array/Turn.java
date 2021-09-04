package ru.job4j.array;

/**
 * 1.1.6.Массивы
 * 6.2.3.Перевернуть массив.[#226790#127124]
 */
public class Turn {
    public static int[] back(int[] array) {
        int step = (array.length) / 2;
        int temp;
        for (int i = 0; i < step; i++) {
            temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
        return array;
    }
}
