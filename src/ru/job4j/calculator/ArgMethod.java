package ru.job4j.calculator;

/**
 * 1.1.2. Тип данных
 * 4.1. Аргументы [#295521]
 */
public class ArgMethod {
    public static void hello(String name, int age) {
        System.out.println("Hello, " + name + ", age = " + age);
    }

    public static void main(String[] args) {
        String name = "Job4j";
        int age = 33;
        ArgMethod.hello(name, age);
        ArgMethod.hello(name, age);
        ArgMethod.hello(name, age);
        ArgMethod.hello(name, age);
    }
}
