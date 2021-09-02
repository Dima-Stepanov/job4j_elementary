package ru.job4j.loop;

/**
 * 1.1.5.Циклы
 * 5.9.Крест в псевдографике.[#177182#127181]
 */
public class Slash {
    public static void draw(int size) {
        int deltaR = size - 1;
        for (int row = 0; row < size; row++) {
            for (int cell = 0; cell < size; cell++) {
                boolean left = row == cell;
                boolean reght = row + cell == deltaR;
                if (left) {
                    System.out.print("x");
                } else if (reght) {
                    System.out.print("x");
                } else {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        System.out.println("Draw by 3");
        draw(3);
        System.out.println("Draw by 5");
        draw(5);
    }
}
