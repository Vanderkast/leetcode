package com.vanderkast.leetcode.year2026.j865;

import net.vanderkast.leetcode.commons.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class SmallestSubtreeWithAllDeepestNodesTest {
    private final SmallestSubtreeWithAllDeepestNodes solution = new SmallestSubtreeWithAllDeepestNodes();

    @Test
    void leetCodeExample1() {
        var root = TreeNode.from(new Integer[]{3, 5, 1, 6, 2, 0, 8, null, null, 7, 4});
        assertNotNull(root);
        var expected = root.left.right;

        var actual = solution.subtreeWithAllDeepest(root);

        assertEquals(expected, actual);
    }

    @Test
    void leetCodeExample2() {
        var root = new TreeNode(1);

        var actual = solution.subtreeWithAllDeepest(root);

        assertEquals(root, actual);
    }

    @Test
    void leetCodeExample3() {
        var root = TreeNode.from(new Integer[]{0, 1, 3, null, 2});
        assertNotNull(root);
        var expected = root.left.right;

        var actual = solution.subtreeWithAllDeepest(root);

        assertEquals(expected, actual);
    }
}
