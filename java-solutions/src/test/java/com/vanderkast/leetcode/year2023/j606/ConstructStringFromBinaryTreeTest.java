package com.vanderkast.leetcode.year2023.j606;

import net.vanderkast.leetcode.commons.TreeNode;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class ConstructStringFromBinaryTreeTest {
    private final ConstructStringFromBinaryTree solution = new ConstructStringFromBinaryTree();

    @ParameterizedTest
    @MethodSource("parameters")
    void test(TreeNode root, String expected) {
        var actual = solution.tree2str(root);
        assertEquals(expected, actual);
    }

    static Stream<Arguments> parameters() {
        return Stream.of(
                arguments(TreeNode.from(new Integer[]{1}), "1"),
                arguments(TreeNode.from(new Integer[]{1, 2, 3, 4}), "1(2(4))(3)"),
                arguments(TreeNode.from(new Integer[]{1, 2, 3, null, 4}), "1(2()(4))(3)")
        );
    }
}
