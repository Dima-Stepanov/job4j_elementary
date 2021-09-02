package ru.job4j.loop;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * 1.1.5.Циклы
 * 5.6.Простые числа[#156314#127179]test
 */
public class PrimeNumberTest {

    @Test
    public void when5Then3() {
        int finish = 5;
        int result = PrimeNumber.calc(finish);
        int expected = 3;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void when11Then5() {
        int finish = 11;
        int result = PrimeNumber.calc(finish);
        int expected = 5;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void when2Then1() {
        int finish = 2;
        int result = PrimeNumber.calc(finish);
        int expected = 1;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void when1Rhen0() {
        int finish = 1;
        int result = PrimeNumber.calc(finish);
        int expected = 0;
        Assert.assertEquals(expected, result);
    }
}