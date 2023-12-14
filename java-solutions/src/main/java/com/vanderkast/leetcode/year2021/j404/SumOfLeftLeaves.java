package com.vanderkast.leetcode.year2021.j404;

import net.vanderkast.leetcode.commons.TreeNode;

public class SumOfLeftLeaves {
    int sum;

    public int sumOfLeftLeaves(TreeNode root) {
        countRecursive(root, false);
        return sum;
    }

    void countRecursive(TreeNode current, boolean left) {
        if (current.left == null && current.right == null) {
            if (left)
                sum += current.val;
        } else {
            if(current.left != null)
                countRecursive(current.left, true);
            if(current.right != null)
                countRecursive(current.right, false);
        }
    }
}
