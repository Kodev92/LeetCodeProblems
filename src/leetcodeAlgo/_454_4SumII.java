package leetcodeAlgo;

import java.util.HashMap;

public class _454_4SumII {
    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        HashMap<Integer, Integer> sumABFreq = new HashMap<>();

        for (int i = 0; i < nums1.length; i++)
            for (int j = 0; j < nums2.length; j++)
                 sumABFreq.put(nums1[i] + nums2[j], sumABFreq.getOrDefault(nums1[i] + nums2[j], 0) + 1);


        int t = 0;
        for (int i = 0; i < nums3.length; i++)
            for (int j = 0; j < nums4.length; j++)
                t += sumABFreq.getOrDefault( (nums3[i] + nums4[j]) * (-1), 0);

        return t;
    }
}
