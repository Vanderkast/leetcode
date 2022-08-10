package net.vanderkast.leetcode.commons;

import java.util.Objects;

public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;

    public TreeNode() {
    }

    public TreeNode(int val) {
        this.val = val;
    }

    public TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    public static TreeNode  from(Integer[] values) {
        var size = values.length;
        if (size == 0)
            return null;
        var nodes = new TreeNode[size];
        for (int i = 0; i < size; i++) {
            if (values[i] == null)
                nodes[i] = null;
            else
                nodes[i] = new TreeNode(values[i]);
        }

        int childPos = 0;
        for (int i = 0; i < size; i++) {
            childPos = i * 2 + 1;
            if (nodes[i] == null)
                continue;
            if (childPos < size)
                nodes[i].left = nodes[childPos];
            childPos = i * 2 + 2;
            if (childPos < size)
                nodes[i].right = nodes[childPos];
        }
        return nodes[0];
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TreeNode treeNode = (TreeNode) o;
        return val == treeNode.val && Objects.equals(left, treeNode.left) && Objects.equals(right, treeNode.right);
    }

    @Override
    public int hashCode() {
        return Objects.hash(val, left, right);
    }
}
