package com.vanderkast.leetcode.year2025.j1123;

import net.vanderkast.leetcode.commons.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

abstract class LowestCommonAncestorOfDeepestLeavesTest {
    private final LowestCommonAncestorOfDeepestLeaves solution = new LowestCommonAncestorOfDeepestLeaves();

    @Test
    void leetcode1() {
        var given = TreeNode.from(new Integer[]{3, 5, 1, 6, 2, 0, 8, null, null, 7, 4});
        var expected = given.left.right; // node with value 2

        var actual = solution.lcaDeepestLeaves(given);

        assertEquals(expected, actual);
    }

    @Test
    void leetcode2() {
        var given = TreeNode.from(new Integer[]{1});
        var expected = given;

        var actual = solution.lcaDeepestLeaves(given);

        assertEquals(expected, actual);
    }

    @Test
    void leetcode3() {
        var given = TreeNode.from(new Integer[]{0,1,3,null,2});
        var expected = given.left.right; // leaf node with value 2

        var actual = solution.lcaDeepestLeaves(given);

        assertEquals(expected, actual);
    }
}
