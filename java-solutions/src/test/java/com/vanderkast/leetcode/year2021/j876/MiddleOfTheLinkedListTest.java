package com.vanderkast.leetcode.year2021.j876;

import net.vanderkast.leetcode.commons.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MiddleOfTheLinkedListTest {
    private final MiddleOfTheLinkedList solution = new MiddleOfTheLinkedList();

    private void test(ListNode given, ListNode expected) {
        // when
        var actual = solution.middleNode(given);
        // then
        assertEquals(expected, actual);
    }

    @Test
    void leetcode1() {
        var given = ListNode.from(1, 2, 3, 4, 5);
        var expected = given.next.next;
        assertEquals(3, expected.val);

        test(given, expected);
    }

    @Test
    void leetcode2() {
        var given = ListNode.from(1, 2, 3, 4, 5, 6);
        var expected = given.next.next.next;
        assertEquals(4, expected.val);

        test(given, expected);
    }

    @Test
    void singleNode() {
        var given = ListNode.from(1);

        test(given, given);
    }
}
