package com.vanderkast.leetcode.year2021.j129;

import net.vanderkast.leetcode.commons.TreeNode;

public class SumRootToLeadNumbers {
    int number = 0;
    int sum = 0;

    public int sumNumbers(TreeNode current) {
        sumRecursive(current);
        return sum;
    }

    private void sumRecursive(TreeNode current) {
        number = number * 10 + current.val;
        if (current.left != null || current.right != null) {
            if (current.left != null)
                sumRecursive(current.left);
            if (current.right != null)
                sumRecursive(current.right);
        } else {
            sum += number;
        }
        number /= 10;
    }
}
