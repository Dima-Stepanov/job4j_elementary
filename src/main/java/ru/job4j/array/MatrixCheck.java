package ru.job4j.array;

/**
 * 1.1.6.Массивы
 * 6.7.1.Моно строка в матрице.[#214126#127110]
 * 6.7.2.Моно столбец в матрице.[#214127#127111]
 * 6.7.3.Массив из диагонали матрицы.[#214128#127109]
 */
public class MatrixCheck {
    /**
     * monoHorizontal 'X'
     * 6.7.1.Моно строка в матрице.[#214126#127110]
     *
     * @param board char[row][]
     * @param row   int
     * @return boolean
     */
    public static boolean monoHorizontal(char[][] board, int row) {
        boolean result = true;
        for (int cell = 0; cell < board[row].length; cell++) {
            if (board[row][cell] != 'X') {
                result = false;
                break;
            }
        }
        return result;
    }

    /**
     * monoVertical 'X'
     * 6.7.2.Моно столбец в матрице.[#214127#127111]
     *
     * @param board  cher[][column]
     * @param column int
     * @return boolean
     */
    public static boolean monoVertical(char[][] board, int column) {
        boolean result = true;
        for (int row = 0; row < board.length; row++) {
            if (board[row][column] != 'X') {
                result = false;
                break;
            }
        }
        return result;
    }

    /**
     * 6.7.3.Массив из диагонали матрицы.[#214128#127109]
     * @param board char[][]
     * @return char[]
     */
    public static char[] extractDiagonal(char[][] board) {
        char[] rsl = new char[board.length];
        for (int i = 0; i < board.length; i++) {
            rsl[i] = board[i][i];
        }
        return rsl;
    }
}
