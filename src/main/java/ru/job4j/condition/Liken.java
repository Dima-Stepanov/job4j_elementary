package ru.job4j.condition;

/**
 * 1.1.4. Оператор ветвления
 * 0. Операции сравнения [#235631#127105]
 */
public class Liken {
    public static void main(String[] args) {
        int first = 10;
        int second = 9;
        boolean rsl = first > second;
        System.out.println(rsl);
        rsl = first < second;
        System.out.println(rsl);
        rsl = first == second;
        System.out.println(rsl);
        rsl = first != second;
        System.out.println(rsl);
    }
}
