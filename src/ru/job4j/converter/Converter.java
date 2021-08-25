package ru.job4j.converter;

/**
 * 1.1.3.Тестирование
 * 0.Что такое тестирование[#159431#127165]
 */
public class Converter {
    /*конвертация в евро курс 80,00*/
    public static float rubleToEuro(float value) {
        return value / 80.00f;
    }

    /*конвертация в доллар курс 70,00*/
    public static float rubleToDollar(float value) {
        return value / 70.00f;
    }

    public static void main(String[] args) {
        float euro = Converter.rubleToEuro(140);
        float euro1 = Converter.rubleToEuro(70);
        float dollar = Converter.rubleToDollar(140);
        System.out.println("140 rubles are " + euro + " euro");
        System.out.println("70 rubles are " + euro1 + " euro");
        System.out.println("140 rubles are " + dollar + " dollars");
        float in = 140;
        float exEuro = 1.75F;
        float outEr = Converter.rubleToEuro(in);
        boolean passedEr = exEuro == outEr;
        System.out.println("140 rubles are 2. Test result: " + passedEr);
        float exDollar = 2.0f;
        float outDll = Converter.rubleToDollar(in);
        boolean passedDollar = exDollar == outDll;
        System.out.println("140 rubles are 2. Test result: " + passedDollar);
    }
}
