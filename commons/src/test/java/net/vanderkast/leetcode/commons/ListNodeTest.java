package net.vanderkast.leetcode.commons;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ListNodeTest {
    @Test
    void from() {
        // given
        var values = new int[]{1, 2, 3};

        // when
        var head = ListNode.from(values);

        // then
        int pos = 0;
        while (head != null) {
            assertEquals(values[pos], head.val);
            pos += 1;
            head = head.next;
        }
    }

    @Test
    void equalsReflection() {
        // given
        var some = new ListNode(1);
        some.next = new ListNode(2);

        // then
        assertEquals(some, some);
    }

    @Test
    void equalsSymmetry() {
        // given
        var a = new ListNode(1, new ListNode(2));
        var b = new ListNode(1, new ListNode(2));
        assertEquals(a, b);

        // then
        assertEquals(b, a);
    }

    @Test
    void equalsTransitive() {
        // given
        var x = new ListNode(1);
        var y = new ListNode(1);
        var z = new ListNode(1);

        assertEquals(x, y);
        assertEquals(y, z);

        // when
        assertEquals(x, z);
    }
}
