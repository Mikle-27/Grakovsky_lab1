package ru.mirea.gib04.lab1;

import java.lang.*;
public class TestDog {
    public static void main(String[] args) {
        Dog d1 = new Dog("Jora", 6);
        Dog d2 = new Dog("Yuri", 8);
        Dog d3 = new Dog("Oleg");
        d3.setAge(1);
        System.out.println(d1);
        d1.intoHumanAge();
        d2.intoHumanAge();
        d3.intoHumanAge();
    }
}