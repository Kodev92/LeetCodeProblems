package leetcodeAlgo;

public class _283_MoveZeroes {
    public void moveZeroes(int[] nums) {

        // Running from 0 to length - 1 element, it is pointer A
        // pointer B running from pointer A + 1 to the end
        // if it is 0 at pointer B then  pointer B ++ else
        // nums[pointer A] = nums[pointer B]
        // if poinetr B at the end, then nums[pointer A] = 0

        int b = 0;
        for (int a = 0; a < nums.length; a++) {
            while (b < nums.length && nums[b] == 0) b++;
            if (b < nums.length) nums[a] = nums[b];
                else nums[a] = 0;
            b++;
        }

    }
}
