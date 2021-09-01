package ru.job4j.loop;

/**
 * 1.1.5. Циклы
 * 5.3.Построить шахматную доску в псевдографике.[#13559#127189]
 */
public class Board {
    /**
     * pain board Chess
     *
     * @param width  int
     * @param height int
     */
    public static void paint(int width, int height) {
        for (int row = 0; row < height; row++) {
            for (int cell = 0; cell < width; cell++) {
                if (row + cell == 0 || (row + cell) % 2 == 0) {
                    System.out.print("X");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    /**
     * by Test paint method
     * @param args String null
     */
    public static void main(String[] args) {
        paint(3, 3);
        paint(5, 5);
    }
}
