package com.vanderkast.leetcode.j121;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BestTimeToByAndSellStockTest {
    private final BestTimeToByAndSellStock solution = new BestTimeToByAndSellStock();

    @Test
    void leetcode1() {
        var prices = new int[]{7, 1, 5, 3, 6, 4};
        var expected = 5;
        var actual = solution.maxProfit(prices);
        assertEquals(expected, actual);
    }

    @Test
    void leetcode2() {
        var prices = new int[]{7, 6, 4, 3, 1};
        var expected = 0;
        var actual = solution.maxProfit(prices);
        assertEquals(expected, actual);
    }

    @Test
    void test1() {
        var prices = new int[]{7};
        var expected = 0;
        var actual = solution.maxProfit(prices);
        assertEquals(expected, actual);
    }

    @Test
    void test2() {
        var prices = new int[]{10, 0};
        var expected = 0;
        var actual = solution.maxProfit(prices);
        assertEquals(expected, actual);
    }
}
