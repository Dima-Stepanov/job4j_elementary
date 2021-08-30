package ru.job4j.condition;

/**
 * 1.1.4.Оператор ветвления
 * 4.3.6.Math.abs[#373616]
 */
public class ChessBoard {
    /**
     * way  Rook
     *
     * @param x1 int
     * @param y1 int
     * @param x2 int
     * @param y2 int
     * @return size way
     */
    public static int wayRook(int x1, int y1, int x2, int y2) {
        int rsl = 0;
        if (x1 < 0 || x1 > 7 || x2 < 0 || x2 > 7 || y1 < 0 || y1 > 7 || y2 < 0 || y2 > 7) {
            return rsl;
        }
        if (x1 == x2 || y1 == y2) {
            rsl = Math.abs(x2 - x1);
            rsl = rsl == 0 ? Math.abs(y2 - y1) : rsl;
        }
        return rsl;
    }

    /**
     * way Dishop
     *
     * @param x1 int
     * @param y1 int
     * @param x2 int
     * @param y2 int
     * @return size way
     */
    public static int wayDishop(int x1, int y1, int x2, int y2) {
        int rsl = 0;
        if (x1 < 0 || x1 > 7 || x2 < 0 || x2 > 7 || y1 < 0 || y1 > 7 || y2 < 0 || y2 > 7) {
            return rsl;
        }
        if (Math.abs(x1 - x2) == Math.abs(y1 - y2)) {
            rsl = Math.abs(x1 - x2);
        }
        return rsl;
    }
}
