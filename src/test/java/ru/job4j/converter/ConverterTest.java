package ru.job4j.converter;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * 1.1.3.Тестирование
 * 1. Модульные тесты. [#159435 #127168]
 */
public class ConverterTest {

    @Test
    public void whenConverter140RblThen175Euro() {
        float in = 140f;
        float expected = 1.75f;
        float out = Converter.rubleToEuro(in);
        float eps = 0.0001f;
        Assert.assertEquals(expected, out, eps);
    }

    @Test
    public void whenConvert140RblThen2Dlr() {
        float in = 140f;
        float expected = 2.0f;
        float out = Converter.rubleToDollar(in);
        float eps = 0.0001f;
        Assert.assertEquals(expected, out, eps);
    }
}