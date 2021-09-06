package ru.job4j.array;

/**
 * 1.1.6.Массивы
 * 6.1.Классический поиск перебором.[#33489#127117]
 * 6.5.Поиск индекса в диапазоне.[#156318 #127121]
 */
public class FindLoop {
    /**
     * 6.1.Классический поиск перебором.[#33489#127117]
     * @param data int[]
     * @param el search element
     * @return index data
     */
    public static int indexOf(int[] data, int el) {
        int rsl = -1;
        for (int i = 0; i < data.length; i++) {
            if (data[i] == el) {
                rsl = i;
                break;
            }
        }
        return rsl;
    }

    /**
     * 6.5.Поиск индекса в диапазоне.[#156318 #127121]
     * @param data int[]
     * @param el search element
     * @param start start index search
     * @param finish end index search
     * @return index data
     */
    public static int indexOf(int[] data, int el, int start, int finish) {
        int rsl = -1;
        for (int i = start; i <= finish; i++) {
            if (data[i] == el) {
                rsl = i;
                break;
            }
        }
        return rsl;
    }
}
