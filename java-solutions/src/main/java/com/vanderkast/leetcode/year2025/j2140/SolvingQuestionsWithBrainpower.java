package com.vanderkast.leetcode.year2025.j2140;

public class SolvingQuestionsWithBrainpower {
    public long mostPoints(int[][] questions) {
        var box = new long[questions.length];
        box[questions.length - 1] = questions[questions.length - 1][0];
        for (int i = questions.length - 2; i > -1; --i) {
            int prev = i + questions[i][1] + 1;
            if (prev < questions.length)
                box[i] = questions[i][0] + Math.max(questions[prev][0], box[prev]);
            else
                box[i] = questions[i][0];
            box[i] = Math.max(box[i], box[i + 1]);
        }
        return box[0];
    }
}
