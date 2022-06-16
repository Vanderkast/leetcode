package com.vanderkast.leetcode.j21;

import net.vanderkast.leetcode.commons.ListNode;

public class MergeTwoSortedArrays {
    public ListNode mergeTwoLists(ListNode left, ListNode right) {
        ListNode root = new ListNode();
        ListNode previous = root;
        if (left != null && right != null) {
            while (left != null && right != null) {
                if (left.val < right.val) {
                    previous.next = left;
                    left = left.next;
                } else {
                    previous.next = right;
                    right = right.next;
                }
                previous = previous.next;
            }
        }
        ListNode pointer = left == null ? right : left;
        while (pointer != null) {
            previous.next = pointer;
            previous = pointer;
            pointer = pointer.next;
        }
        return root.next;
    }
}
