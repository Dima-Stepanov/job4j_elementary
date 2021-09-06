package ru.job4j.array;

import org.junit.Test;
import org.junit.Assert;

import static org.junit.Assert.*;

/**
 * 1.1.6.Массивы
 * 6.5.3.Сортировка выборкой.[#156320#127122]test
 */
public class SortSelectedTest {

    @Test
    public void whenSort() {
        int[] data = new int[]{3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[]{1, 2, 3, 4, 5};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSort3El() {
        int[] data = new int[]{9, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[]{2, 5, 9};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSort6El() {
        int[] data = new int[]{3, 5, 4, 7, 2, 1};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[]{1, 2, 3, 4, 5, 7};
        Assert.assertArrayEquals(expected, result);
    }
}