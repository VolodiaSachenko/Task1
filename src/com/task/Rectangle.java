package com.task;

/**
 * @author Volodia Sachenko
 * @version 0.1
 * @since 08.11.21
 */

public class Rectangle {
    protected double side1;
    protected double side2;

    public static void main(String[] args) {
        System.out.println("Вимірюємо площу і периметр прямокутника: ▭");
        Methods.scanner();
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }
}
