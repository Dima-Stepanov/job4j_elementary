package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * 1.1.6.Массивы
 * 6.3.Массив заполнен true или false[#53857#127118]test
 */
public class CheckTest {

    @Test
    public void whenDataMonoByTrueThenTrue() {
        boolean[] data = new boolean[]{true, true, true};
        boolean result = Check.mono(data);
        Assert.assertTrue(result);
    }

    @Test
    public void whenDataNotMonoByTrueThenFalse() {
        boolean[] data = new boolean[]{true, false, true};
        boolean result = Check.mono(data);
        Assert.assertFalse(result);
    }

    @Test
    public void whenDataMonoByFalseThenTrue() {
        boolean[] data = new boolean[]{false, false, false};
        boolean result = Check.mono(data);
        Assert.assertTrue(result);
    }

    @Test
    public void whenDataNotMonoByFalseThenFalse() {
        boolean[] data = new boolean[]{false, true, false};
        boolean result = Check.mono(data);
        Assert.assertFalse(result);
    }
}