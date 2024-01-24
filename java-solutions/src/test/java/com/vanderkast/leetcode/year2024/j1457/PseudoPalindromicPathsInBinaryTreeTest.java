package com.vanderkast.leetcode.year2024.j1457;

import net.vanderkast.leetcode.commons.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PseudoPalindromicPathsInBinaryTreeTest {
    private final PseudoPalindromicPathsInBinaryTree solution = new PseudoPalindromicPathsInBinaryTree();

    @Test
    void singleNode() {
        var root = new TreeNode(1);
        var expected = 1;
        var actual = solution.pseudoPalindromicPaths(root);
        assertEquals(expected, actual);
    }

    @Test
    void leftLeaf_even_palindrome() {
        var root = new TreeNode(1, new TreeNode(1), null);
        var expected = 1;
        var actual = solution.pseudoPalindromicPaths(root);
        assertEquals(expected, actual);
    }

    @Test
    void leftLeaf_odd_palindrome() {
        var root = TreeNode.from(new Integer[]{1, 1, null, 2, null, null, null});
        var expected = 1;
        var actual = solution.pseudoPalindromicPaths(root);
        assertEquals(expected, actual);
    }

    @Test
    void leftLeaf_odd_notPalindrome() {
        var root = TreeNode.from(new Integer[]{1, 2, null, 3, null, null, null});
        var expected = 0;
        var actual = solution.pseudoPalindromicPaths(root);
        assertEquals(expected, actual);
    }

    @Test
    void leftLeaf_even_notPalindrome() {
        var root = new TreeNode(1, new TreeNode(2), null);
        var expected = 0;
        var actual = solution.pseudoPalindromicPaths(root);
        assertEquals(expected, actual);
    }

    @Test
    void rightLeaf_even_palindrome() {
        var root = new TreeNode(1, null, new TreeNode(1));
        var expected = 1;
        var actual = solution.pseudoPalindromicPaths(root);
        assertEquals(expected, actual);
    }

    @Test
    void rightLeaf_even_notPalindrome() {
        var root = new TreeNode(1, null, new TreeNode(2));
        var expected = 0;
        var actual = solution.pseudoPalindromicPaths(root);
        assertEquals(expected, actual);
    }

    @Test
    void rightLeaf_odd_palindrome() {
        var root = TreeNode.from(new Integer[]{1, null, 1, null, null, 2, null});
        var expected = 1;
        var actual = solution.pseudoPalindromicPaths(root);
        assertEquals(expected, actual);
    }

    @Test
    void rightLeaf_odd_notPalindrome() {
        var root = TreeNode.from(new Integer[]{1, null, 2, null, null, 3, null});
        var expected = 0;
        var actual = solution.pseudoPalindromicPaths(root);
        assertEquals(expected, actual);
    }

    @Test
    void leetcodeExample1() {
        var root = TreeNode.from(new Integer[]{2, 3, 1, 3, 1, null, 1});
        var expected = 2;
        var actual = solution.pseudoPalindromicPaths(root);
        assertEquals(expected, actual);
    }

    @Test
    void leetcodeExample2() {
        var root = TreeNode.from(new Integer[]{2, 1, 1, 1, 3, null, null, null, null, null, 1});
        var expected = 1;
        var actual = solution.pseudoPalindromicPaths(root);
        assertEquals(expected, actual);
    }
}
