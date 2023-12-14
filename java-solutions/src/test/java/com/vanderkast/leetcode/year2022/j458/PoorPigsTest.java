package com.vanderkast.leetcode.year2022.j458;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PoorPigsTest {
    private final PoorPigs solution = new PoorPigs();

    @Test
    void leetcode1() {
        int buckets = 1000;
        int minutesToDie = 15;
        int minutesToTest = 60;
        int expected = 5;
        int actual = solution.poorPigs(buckets, minutesToDie, minutesToTest);

        assertEquals(expected, actual);
    }
}
