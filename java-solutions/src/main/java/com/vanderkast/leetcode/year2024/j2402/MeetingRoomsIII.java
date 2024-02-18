package com.vanderkast.leetcode.year2024.j2402;

import java.util.Arrays;
import java.util.Comparator;

public class MeetingRoomsIII {
    public int mostBooked(int n, int[][] meetings) {
        Arrays.sort(meetings, Comparator.comparingInt(a -> a[0]));
        int[] meetingsHeld = new int[n];
        long[] meetingEnd = new long[n];
        int room;
        int earliestFreeRoom;
        for (int[] meeting : meetings) {
            earliestFreeRoom = 0;
            for (room = 0; room < n; ++room) {
                if (meetingEnd[room] <= meeting[0]) {
                    meetingEnd[room] = meeting[1];
                    ++meetingsHeld[room];
                    break;
                } else if (meetingEnd[room] < meetingEnd[earliestFreeRoom]) {
                    earliestFreeRoom = room;
                }
            }
            if (room == n) {
                meetingEnd[earliestFreeRoom] += meeting[1] - meeting[0];
                ++meetingsHeld[earliestFreeRoom];
            }
        }
        int iMin = 0;
        for (int i = 1; i < n; i++) {
            if (meetingsHeld[i] > meetingsHeld[iMin])
                iMin = i;
        }
        return iMin;
    }
}
