package com.vanderkast.leetcode.year2024.j1642;

import java.util.*;

public class FurthestBuildingYouCanReach {
    public int furthestBuilding(int[] heights, int bricks, int ladders) {
        PriorityQueue<Integer> queue = new PriorityQueue<>(Comparator.reverseOrder());
        int i, dh;
        for (i = 0; i < heights.length - 1; ++i) {
            dh = heights[i + 1] - heights[i];

            if (dh <= 0)
                continue;

            bricks -= dh;
            queue.add(dh);

            if (bricks < 0) {
                bricks += queue.poll();
                --ladders;
            }

            if (ladders < 0)
                break;
        }
        return i;
    }
}
