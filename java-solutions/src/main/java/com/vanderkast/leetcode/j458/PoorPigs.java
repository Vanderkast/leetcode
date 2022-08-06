package com.vanderkast.leetcode.j458;

public class PoorPigs {
    public int poorPigs(int buckets, int minutesToDie, int minutesToTest) {
        int t = minutesToTest / minutesToDie;
        return (int) Math.ceil(Math.log(buckets) / Math.log(t + 1));
    }
}
