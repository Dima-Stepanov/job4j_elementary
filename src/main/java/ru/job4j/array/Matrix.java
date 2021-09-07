package ru.job4j.array;

/**
 * 1.1.6.Массивы
 * 6.6.8.Двухмерный массив.Таблица умножения.[#33491#127123]
 */
public class Matrix {
    public static int[][] multiple(int size) {
        int[][] array = new int[size][size];
        for (int row = 0; row < array.length; row++) {
            for (int cell = 0; cell < array[row].length; cell++) {
                array[row][cell] = (row + 1) * (cell + 1);
            }
        }
        return array;
    }
}
