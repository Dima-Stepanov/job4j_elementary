package ru.job4j.array;

import java.util.Arrays;

/**
 * 1.1.6.Массивы
 * 6.9.Жадный алгоритм.Сдача в кофе машине[#34741]
 */
public class Machine {
    public static int[] change(int money, int price) {
        int[] coins = {10, 5, 2, 1};
        int[] rsl = new int[100];
        int size = 0;
        int change = money - price;
        for (int i = 0; i < coins.length && change > 0; i++) {
            while (change - coins[i] >= 0) {
                change -= coins[i];
                rsl[size++] = coins[i];
            }
        }
        return Arrays.copyOf(rsl, size);
    }
}
