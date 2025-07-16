package ru.job4j;

import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a = input.nextDouble();
        double b = input.nextDouble();
        // сумма
        System.out.println(a + b);
        // разность
        System.out.println(a - b);
        // произведение
        System.out.println(a * b);
        // частное
        System.out.println(a / b);
    }
}
