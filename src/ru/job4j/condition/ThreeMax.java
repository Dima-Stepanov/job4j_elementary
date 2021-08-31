package ru.job4j.condition;

/**
 * 1.1.4.Оператор ветвления
 * 4.5.Отладка программы в IDEA[#159464#127100]
 */
public class ThreeMax {
    public static int max(int first, int second, int third) {
        int max = first;
        if (max <= second && second >= third) {
            max = second;
        }
        if (max <= third) {
            max = third;
        }
        return max;
    }
}
