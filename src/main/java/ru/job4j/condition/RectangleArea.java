package ru.job4j.condition;

public class RectangleArea {

    public static double square(double p, double k) {
        double h = p / (2 * (k + 1));
        double l = h * k;
        return l * h;
    }

    public static void main(String[] args) {
        double result1 = RectangleArea.square(4, 1);
        System.out.println(" p = 4, k = 1, s = 1, real = " + result1);
        double result2 = RectangleArea.square(6, 2);
        System.out.println(" p = 6, k = 2, s = 2, real = " + result2);
    }
}
