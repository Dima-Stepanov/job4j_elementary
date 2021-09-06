package ru.job4j.array;

/**
 * 1.1.6.Массивы
 * 6.2.Упорядочить массив.[#4441#127116]
 */
public class AlgoArray {
    public static void main(String[] args) {
        int[] array = new int[]{5, 3, 2, 1, 4};
        int temp = array[0];
        array[0] = array[3];
        array[3] = temp;
        temp = array[4];
        array[4] = array[3];
        array[3] = temp;
        temp = array[1];
        array[1] = array[2];
        array[2] = temp;
        for (int j : array) {
            System.out.println(j);
        }
    }
}
