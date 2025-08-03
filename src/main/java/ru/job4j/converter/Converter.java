package ru.job4j.converter;

public class Converter {

    public static float rubleToEuro(float value) {
        return value / 90;
    }

    public static float rubleToDollar(float value) {
        return value / 80;
    }

    public static void main(String[] args) {
        float input = 180;
        float expected = 2;
        float output = Converter.rubleToEuro(input);
        boolean passed = expected == output;
        System.out.println("190 rubles are 2 euro. Test result : " + passed);
        input = 240;
        expected = 3;
        output = Converter.rubleToDollar(input);
        passed = expected == output;
        System.out.println("240 rubles are 3 dollar. Test result : " + passed);
    }
}