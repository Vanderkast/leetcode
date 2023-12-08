package com.vanderkast.leetcode.j606;

import net.vanderkast.leetcode.commons.TreeNode;

public class ConstructStringFromBinaryTree {
    public String tree2str(TreeNode node) {
        StringBuilder result = new StringBuilder();
        tree2str(node, result);
        return result.toString();
    }

    void tree2str(TreeNode node, StringBuilder string) {
        string.append(node.val);
        if (node.left != null) {
            string.append('(');
            tree2str(node.left, string);
            string.append(')');
        }
        if (node.right != null) {
            if (node.left == null)
                string.append("()");
            string.append('(');
            tree2str(node.right, string);
            string.append(')');
        }
    }
}
