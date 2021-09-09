package ru.job4j.condition;

/**
 * 1.1.4.Оператор ветвления
 * 4.2.Тернарное сравнение[#189#127107]
 * 1.2.1.Классы и объекты
 * 3.Перегрузить метод max для трех чисел[#122644#127048]
 *
 * @version 2
 * @since 10.09.2021
 */
public class Max {
    /**
     * max 2 number
     *
     * @param first  number
     * @param second number
     * @return max number
     */
    public static int max(int first, int second) {
        return Math.max(first, second);
    }

    /**
     * max 3 number
     *
     * @param first  number
     * @param second number
     * @param third  number
     * @return max number
     */
    public static int max(int first, int second, int third) {
        return max(first, max(second, third));
    }

    /**
     * max 4 number
     *
     * @param first  number
     * @param second number
     * @param third  number
     * @param four   number
     * @return max number
     */
    public static int max(int first, int second, int third, int four) {
        return max(first, max(second, third, four));
    }
}
