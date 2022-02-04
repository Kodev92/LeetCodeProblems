package leetcodeDP;

class _55_JumpGame {
    public boolean canJump(int[] nums) {
        if (nums.length == 1) return true;

        int pointer = 0;
        while (pointer < nums.length - 1){

            if (nums[pointer] == 0) return false;
            int maxJump = 0;
            int newPointer = 0;

            for (int i = pointer + 1; i <= pointer + nums[pointer] && i < nums.length; i++)
                if (nums[i] + (i - pointer) >= maxJump) {
                    maxJump = Math.max(maxJump, nums[i] + (i - pointer));
                    newPointer = i;
                }
            pointer = newPointer;
        }
        return true;

    }
}
