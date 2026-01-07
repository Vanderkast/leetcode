package com.vanderkast.leetcode.year2026.j1339;

import net.vanderkast.leetcode.commons.TreeNode;

public class MaximumProductOfSplittedBinaryTree {
    public int maxProduct(TreeNode root) {
        calculateSums(root);
        return (int) (maxProductCut(root) % 1_000_000_007);
    }

    private void calculateSums(TreeNode node) {
        if (node.left != null)
            calculateSums(node.left);
        if (node.right != null)
            calculateSums(node.right);
        node.val += node.left == null ? 0 : node.left.val;
        node.val += node.right == null ? 0 : node.right.val;
    }

    private long maxProductCut(TreeNode node) {
        if (node.left == null && node.right == null)
            return 0;
        long leftCutProduct = 0;
        if (node.left != null) {
            leftCutProduct = ((long) (node.val - node.left.val)) * (long) node.left.val;
            node.left.val = node.val;
            leftCutProduct = Math.max(leftCutProduct, maxProductCut(node.left));
        }
        long rightCutProduct = 0;
        if (node.right != null) {
            rightCutProduct = ((long) (node.val - node.right.val)) * (long) node.right.val;
            node.right.val = node.val;
            rightCutProduct = Math.max(rightCutProduct, maxProductCut(node.right));
        }
        return Math.max(leftCutProduct, rightCutProduct);
    }
}
