package ru.mirea.gib04.lab1;

import java.lang.*;
public class TestBook {
    public static void main(String[] args) {
        Book b1 = new Book("Жизнь", "Андрей Петров", 240, "Автобиография");
        Book b2 = new Book("Дом", "Николас Бейл", 620, "Ужасы");
        Book b3 = new Book("Красная Линия", "Ольга Петрова", 500, "Детектив");

        b2.setPagesCount(100);

        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
    }
}