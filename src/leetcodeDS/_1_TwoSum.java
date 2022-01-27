package leetcodeDS;

import java.util.*;
import java.util.stream.Collectors;

public class _1_TwoSum {
    public int[] twoSum(int[] nums, int target) {

        if (target % 2 == 0)  // in case then both elements are equal
            for (int i = 0; i < nums.length - 1; i++)
                if (nums[i] == target / 2)
                    for (int j = i + 1; j < nums.length; j++)
                        if (nums[j] == target / 2) return new int[]{i, j};

        Map<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) hashMap.put(nums[i], i);
        for (int i = 0; i < nums.length - 1; i++)
                if (hashMap.containsKey(target - nums[i]) && hashMap.get(target - nums[i]) != i) return new int[]{i, hashMap.get(target - nums[i])};
        return new int[]{-1, -1};
    }

}
