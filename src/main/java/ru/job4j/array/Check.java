package ru.job4j.array;

/**
 * 1.1.6.Массивы
 * 6.3.Массив заполнен true или false[#53857#127118]
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
