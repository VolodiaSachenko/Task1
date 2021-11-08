package com.task;

import java.util.Scanner;
import java.util.NoSuchElementException;

public class Methods extends Rectangle {
    static double areaCalculator(double side1, double side2) {
        return side1 * side2;
    }

    static double perimeterCalculator(double side1, double side2) {
        return 2 * (side1 + side2);
    }

    protected static void scanner() {
        try (Scanner scanner = new Scanner(System.in)) {
            Rectangle side = new Rectangle();
            System.out.println("Будь ласка, введіть довжину першої сторони прямокутника");
            double sideOne = scanner.nextDouble();
            side.setSide1(sideOne);
            System.out.println("Будь ласка, введіть довжину другої сторони прямокутника");
            double sideTwo = scanner.nextDouble();
            side.setSide2(sideTwo);
            System.out.println("Площа прямокутника: " + areaCalculator(sideOne, sideTwo));
            System.out.println("Периметр прямокутника: " + perimeterCalculator(sideOne, sideTwo));
        } catch (NoSuchElementException e) {
            System.out.println("Помилка, введіть, будь ласка, число.");
        }
    }
}
