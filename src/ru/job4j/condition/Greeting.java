package ru.job4j.condition;

/**
 * 1.1.2. Тип данных
 * 9.1. String [#237407 #127149]
 */
public class Greeting {
    public static void main(String[] args) {
        String idea = "I like Java!";
        System.out.println(idea);
        int year = 2021;
        idea += year;
        System.out.println(idea);
    }
}
