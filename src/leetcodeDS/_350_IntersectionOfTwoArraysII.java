package leetcodeDS;

import java.util.HashMap;

public class _350_IntersectionOfTwoArraysII {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> freqNum1 = new HashMap<>();
        for (int i = 0; i < nums1.length; i++)
            if (freqNum1.containsKey(nums1[i]))
                freqNum1.put(nums1[i], freqNum1.get(nums1[i]) + 1);
            else
                freqNum1.put(nums1[i], 1);


        HashMap<Integer, Integer> freqNum2 = new HashMap<>();
        for (int i = 0; i < nums2.length; i++)
            if (freqNum2.containsKey(nums2[i]))
                freqNum2.put(nums2[i], freqNum2.get(nums2[i]) + 1);
            else
                freqNum2.put(nums2[i], 1);

        HashMap<Integer, Integer> result = new HashMap<>();
        int size = 0;
        for (Integer key : freqNum1.keySet())
            if (freqNum2.containsKey(key)) {
                int minFreq = Math.min(freqNum1.get(key), freqNum2.get(key));
                result.put(key, minFreq);
                size += minFreq;
            }


        int[] r = new int[size];
        int index = 0;
        for (Integer key : result.keySet())
            for (int i = 1; i <= result.get(key); i++)
                r[index++] = key;
        return r;
    }
}
