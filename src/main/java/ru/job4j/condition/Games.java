package ru.job4j.condition;

/**
 * 1.1.4.Оператор ветвления
 * 4.3.1.Оператор &&[#333783]
 */
public class Games {
    public static void permission(boolean allowByParent, boolean hasMoney) {
        if (allowByParent && hasMoney) {
            System.out.println("I can go to the game club");
        } else {
            System.out.println("I can't.");
        }

    }

    public static void main(String[] args) {
        Games.permission(true, true);
        Games.permission(true, false);
        Games.permission(false, true);
        Games.permission(false, false);
    }
}
