package com.vanderkast.leetcode;

public class Nodes {
    public static Node fromValueArrays(Integer[][] values) {
        if(values.length == 0)
            return null;
        Node[][] nodes = new Node[values.length][];
        Integer[] levelValues = values[0];
        Node[] levelNodes = new Node[levelValues.length];
        levelNodes[0] = new Node();
        levelNodes[0].val = levelValues[0];
        int i = 1;
        while (levelNodes[i] != null) {
            levelNodes[i] = new Node();
            levelNodes[i].val = levelValues[i];
            levelNodes[i].prev = levelNodes[i - 1];
            i++;
        }
        for (int j = 0; j < ; j++) {
            
        }
        return nodes[0][0];
    }
}
