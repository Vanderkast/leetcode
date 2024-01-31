package com.vanderkast.leetcode.year2024.j739;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

abstract class DailyTemperaturesTest {
    private final DailyTemperatures solution;

    DailyTemperaturesTest(DailyTemperatures solution) {
        this.solution = solution;
    }

    @Test
    void leetcodeExample1() {
        var temperatures = new int[]{73, 74, 75, 71, 69, 72, 76, 73};
        var expected = new int[]{1, 1, 4, 2, 1, 1, 0, 0};
        var actual = solution.dailyTemperatures(temperatures);
        assertArrayEquals(expected, actual);
    }

    @Test
    void leetcodeExample2() {
        var temperatures = new int[]{30, 40, 50, 60};
        var expected = new int[]{1, 1, 1, 0};
        var actual = solution.dailyTemperatures(temperatures);
        assertArrayEquals(expected, actual);
    }

    @Test
    void leetcodeExample3() {
        var temperatures = new int[]{30, 60, 90};
        var expected = new int[]{1, 1, 0};
        var actual = solution.dailyTemperatures(temperatures);
        assertArrayEquals(expected, actual);
    }

    @Test
    void oneDay() {
        var temperatures = new int[]{30};
        var expected = new int[]{0};
        var actual = solution.dailyTemperatures(temperatures);
        assertArrayEquals(expected, actual);
    }
}
