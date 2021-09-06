package ru.job4j.condition;
/**
 * 1.1.4.Оператор ветвления
 * 4.3.4.if c return[#333785]
 */
public class PointEq {
    public static boolean eq(int x1, int y1, int x2, int y2) {
        return x1 == x2 && y1 == y2;
    }

    public static void main(String[] args) {
        System.out.println(eq(1, 1, 2, 2));
        System.out.println(eq(10, 10, 10, 10));
        System.out.println(eq(3, 5, 3, 5));
    }
}
