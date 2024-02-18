package com.vanderkast.leetcode.year2024.j2402;

import net.vanderkast.leetcode.commons.test.ResourcesUtils;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.Comparator;
import java.util.PriorityQueue;

import static com.vanderkast.leetcode.tools.Matrix.matrix;
import static org.junit.jupiter.api.Assertions.*;

class MeetingRoomsIIITest {
    private final MeetingRoomsIII solution = new MeetingRoomsIII();

    @Test
    void leetcodeExample1() {
        var n = 2;
        var meetings = matrix("[[0,10],[1,5],[2,7],[3,4]]");
        var expected = 0;
        var actual = solution.mostBooked(n, meetings);
        assertEquals(expected, actual);
    }

    @Test
    void leetcodeExample2() {
        var n = 3;
        var meetings = matrix("[[1,20],[2,10],[3,5],[4,9],[6,8]]");
        var expected = 1;
        var actual = solution.mostBooked(n, meetings);
        assertEquals(expected, actual);
    }

    @Test
    void tooMuchRooms() {
        var n = 3;
        var meetings = matrix("[[0,1], [1, 2]");
        var expected = 0;
        var actual = solution.mostBooked(n, meetings);
        assertEquals(expected, actual);
    }

    @Test
    void oneRoom() {
        var n = 1;
        var meetings = matrix("[[0,10],[1,9],[2,8],[3,7],[4,6]");
        var expected = 0;
        var actual = solution.mostBooked(n, meetings);
        assertEquals(expected, actual);
    }

    @Test
    void priorityQueue() {
        PriorityQueue<Integer[]> queue = new PriorityQueue<>(Comparator.comparingInt(a -> a[1]));
        var expected1 = new Integer[]{0, 3};
        var expected2 = new Integer[]{1, 3};
        queue.add(expected1);
        queue.add(expected2);
        var actual1 = queue.poll();
        var actual2 = queue.poll();
        assertArrayEquals(expected1, actual1);
        assertArrayEquals(expected2, actual2);
    }

    @Test
    void leetcodeTest65() {
        var n = 2;
        var meetings = matrix("[[0,10],[1,2],[12,14],[13,15]]");
        var expected = 0;
        var actual = solution.mostBooked(n, meetings);
        assertEquals(expected, actual);
    }

    @Test
    void leetcodeTestN() {
        var n = 4;
        var meetings = matrix("[[18,19],[3,12],[17,19],[2,13],[7,10]]");
        var expected = 0;
        var actual = solution.mostBooked(n, meetings);
        assertEquals(expected, actual);
    }

    @Test
    void leetcodeTest72() {
        var n = 4;
        var meetings = matrix("[[19,20],[14,15],[13,14],[11,20]]");
        var expected = 1;
        var actual = solution.mostBooked(n, meetings);
        assertEquals(expected, actual);
    }

    @Test
    void leetcodeTest80() throws IOException {
        var n = 10;
        var meetings = matrix(ResourcesUtils.readResourceFileContent("year2024/j2402/leetcodeTest80.txt"));
        var expected = 1;
        var actual = solution.mostBooked(n, meetings);
        assertEquals(expected, actual);
    }
}
