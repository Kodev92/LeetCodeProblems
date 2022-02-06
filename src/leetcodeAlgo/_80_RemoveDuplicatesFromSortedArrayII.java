package leetcodeAlgo;

public class _80_RemoveDuplicatesFromSortedArrayII {
    public int removeDuplicates(int[] nums) {

        int pointer2 = 0;
        int nDublicates  = 0;
        int cNumber = nums[0];

        for (int pointer1 = 0; pointer1 < nums.length; pointer1++) {

            if (nums[pointer1] != cNumber) {
                cNumber = nums[pointer1];
                nDublicates = 1;
            } else
                nDublicates++;


            if (pointer1 != pointer2 && nDublicates <= 2) {
                nums[pointer2] = nums[pointer1];
                pointer2++;
            }

        }
        return pointer2;

    }
}
