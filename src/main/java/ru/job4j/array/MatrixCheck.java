package ru.job4j.array;

/**
 * 1.1.6.Массивы
 * 6.7.1.Моно строка в матрице.[#214126#127110]
 */
public class MatrixCheck {
    /**
     * monoHorizontal 'X'
     *
     * @param board char
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
}
