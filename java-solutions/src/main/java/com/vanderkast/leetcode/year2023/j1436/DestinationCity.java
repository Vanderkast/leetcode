package com.vanderkast.leetcode.year2023.j1436;

import java.util.HashMap;
import java.util.List;

public class DestinationCity {
    public String destCity(List<List<String>> paths) {
        if (paths.size() == 1)
            return paths.get(0).get(1);

        HashMap<String, String> routes = new HashMap<>();
        for (List<String> path : paths) {
            routes.put(path.get(0), path.get(1));
        }

        var dest = paths.get(0).get(0);
        while (routes.containsKey(dest)){
            dest = routes.get(dest);
        }
        return dest;
    }
}
