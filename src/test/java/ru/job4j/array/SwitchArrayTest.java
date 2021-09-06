package ru.job4j.array;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * 1.1.6.Массивы
 * 6.2.2.Переставить элементы массива[#226795#127133]test
 */
public class SwitchArrayTest {

    @Test
    public void whenSwap0to3() {
        int[] input = {1, 2, 3, 4};
        int source = 0;
        int dest = input.length - 1;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {4, 2, 3, 1};
        assertArrayEquals(expected, result);
    }

    @Test
    public void whenSwap1to4() {
        int[] input = {1, 2, 3, 4, 5};
        int source = 1;
        int dest = input.length - 1;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {1, 5, 3, 4, 2};
        assertArrayEquals(expected, result);
    }

    @Test
    public void whenSwap6to7() {
        int[] input = {1, 2, 3, 4, 5};
        int source = 6;
        int dest = 7;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {1, 2, 3, 4, 5};
        assertArrayEquals(expected, result);
    }
}