package com.vanderkast.leetcode.year2023.j120;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TriangleTest {
    private final Triangle solution = new Triangle();

    @Test
    void leetcodeExample1() {
        var given = List.of(
                List.of(2),
                List.of(3, 4),
                List.of(6, 5, 7),
                List.of(4, 1, 8, 3)
        );
        var expected = 11;
        var actual = solution.minimumTotal(given);
        assertEquals(expected, actual);
    }

    @Test
    void leetcodeExample2() {
        var given = List.of(List.of(-10));
        var expected = -10;
        var actual = solution.minimumTotal(given);
        assertEquals(expected, actual);
    }

    @Test
    void test1() {
        var given = List.of(
                List.of(1),
                List.of(1, 1),
                List.of(1, -1, 1),
                List.of(1, -1, -1, 1)
        );
        var expected = 0;
        var actual = solution.minimumTotal(given);
        assertEquals(expected, actual);
    }
}
