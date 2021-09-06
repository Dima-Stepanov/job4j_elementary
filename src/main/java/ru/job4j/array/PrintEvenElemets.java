package ru.job4j.array;

/**
 * 1.1.6.Массивы
 * 6.4.1.1. Обход массива с последнего элемента[#361619]
 */
public class PrintEvenElemets {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        for (int i = 0; i < numbers.length; i++) {
            if ((numbers.length - 1 - i) % 2 == 0) {
                System.out.println("Элемент массива с четным индексом начиная с последнего: "
                        + numbers[numbers.length - 1 - i]
                );
            }
        }
    }
}
