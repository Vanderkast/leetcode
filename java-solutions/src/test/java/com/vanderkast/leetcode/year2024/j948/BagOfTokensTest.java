package com.vanderkast.leetcode.year2024.j948;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BagOfTokensTest {
    private final BagOfTokens solution = new BagOfTokens();

    @Test
    void leetcodeExample1() {
        var tokens = new int[]{100};
        var power = 50;
        var expected = 0;
        var actual = solution.bagOfTokensScore(tokens, power);
        assertEquals(expected, actual);
    }

    @Test
    void leetcodeExample2() {
        var tokens = new int[]{200, 100};
        var power = 150;
        var expected = 1;
        var actual = solution.bagOfTokensScore(tokens, power);
        assertEquals(expected, actual);
    }

    @Test
    void leetcodeExample3() {
        var tokens = new int[]{100, 200, 300, 400};
        var power = 200;
        var expected = 2;
        var actual = solution.bagOfTokensScore(tokens, power);
        assertEquals(expected, actual);
    }
}
