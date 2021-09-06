package ru.job4j.condition;

/**
 * 1.1.4.Оператор ветвления
 * 4.3.5.Множественное логическое выражение И[#9461#127098]
 */
public class Triangle {
    /**
     * triangle exists
     *
     * @param ab double
     * @param ac double
     * @param bc double
     * @return boolean
     */
    public static boolean exist(double ab, double ac, double bc) {
        return ab + ac > bc && ac + bc > ab && ab + bc > ac;
    }
}
