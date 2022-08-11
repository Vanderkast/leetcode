package com.vanderkast.leetcode.j98;

import net.vanderkast.leetcode.commons.TreeNode;

public class ValidateBinarySearchTree {
    public boolean isValidBST(TreeNode root) {
        return isValid(root, 0x8000000000000000L, 0x7fffffffffffffffL);
    }

    private boolean isValid(TreeNode root, long min, long max) {
        if (root.left != null && (root.left.val <= min || root.left.val >= root.val))
            return false;
        if (root.right != null && (root.right.val >= max || root.right.val <= root.val))
            return false;
        return (root.left == null || isValid(root.left, min, root.val)) &&
                (root.right == null || isValid(root.right, root.val, max));
    }
}
