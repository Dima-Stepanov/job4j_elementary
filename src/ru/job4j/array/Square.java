package ru.job4j.array;

/**
 * 1.1.6.Массивы
 * 6.0.4.Заполнить массив степенями чисел.[#33488#127114]
 */
public class Square {
    public static int[] calculate(int bound) {
        int[] rst = new int[bound];
        for (int i = 0; i < rst.length; i++) {
            rst[i] = i * i;
        }
        return rst;
    }

    public static void main(String[] args) {
        int[] array = calculate(4);
        for (int arr : array) {
            System.out.println(arr);
        }
    }
}
