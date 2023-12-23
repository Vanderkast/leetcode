package com.vanderkast.leetcode.year2023.j1496;


import java.util.HashSet;
import java.util.Set;

public class PathCrossing {
    public boolean isPathCrossing(String path) {
        Set<Integer> visited = new HashSet<>();
        int y = 0, x = 0;
        visited.add(0);
        for (int i = 0; i < path.length(); i++) {
            switch (path.charAt(i)) {
                case 'N' -> ++y;
                case 'S' -> --y;
                case 'E' -> ++x;
                case 'W' -> --x;
            }
            if (!visited.add(y * 100000 + x))
                return true;
        }
        return false;
    }
}
