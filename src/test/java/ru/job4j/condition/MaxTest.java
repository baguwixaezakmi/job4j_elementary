package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
import static ru.job4j.condition.Max.max;

class MaxTest {
    @Test
    void whenMax1To2Then2() {
        int left = 1;
        int right = 2;
        int result = max(left, right);
        int expected = 2;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax10To2Then10() {
        int left = 10;
        int right = 2;
        int result = max(left, right);
        int expected = 10;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax10To2Then20() {
        int left = 10;
        int right = 20;
        int result = max(left, right);
        int expected = 20;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax10To10Then10() {
        int left = 10;
        int right = 10;
        int result = max(left, right);
        int expected = 10;
        assertThat(result).isEqualTo(expected);
    }
}