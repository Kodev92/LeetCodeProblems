package leetcode;

import java.lang.reflect.Array;
import java.util.Arrays;

class Solution704 {
    public int search(int[] nums, int target) {

        int l = 0;
        int r = nums.length - 1;
        int m = 0;

        while (l <= r) {
            m = (r + l) / 2;
            if (nums[m] > target) {
                r = m - 1;
            } else if (nums[m] < target) {
                l = m + 1;
            } else {
                return m;
            }
        }
        return -1;

    }
}

