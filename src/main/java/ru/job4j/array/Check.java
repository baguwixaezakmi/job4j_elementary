package ru.job4j.array;

public class Check {
    public static boolean mono(boolean[] data) {

        for (boolean index : data) {
            if (index != data[0]) {
                return false;
            }
        }

        return true;
    }
}