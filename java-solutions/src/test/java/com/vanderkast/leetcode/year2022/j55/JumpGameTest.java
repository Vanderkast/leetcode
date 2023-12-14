package com.vanderkast.leetcode.year2022.j55;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JumpGameTest {
    private final JumpGame solution = new JumpGame();

    @Test
    void leetcode1() {
        // given
        var nums = new int[]{2, 3, 1, 1, 4};
        // when
        var actual = solution.canJump(nums);
        // then
        assertTrue(actual);
    }

    @Test
    void leetcode2() {
        // given
        var nums = new int[]{3,2,1,0,4};
        // when
        var actual = solution.canJump(nums);
        // then
        assertFalse(actual);
    }

    @Test
    void noWaysFromStart() {
        // given
        var nums = new int[]{0, 1, 10};
        // when
        var actual = solution.canJump(nums);
        // then
        assertFalse(actual);
    }

    @Test
    void fromStartToFinish() {
        // given
        var nums = new int[]{3, 0, 1};
        // when
        var actual = solution.canJump(nums);
        // then
        assertTrue(actual);
    }

    @Test
    void overPosition() {
        // given
        var nums = new int[]{2, 0, 2, 0, 1};
        // when
        var actual = solution.canJump(nums);
        // then
        assertTrue(actual);
    }

    @Test
    void almostButNoSuccess() {
        // given
        var nums = new int[]{1, 3, 0, 0, 0, 1};
        // when
        var actual = solution.canJump(nums);
        // then
        assertFalse(actual);
    }

    @Test
    void leetcode131() {
        // given
        var nums = new int[]{1, 1, 1, 0};
        // when
        var actual = solution.canJump(nums);
        // then
        assertTrue(actual);
    }
}
