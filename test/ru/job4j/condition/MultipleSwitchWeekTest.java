package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * 1.1.4.Оператор ветвления
 * 4.6.2.Switch-matcher[#334071]test
 */
public class MultipleSwitchWeekTest {

    @Test
    public void whenMonThen1() {
        String day = "Monday";
        int result = MultipleSwitchWeek.numberOfDay(day);
        int expected = 1;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenTuesdayThen2() {
        String day = "Tuesday";
        int result = MultipleSwitchWeek.numberOfDay(day);
        int expected = 2;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenWednesdayThen3() {
        String day = "Wednesday";
        int result = MultipleSwitchWeek.numberOfDay(day);
        int expected = 3;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenThursdayThen4() {
        String day = "Thursday";
        int result = MultipleSwitchWeek.numberOfDay(day);
        int expected = 4;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenFridayThen5() {
        String day = "Friday";
        int result = MultipleSwitchWeek.numberOfDay(day);
        int expected = 5;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenSaturdayThen6() {
        String day = "Saturday";
        int result = MultipleSwitchWeek.numberOfDay(day);
        int expected = 6;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenSundayThen7() {
        String day = "Sunday";
        int result = MultipleSwitchWeek.numberOfDay(day);
        int expected = 7;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenExitThenMinus1() {
        String day = "Exit";
        int result = MultipleSwitchWeek.numberOfDay(day);
        int expected = -1;
        Assert.assertEquals(expected, result);
    }

    //ru-------------------------------------------------------------------------
    @Test
    public void whenMonThen1Ru() {
        String day = "Понедельник";
        int result = MultipleSwitchWeek.numberOfDay(day);
        int expected = 1;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenTuesdayThen2Ru() {
        String day = "Вторник";
        int result = MultipleSwitchWeek.numberOfDay(day);
        int expected = 2;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenWednesdayThen3Ru() {
        String day = "Среда";
        int result = MultipleSwitchWeek.numberOfDay(day);
        int expected = 3;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenThursdayThen4Ru() {
        String day = "Четверг";
        int result = MultipleSwitchWeek.numberOfDay(day);
        int expected = 4;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenFridayThen5Ru() {
        String day = "Пятница";
        int result = MultipleSwitchWeek.numberOfDay(day);
        int expected = 5;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenSaturdayThen6Ru() {
        String day = "Суббота";
        int result = MultipleSwitchWeek.numberOfDay(day);
        int expected = 6;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenSundayThen7Ru() {
        String day = "Воскресенье";
        int result = MultipleSwitchWeek.numberOfDay(day);
        int expected = 7;
        Assert.assertEquals(expected, result);
    }

}