package ru.levelUp.qa.homework_3.task_1;

import java.text.DecimalFormat;

public class Counting {
    void count() {
        double x;
        Reader reader = new Reader();
        reader.number();
        double a = reader.a;
        double b = reader.b;
        double c = reader.c;

        double d = FindDisc.findD(a, b, c);
        DecimalFormat newD = new DecimalFormat("#.##");
        System.out.println("D = " + newD.format(d));
        if (d > 0) {
            x = (-b - Math.sqrt(d)) / (2 * a);
            double copyX = (Math.sqrt(d) - b) / (2 * a);
            System.out.println("Result: " + newD.format(x) + " or " + newD.format(copyX));
        } else if (d == 0.0) {
            x = -b / (2 * a);
            System.out.println("Result: " + newD.format(x));
        } else {
            System.out.println("Solution is impossible");
        }
    }
}
