package com.vanderkast.leetcode.year2024.j2966;

import org.junit.jupiter.api.Test;

import static com.vanderkast.leetcode.tools.Matrix.assertMatrixEquals;
import static com.vanderkast.leetcode.tools.Matrix.matrix;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class DivideArrayIntoArraysWithMaxDifferenceTest {
    private final DivideArrayIntoArraysWithMaxDifference solution = new DivideArrayIntoArraysWithMaxDifference();

    @Test
    void leetcodeExample1() {
        var nums = new int[]{1, 3, 4, 8, 7, 9, 3, 5, 1};
        var k = 2;
        var expected = matrix("[[1,1,3],[3,4,5],[7,8,9]]");
        var actual = solution.divideArray(nums, k);
        assertMatrixEquals(expected, actual);
    }

    @Test
    void leetcodeExample2() {
        var nums = new int[]{1, 3, 3, 2, 7, 3};
        var k = 3;
        var expected = new int[][]{};
        var actual = solution.divideArray(nums, k);
        assertArrayEquals(expected, actual);
    }

    @Test
    void leetcode1109() {
        var nums = new int[]{15, 13, 12, 13, 12, 14, 12, 2, 3, 13, 12, 14, 14, 13, 5, 12, 12, 2, 13, 2, 2};
        var k = 2;
        var expected = new int[][]{};
        var actual = solution.divideArray(nums, k);
        assertArrayEquals(expected, actual);
    }
}
