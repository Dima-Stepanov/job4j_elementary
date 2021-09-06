package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * 1.1.6.Массивы
 * 6.1.Классический поиск перебором.[#33489#127117]test
 * 6.5.Поиск индекса в диапазоне.[#156318 #127121]test
 */
public class FindLoopTest {
    /*
    6.1.Классический поиск перебором.[#33489#127117]test
     */
    @Test
    public void whenArrayHas5Then0() {
        int[] data = {5, 4, 3, 2};
        int el = 5;
        int result = FindLoop.indexOf(data, el);
        int expected = 0;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenArrayHas7then4() {
        int[] data = {5, 4, 3, 2, 7};
        int el = 7;
        int result = FindLoop.indexOf(data, el);
        int expected = 4;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenArrayHas6ThenNo() {
        int[] data = {5, 4, 3, 7, 8, 2, 1};
        int el = 6;
        int result = FindLoop.indexOf(data, el);
        int expected = -1;
        Assert.assertEquals(expected, result);
    }

    /*
    6.5.Поиск индекса в диапазоне.[#156318 #127121]test
     */
    @Test
    public void whenArrayHas6ThenStart2Finish4() {
        int[] data = {1, 2, 3, 5, 6, 8, 10, 7};
        int el = 6;
        int start = 2;
        int finish = 4;
        int result = FindLoop.indexOf(data, el, start, finish);
        int expected = 4;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenArrayHas10ThenStart0Finish5ThenNoSerch() {
        int[] data = {1, 2, 3, 5, 6, 8, 10, 7};
        int el = 10;
        int start = 0;
        int finish = 5;
        int result = FindLoop.indexOf(data, el, start, finish);
        int expected = -1;
        Assert.assertEquals(expected, result);
    }
}