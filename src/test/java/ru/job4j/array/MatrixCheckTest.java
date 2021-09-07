package ru.job4j.array;

import org.junit.Test;
import org.junit.Assert;

import static org.junit.Assert.*;

/**
 * 1.1.6.Массивы
 * 6.7.1.Моно строка в матрице.[#214126#127110]test
 * 6.7.2.Моно столбец в матрице.[#214127#127111]test
 * 6.7.3.Массив из диагонали матрицы.[#214128#127109]test
 */
public class MatrixCheckTest {
    /*
    6.7.1.Моно строка в матрице.[#214126#127110]
     */
    @Test
    public void whenHasMonoHorizontalRow1ThenTrue() {
        char[][] input = {
                {' ', ' ', ' '},
                {'X', 'X', 'X'},
                {' ', ' ', ' '},
        };
        int row = 1;
        boolean result = MatrixCheck.monoHorizontal(input, row);
        Assert.assertTrue(result);
    }

    @Test
    public void whenHasMonoHorizontalRowThenFalse() {
        char[][] input = {
                {' ', ' ', ' '},
                {'X', ' ', 'X'},
                {' ', ' ', ' '},
        };
        int row = 1;
        boolean result = MatrixCheck.monoHorizontal(input, row);
        Assert.assertFalse(result);
    }

    /*
    6.7.2.Моно столбец в матрице.[#214127#127111]
     */
    @Test
    public void whenHasMonoVerticalColumn2ThenTrue() {
        char[][] input = {
                {' ', ' ', 'X'},
                {' ', ' ', 'X'},
                {' ', ' ', 'X'},
        };
        int column = 2;
        boolean result = MatrixCheck.monoVertical(input, column);
        Assert.assertTrue(result);
    }

    @Test
    public void whenHasMonoVerticalColumn1ThenFalse() {
        char[][] input = {
                {' ', 'X', 'X'},
                {' ', 'X', 'X'},
                {' ', ' ', 'X'},
        };
        int column = 1;
        boolean result = MatrixCheck.monoVertical(input, column);
        Assert.assertFalse(result);
    }

    /*
    6.7.3.Массив из диагонали матрицы.[#214128#127109]
     */
    @Test
    public void whenDiagonalFullX() {
        char[][] input = {
                {'X', ' ', ' '},
                {' ', 'X', ' '},
                {' ', ' ', 'X'},
        };
        char[] result = MatrixCheck.extractDiagonal(input);
        char[] expected = {'X', 'X', 'X'};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenDiagonalFullOne() {
        char[][] input = {
                {'1', ' ', ' '},
                {' ', '1', ' '},
                {' ', ' ', '1'},
        };
        char[] result = MatrixCheck.extractDiagonal(input);
        char[] expected = {'1', '1', '1'};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenDiagonalMix() {
        char[][] input = {
                {'X', ' ', ' '},
                {' ', 'Y', ' '},
                {' ', ' ', 'Z'},
        };
        char[] result = MatrixCheck.extractDiagonal(input);
        char[] expected = {'X', 'Y', 'Z'};
        Assert.assertArrayEquals(expected, result);
    }
}