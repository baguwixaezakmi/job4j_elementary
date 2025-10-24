package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.withPrecision;

class PointTest {

    @Test
    void when00To20Then2() {
        double expected = 2;
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        double output = a.distance(b);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when1010toMinus5Minus5Then21dot213203435596427() {
        double expected = 21.213203435596427;
        Point a = new Point(10, 10);
        Point b = new Point(-5, -5);
        double output = a.distance(b);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when000to111Then1732() {
        double expected = 1.732;
        Point a = new Point(0, 0, 0);
        Point b = new Point(1, 1, 1);
        double output = a.distance3d(b);
        assertThat(output).isEqualTo(expected, withPrecision(0.001));
    }

    @Test
    void when123to456Then5196() {
        double expected = 5.196;
        Point a = new Point(1, 2, 3);
        Point b = new Point(4, 5, 6);
        double output = a.distance3d(b);
        assertThat(output).isEqualTo(expected, withPrecision(0.001));
    }

    @Test
    void when10105to505Then8660() {
        double expected = 8.660;
        Point a = new Point(10, 10, 5);
        Point b = new Point(5, 5, 0);
        double output = a.distance3d(b);
        assertThat(output).isEqualTo(expected, withPrecision(0.001));
    }

    @Test
    void whenMinus1Minus1Minus1To111Then3464() {
        double expected = 3.464;
        Point a = new Point(-1, -1, -1);
        Point b = new Point(1, 1, 1);
        double output = a.distance3d(b);
        assertThat(output).isEqualTo(expected, withPrecision(0.001));
    }

    @Test
    void when000to333Then5196() {
        double expected = 5.196;
        Point a = new Point(0, 0, 0);
        Point b = new Point(3, 3, 3);
        double output = a.distance3d(b);
        assertThat(output).isEqualTo(expected, withPrecision(0.001));
    }

    @Test
    void when1010Minus10toMinus5Minus5Minus5Then21dot794() {
        double expected = 21.794;
        Point a = new Point(10, 10, -10);
        Point b = new Point(-5, -5, -5);
        double output = a.distance3d(b);
        assertThat(output).isEqualTo(expected, withPrecision(0.001));
    }
}