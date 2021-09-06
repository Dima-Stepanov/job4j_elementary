package ru.job4j.array;

/**
 * 1.1.6.Массивы
 * 6.4.Слово начинается с...[#41585#127119]
 */
public class ArrayChar {
    public static boolean startWith(char[] word, char[] pref) {
        boolean result = true;
        int lengWord = Math.min(word.length, pref.length);
        for (int i = 0; i < lengWord; i++) {
            if (word[i] != pref[i]) {
                result = false;
                break;
            }
        }
        return result;
    }
}
