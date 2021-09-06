package ru.job4j.array;

/**
 * 1.1.6.Массивы
 * 6.2.1.Выход за границу массива.[#226794#127134]
 * 6.2.2.Переставить элементы массива[#226795#127133]
 */
public class SwitchArray {
    /**
     * 6.2.2. Переставить элементы массива [#226795 #127133]
     *
     * @param array  []
     * @param source int
     * @param dest   int
     * @return array
     */
    public static int[] swap(int[] array, int source, int dest) {
        int temp;
        if (source < array.length && dest < array.length) {
            temp = array[source];
            array[source] = array[dest];
            array[dest] = temp;
        }
        return array;
    }

    /**
     * 6.2.1. Выход за границу массива. [#226794 #127134]
     *
     * @param array int
     * @return array
     */
    public static int[] swapBorder(int[] array) {
        int temp = array[0];
        array[0] = array[array.length - 1];
        array[array.length - 1] = temp;
        return array;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 3, 4, 5, 6};
        int[] rsl = swapBorder(nums);
        for (int j : rsl) {
            System.out.println(j);
        }
    }
}
