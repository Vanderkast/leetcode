package com.vanderkast.leetcode.j129;

import net.vanderkast.leetcode.commons.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SumRootToLeadNumbersTest {
    private final SumRootToLeadNumbers solution = new SumRootToLeadNumbers();

    @Test
    void leetcode1() {
        var given = TreeNode.from(new Integer[]{1, 2, 3});
        var actual = solution.sumNumbers(given);
        assertEquals(25, actual);
    }

    @Test
    void leetcode2() {
        var given = TreeNode.from(new Integer[]{4, 9, 0, 5, 1});
        var actual = solution.sumNumbers(given);
        assertEquals(1026, actual);
    }

    @Test
    void rootOnly() {
        var given = TreeNode.from(new Integer[]{7});
        var actual = solution.sumNumbers(given);
        assertEquals(7, actual);
    }
}
