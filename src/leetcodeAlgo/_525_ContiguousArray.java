package leetcodeAlgo;

import java.util.HashMap;

public class _525_ContiguousArray {
    public int findMaxLength(int[] nums) {

        HashMap<Integer, Integer> hm = new HashMap<>();
        int maxL = 0;
        int sum = 0;

        hm.put(0,-1);

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) sum++; else sum--;
            if (hm.containsKey(sum))
                maxL = Math.max(maxL, i - hm.get(sum));
            else
                hm.put(sum, i);
        }
        return maxL;
    }
}
