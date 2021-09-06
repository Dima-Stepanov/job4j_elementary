package ru.job4j.loop;

/**
 * 1.1.5. Циклы
 * 5.0.1.Сумма чисел.[#226416#127176]
 * 5.1.Подсчет суммы чётных чисел в диапазоне[#192#127188]
 */
public class Counter {
    public static int sum(int start, int finish) {
        int sum = 0;
        for (int i = start; i <= finish; i++) {
            sum += i;
        }
        return sum;
    }

    public static int sumByEven(int start, int finish) {
        int sum = 0;
        for (int i = start; i <= finish; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        return sum;
    }
}
