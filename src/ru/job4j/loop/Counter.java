package ru.job4j.loop;

/**
 * 1.1.5. Циклы
 * 5.0.1.Сумма чисел.[#226416#127176]
 */
public class Counter {
    public static int sum(int start, int finish) {
        int sum = 0;
        for (int i = start; i <= finish; i++) {
            sum = sum + i;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sum(0, 10));
        System.out.println(sum(3, 8));
        System.out.println(sum(1, 1));
        System.out.println(sum(1, 5));
        System.out.println(sum(11, 20));
        System.out.println(sum(15, 20));
    }
}
