package ru.job4j.array;

/**
 * 1.1.6.Массивы
 * 6.2.3.Перевернуть массив.[#226790#127124]
 */
public class Check {
    public static boolean mono(boolean[] data) {
        boolean result = true;
        boolean temp = data[0];
        for (int i = 1; i < data.length - 1; i++) {
            if (temp != data[i]) {
                result = false;
                break;
            }
        }
        return result;
    }
}
