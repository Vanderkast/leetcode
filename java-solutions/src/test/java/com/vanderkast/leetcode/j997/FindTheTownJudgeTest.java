package com.vanderkast.leetcode.j997;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FindTheTownJudgeTest {
    private final FindTheTownJudge solution = new FindTheTownJudge();

    @Test
    void leetcode1() {
        // given
        var n = 2;
        var trust = new int[][]{new int[]{1, 2}};
        var expected = 2;
        // when
        var actual = solution.findJudge(n, trust);
        // then
        assertEquals(expected, actual);
    }

    @Test
    void leetcode2() {
        // given
        var n = 3;
        var trust = new int[][]{
                new int[]{1, 3},
                new int[]{2, 3}};
        var expected = 3;
        // when
        var actual = solution.findJudge(n, trust);
        // then
        assertEquals(expected, actual);
    }

    @Test
    void leetcode3() {
        // given
        var n = 3;
        var trust = new int[][]{
                new int[]{1, 3},
                new int[]{2, 3},
                new int[]{3, 1}};
        var expected = -1;
        // when
        var actual = solution.findJudge(n, trust);
        // then
        assertEquals(expected, actual);
    }

    @Test
    void everyoneExceptOneTrustsJudge() {
        // given
        var n = 4;
        var trust = new int[][]{
                new int[]{1, 3},
                new int[]{2, 3}};
        var expected = -1;
        // when
        var actual = solution.findJudge(n, trust);
        // then
        assertEquals(expected, actual);
    }

    @Test
    void leetcode91() {
        // given
        var n = 1;
        var trust = new int[][]{};
        var expected = 1;
        // when
        var actual = solution.findJudge(n, trust);
        // then
        assertEquals(expected, actual);
    }
}
