package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        return left > right ? left : right;
    }

//    public static int max(int left, int middle, int right) {
//        return left > right
//            ? left > middle
//                ? left
//                : middle
//            : right > middle
//                ? right
//                : middle;
//    }

    public static int max(int left, int middle, int right) {
        return left > max(middle, right)
            ? left
            : max(middle, right);
    }

    public static int max(int first, int second, int third, int four) {
        return first > max(second, third, four)
            ? first
            : max(second, third, four);
    }
}