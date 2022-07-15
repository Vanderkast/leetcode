package com.vanderkast.leetcode.j237;

import net.vanderkast.leetcode.commons.ListNode;

public class DeleteNodeInLinkedList {
    public void deleteNode(ListNode target) {
        target.val = target.next.val;
        target.next = target.next.next;
    }
}
