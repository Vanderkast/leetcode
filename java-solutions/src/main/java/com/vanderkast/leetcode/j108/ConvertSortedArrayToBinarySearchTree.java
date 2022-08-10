package com.vanderkast.leetcode.j108;

import net.vanderkast.leetcode.commons.TreeNode;

public class ConvertSortedArrayToBinarySearchTree {
    private int[] nums;

    public TreeNode sortedArrayToBST(int[] nums) {
        this.nums = nums;
        return sortedArrayToBst(0, nums.length - 1);
    }
    private TreeNode sortedArrayToBst(int from, int to) {
        if (from == to)
            return new TreeNode(nums[from]);
        if (to - from == 1)
            return new TreeNode(nums[to], new TreeNode(nums[from]), null);
        int center = (to + from) / 2;
        return new TreeNode(nums[center],
                sortedArrayToBst(from, center - 1),
                sortedArrayToBst(center + 1, to));
    }
}
