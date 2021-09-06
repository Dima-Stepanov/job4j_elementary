package ru.job4j.array;

/**
 * 1.1.6.Массивы
 * 6.6.2.Двухмерный массив.Циклы.[#306725]
 */
public class MatrixSum {
    public static int sum(int[][] array) {
        int rsl = 0;
        for (int row = 0; row < array.length; row++) {
            for (int cell = 0; cell < array[row].length; cell++) {
                rsl += array[row][cell];
            }
        }
        return rsl;
    }
}
