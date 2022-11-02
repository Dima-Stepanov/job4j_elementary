package ru.job4j.array;

/**
 * 1. СтажерКатегория
 * 1.1. Базовый Синтаксис.Тема
 * 1.1.6. Массивы
 * 6.9. String - это массив [#504884]
 * Необходимо разработать метод isNameValid(String name) для проверки валидности имен в языке Java.
 * Напомню, что переменная может содержать символы латинского алфавита и числа, символ подчеркивания и символ доллара.
 * Переменная должна начинаться на строчную латинскую букву.
 *
 * @author Dmitry Stepanov, user Dmitry
 * @since 02.11.2022
 */
public class JavaNameValidator {
    private static final int DOLLAR = 36;
    private static final int UNDERLINE = 95;
    private static final int START_UPPER_LATIN = 65;
    private static final int END_UPPER_LATIN = 90;
    private static final int START_LOWER_LATIN = 97;
    private static final int END_LOWER_LATIN = 122;
    private static final int START_NUMBER = 48;
    private static final int END_NUMBER = 57;

    public static boolean isNameValid(String name) {
        if (name.isEmpty() || !isLowerLatinLetter(name.charAt(0))) {
            return false;
        }
        for (int i = 1; i < name.length(); i++) {
            int code = name.charAt(i);
            if (!isSpecialSymbol(code) && !isUpperLatinLetter(code) && !isLowerLatinLetter(code) && !isNumber(code)) {
                return false;
            }
        }
        return true;
    }

    /**
     * Проверить соответствия символа коду $(знак доллара 36) и _ (нижнее подчеркивание 95)
     *
     * @param code 36 or 95
     * @return boolean
     */
    public static boolean isSpecialSymbol(int code) {
        return DOLLAR == code || UNDERLINE == code;
    }

    /**
     * Проверить соответствия символа коду цифры от 0 до 9. код 48-57
     *
     * @param code 48 or 57
     * @return boolean
     */
    public static boolean isNumber(int code) {
        return START_NUMBER <= code && END_NUMBER >= code;
    }

    /**
     * Проверить соответствия символа коду прописной латиницы 65-90
     *
     * @param code 65-90
     * @return
     */
    public static boolean isUpperLatinLetter(int code) {
        return START_UPPER_LATIN <= code && END_UPPER_LATIN >= code;
    }

    /**
     * Проверить соответствия символа коду строчной латиницы 97-122
     *
     * @param code 97-122.
     * @return boolean
     */
    public static boolean isLowerLatinLetter(int code) {
        return START_LOWER_LATIN <= code && END_LOWER_LATIN >= code;
    }
}
