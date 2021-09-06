package ru.job4j.condition;

/**
 * 1.1.4. Оператор ветвления
 * 4.1.Операторы ветвлений [#3611#127102]
 */
public class AlertDivByZero {
    public static void main(String[] args) {
        possibleDiv(4);
        possibleDiv(0);
        possibleDiv(-5);
    }

    public static void possibleDiv(int number) {
        if (number == 0) {
            System.out.println("Could not div by 0");
        }
        if (number < 0) {
            System.out.println("This is negative numbers");
        }
    }
}
