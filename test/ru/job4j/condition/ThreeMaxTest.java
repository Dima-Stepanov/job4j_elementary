package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

/**
 * 1.1.4.Оператор ветвления
 * 4.5.Отладка программы в IDEA[#159464#127100]test
 */
public class ThreeMaxTest {

    @Test
    public void firsMax() {
        int first = 10;
        int second = 5;
        int therd = 1;
        int result = ThreeMax.max(first, second, therd);
        int expected = 10;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void secondMax() {
        int first = 10;
        int second = 50;
        int third = 1;
        int result = ThreeMax.max(first, second, third);
        int expected = 50;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void thirdMax() {
        int first = 1;
        int second = 5;
        int therd = 100;
        int result = ThreeMax.max(first, second, therd);
        int expected = 100;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void allEq() {
        int first = 1;
        int second = 1;
        int third = 1;
        int result = ThreeMax.max(first, second, third);
        int expected = 1;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void firstEqSecond() {
        int first = 10;
        int second = 10;
        int third = 1;
        int result = ThreeMax.max(first, second, third);
        int expected = 10;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void firstEqThird() {
        int first = 100;
        int second = 1;
        int therd = 100;
        int result = ThreeMax.max(first, second, therd);
        int expected = 100;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void secondEqTherd() {
        int first = 1;
        int second = 100;
        int third = 100;
        int result = ThreeMax.max(first, second, third);
        int expected = 100;
        Assert.assertEquals(expected, result);
    }
}