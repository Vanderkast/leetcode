package com.vanderkast.leetcode.year2024.j150;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class EvaluateReversePolishNotationTest {
    private final EvaluateReversePolishNotation solution = new EvaluateReversePolishNotation();

    @Test
    void leetcodeExample1() {
        var tokens = new String[]{"2", "1", "+", "3", "*"};
        var expected = 9;
        var actual = solution.evalRPN(tokens);
        assertEquals(expected, actual);
    }

    @Test
    void leetcodeExample2() {
        var tokens = new String[]{"4", "13", "5", "/", "+"};
        var expected = 6;
        var actual = solution.evalRPN(tokens);
        assertEquals(expected, actual);
    }

    @Test
    void leetcodeExample3() {
        var tokens = new String[]{"10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+"};
        var expected = 22;
        var actual = solution.evalRPN(tokens);
        assertEquals(expected, actual);
    }
}
