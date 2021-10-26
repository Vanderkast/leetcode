package com.vanderkast.leetcode;

import net.vanderkast.leetcode.commons.TreeNode;

public class InvertBinaryTree {
    public TreeNode invertTree(TreeNode root) {
        if(root == null)
            return null;
        invertTreeRecursive(root);
        return root;
    }

    public void invertTreeRecursive(TreeNode current){
        TreeNode box = current.left;
        current.left = current.right;
        current.right = box;
        if(current.left != null)
            invertTreeRecursive(current.left);
        if(current.right != null)
            invertTreeRecursive(current.right);
    }
}
