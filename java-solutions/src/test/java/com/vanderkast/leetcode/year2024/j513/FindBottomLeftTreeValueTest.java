package com.vanderkast.leetcode.year2024.j513;

import net.vanderkast.leetcode.commons.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FindBottomLeftTreeValueTest {
    private final FindBottomLeftTreeValue solution = new FindBottomLeftTreeValue();

    @Test
    void leetcodeExample1() {
        var root = TreeNode.from(new Integer[]{2, 1, 3});
        var expected = 1;
        var actual = solution.findBottomLeftValue(root);
        assertEquals(expected, actual);
    }

    @Test
    void leetcodeExample2() {
        var root = TreeNode.from(new Integer[]{1, 2, 3, 4, null, 5, 6, null, null, null, null, 7});
        var expected = 7;
        var actual = solution.findBottomLeftValue(root);
        assertEquals(expected, actual);
    }
}
