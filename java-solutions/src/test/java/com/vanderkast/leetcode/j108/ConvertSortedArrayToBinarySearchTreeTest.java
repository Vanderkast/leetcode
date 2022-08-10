package com.vanderkast.leetcode.j108;

import net.vanderkast.leetcode.commons.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ConvertSortedArrayToBinarySearchTreeTest {
    private final ConvertSortedArrayToBinarySearchTree solution = new ConvertSortedArrayToBinarySearchTree();

    @Test
    void oneElementList() {
        int[] nums = new int[]{1};
        TreeNode expected = new TreeNode(1);

        TreeNode actual = solution.sortedArrayToBST(nums);

        assertEquals(expected, actual);
    }

    @Test
    void twoElementsList() {
        int[] nums = new int[]{1, 2};
        TreeNode expected = new TreeNode(2, new TreeNode(1), null);

        TreeNode actual = solution.sortedArrayToBST(nums);

        assertEquals(expected, actual);
    }

    @Test
    void leetcode1() {
        int[] nums = new int[]{-10, -3, 0, 5, 9};
        TreeNode root = new TreeNode(nums[2]);
        root.left = new TreeNode(nums[1], new TreeNode(nums[0]), null);
        root.right = new TreeNode(nums[4], new TreeNode(nums[3]), null);

        TreeNode actual = solution.sortedArrayToBST(nums);

        assertEquals(root, actual);
    }
}
