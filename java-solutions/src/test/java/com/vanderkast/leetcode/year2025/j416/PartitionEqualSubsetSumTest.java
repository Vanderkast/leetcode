package com.vanderkast.leetcode.year2025.j416;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PartitionEqualSubsetSumTest {
    private final PartitionEqualSubsetSum solution = new PartitionEqualSubsetSum();

    @Test
    void leetcode1() {
        var given = new int[]{1, 5, 11, 5};
        var expected = true;

        var actual = solution.canPartition(given);

        assertEquals(expected, actual);
    }

    @Test
    void leetcode2() {
        var given = new int[]{1, 2, 3, 5};
        var expected = false;

        var actual = solution.canPartition(given);

        assertEquals(expected, actual);
    }

    @Test
    void test1() {
        var given = new int[]{1, 7, 2, 8};
        var expected = true;

        var actual = solution.canPartition(given);

        assertEquals(expected, actual);
    }

    @Test
    void leetcode108() {
        var given = new int[]{2, 2, 1, 1};
        var expected = true;

        var actual = solution.canPartition(given);

        assertEquals(expected, actual);
    }

    @Test
    void leetcode124() {
        var given = new int[]{1, 2, 5};
        var expected = false;

        var actual = solution.canPartition(given);

        assertEquals(expected, actual);
    }
}
