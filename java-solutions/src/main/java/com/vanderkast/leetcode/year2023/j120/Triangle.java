package com.vanderkast.leetcode.year2023.j120;

import java.util.ArrayList;
import java.util.List;

public class Triangle {
    public int minimumTotal(List<List<Integer>> triangle) {
        int i = triangle.size() - 1;
        List<Integer> result = new ArrayList<>(triangle.get(i--));
        List<Integer> cur;
        while (i > -1) {
            cur = triangle.get(i--);
            for (int j = 0; j < cur.size(); j++) {
                result.set(j, cur.get(j) + Math.min(result.get(j), result.get(j + 1)));
            }
        }
        return result.get(0);
    }
}
