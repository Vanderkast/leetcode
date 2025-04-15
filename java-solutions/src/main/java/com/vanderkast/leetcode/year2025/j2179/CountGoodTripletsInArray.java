package com.vanderkast.leetcode.year2025.j2179;

public class CountGoodTripletsInArray {
    public long goodTriplets(int[] nums1, int[] nums2) {
        int len = nums1.length;
        var pos1 = new int[len];
        var pos2 = new int[len];

        for (int i = 0; i < len; i++) {
            pos1[nums1[i]] = i;
            pos2[nums2[i]] = i;
        }

        var segmentTreeLen = 2 * len - 1;
        var tree = new int[segmentTreeLen];
        int subLen = len - 1;
        build(tree, 0, 0, subLen, pos1, pos2);

        int count = 0;
        for (int i = 1; i < subLen; i++) {
            count += query(tree, 0, 0, len, 0, Math.min(pos1[i], pos2[i]) - 1)
                     * query(tree, 0, 0, len, Math.max(pos1[i], pos2[i]) + 1, len);
        }

        return count;
    }

    void build(int[] tree, int node, int i, int j, int[] pos1, int[] pos2) {
        if (i == j) {
            tree[node] = i <= pos1[i] && pos1[i] <= j && i <= pos2[i] && pos2[i] <= j ? 1 : 0;
        } else {
            int middle = (i + j) / 2;
            build(tree, 2 * node, i, middle, pos1, pos2);
            build(tree, 2 * node + 1, middle + 1, j, pos1, pos2);
            tree[node] = tree[2 * node] + tree[2 * node + 1];
        }
    }

    int query(int[] tree, int node, int nodeI, int nodeJ, int i, int j) {
        if (j < nodeI || nodeJ < i)
            return 0;
        if (nodeI <= i && j <= nodeJ)
            return tree[2 * node];
        var middle = (i + j) / 2;
        int left = query(tree, 2 * node, nodeI, middle, i, j);
        int right = query(tree, 2 * node + 1, middle, nodeJ, i, j);
        return left + right;
    }
}
