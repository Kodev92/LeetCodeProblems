package leetcodeAlgo;

import java.util.HashMap;
import java.util.Set;

public class _560_SubarraySumEqualsK {
    public int subarraySum(int[] nums, int k) {

        // Brute force
/*
        int counter = 0;
        int sum;
        for (int i = 0; i < nums.length; i++) {
            sum = 0;
            int j = i;
            while (sum < k && j < nums.length) {
                sum += nums[j];
                if (sum == k) counter++;
                j++;
            }
        }
*/

        // Hashmap
        HashMap<Integer, Integer> sumPrev = new HashMap<>();
        sumPrev.put(0, 1);
        int sum = 0;
        int result = 0;

        for (int num : nums) {
            sum += num;
            if (sumPrev.containsKey(sum - k)) result += sumPrev.get(sum - k);
            sumPrev.put(sum, sumPrev.getOrDefault(sum, 0) + 1);
        }
        return result;

    }
}
