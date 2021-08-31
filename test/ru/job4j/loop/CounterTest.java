package ru.job4j.loop;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * 1.1.5. Циклы
 * 5.1.Подсчет суммы чётных чисел в диапазоне[#192#127188]test
 */
public class CounterTest {

    @Test
    public void whenEvenNumber1To10Then30() {
        int start = 1;
        int finish = 10;
        int result = Counter.sumByEven(start, finish);
        int expected = 30;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenEvenNumber3To8Then() {
        int start = 2;
        int finish = 8;
        int result = Counter.sumByEven(start, finish);
        int expected = 20;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenEvenNumber11To16Then() {
        int start = 11;
        int finish = 16;
        int result = Counter.sumByEven(start, finish);
        int expected = 42;
        Assert.assertEquals(expected, result);
    }
}