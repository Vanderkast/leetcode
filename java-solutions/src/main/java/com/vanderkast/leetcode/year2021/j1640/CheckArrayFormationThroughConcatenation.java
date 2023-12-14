package com.vanderkast.leetcode.year2021.j1640;

import java.util.HashMap;
import java.util.Map;

public class CheckArrayFormationThroughConcatenation {
    public boolean canFormArray(int[] arr, int[][] pieces) {
        Map<Integer, int[]> piecesMap = new HashMap<>(pieces.length);
        for (int[] piece: pieces) {
            piecesMap.put(piece[0], piece);
        }
        int[] piece;
        for (int aI = 0; aI < arr.length; aI++) {
            piece = piecesMap.get(arr[aI]);
            if(piece == null)
                return false;
            for (int pI = 1; pI < piece.length; pI++) {
                if(piece[pI] != arr[++aI])
                    return false;
            }
        }
        return true;
    }
}
