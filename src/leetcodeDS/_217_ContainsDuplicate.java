package leetcodeDS;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class _217_ContainsDuplicate {
    public boolean containsDuplicateSort(int[] nums) {

        return Arrays.stream(nums).distinct().count() < nums.length;
    }

    public boolean containsDuplicateFast(int[] nums) {

        Set<Integer> s = new HashSet<>();
        for (int i : nums)
            if (!s.add(i)) return true;
        return false;
    }

}
