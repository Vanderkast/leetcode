package com.vanderkast.leetcode.year2022.j102;

import net.vanderkast.leetcode.commons.TreeNode;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BinaryTreeLevelOrderTraversalStraightTest {
    private final BinaryTreeLevelOrderTraversalStraight traversal = new BinaryTreeLevelOrderTraversalStraight();

    @Test
    void leetcode1() {
        var given = TreeNode.from(new Integer[]{3, 9, 20, null, null, 15, 17});
        var expected = List.of(List.of(3), List.of(9, 20), List.of(15, 17));
        var actual = traversal.levelOrder(given);
        assertEquals(expected, actual);
    }

    @Test
    void leetcode2() {
        var given = TreeNode.from(new Integer[]{1});
        var expected = List.of(List.of(1));
        var actual = traversal.levelOrder(given);
        assertEquals(expected, actual);
    }

    @Test
    void leetcode3() {
        var given = TreeNode.from(new Integer[]{});
        var expected = List.of();
        var actual = traversal.levelOrder(given);
        assertEquals(expected, actual);
    }
}
