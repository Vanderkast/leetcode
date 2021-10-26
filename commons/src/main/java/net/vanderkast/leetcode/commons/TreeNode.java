package net.vanderkast.leetcode.commons;

public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    public static TreeNode from(Integer[] values) {
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
}
