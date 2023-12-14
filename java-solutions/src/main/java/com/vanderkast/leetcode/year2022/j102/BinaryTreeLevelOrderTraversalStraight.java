package com.vanderkast.leetcode.year2022.j102;

import net.vanderkast.leetcode.commons.TreeNode;

import java.util.LinkedList;
import java.util.List;

public class BinaryTreeLevelOrderTraversalStraight {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> traversal = new LinkedList<>();
        if (root == null)
            return traversal;
        var previousLevel = new LinkedList<TreeNode>();
        previousLevel.add(root);
        while (!previousLevel.isEmpty()) {
            var levelTraverse = new LinkedList<Integer>();
            traversal.add(levelTraverse);

            var currentLevel = new LinkedList<TreeNode>();
            for (var node : previousLevel) {
                if (node.left != null)
                    currentLevel.add(node.left);
                if (node.right != null)
                    currentLevel.add(node.right);
                levelTraverse.add(node.val);
            }
            previousLevel = currentLevel;
        }
        return traversal;
    }
}
