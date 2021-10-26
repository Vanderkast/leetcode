package net.vanderkast.leetcode.commons;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TreeNodeTest {
    @Test
    void fromZeroLengthArray() {
        var actual = TreeNode.from(new Integer[]{});
        assertNull(actual);
    }

    @Test
    void fromOnlyRootArray() {
        var actual = TreeNode.from(new Integer[]{1});
        assertNotNull(actual);
        assertEquals(1, actual.val);
        assertNull(actual.left);
        assertNull(actual.right);
    }

    @Test
    void fromOnlyLeftChildArray() {
        var actual = TreeNode.from(new Integer[]{1, 2});
        assertNotNull(actual);
        assertEquals(1, actual.val);
        assertNotNull(actual.left);
        assertEquals(2, actual.left.val);
        assertNull(actual.right);
    }

    @Test
    void fromOnlyRightChildArray() {
        var actual = TreeNode.from(new Integer[]{1, null, 3});
        assertNotNull(actual);
        assertEquals(1, actual.val);
        assertNull(actual.left);
        assertNotNull(actual.right);
        assertEquals(3, actual.right.val);
    }
}
