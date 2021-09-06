package ru.job4j.loop;

/**
 * 1.1.5.Циклы
 * 5.4.Протеиновая диета[#156313#127187]
 */
public class Fitness {
    public static int calc(int ivan, int nik) {
        int moth = 0;
        int deadliftIvan = ivan;
        int deadliftNik = nik;
        while (deadliftIvan <= deadliftNik) {
            deadliftIvan *= 3;
            deadliftNik *= 2;
            moth++;
        }
        return moth;
    }
}
