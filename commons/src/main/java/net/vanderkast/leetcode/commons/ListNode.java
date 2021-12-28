package net.vanderkast.leetcode.commons;

import java.util.List;
import java.util.Objects;

public class ListNode {
    public int val;
    public ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    public static ListNode from(int... values) {
        var root = new ListNode();
        var cursor = root;
        for (int val: values) {
            cursor.next = new ListNode();
            cursor = cursor.next;
            cursor.val = val;
        }
        return root.next;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ListNode listNode = (ListNode) o;
        return val == listNode.val && Objects.equals(next, listNode.next);
    }

    @Override
    public int hashCode() {
        return Objects.hash(val);
    }
}
