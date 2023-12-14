package com.vanderkast.leetcode.year2022.j39;

import java.util.LinkedList;
import java.util.List;

public class CombinationSum {
    private int[] candidates;
    private int target;
    List<List<Integer>> result = new LinkedList<>();

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        this.candidates = candidates;
        this.target = target;
        LinkedList<Integer> list;
        for (int i = 0; i < candidates.length; i++) {
            list = new LinkedList<>();
            list.add(candidates[i]);
            if (candidates[i] == target)
                result.add(list);
            else
                combinationSum(list, candidates[i], i);
        }
        return result;
    }

    void combinationSum(LinkedList<Integer> combination, int middleSum, int firstCandidate) {
        for (int j = firstCandidate; j < candidates.length; j++) {
            int sum = middleSum + candidates[j];
            if (sum > target)
                continue;
            combination.add(candidates[j]);
            if (sum == target) {
                result.add(List.copyOf(combination));
                combination.removeLast();
                continue;
            }
            combinationSum(combination, middleSum + candidates[j], j);
            combination.removeLast();
        }
    }
}
