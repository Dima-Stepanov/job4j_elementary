package ru.job4j.array;

/**
 * 1.1.6.Массивы
 * 6.6.1.Размер элемента двухмерного массива.[#333583]
 */
public class LengthArrayArrays {
    public static void main(String[] args) {
        int[][] numbers = {
                {1},
                {2, 3},
                {4, 5, 6},
                {7, 8, 9, 10}
        };
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(
                    "Размер вложенного массива равен: " + numbers[i].length
            );
        }
    }
}
