package ru.job4j.calculator;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * 1.1.3.Тестирование
 * 2. Тесты для задачи "идеальный вес"[#159458#127166]Test
 */
public class FitTest {

    @Test
    public void whenMan180Then92() {
        short in = 180;
        double expected = 92;
        double out = Fit.manWeitght(in);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenWoman170Then69() {
        short in = 170;
        double expected = 69;
        double out = Fit.womanWeight(in);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenMen189Then102I35() {
        short in = 189;
        double expected = 102.35;
        double out = Fit.manWeitght(in);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenWoman179Then79I35() {
        short in = 179;
        double expected = 79.35;
        double out = Fit.womanWeight(in);
        Assert.assertEquals(expected, out, 0.01);
    }
}