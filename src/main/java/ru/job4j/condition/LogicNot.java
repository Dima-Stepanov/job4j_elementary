package ru.job4j.condition;

/**
 * 1.1.4.Оператор ветвления
 * 4.3.3.Логическое отрицание![#334072]
 */
public class LogicNot {
    /**
     * 1 num is Even
     *
     * @param num number
     * @return boolean
     */
    public static boolean isEven(int num) {
        return num % 2 == 0;
    }

    /**
     * 2 num is Positive
     *
     * @param num number
     * @return boolean
     */
    public static boolean isPositive(int num) {
        return num > 0;
    }

    /**
     * 3 num is not Even
     *
     * @param num number
     * @return boolean
     */
    public static boolean notEven(int num) {
        return !isEven(num);
    }

    /**
     * 4 num is not Positive
     *
     * @param num number
     * @return boolean
     */
    public static boolean notPositive(int num) {
        return !isPositive(num);
    }

    /**
     * 5 num is not Even and Positive
     *
     * @param num number
     * @return boolean
     */
    public static boolean notEvenAndPositive(int num) {
        return notEven(num) && isPositive(num);
    }

    /**
     * 6 num is even or not Positive
     *
     * @param num number
     * @return boolean
     */
    public static boolean evenOrNotPositive(int num) {
        return isEven(num) || notPositive(num);
    }
}
