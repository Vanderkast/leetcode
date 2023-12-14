package com.vanderkast.leetcode.year2022.j39;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CombinationSumTest {
    private final CombinationSum solution = new CombinationSum();

    @Test
    void leetcode1() {
        int[] candidates = new int[]{2, 3, 6, 7};
        int target = 7;
        var expected = List.of(
                List.of(2, 2, 3),
                List.of(7)
        );

        var actual = solution.combinationSum(candidates, target);

        assertEquals(expected, actual);
    }

    @Test
    void leetcode2() {
        int[] candidates = new int[]{2, 3, 5};
        int target = 8;
        var expected = List.of(
                List.of(2, 2, 2, 2),
                List.of(2, 3, 3),
                List.of(3, 5)
        );

        var actual = solution.combinationSum(candidates, target);

        assertEquals(expected, actual);
    }

    @Test
    void leetcode3() {
        int[] candidates = new int[]{2};
        int target = 1;
        var expected = List.of();

        var actual = solution.combinationSum(candidates, target);

        assertEquals(expected, actual);
    }
}
