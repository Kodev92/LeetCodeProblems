package leetcode;

public class _167_TwoSumII_InputArrayIsSorted {
    public int[] twoSum(int[] numbers, int target) {

        // Running from 0 to length-1 element
        // candidate1 = nums[index], candidate2 = target - candidate1, then binary searching for index2 for candidate2

        int c2;
        for (int i1 = 0; i1 < numbers.length - 1; i1++) {
            c2 = target - numbers[i1]; // candidate2

            int l = i1 + 1;
            int r = numbers.length - 1;
            int m;

            while (l <= r) {
                m = l + (r - l) / 2;
                if (numbers[m] < c2)
                    l = m + 1;
                else if (numbers[m] > c2)
                    r = m - 1;
                else return new int[]{i1, m};
            }
        }
        return new int[]{-1, -1};
    }
}
