package com.vanderkast.leetcode.year2024.j2225;

import java.util.ArrayList;
import java.util.List;

public class FindPlayersWithZeroOrOneLossesFiveHead implements FindPlayersWithZeroOrOneLosses {
    @Override
    public List<List<Integer>> findWinners(int[][] matches) {
        Integer[] playersLosses = new Integer[100001];
        for (int[] match : matches) {
            if (playersLosses[match[0]] == null)
                playersLosses[match[0]] = 0;
            if (playersLosses[match[1]] == null)
                playersLosses[match[1]] = 1;
            else
                ++playersLosses[match[1]];
        }
        List<Integer> noLosses = new ArrayList<>();
        List<Integer> oneLoss = new ArrayList<>();
        for (int i = 1; i < playersLosses.length; i++) {
            if (playersLosses[i] != null) {
                if (playersLosses[i] == 0)
                    noLosses.add(i);
                else if (playersLosses[i] == 1)
                    oneLoss.add(i);
            }
        }
        return List.of(noLosses, oneLoss);
    }
}
