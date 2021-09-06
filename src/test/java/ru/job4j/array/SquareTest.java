package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * 1.1.6.Массивы
 * 6.0.5.Массивы в тестах.[#226789#127115]test
 */
public class SquareTest {

    @Test
    public void whenBound3Then014() {
        int bound = 3;
        int[] result = Square.calculate(bound);
        int[] expected = new int[]{0, 1, 4};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenBound5Then014916() {
        int bound = 5;
        int[] result = Square.calculate(bound);
        int[] expected = new int[]{0, 1, 4, 9, 16};
        assertArrayEquals(expected, result);
    }

    @Test
    public void whenBound4Then0149() {
        int bound = 4;
        int[] result = Square.calculate(bound);
        int[] expected = new int[]{0, 1, 4, 9};
        assertArrayEquals(expected, result);
    }
}