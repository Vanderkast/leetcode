package com.vanderkast.leetcode.j496;

/**
 * O(n^2) solution with some optimization;
 */
public class NextGreaterElementIBruteForce implements NextGreaterElementI {
    @Override
    public int[] nextGreaterElement(int[] iNums, int[] jNums) {
        int iLen = iNums.length;
        int jSubLen = jNums.length - 1;

        int j, iTmp, jTmp, nextGreater;
        for (int i = 0; i < iLen; ++i) {
            iTmp = iNums[i];
            nextGreater = -1;
            j = jSubLen;
            do {
                jTmp = jNums[j];
                if (jTmp == iTmp) {
                    iNums[i] = nextGreater;
                    break;
                } else if (jTmp > iTmp)
                    nextGreater = jTmp;
            } while (--j > -1);
        }
        return iNums;
    }
}
