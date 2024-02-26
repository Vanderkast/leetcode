package com.vanderkast.leetcode.year2024.j100;

import net.vanderkast.leetcode.commons.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SameTreeTest {
    private final SameTree solution = new SameTree();

    @Test
    void leetcodeExample1() {
        var p = TreeNode.from(new Integer[]{1, 2, 3});
        var q = TreeNode.from(new Integer[]{1, 2, 3});
        var expected = true;
        var actual = solution.isSameTree(p, q);
        assertEquals(expected, actual);
    }

    @Test
    void leetcodeExample2() {
        var p = TreeNode.from(new Integer[]{1, 2});
        var q = TreeNode.from(new Integer[]{1, null, 2});
        var expected = false;
        var actual = solution.isSameTree(p, q);
        assertEquals(expected, actual);
    }

    @Test
    void leetcodeExample3() {
        var p = TreeNode.from(new Integer[]{1, 2, 1});
        var q = TreeNode.from(new Integer[]{1, 1, 2});
        var expected = false;
        var actual = solution.isSameTree(p, q);
        assertEquals(expected, actual);
    }

    @Test
    void test1() {
        var p = TreeNode.from(new Integer[]{1, 2, 3});
        var q = TreeNode.from(new Integer[]{1, 2, 3, 4});
        var expected = false;
        var actual = solution.isSameTree(p, q);
        assertEquals(expected, actual);
    }

    @Test
    void nulls() {
        TreeNode p = null;
        TreeNode q = null;
        var expected = true;
        var actual = solution.isSameTree(p, q);
        assertEquals(expected, actual);
    }
}
