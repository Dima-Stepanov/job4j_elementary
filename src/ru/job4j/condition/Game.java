package ru.job4j.condition;

/**
 * 1.1.4.Оператор ветвления
 * 4.1.1.Операторы сравнения в String.[#237406#127108]
 */
public class Game {
    public static void menu(String name) {
        if (name.equals("super mario")) { /* сравниваем переменную name c "super mario" */
            System.out.println("Start - super mario");
        }
        if (name.equals("tanks")) { /* сравниваем переменную name c "tanks" */
            System.out.println("Start - tanks");
        }
        if (name.equals("tetris")) { /* сравниваем переменную name c "tetris" */
            System.out.println("Start - tetris");
        }
    }

    public static void main(String[] args) {
        Game.menu("tanks");
        Game.menu("super mario");
        Game.menu("tetris");
    }
}
