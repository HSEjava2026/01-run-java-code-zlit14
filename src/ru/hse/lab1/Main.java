package ru.hse.lab1;

// Импортируем наш класс из подпакета
import ru.hse.lab1.second.Person;

/**
 * Главный класс приложения.
 * @author Litvinenko Zakhar Andreevich
 * @version 1.0
 * @since 2026
 */

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Иван", 20);
        System.out.println(person);
    }
}
