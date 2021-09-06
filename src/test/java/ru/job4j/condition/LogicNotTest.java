package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * 1.1.4.Оператор ветвления
 * 4.3.3.Логическое отрицание![#334072]test
 */
public class LogicNotTest {

    @Test
    public void when4isEvenThenTrue() {
        int num = 4;
        boolean result = LogicNot.isEven(num);
        assertTrue(result);
    }

    @Test
    public void when5isEvenThenFalse() {
        int num = 5;
        boolean result = LogicNot.isEven(num);
        assertFalse(result);
    }

    @Test
    public void when2isPositiveThenTrue() {
        int num = 2;
        boolean result = LogicNot.isPositive(num);
        assertTrue(result);
    }

    @Test
    public void whenMinus2isPositiveThenFalse() {
        int num = -2;
        boolean result = LogicNot.isPositive(num);
        assertFalse(result);
    }

    @Test
    public void when5notEvenThenTrue() {
        int num = 5;
        boolean result = LogicNot.notEven(num);
        assertTrue(result);
    }

    @Test
    public void when4notEvenThenFalse() {
        int num = 4;
        boolean result = LogicNot.notEven(num);
        assertFalse(result);
    }

    @Test
    public void when2notPositiveThenFalse() {
        int num = 2;
        boolean result = LogicNot.notPositive(num);
        assertFalse(result);
    }

    @Test
    public void whenMinus2notPositiveThenTrue() {
        int num = -2;
        boolean result = LogicNot.notPositive(num);
        assertTrue(result);
    }

    @Test
    public void when5notEvenAndPositiveThenTrue() {
        int num = 5;
        boolean result = LogicNot.notEvenAndPositive(num);
        assertTrue(result);
    }

    @Test
    public void when2notEvenAndPositiveThenFalse() {
        int num = 2;
        boolean result = LogicNot.notEvenAndPositive(num);
        assertFalse(result);
    }

    @Test
    public void whenMinus5notEvenAndPositiveThenFalse() {
        int num = -5;
        boolean result = LogicNot.notEvenAndPositive(num);
        assertFalse(result);
    }

    @Test
    public void whenMinus2notEvenAndPositiveThenFalse() {
        int num = -2;
        boolean result = LogicNot.notEvenAndPositive(num);
        assertFalse(result);
    }

    @Test
    public void when4evenOrNotPositiveThenTrue() {
        int num = 4;
        boolean result = LogicNot.evenOrNotPositive(num);
        assertTrue(result);
    }

    @Test
    public void when5evenOrNotPositiveThenFalse() {
        int num = 5;
        boolean result = LogicNot.evenOrNotPositive(num);
        assertFalse(result);
    }

    @Test
    public void whenMinus5evenOrNotPositiveThenTrue() {
        int num = -5;
        boolean result = LogicNot.evenOrNotPositive(num);
        assertTrue(result);
    }
}