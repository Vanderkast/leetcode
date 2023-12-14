package com.vanderkast.leetcode.year2021.j35;

public class SearchInsertPosition {
    /**
     * Finds target in numbers, or index where it should be.
     *
     * @param numbers - array of distinct integers sorted in ascending order
     * @param target  - value, index of should be found
     * @return index (existing or possible) of target in numbers
     */
    public int searchInsert(int[] numbers, int target) {
        if (numbers.length == 1) {
            if (numbers[0] == target)
                return 0;
            return numbers[0] > target ? 0 : 1;
        }
        int a = 0;
        int b = numbers.length - 1;
        int cursor, index;
        while (a < b) {
            index = (a + b) / 2;
            cursor = numbers[index];
            if (cursor == target)
                return index;
            if (cursor < target)
                a = index + 1;
            else
                b = index - 1;
        }
        // if we have not found target in numbers,
        // then we should place it next to numbers[a]
        // which is the nearest value
        return numbers[a] >= target ? a : a + 1;
    }
}
