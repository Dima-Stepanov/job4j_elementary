package ru.job4j.array;

/**
 * 1.1.6.Массивы
 * 6.4.2. Слово заканчивается на ...[#156317#127120]
 */
public class EndsWith {
    public static boolean endWith(char[] word, char[] post) {
        boolean result = true;
        int lengWord = Math.min(word.length, post.length);
        for (int i = 0; i < lengWord; i++) {
            if (word[word.length - i - 1] != post[post.length - i - 1]) {
                result = false;
                break;
            }
        }
        return result;
    }
}
