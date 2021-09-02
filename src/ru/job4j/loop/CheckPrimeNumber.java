package ru.job4j.loop;

/**
 * 1.1.5.Циклы
 * 5.5.Простое число[#171694#127178]
 */
public class CheckPrimeNumber {
    public static boolean check(int number) {
        boolean prime = false;
        if (number > 1) {
            prime = true;
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    prime = false;
                    break;
                }
            }
        }
        return prime;
    }
}
