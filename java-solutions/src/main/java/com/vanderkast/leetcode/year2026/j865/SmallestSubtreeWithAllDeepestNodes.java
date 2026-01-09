package com.vanderkast.leetcode.year2026.j865;

import net.vanderkast.leetcode.commons.TreeNode;

public class SmallestSubtreeWithAllDeepestNodes {
    public TreeNode subtreeWithAllDeepest(TreeNode root) {
        return subtreeWithAllDeepest(root, 1).node;
    }

    record NodeDepth(TreeNode node, int depth) {
    }

    private NodeDepth subtreeWithAllDeepest(TreeNode node, int depth) {
        if (node.left == null && node.right == null) {
            return new NodeDepth(node, depth);
        } else if (node.left != null && node.right != null) {
            var left = subtreeWithAllDeepest(node.left, depth + 1);
            var right = subtreeWithAllDeepest(node.right, depth + 1);
            if (left.depth == right.depth)
                return new NodeDepth(node, left.depth);
            else if (left.depth > right.depth)
                return left;
            else
                return right;
        } else if (node.left != null)
            return subtreeWithAllDeepest(node.left, depth + 1);
        return subtreeWithAllDeepest(node.right, depth + 1);
    }
}
