package com.vanderkast.leetcode.year2021.j876;

import net.vanderkast.leetcode.commons.ListNode;

public class MiddleOfTheLinkedList {
    public ListNode middleNode(ListNode pointer) {
        var middlePointer = pointer;
        while (true) {
            if(pointer.next == null)
                return middlePointer;
            middlePointer = middlePointer.next;
            pointer = pointer.next;

            if(pointer.next == null)
                return middlePointer;
            pointer = pointer.next;
        }
    }
}
