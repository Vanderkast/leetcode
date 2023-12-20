package com.vanderkast.leetcode.year2023.j2706;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BuyTwoChocolatesTest {
    private final BuyTwoChocolates solution = new BuyTwoChocolates();

    @Test
    void leetcodeExample1() {
        var givenPrices = new int[]{1, 2, 2};
        var givenMoney = 3;
        var expected = 0;
        var actual = solution.buyChoco(givenPrices, givenMoney);
        assertEquals(expected, actual);
    }

    @Test
    void leetcodeExample2() {
        var givenPrices = new int[]{3, 2, 3};
        var givenMoney = 3;
        var expected = 3;
        var actual = solution.buyChoco(givenPrices, givenMoney);
        assertEquals(expected, actual);
    }

    @Test
    void leetcode1400() {
        var givenPrices = new int[]{69, 91, 78, 19, 40, 13};
        var givenMoney = 94;
        var expected = 62;
        var actual = solution.buyChoco(givenPrices, givenMoney);
        assertEquals(expected, actual);
    }

    @Test
    void oneChocolate() {
        var givenPrices = new int[]{1};
        var givenMoney = 3;
        var expected = 3;
        var actual = solution.buyChoco(givenPrices, givenMoney);
        assertEquals(expected, actual);
    }
}
