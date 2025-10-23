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

    @Test
    void whenLeft4Middle1Right8Max8() {
        int left = 4;
        int middle = 1;
        int right = 8;
        int result = max(left, middle, right);
        int expected = 8;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenLeft10Middle5Right8Max10() {
        int left = 10;
        int middle = 5;
        int right = 8;
        int result = max(left, middle, right);
        int expected = 10;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenLeft10Middle15Right8Max10() {
        int left = 10;
        int middle = 15;
        int right = 8;
        int result = max(left, middle, right);
        int expected = 15;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenFirst10Second15Third8Four4Max15() {
        int first = 10;
        int second = 15;
        int third = 8;
        int four = 4;
        int result = max(first, second, third, four);
        int expected = 15;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenFirst15Second10Third8Four4Max15() {
        int first = 10;
        int second = 15;
        int third = 8;
        int four = 4;
        int result = max(first, second, third, four);
        int expected = 15;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenFirst10Second15Third18Four4Max18() {
        int first = 10;
        int second = 15;
        int third = 18;
        int four = 4;
        int result = max(first, second, third, four);
        int expected = 18;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenFirst10Second15Third18Four40Max40() {
        int first = 10;
        int second = 15;
        int third = 18;
        int four = 40;
        int result = max(first, second, third, four);
        int expected = 40;
        assertThat(result).isEqualTo(expected);
    }
}