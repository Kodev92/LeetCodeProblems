package leetcodeAlgo;

public class _977_SquaresOfASortedArray {
    public int[] sortedSquares(int[] nums) {

        // let's divide array into two part, part one - all elements below 0, part two - all elements equal or above 0
        // then we will run through both part and compare squaring results and place them in proper order

        int[] result = new int[nums.length];

        int l = 0;
        int r = nums.length - 1;
        int z = 0;

        if (r == 0) {return new int[]{nums[r]*nums[r]};}

        while ( l <= r ) {
            z = l + (r - l) / 2;
            if (nums[z] <= -1)
                l = z + 1;
            else if (nums[z] > -1)
                r = z - 1;
        }
        if (r < 0) r = 0;// r = last negative or 0
        int p; // index in positive part
        int n; // index in negative part

        if (nums[r] < 0) {
            p = r + 1; // point to first positive, could be nums.length
            n = r; // point to first negative
        } else {
            p = r; // point to first positive in case there are no negatives
            n = -1; // no negatives
        }

        for (int i = 0; i < nums.length; i++) {
            if (n < 0) {
                result[i] = nums[p] * nums[p];
                p++;
            } else
            if (p > nums.length - 1) {
                result[i] = nums[n] * nums[n];
                n--;
            } else
            if (nums[n] * nums[n] <= nums[p] * nums[p]) {
                result[i] = nums[n] * nums[n];
                n--;
            } else {
                result[i] = nums[p] * nums[p];
                p++;
            }
        }
        return result;

    }
}
