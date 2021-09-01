package ru.job4j.loop;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * 1.1.5. Циклы
 * 5.2.Создать программу, вычисляющую факториал.[#193#127184]test
 */
public class FactorialTest {

    @Test
    public void whenCalculateFactorial5FiveThen120() {
        int n = 5;
        int result = Factorial.calc(n);
        int expected = 120;
        assertEquals(expected, result);
    }

    @Test
    public void whenCalculateFactorial6FiveThen720() {
        int n = 6;
        int result = Factorial.calc(n);
        int expected = 720;
        assertEquals(expected, result);
    }

    @Test
    public void whenCalculateFactorial1FiveThen1() {
        int n = 1;
        int result = Factorial.calc(n);
        int expected = 1;
        assertEquals(expected, result);
    }

    @Test
    public void whenCalculateFactorial0FiveThen1() {
        int n = 0;
        int result = Factorial.calc(n);
        int expected = 1;
        assertEquals(expected, result);
    }

    @Test
    public void whenCalculateFactorialMinus1FiveThen1() {
        int n = -1;
        int result = Factorial.calc(n);
        int expected = 1;
        assertEquals(expected, result);
    }

}