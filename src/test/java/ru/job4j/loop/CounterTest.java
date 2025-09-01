package ru.job4j.loop;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class CounterTest {

    @Test
    void whenStart0Finish10then55() {
        int start = 0;
        int finish = 10;
        int expected = 55;
        int out = Counter.sum(start, finish);
        assertThat(out).isEqualTo(expected);
    }

    @Test
    void whenStart3Finish8then33() {
        int start = 3;
        int finish = 8;
        int expected = 33;
        int out = Counter.sum(start, finish);
        assertThat(out).isEqualTo(expected);
    }

    @Test
    void whenStart1Finish1then1() {
        int start = 1;
        int finish = 11;
        int expected = 1;
        int out = Counter.sum(start, finish);
        assertThat(out).isEqualTo(expected);
    }

    @Test
    void whenStart10Finish0then0() {
        int start = 10;
        int finish = 0;
        int expected = 0;
        int out = Counter.sum(start, finish);
        assertThat(out).isEqualTo(expected);
    }
}