package com.vanderkast.leetcode.j98;

import net.vanderkast.leetcode.commons.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ValidateBinarySearchTreeTest {
    private final ValidateBinarySearchTree solution = new ValidateBinarySearchTree();

    @Test
    void noChildren() {
        var root = new TreeNode(1);
        assertTrue(solution.isValidBST(root));
    }

    @Test
    void leftChildValid() {
        var root = new TreeNode(2);
        root.left = new TreeNode(1);
        assertTrue(solution.isValidBST(root));
    }

    @Test
    void rightChildValid() {
        var root = new TreeNode(1);
        root.right = new TreeNode(2);
        assertTrue(solution.isValidBST(root));
    }

    @Test
    void leftChildInvalid() {
        var root = new TreeNode(1);
        root.left = new TreeNode(1);
        assertFalse(solution.isValidBST(root));
    }

    @Test
    void rightChildInvalid() {
        var root = new TreeNode(1);
        root.right = new TreeNode(1);
        assertFalse(solution.isValidBST(root));
    }

    @Test
    void leetcode1() {
        var root = TreeNode.from(new Integer[]{2, 1, 3});
        assertTrue(solution.isValidBST(root));
    }

    @Test
    void leetcode2() {
        var root = TreeNode.from(new Integer[]{5, 1, 4, null, null, 3, 6});
        assertFalse(solution.isValidBST(root));
    }

    @Test
    void leetcode59() {
        var root = TreeNode.from(new Integer[]{3, 1, 5, 0, 2, 4, 6});
        assertTrue(solution.isValidBST(root));
    }

    @Test
    void leetcode76() {
        var root = TreeNode.from(
                new Integer[]{120, 70, 140, 50, 100, 130, 160, 20, 55, 75, 110, 119, 135, 150, 200});
        assertFalse(solution.isValidBST(root));
    }

    @Test
    void leetcode78() {
        var root = TreeNode.from(
                new Integer[]{3, 1, 5, 0, 2, 4, 6, null, null, null, 3});
        assertFalse(solution.isValidBST(root));
    }
}
