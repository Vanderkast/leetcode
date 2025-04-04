package com.vanderkast.leetcode.year2025.j1123;

import net.vanderkast.leetcode.commons.TreeNode;

public class LowestCommonAncestorOfDeepestLeaves {

    public TreeNode lcaDeepestLeaves(TreeNode root) {
        return lcaDeepestLeaves(root, 0).node;
    }

    private NodeLevel lcaDeepestLeaves(TreeNode node, int level) {
        if (node.left == null && node.right == null)
            return lcaDeepestLeaves(node, level + 1);
        if (node.left != null && node.right == null)
            return lcaDeepestLeaves(node.left, level + 1);
        if (node.left == null && node.right != null)
            return lcaDeepestLeaves(node.right, level + 1);
        var left = lcaDeepestLeaves(node.right, level + 1);
        var right = lcaDeepestLeaves(node.right, level + 1);
        if (left == right)
            return new NodeLevel(node, left.level);
        if (left.level > right.level)
            return left;
        return right;
    }

    record NodeLevel(TreeNode node, int level) {
    }
}
