package com.vanderkast.leetcode.j404;

import net.vanderkast.leetcode.commons.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SumOfLeftLeavesTest {
    private final SumOfLeftLeaves solution = new SumOfLeftLeaves();

    @Test
    void leetcode1() {
        var given = TreeNode.from(new Integer[]{3, 9, 20, null, null, 15, 7});
        var actual = solution.sumOfLeftLeaves(given);
        assertEquals(24, actual);
    }

    @Test
    void leetcode2() {
        var given = TreeNode.from(new Integer[]{6});
        var actual = solution.sumOfLeftLeaves(given);
        assertEquals(0, actual);
    }
}
