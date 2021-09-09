package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * 1.1.4.Оператор ветвления
 * 4.2.Тернарное сравнение[#189#127107]Test
 * 1.2.1.Классы и объекты
 * 3.Перегрузить метод max для трех чисел[#122644#127048]test
 *
 * @version 2
 * @since 10.09.2021
 */
public class MaxTest {

    @Test
    public void whenMax1To2Then2() {
        int left = 1;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax3To2Then3() {
        int left = 3;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 3;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax7To10Then10() {
        int left = 7;
        int right = 10;
        int result = Max.max(left, right);
        int expected = 10;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax5To5Then5() {
        int left = 5;
        int right = 5;
        int result = Max.max(left, right);
        int expected = 5;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax1To2To3Then3() {
        int first = 1;
        int second = 2;
        int third = 3;
        int rsl = Max.max(first, second, third);
        assertEquals(3, rsl);
    }

    @Test
    public void whenMax5To2To3To4Then5() {
        int first = 5;
        int second = 2;
        int third = 3;
        int four = 4;
        int rsl = Max.max(first, second, third, four);
        assertEquals(5, rsl);
    }

}