package com.vanderkast.leetcode.year2021.j278;

public class VersionControl {
    private final int badVersion;

    public VersionControl(int badVersion) {
        this.badVersion = badVersion;
    }

    boolean isBadVersion(int version) {
        return badVersion <= version;
    }
}
