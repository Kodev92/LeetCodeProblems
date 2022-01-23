package leetcode;

public class _189_RotateArray {

    public int gcd(int a, int b){
        int result;
        if (a == 0) return b;
        if (b == 0) return a;
        if (a > b) result = gcd(b, a % b);
        else result = gcd(a, b % a);
        return result;
    }

    public void rotate(int[] nums, int k) {

        // 1. Let's find where first element will move, like n = 0 + k, but if length is less than k,
        //    then n = k mod length should work
        // 2. Find a rule how to replace elements from old to new index
        //    nums[new] = nums[old], where new = old + n > length ? old + n - length : old + n
        // 3. Have to save nums[old] before change
        // 4. Start from 0 element then run in loop for [length-1] times

//        MyMath mm = new MyMath();

        int newIndex;
        int savedValueFromPrevIteration;
        int saveAgain;

        int n = k % nums.length;

        if (n > 0) { // if n == 0 just don`t do anything
            if (gcd(nums.length, n) > 1) {
                for (int seq = 0; seq < gcd(nums.length, n) ; seq++) {
                    newIndex = seq + n; // new index for starting element
                    savedValueFromPrevIteration = nums[newIndex];
                    nums[newIndex] = nums[seq]; // first charge

                    for (int i = 1; i < nums.length / gcd(nums.length, n); i++) { //
                        newIndex = (n + newIndex) % nums.length; // here is the new position for element saved from previous iteration
                        saveAgain = nums[newIndex];
                        nums[newIndex] = savedValueFromPrevIteration; // do change
                        savedValueFromPrevIteration = saveAgain;
                       }
                }
            } else {

                newIndex = 0 + n; // new index for starting element
                savedValueFromPrevIteration = nums[newIndex];
                nums[newIndex] = nums[0]; // first charge

                for (int i = 1; i < nums.length; i++) { //

                    newIndex = (n + newIndex) % nums.length; // here is the new position for element saved from previous iteration
                    saveAgain = nums[newIndex];
                    nums[newIndex] = savedValueFromPrevIteration; // do change
                    savedValueFromPrevIteration = saveAgain;
                }
            }
        }

    }
}
