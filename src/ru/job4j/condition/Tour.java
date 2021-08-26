package ru.job4j.condition;

/**
 * 1.1.4. Оператор ветвления
 * 4.1.0. Оператор if с блоком else[#227534#127104]
 */
public class Tour {
    public static void offer(boolean passport) {
        System.out.println("A clien has foreign passport : " + passport);
        if (passport) {
            System.out.println("Tours abroad.");
        } else {
            System.out.println("Tours in Russia.");
        }
    }

    public static void main(String[] args) {
        Tour.offer(true);
        Tour.offer(false);
    }
}
