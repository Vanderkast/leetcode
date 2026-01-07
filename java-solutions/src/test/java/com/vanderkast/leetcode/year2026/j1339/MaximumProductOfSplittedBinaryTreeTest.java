package com.vanderkast.leetcode.year2026.j1339;

import net.vanderkast.leetcode.commons.TreeNode;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class MaximumProductOfSplittedBinaryTreeTest {
    private final MaximumProductOfSplittedBinaryTree solution = new MaximumProductOfSplittedBinaryTree();

    @ParameterizedTest
    @MethodSource("testCases")
    void maxProduct(TreeNode root, int expected) {
        var actual = solution.maxProduct(root);
        assertEquals(expected, actual);
    }

    private static Stream<Arguments> testCases() {
        return Stream.of(
                Arguments.of(TreeNode.from(new Integer[]{1, 2}), 2),
                Arguments.of(TreeNode.from(new Integer[]{1, 2, 3, 4, 5, 6}), 110),
                Arguments.of(TreeNode.from(new Integer[]{1, null, 2, null, null, 3, 4, null, null, null, null, null, null, 5, 6}), 90)
        );
    }
}