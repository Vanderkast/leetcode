package com.vanderkast.leetcode;

import java.util.Deque;
import java.util.LinkedList;

public class FlattenMultilevelDoublyLinkedList {
    public Node flatten(Node head) {
        if (head == null)
            return null;

        Deque<Node> stack = new LinkedList<>();
        var cursor = head;
        while (true) {
            if (cursor.child != null) {
                stack.add(cursor);
                cursor = cursor.child;
            }
            if (cursor.next == null && stack.isEmpty())
                break;
            else
                cursor = cursor.next;
        }

        return head;
    }
}
