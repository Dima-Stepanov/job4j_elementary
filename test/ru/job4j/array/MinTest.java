package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 *  1.1.6.Массивы
 *  6.5.1.Поиск минимального числа в массиве.[#179803#127131]test
 */
public class MinTest {

    @Test
    public void whenFirstMin() {
        int[] array = new int[]{0, 5, 10};
        int result = Min.findMin(array);
        int expected = 0;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenLastMin() {
        int[] array = new int[]{10, 5, 3};
        int result = Min.findMin(array);
        int expected = 3;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenMiddleMin() {
        int[] array = new int[]{10, 2, 5};
        int result = Min.findMin(array);
        int expected = 2;
        Assert.assertEquals(expected, result);
    }
}