package com.vanderkast.leetcode.j278;

public class FirstBadVersion extends VersionControl {
    public FirstBadVersion(int badVersion) {
        super(badVersion);
    }

    public int firstBadVersion(int n) {
        if (n == 1)
            return 1;
        int a = 1;
        int b = n;
        int middle;
        boolean previous, cursor;
        while (a != b) {
            middle = a / 2 + b / 2;
            cursor = isBadVersion(middle);
            previous = isBadVersion(middle - 1);
            if (!previous && cursor)
                return middle;
            if (previous && cursor)
                b = middle - 1;
            else
                a = middle + 1;
        }
        return a;
    }
}
