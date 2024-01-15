package com.vanderkast.leetcode.year2024.j2225;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindPlayersWithZeroOrOneLossesStraight implements FindPlayersWithZeroOrOneLosses {
    public List<List<Integer>> findWinners(int[][] matches) {
        HashMap<Integer, Integer> playersLosses = new HashMap<>();
        for (int[] match : matches) {
            playersLosses.putIfAbsent(match[0], 0);
            playersLosses.compute(match[1], (p, losses) -> {
                if (losses == null)
                    return 1;
                return losses + 1;
            });
        }
        List<Integer> noLosses = new ArrayList<>();
        List<Integer> oneLoss = new ArrayList<>();
        for (Map.Entry<Integer, Integer> player : playersLosses.entrySet()) {
            if (player.getValue() == 0)
                noLosses.add(player.getKey());
            else if (player.getValue() == 1)
                oneLoss.add(player.getKey());
        }
        noLosses.sort(Integer::compareTo);
        oneLoss.sort(Integer::compareTo);
        return List.of(noLosses, oneLoss);
    }
}
