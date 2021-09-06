package ru.job4j.condition;

/**
 * 1.1.4. Оператор ветвления
 * 4.1.0. Оператор if с блоком else[#227534#127104]
 */
public class Cinema {
    public static void access(int age) {
        System.out.println("The age of the customer is: " + age);
        if (age >= 18) {
            System.out.println("Welcome to the cinema");
        } else {
            System.out.println("It is not for you");
        }
    }

    public static void main(String[] args) {
        Cinema.access(21);
        Cinema.access(16);
    }
}
