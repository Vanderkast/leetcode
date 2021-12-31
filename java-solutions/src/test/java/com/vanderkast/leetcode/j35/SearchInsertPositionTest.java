package com.vanderkast.leetcode.j35;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SearchInsertPositionTest {
    private final SearchInsertPosition solution = new SearchInsertPosition();

    private void test(int[] numbers, int target, int expected) {
        assertEquals(expected, solution.searchInsert(numbers, target));
    }

    @Test
    void leetcode1() {
        test(new int[]{1, 3, 5, 6}, 5, 2);
    }

    @Test
    void leetcode2() {
        test(new int[]{1, 3, 5, 6}, 2, 1);
    }

    @Test
    void leetcode3() {
        test(new int[]{1, 3, 5, 6}, 7, 4);
    }

    @Test
    void leetcode4() {
        test(new int[]{1, 3, 5, 6}, 0, 0);
    }

    @Test
    void leetcode5() {
        test(new int[]{1}, 0, 0);
    }

    @Test
    void leetcode7() {
        test(new int[]{1, 3}, 0, 0);
    }

    @Test
    void leetcode21() {
        test(new int[]{1, 3}, 2, 1);
    }

    @Test
    void leetcode23() {
        test(new int[]{1, 3}, 3, 1);
    }

    @Test
    void leetcode28() {
        test(new int[]{3, 5, 7, 9, 10}, 8, 3);
    }
}
