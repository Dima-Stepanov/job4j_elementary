package ru.job4j.array;

/**
 * 1.1.6. Массивы
 * 6.0.1.Объявление массива.[#3613#127112]
 */
public class ArrayDefinition {
    public static void main(String[] args) {
        short[] ages = new short[10];
        String[] surnames = new String[100500];
        float[] prices = new float[40];
        System.out.println("Размер массива ages: " + ages.length);
        System.out.println("Размер массива surnames: " + surnames.length);
        System.out.println("Размер массива prices: " + prices.length);
    }
}
