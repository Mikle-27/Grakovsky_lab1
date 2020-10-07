package ru.mirea.gib04.lab1;

import java.lang.*;
public class TestBall {
    public static void main(String[] args) {
        Ball b1 = new Ball(24.8, "red", "basketball", 4000);
        Ball b2 = new Ball(27.7, "yellow", "handball", 3000);
        Ball b3 = new Ball(25.3, "white", "football", 5000);
        b3.setColor("red");
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
    }
}