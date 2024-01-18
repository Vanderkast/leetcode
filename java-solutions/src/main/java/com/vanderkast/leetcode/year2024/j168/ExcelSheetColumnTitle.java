package com.vanderkast.leetcode.year2024.j168;

public class ExcelSheetColumnTitle {
    public String convertToTitle(int columnNumber) {
        char[] title = new char[7];
        int i = 6;
        do {
            title[i--] = (char) (--columnNumber % 26 + 'A');
            columnNumber = columnNumber / 26;
        } while (columnNumber > 0);
        return String.valueOf(title, i + 1, 6 - i);
    }
}
