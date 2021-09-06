package ru.job4j.loop;

/**
 * 1.1.5.Циклы
 * 5.7.Ипотека[#156315#127180]
 */
public class Mortgage {
    /**
     * Number of mortgage years
     *
     * @param amount  sum credit
     * @param salary  salary of years
     * @param percent percent of years
     * @return year mortgage
     */
    public static int year(double amount, int salary, double percent) {
        int year = 0;
        double step = amount;
        while (step > 0) {
            step = step + step * percent / 100 - salary;
            year++;
        }
        return year;
    }
}
