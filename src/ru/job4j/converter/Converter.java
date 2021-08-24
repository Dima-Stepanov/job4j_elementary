package ru.job4j.converter;

/**
 * 1.1.2. Тип данных
 * 5. Конвертер валюты [#41583 #127148]
 */
public class Converter {
    /*конвертация в евро курс 86,00*/
    public static float rubleToEuro(float value) {
        return value / 86.00f;
    }

    /*конвертация в доллар курс 73,50*/
    public static float rubleToDollar(float value) {
        return value / 73.50f;
    }

    public static void main(String[] args) {
        float euro = Converter.rubleToEuro(140);
        float euro1 = Converter.rubleToEuro(70);
        float dollar = Converter.rubleToDollar(60);
        System.out.println("140 rubles are " + euro + " euro");
        System.out.println("70 rubles are " + euro + " euro");
        System.out.println("60 rubles are " + euro + " dollars");
    }
}
