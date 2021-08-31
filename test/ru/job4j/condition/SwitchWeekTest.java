package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * 1.1.4.Оператор ветвления
 * 4.6.1.Switch[#334070]test
 */
public class SwitchWeekTest {

    @Test
    public void when1ThenMon() {
        int day = 1;
        String result = SwitchWeek.nameOfDay(day);
        String expected = "Понедельник";
        Assert.assertEquals(expected, result);
    }

    @Test
    public void when2ThenTue() {
        int day = 2;
        String result = SwitchWeek.nameOfDay(day);
        String expected = "Вторник";
        Assert.assertEquals(expected, result);
    }

    @Test
    public void when3ThenWed() {
        int day = 3;
        String result = SwitchWeek.nameOfDay(day);
        String expected = "Среда";
        Assert.assertEquals(expected, result);
    }

    @Test
    public void when4ThenThur() {
        int day = 4;
        String result = SwitchWeek.nameOfDay(day);
        String expected = "Четверг";
        Assert.assertEquals(expected, result);
    }

    @Test
    public void when5ThenFri() {
        int day = 5;
        String result = SwitchWeek.nameOfDay(day);
        String expected = "Пятница";
        Assert.assertEquals(expected, result);
    }

    @Test
    public void when6ThenSat() {
        int day = 6;
        String result = SwitchWeek.nameOfDay(day);
        String expected = "Суббота";
        Assert.assertEquals(expected, result);
    }

    @Test
    public void when7ThenSun() {
        int day = 7;
        String result = SwitchWeek.nameOfDay(day);
        String expected = "Воскресенье";
        Assert.assertEquals(expected, result);
    }

    @Test
    public void when10ThenErr() {
        int day = 10;
        String result = SwitchWeek.nameOfDay(day);
        String expected = "Ошибка";
        Assert.assertEquals(expected, result);
    }
}