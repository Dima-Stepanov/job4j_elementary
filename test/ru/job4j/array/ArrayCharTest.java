package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * 1.1.6.Массивы
 * 6.4.Слово начинается с...[#41585#127119]test
 */
public class ArrayCharTest {

    @Test
    public void whenStartWithPrefixThenTrue() {
        char[] word = {'H', 'e', 'l', 'l', 'o'};
        char[] pref = {'H', 'e'};
        boolean result = ArrayChar.startWith(word, pref);
        assertTrue(result);
    }

    @Test
    public void whenNotStartWithPrefixThenFalse() {
        char[] word = {'H', 'e', 'l', 'l', 'o'};
        char[] pref = {'H', 'i'};
        boolean result = ArrayChar.startWith(word, pref);
        assertFalse(result);
    }

    @Test
    public void whenNotStartWithMenPrefixThenFalse() {
        char[] word = {'H', 'i', 'l'};
        char[] pref = {'H', 'e', 'l', 'o'};
        boolean result = ArrayChar.startWith(word, pref);
        assertFalse(result);
    }

    @Test
    public void whenNotStartWithMenPrefixThenTrue() {
        char[] word = {'H', 'e', 'l'};
        char[] pref = {'H', 'e', 'l', 'o'};
        boolean result = ArrayChar.startWith(word, pref);
        Assert.assertTrue(result);
    }
}