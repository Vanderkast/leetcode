package com.vanderkast.leetcode.year2024.j513;

import net.vanderkast.leetcode.commons.TreeNode;

public class FindBottomLeftTreeValue {
    int maxLevel;
    int mostLeft;

    public int findBottomLeftValue(TreeNode root) {
        maxLevel = 0;
        mostLeft = root.val;
        findBottomLeftValue(root.left, 1);
        findBottomLeftValue(root.right, 1);
        return mostLeft;
    }

    public void findBottomLeftValue(TreeNode node, int level) {
        if (node == null)
            return;
        findBottomLeftValue(node.left, ++level);
        findBottomLeftValue(node.right, level);
        if (level > maxLevel) {
            maxLevel = level;
            mostLeft = node.val;
        }
    }
}
