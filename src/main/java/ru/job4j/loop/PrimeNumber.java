package ru.job4j.loop;

/**
 * 1.1.5.Циклы
 * 5.6.Простые числа[#156314 #127179]
 */
public class PrimeNumber {
    public static int calc(int finish) {
        int count = 0;
        for (int num = 2; num <= finish; num++) {
            if (CheckPrimeNumber.check(num)) {
                count++;
            }
        }
        return count;
    }
}
