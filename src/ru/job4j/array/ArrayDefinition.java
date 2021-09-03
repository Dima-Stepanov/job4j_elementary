package ru.job4j.array;

/**
 * 1.1.6. Массивы
 * <p>
 * 6.0.1.Объявление массива.[#3613#127112]
 * 6.0.1.1. Размер массива [#333582 #198578]
 * 6.0.2. Заполнение массива. [#226300 #127128]
 */
public class ArrayDefinition {
    public static void main(String[] args) {
        /*
         * 6.0.1. Объявление массива. [#3613 #127112]
         */
        short[] ages = new short[10];
        String[] surnames = new String[100500];
        float[] prices = new float[40];
        /*
         * 6.0.1.1. Размер массива [#333582 #198578]
         */
        System.out.println("Размер массива ages: " + ages.length);
        System.out.println("Размер массива surnames: " + surnames.length);
        System.out.println("Размер массива prices: " + prices.length);
        /*
         * 6.0.2. Заполнение массива. [#226300 #127128]
         */
        String[] names = new String[4];
        names[0] = "Dima";
        names[1] = "Alex";
        names[2] = "Valentin";
        names[3] = "Elena";
        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);
        System.out.println(names[3]);
    }
}
