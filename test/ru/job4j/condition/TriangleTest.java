package ru.job4j.condition;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * 1.1.4.Оператор ветвления
 * 4.3.5.Множественное логическое выражение И[#9461#127098]test
 */
public class TriangleTest {

    @Test
    public void whenExist() {
        double ab = 2.0;
        double ac = 2.0;
        double bc = 2.0;
        boolean result = Triangle.exist(ab, ac, bc);
        assertTrue(result);
    }

    @Test
    public void whenNotExist() {
        double ab = 2.0;
        double ac = 2.0;
        double bc = 5.0;
        boolean result = Triangle.exist(ab, ac, bc);
        assertFalse(result);
    }
}