package ru.job4j.condition;

/**
 * 1.1.3.Тестирование
 * 1.2. Входные данные в тесте [#297750]
 */
public class X2 {
    /**
     * Calculating function of the square trinomial
     *
     * @param a int
     * @param b int
     * @param c int
     * @param x int
     * @return rsl
     */
    public static int calc(int a, int b, int c, int x) {
        return a * x * x + b * x + c;
    }

    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        int c = 0;
        int x = 1;
        int rsl = X2.calc(a, b, c, x);
        System.out.println(rsl);
    }
}
