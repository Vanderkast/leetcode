package com.vanderkast.leetcode.year2023.j1688;

public class CountOfMatchesInTournament {
    public int numberOfMatches(int n) {
        int matches = 0;
        while (n > 1) {
            matches += n / 2;
            n = (n / 2) + (n & 1);
        }
        return matches;
    }
}
