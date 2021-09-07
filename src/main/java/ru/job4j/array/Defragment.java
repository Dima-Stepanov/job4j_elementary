package ru.job4j.array;

/**
 * 1.1.6.Массивы
 * 6.8. Дефрагментация массива [#225 #127130]
 */
public class Defragment {
    public static String[] compress(String[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == null) {
                for (int j = i + 1; j < array.length; j++) {
                    if (array[j] != null) {
                        String temp = array[j];
                        array[j] = array[i];
                        array[i] = temp;
                        break;
                    }
                }
            }
        }
        return array;
    }
}
