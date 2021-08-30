package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * 1.1.4.Оператор ветвления
 * 4.3.6.Math.abs[#373616]test
 */
public class ChessBoardTest {
    /**
     * testWayRook
     */
    @Test
    public void wayIs6Rook() {
        int x1 = 0;
        int y1 = 0;
        int x2 = 0;
        int y2 = 6;
        int result = ChessBoard.wayRook(x1, y1, x2, y2);
        int expected = 6;
        assertEquals(expected, result);
    }

    @Test
    public void wayIs5Rook() {
        int x1 = 0;
        int y1 = 0;
        int x2 = 5;
        int y2 = 0;
        int result = ChessBoard.wayRook(x1, y1, x2, y2);
        int expected = 5;
        assertEquals(expected, result);
    }

    @Test
    public void wayIs0Rook() {
        int x1 = 0;
        int y1 = 0;
        int x2 = 5;
        int y2 = 6;
        int result = ChessBoard.wayRook(x1, y1, x2, y2);
        int expected = 0;
        assertEquals(expected, result);
    }

    /**
     * test wayDishop
     */
    @Test
    public void wayIs5Dishop() {
        int x1 = 6;
        int y1 = 7;
        int x2 = 1;
        int y2 = 2;
        int result = ChessBoard.wayDishop(x1, y1, x2, y2);
        int expected = 5;
        assertEquals(expected, result);
    }

    @Test
    public void wayIs7Dishop() {
        int x1 = 7;
        int y1 = 0;
        int x2 = 0;
        int y2 = 7;
        int result = ChessBoard.wayDishop(x1, y1, x2, y2);
        int expected = 7;
        assertEquals(expected, result);
    }

    @Test
    public void wayIs0Dishop() {
        int x1 = 2;
        int y1 = 6;
        int x2 = 4;
        int y2 = 1;
        int result = ChessBoard.wayDishop(x1, y1, x2, y2);
        int expected = 0;
        assertEquals(expected, result);
    }

    @Test
    public void whenX1isMinus1ThenWayIs0Dishop() {
        int x1 = -1;
        int y1 = 6;
        int x2 = 4;
        int y2 = 1;
        int result = ChessBoard.wayDishop(x1, y1, x2, y2);
        int expected = 0;
        assertEquals(expected, result);
    }

    @Test
    public void whenY1isMinus1ThenWayIs0Dishop() {
        int x1 = 2;
        int y1 = -1;
        int x2 = 4;
        int y2 = 1;
        int result = ChessBoard.wayDishop(x1, y1, x2, y2);
        int expected = 0;
        assertEquals(expected, result);
    }

    @Test
    public void whenX2isMinus1ThenWayIs0Dishop() {
        int x1 = 2;
        int y1 = 6;
        int x2 = -1;
        int y2 = 1;
        int result = ChessBoard.wayDishop(x1, y1, x2, y2);
        int expected = 0;
        assertEquals(expected, result);
    }

    @Test
    public void whenY2isMinus1ThenWayIs0Dishop() {
        int x1 = 2;
        int y1 = 6;
        int x2 = 4;
        int y2 = -1;
        int result = ChessBoard.wayDishop(x1, y1, x2, y2);
        int expected = 0;
        assertEquals(expected, result);
    }

    @Test
    public void whenX1isGreater7ThenWayIs0Dishop() {
        int x1 = 10;
        int y1 = 6;
        int x2 = 4;
        int y2 = 1;
        int result = ChessBoard.wayDishop(x1, y1, x2, y2);
        int expected = 0;
        assertEquals(expected, result);
    }

    @Test
    public void whenY1isGreater7ThenWayIs0Dishop() {
        int x1 = 2;
        int y1 = 10;
        int x2 = 4;
        int y2 = 1;
        int result = ChessBoard.wayDishop(x1, y1, x2, y2);
        int expected = 0;
        assertEquals(expected, result);
    }

    @Test
    public void whenX2isGreater7ThenWayIs0Dishop() {
        int x1 = 2;
        int y1 = 6;
        int x2 = 10;
        int y2 = 1;
        int result = ChessBoard.wayDishop(x1, y1, x2, y2);
        int expected = 0;
        assertEquals(expected, result);
    }

    @Test
    public void whenY2isGreater7ThenWayIs0Dishop() {
        int x1 = 2;
        int y1 = 6;
        int x2 = 4;
        int y2 = 10;
        int result = ChessBoard.wayDishop(x1, y1, x2, y2);
        int expected = 0;
        assertEquals(expected, result);
    }
}