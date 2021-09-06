package ru.job4j.condition;
/**
 * 1.1.4.Оператор ветвления
 * 4.3.2.Оператор||[#333784]
 */
public class Club {
    public static void permission(boolean hasManey, boolean beFriend) {
        if (hasManey || beFriend) {
            System.out.println("I can go to the club");
        } else {
            System.out.println("I can't.");
        }
    }

    public static void main(String[] args) {
        permission(true, true);
        permission(true, false);
        permission(false, true);
        permission(false, false);
    }
}
