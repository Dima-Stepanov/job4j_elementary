package ru.job4j.array;

/**
 * 1.1.6.Массивы
 * 6.5.2.Поиск минимума в диапазоне.[#179804#127125]
 */
public class MinDiapason {
    /**
     * 6.5.2.Поиск минимума в диапазоне.[#179804#127125]
     *
     * @param array  int[]
     * @param start  start search
     * @param finish finish search
     * @return min element
     */
    public static int findMin(int[] array, int start, int finish) {
        int min = array[start];
        for (int i = start; i <= finish; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        return min;
    }
}
