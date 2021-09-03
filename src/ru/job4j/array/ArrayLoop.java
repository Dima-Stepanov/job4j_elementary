package ru.job4j.array;

/**
 * 1.1.6.Массивы
 * 6.0.3.Массивы и цикл for.[#226665#127113]
 * 6.0.3.1.Массивы и цикл for-each[#333581]
 */
public class ArrayLoop {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i * 2 + 3;
        }
        for (int number : numbers) {
            System.out.println(number);
        }
    }
}
