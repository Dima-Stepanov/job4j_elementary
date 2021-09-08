package ru.job4j.array;

import java.util.Arrays;

/**
 * 1.1.6.Массивы
 * 6.9.Жадный алгоритм.Сдача в кофе машине[#34741]
 * fori заменил на for each
 */
public class Machine {
    public static int[] change(int money, int price) {
        int[] coins = {10, 5, 2, 1};
        int[] rsl = new int[100];
        int size = 0;
        int change = money - price;
        for (int coin : coins) {
            while (change - coin >= 0) {
                change -= coin;
                rsl[size++] = coin;
            }
        }
        return Arrays.copyOf(rsl, size);
    }
}
