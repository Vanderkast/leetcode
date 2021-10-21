package com.vanderkast.leetcode;

import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class RandomizedSet {
    private final Random rng = new Random();
    private final Map<Integer, Integer> set;
    private final List<Integer> list;

    public RandomizedSet() {
        set = new HashMap<>();
        list = new ArrayList<>();
    }

    public boolean insert(int val) {
        if (set.putIfAbsent(val, list.size()) == null) {
            list.add(val);
            return true;
        }
        return false;
    }

    public boolean remove(int val) {
        var place = set.remove(val);
        if (place != null) {
            list.set(place, null);
            return true;
        }
        return false;
    }

    public int getRandom() {
        Integer val;
        do {
            val = list.get(rng.nextInt(list.size()));
        } while (val == null);
        return val;
    }
}
