package ru.job4j.calculator;

public class ArgumentsMethod {
    public static void hello(String name, int age) {
        System.out.println("Hello, " + name + ", age = " + age);
    }

    public static void main(String[] args) {
        String name = "Job4j";
        int age = 6;
        hello(name, age);
        hello(name, age);
        hello(name, age);
        hello(name, age);
    }
}
