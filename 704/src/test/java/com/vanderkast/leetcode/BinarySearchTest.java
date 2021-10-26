package com.vanderkast.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinarySearchTest {
    private final BinarySearch solution = new BinarySearch();

    void test(int[] nums, int target, int expectedOutput) {
        assertEquals(expectedOutput, solution.search(nums, target));
    }

    @Test
    void leetcode1() {
        var nums = new int[] {-1, 0, 3, 5, 9, 12};
        var target = 9;
        var expected = 4;

        test(nums, target, expected);
    }

    @Test
    void leetcode11() {
        var nums = new int[] {-1, 0, 3, 5, 9, 12};
        var target = 12;
        var expected = 5;

        test(nums, target, expected);
    }

    @Test
    void leetcode2() {
        var nums = new int[] {-1, 0, 3, 5, 9, 12};
        var target = 2;
        var expected = -1;

        test(nums, target, expected);
    }

    @Test
    void leetcode3() {
        var nums = new int[] {5};
        var target = -5;
        var expected = -1;

        test(nums, target, expected);
    }

    @Test
    void leetcode8() {
        var nums = new int[] {2, 5};
        var target = 2;
        var expected = 0;

        test(nums, target, expected);
    }

    @Test
    void leftOutOfBounds() {
        var nums = new int[] {1, 2, 3};
        var target = 0;
        var expected = -1;

        test(nums, target, expected);
    }

    @Test
    void rightOutOfBounds() {
        var nums = new int[] {1, 2, 3};
        var target = 4;
        var expected = -1;

        test(nums, target, expected);
    }
}
