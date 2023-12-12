package com.vanderkast.leetcode.j22;

import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses {
    List<String> result;
    char[] box;
    int last;
    int pairs;

    public List<String> generateParenthesis(int pairs) {
        this.result = new ArrayList<>(pairs * (pairs - 1) + 1);
        this.box = new char[pairs * 2];
        this.last = box.length - 1;
        this.pairs = pairs;
        box[0] = '(';
        generateParenthesis(1, 1, 0);
        return result;
    }

    void generateParenthesis(int pos, int opened, int closed) {
        if (pos < last) {
            if (opened < pairs) {
                box[pos] = '(';
                generateParenthesis(pos + 1, opened + 1, closed);
            }
            if (closed < pairs && closed < opened) {
                box[pos] = ')';
                generateParenthesis(pos + 1, opened, closed + 1);
            }
        } else if (pos == last) {
            box[pos] = ')';
            result.add(new String(box));
        }
    }
}
