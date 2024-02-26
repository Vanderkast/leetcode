package com.vanderkast.leetcode.year2024.j100;

import net.vanderkast.leetcode.commons.TreeNode;

public class SameTree {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if ((p == null) != (q == null))
            return false;
        if (p == null)
            return true;
        return p.val == q.val && isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
}
