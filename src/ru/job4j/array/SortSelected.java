package ru.job4j.array;

/**
 * 1.1.6.Массивы
 * 6.5.3.Сортировка выборкой.[#156320#127122]
 */
public class SortSelected {
    public static int[] sort(int[] data) {
        for (int i = 0; i < data.length; i++) {
            int min = MinDiapason.findMin(data, i, data.length - 1);
            int indexMin = FindLoop.indexOf(data, min, i, data.length - 1);
            int temp = data[i];
            data[i] = data[indexMin];
            data[indexMin] = temp;
        }
        return data;
    }
}
