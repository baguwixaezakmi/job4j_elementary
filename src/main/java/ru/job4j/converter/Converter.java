package ru.job4j.converter;

public class Converter {

    public static float rubleToEuro(float value) {
        float result = value / 91;
        return result;
    }

    public static float rubleToDollar(float value) {
        float result = value / 79;
        return result;
    }

    public static void main(String[] args) {
        float euro = rubleToEuro(1000);
        float dollar = rubleToDollar(1000);
        System.out.println("1000 rubles are " + euro + " euro.");
        System.out.println("1000 rubles are " + dollar + " dollar.");
    }
}