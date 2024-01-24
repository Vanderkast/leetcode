package com.vanderkast.leetcode.year2024.j1457;

import net.vanderkast.leetcode.commons.TreeNode;

public class PseudoPalindromicPathsInBinaryTree {
    public int pseudoPalindromicPaths(TreeNode root) {
        return pseudoPalindromicPaths(root, 0);
    }

    int pseudoPalindromicPaths(TreeNode node, int seen) {
        seen ^= 1 << node.val;
        int count = 0;
        if (node.left != null)
            count += pseudoPalindromicPaths(node.left, seen);
        if (node.right != null)
            count += pseudoPalindromicPaths(node.right, seen);
        if (node.left == null && node.right == null && (seen & (seen - 1)) == 0) {
            ++count;
        }
        return count;
    }
}
